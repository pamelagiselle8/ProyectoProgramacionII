package p2proyecto_pamelaramirez;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DatosSistema {

    private Dba ds = new Dba("./DBProyecto.mdb");
    private ArrayList<Usuario> usuarios = new ArrayList();
    private ArrayList<Local> locales = new ArrayList();
    private ArrayList<Empleado> empleados = new ArrayList();
    private ArrayList<Gerente> gerentes = new ArrayList();
    private ArrayList<Transaccion> transacciones = new ArrayList();

    public DatosSistema() {
        cargarDatos();
    }

    // Validaciones
    public boolean idValido(String id) {
        cargarDatos();
        boolean valido = true;
        if (!usuarios.isEmpty()) {
            for (Usuario user : usuarios) {
                if (user.getIdentidad().equals(id)) {
                    valido = false;
                }
            }
        }
        if (!empleados.isEmpty()) {
            for (Empleado emp : empleados) {
                if (emp.getIdentidad().equals(id)) {
                    valido = false;
                }
            }
        }
        if (!gerentes.isEmpty()) {
            for (Gerente ger : gerentes) {
                if (ger.getIdentidad().equals(id)) {
                    valido = false;
                }
            }
        }
        return valido;
    }

    public boolean userValido(String username) {
        cargarDatos();
        boolean valido = true;
        if (!usuarios.isEmpty()) {
            for (Usuario user : usuarios) {
                if (user.getNombreUsuario().equals(username)) {
                    valido = false;
                }
            }
        }
        if (!empleados.isEmpty()) {
            for (Empleado emp : empleados) {
                if (emp.getNombreUsuario().equals(username)) {
                    valido = false;
                }
            }
        }
        if (!gerentes.isEmpty()) {
            for (Gerente ger : gerentes) {
                if (ger.getNombreUsuario().equals(username)) {
                    valido = false;
                }
            }
        }
        return valido;
    }

    // Metodos para llenar componentes
    public DefaultComboBoxModel llenarCboUsuarios() {
        cargarDatos();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (Usuario user : usuarios) {
            modelo.addElement(user);
        }
        if (!empleados.isEmpty()) {
            for (Empleado emp : empleados) {
                modelo.addElement(emp);
            }
        }
        if (!gerentes.isEmpty()) {
            for (Gerente ger : gerentes) {
                modelo.addElement(ger);
            }
        }
        for (Local local : locales) {
            if (!local.getAreas().isEmpty()) {
                if (local.getGerente() != null) {
                    modelo.addElement(local.getGerente());
                }
                for (Area area : local.getAreas()) {
                    if (!area.getEmpleados().isEmpty()) {
                        for (Empleado emp : area.getEmpleados()) {
                            modelo.addElement(emp);
                        }
                    }
                }
            }
        }
        return modelo;
    }

    public DefaultComboBoxModel llenarCboLocales() {
        cargarDatos();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (Local local : locales) {
            modelo.addElement(local);
        }
        return modelo;
    }

    public DefaultComboBoxModel llenarCboAreas(Local local) {
        cargarDatos();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        if (!local.getAreas().isEmpty()) {
            for (Area area : local.getAreas()) {
                modelo.addElement(area);
            }
        }
        return modelo;
    }

    public DefaultComboBoxModel llenarCboAreas() {
        cargarDatos();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (Local local : locales) {
            if (!local.getAreas().isEmpty()) {
                for (Area area : local.getAreas()) {
                    modelo.addElement(area);
                }
            }
        }
        return modelo;
    }

    public DefaultComboBoxModel llenarCboTransacciones() {
        cargarDatos();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (Local local : locales) {
            if (!local.getAreas().isEmpty()) {
                for (Area area : local.getAreas()) {
                    if (!area.getTransacciones().isEmpty()) {
                        for (Transaccion tran : area.getTransacciones()) {
                            modelo.addElement(tran);
                        }
                    }
                }
            }
        }
        return modelo;
    }

    public DefaultListModel llenarListGerentes() {
        cargarDatos();
        DefaultListModel listModel = new DefaultListModel();
        for (Gerente ger : gerentes) {
            listModel.addElement(ger);
        }
        return listModel;
    }

    public DefaultListModel llenarListGerente(Local local) {
        cargarDatos();
        DefaultListModel listModel = new DefaultListModel();
        if (local.getGerente() != null) {
            listModel.addElement(local.getGerente());
        }
        return listModel;
    }

    public DefaultListModel llenarListEmpleados() {
        cargarDatos();
        DefaultListModel listModel = new DefaultListModel();
        for (Empleado emp : empleados) {
            listModel.addElement(emp);
        }
        return listModel;
    }

    public DefaultListModel llenarListEmpleados(Area area) {
        cargarDatos();
        DefaultListModel listModel = new DefaultListModel();
        if (!area.getEmpleados().isEmpty()) {
            for (Empleado emp : area.getEmpleados()) {
                listModel.addElement(emp);
            }
        }
        return listModel;
    }

    public DefaultListModel llenarListTranArea(Area area) {
        cargarDatos();
        DefaultListModel listTranModel = new DefaultListModel();
        if (!area.getTransacciones().isEmpty()) {
            for (Transaccion tran : area.getTransacciones()) {
                listTranModel.addElement(tran);
            }
        }
        return listTranModel;
    }
    
    public DefaultListModel llenarListTran() {
        cargarDatos();
        DefaultListModel modelo = new DefaultListModel();
        for (Transaccion tran : transacciones) {
            modelo.addElement(tran);
        }
        return modelo;
    }
    
    public void listarUsuarios(JTable tabla, int instancia, int atributos) {

    }

// Metodos para cargar datos
    public void cargarDatos() {
        cargarAdmins();
        // Cargar gerentes sin local
        cargarGerSinLocal();
        // Cargar empleados sin area
        cargarEmpSinArea();
        cargarLocales();
    }

    public void cargarBitacora(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        String[] encabezado = new String[3];
        modelo.setColumnCount(3);
        encabezado[0] = "Usuario";
        encabezado[1] = "Fecha";
        encabezado[2] = "Actividad";
//        Object[] row = new Object[4];
//        row[0] = user.getIdentidad();
//        row[1] = user.getNombre();
//        row[2] = user.getNombreUsuario();
//        row[3] = user.getPass();
//        modelo.addRow(row);
        modelo.setColumnIdentifiers(encabezado);
        tabla.setModel(modelo);
    }

    public void cargarAdmins() {
        // Cargar administradores
        usuarios.clear();
        ds.conectar();
        try {
            ds.query.execute("select * from Administradores");
            ResultSet rs = ds.query.getResultSet();
            while (rs.next()) {
                usuarios.add(new Administrador(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
    }

    public void cargarEmpSinArea() {
        empleados.clear();
        ds.conectar();
        try {
            ds.query.execute("select * from EmpSinArea");
            ResultSet rs = ds.query.getResultSet();
            while (rs.next()) {
                empleados.add(new Empleado(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
    }

    public void cargarGerSinLocal() {
        gerentes.clear();
        ds.conectar();
        try {
            ds.query.execute("select * from GerSinLocal");
            ResultSet rs = ds.query.getResultSet();
            while (rs.next()) {
                gerentes.add(new Gerente(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
    }

    public void cargarTranSinArea() {
        transacciones.clear();
        ds.conectar();
        try {
            ds.query.execute("select * from TranSinArea");
            ResultSet rs = ds.query.getResultSet();
            while (rs.next()) {
                transacciones.add(new Transaccion(rs.getInt(1),
                        rs.getString(2), rs.getInt(3)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
    }

    public void cargarLocales() {
        // Cargar locales
        locales.clear();
        ds.conectar();
        try {
            ds.query.execute("select * from Locales");
            ResultSet rs = ds.query.getResultSet();
            while (rs.next()) {
                locales.add(new Local(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
        // Cargar areas y gerentes
        cargarDatosLocales();
    }

    public void cargarDatosLocales() {
        ds.conectar();
        if (!locales.isEmpty()) {
            for (Local local : locales) {
                local.getAreas().clear();
                try {
                    // Cargar areas
                    ds.query.execute("select * from Areas where IdLocal = " + local.getId());
                    ResultSet rs = ds.query.getResultSet();
                    while (rs.next()) {
                        local.getAreas().add(new Area(rs.getInt(1), rs.getString(2)));
                    }

                    // Cargar gerentes
                    ds.query.execute("select * from Gerentes where IdLocal = " + local.getId());
                    rs = ds.query.getResultSet();
                    while (rs.next()) {
                        local.setGerente(new Gerente(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        ds.desconectar();
        // Cargar transacciones, empleados, colas y citas
        cargarDatosAreas();
    }

    public void cargarDatosAreas() {
        ds.conectar();
        if (!locales.isEmpty()) {
            for (Local local : locales) {
                if (!local.getAreas().isEmpty()) {
                    for (Area area : local.getAreas()) {
                        area.getTransacciones().clear();
                        area.getEmpleados().clear();
                        area.getPreferencial().clear();
                        area.getNormal().clear();
                        area.getCitas().clear();
                        try {
                            // Cargar transacciones
                            ds.query.execute("select * from Transacciones where IdArea = " + area.getId());
                            ResultSet rs = ds.query.getResultSet();
                            while (rs.next()) {
                                area.getTransacciones().add(new Transaccion(rs.getInt(1),
                                        rs.getString(2), rs.getInt(3)));
                            }
                            // Cargar empleados
                            ds.query.execute("select * from Empleados where IdArea = " + area.getId());
                            rs = ds.query.getResultSet();
                            while (rs.next()) {
                                area.getEmpleados().add(new Empleado(rs.getInt(1), rs.getString(2),
                                        rs.getString(3), rs.getString(4), rs.getString(5)));
                            }
                            // Cargar cola preferencial
                            ds.query.execute("select * from CPreferenciales where IdArea = " + area.getId());
                            rs = ds.query.getResultSet();
                            while (rs.next()) {
                                if (rs.getInt(6) == 1) {
                                    // Cliente preferencial que desea recibir notificaciones
                                    area.getPreferencial().add(new CPreferencial(
                                            rs.getInt(1), rs.getInt(3), rs.getString(4), rs.getString(5),
                                            true, rs.getString(7), rs.getString(8), rs.getString(9),
                                            local, area));
                                } else if (rs.getInt(6) == 0) {
                                    // Cliente preferencial que no desea recibir notificaciones
                                    area.getPreferencial().add(new CPreferencial(
                                            rs.getInt(1), rs.getInt(3), rs.getString(4), rs.getString(5),
                                            false, rs.getString(9), local, area));
                                }
                            }
                            // Cargar cola normal
                            ds.query.execute("select * from CNormales where IdArea = " + area.getId());
                            rs = ds.query.getResultSet();
                            while (rs.next()) {
                                if (rs.getInt(6) == 1) {
                                    // Cliente que desea recibir notificaciones
                                    area.getNormal().add(new CNormal(
                                            rs.getInt(1), rs.getInt(3), rs.getString(4), rs.getString(5),
                                            true, rs.getString(7), rs.getString(8), rs.getString(9),
                                            local, area));
                                } else if (rs.getInt(6) == 0) {
                                    // Cliente que no desea recibir notificaciones
                                    area.getNormal().add(new CNormal(
                                            rs.getInt(1), rs.getInt(3), rs.getString(4), rs.getString(5),
                                            false, rs.getString(9), local, area));
                                }
                            }
                            // Cargar citas
                            ds.query.execute("select * from Citas where IdArea = " + area.getId());
                            rs = ds.query.getResultSet();
                            while (rs.next()) {
                                boolean preferencial = false;
                                if (rs.getInt(5) == 1) {
                                    preferencial = true;
                                }
                                if (rs.getInt(5) == 1) {
                                    // Cita de cliente que desea recibir notificaciones
                                    area.getCitas().add(new Cita(
                                            rs.getInt(1), rs.getString(2), rs.getString(3), preferencial, true,
                                            rs.getString(6), rs.getString(7),
                                            rs.getString(10), rs.getString(11), rs.getString(12), local, area));
                                } else if (rs.getInt(5) == 0) {
                                    // Cita de cliente que no desea recibir notificaciones
                                    area.getCitas().add(new Cita(
                                            rs.getInt(1), rs.getString(2), rs.getString(3), preferencial, false,
                                            rs.getString(10), rs.getString(11), rs.getString(12), local, area));
                                }
                            }
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }
        }
        ds.desconectar();
        // Cargar transacciones de los clientes y de las citas
        cargarTranClientes();
    }

    public void cargarTranClientes() {
        ds.conectar();
        try {
            if (!locales.isEmpty()) {
                for (Local local : locales) {
                    if (!local.getAreas().isEmpty()) {
                        for (Area area : local.getAreas()) {
                            for (CPreferencial cliente : area.getPreferencial()) {
                                ds.query.execute("select IdTransaccion from TranClientes where IdCliente = " + cliente.getId());
                                ResultSet rs = ds.query.getResultSet();
                                while (rs.next()) {
                                    ds.query.execute("select * from Transacciones where Id = " + rs.getInt(1));
                                    ResultSet rs2 = ds.query.getResultSet();
                                    cliente.getTransacciones().add(new Transaccion(rs2.getInt(1), rs2.getString(2), rs2.getInt(3)));
                                }
                            }
                            for (CNormal cliente : area.getNormal()) {
                                ds.query.execute("select IdTransaccion from TranClientes where IdCliente = " + cliente.getId());
                                ResultSet rs = ds.query.getResultSet();
                                while (rs.next()) {
                                    ds.query.execute("select * from Transacciones where Id = " + rs.getInt(1));
                                    ResultSet rs2 = ds.query.getResultSet();
                                    cliente.getTransacciones().add(new Transaccion(rs2.getInt(1), rs2.getString(2), rs2.getInt(3)));
                                }
                            }
                            for (Cita cita : area.getCitas()) {
                                ds.query.execute("select IdTransaccion from TranClientes where IdCliente = " + cita.getId());
                                ResultSet rs = ds.query.getResultSet();
                                while (rs.next()) {
                                    ds.query.execute("select * from Transacciones where Id = " + rs.getInt(1));
                                    ResultSet rs2 = ds.query.getResultSet();
                                    cita.getTransacciones().add(new Transaccion(rs2.getInt(1), rs2.getString(2), rs2.getInt(3)));
                                }
                            }
                        }
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
    }

    // Metodos para agregar
    public void addNormalNotis(int pos, String id, String nom, int notis,
            String correo, String telefono, String fecha, Area area) {
        ds.conectar();
        try {
            ds.query.execute("insert into CNormales "
                    + "(IdArea, Posicion, Identidad, Nombre, Notis, Correo, Telefono, Fecha registro ) "
                    + "Values ('" + area.getId() + "', '" + pos + "', '" + id + "', '" + nom + "', '"
                    + notis + "','" + correo + "','" + telefono + "','" + fecha + "','" + area.getId() + "')");
            ds.commit();
            cargarDatosAreas();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
        cargarDatos();
    }

    public void addNormal(int pos, String id, String nom, int notis,
            String correo, String telefono, String fecha, Area area) {
        ds.conectar();
        try {
            ds.query.execute("insert into CNormales "
                    + "(IdArea, Posicion, Identidad, Nombre, Notis, Fecha registro ) "
                    + "Values ('" + area.getId() + "', '" + pos + "', '" + id + "', '" + nom + "', '"
                    + notis + "','" + fecha + "','" + area.getId() + "')");
            ds.commit();
            cargarDatosAreas();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
        cargarDatos();
    }

    public void addPreferencialNotis(int pos, String id, String nom, int notis,
            String correo, String telefono, String fecha, Area area) {
        ds.conectar();
        try {
            ds.query.execute("insert into CPreferenciales "
                    + "(IdArea, Posicion, Identidad, Nombre, Notis, Correo, Telefono, Fecha registro ) "
                    + "Values ('" + area.getId() + "', '" + pos + "', '" + id + "', '" + nom + "', '"
                    + notis + "','" + correo + "','" + telefono + "','" + fecha + "','" + area.getId() + "')");
            ds.commit();
            cargarDatosAreas();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
        cargarDatos();
    }

    public void addPreferencial(int pos, String id, String nom, int notis,
            String correo, String telefono, String fecha, Area area) {
        ds.conectar();
        try {
            ds.query.execute("insert into CPreferenciales "
                    + "(IdArea, Posicion, Identidad, Nombre, Notis, Fecha registro ) "
                    + "Values ('" + area.getId() + "', '" + pos + "', '" + id + "', '" + nom + "', '"
                    + notis + "','" + fecha + "','" + area.getId() + "')");
            ds.commit();
            cargarDatosAreas();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
        cargarDatos();
    }

    public void addCitaNotis(int pos, String id, String nom, int notis, int pref,
            String correo, String telefono, String fecha, String fechaCita, String horaCita, Area area) {
        ds.conectar();
        try {
            ds.query.execute("insert into Citas "
                    + "(Identidad, Nombre, Preferencial, Notis, Correo, Telefono, IdArea, Fecha registro, Fecha cita, Hora cita ) "
                    + "Values ('" + id + "', '" + nom + "', '" + pref + "', '" + notis + "', '"
                    + correo + "','" + telefono + "','" + area.getId() + "','" + fecha + "','" + fechaCita + "','"
                    + horaCita + "')");
            ds.commit();
            cargarDatosAreas();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
        cargarDatos();
    }

    public void addCitas(int pos, String id, String nom, int notis, int pref,
            String fecha, String fechaCita, String horaCita, Area area) {
        ds.conectar();
        try {
            ds.query.execute("insert into Citas "
                    + "(Identidad, Nombre, Preferencial, Notis, IdArea, Fecha registro, Fecha cita, Hora cita ) "
                    + "Values ('" + id + "', '" + nom + "', '" + pref + "', '" + notis + "', '"
                    + "','" + area.getId() + "','" + fecha + "','" + fechaCita + "','" + horaCita + "')");
            ds.commit();
            cargarDatosAreas();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
        cargarDatos();
    }

    public void addAdmin(String id, String nom, String user, String pass) {
        ds.conectar();
        try {
            ds.query.execute("insert into Administradores "
                    + "(Identidad, Nombre, Usuario, Contrasena) "
                    + "Values ('" + id + "', '" + nom + "', '" + user + "','" + pass + "')");
            ds.commit();
            cargarAdmins();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
        cargarDatos();
    }

    public void addGerente(String id, String nom, String user, String pass, Local local) {
        ds.conectar();
        try {
            ds.query.execute("insert into Gerentes "
                    + "(Identidad, Nombre, Usuario, Contrasena, IdLocal) "
                    + "Values ('" + id + "', '" + nom + "', '" + user + "','" + pass + "','" + local.getId() + "')");
            ds.commit();
            cargarDatosLocales();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
        cargarDatos();
    }

    public void addGerSinLocal(String id, String nom, String user, String pass) {
        ds.conectar();
        try {
            ds.query.execute("insert into GerSinLocal "
                    + "(Identidad, Nombre, Usuario, Contrasena) "
                    + "Values ('" + id + "', '" + nom + "', '" + user + "','" + pass + "')");
            ds.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
        cargarDatos();
    }

    public void addEmpleado(String id, String nom, String user, String pass, Area area) {
        ds.conectar();
        try {
            ds.query.execute("insert into Empleados "
                    + "(Identidad, Nombre, Usuario, Contrasena, IdArea) "
                    + "Values ('" + id + "', '" + nom + "', '" + user + "','" + pass + "','" + area.getId() + "')");
            ds.commit();
            cargarDatosAreas();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
        cargarDatos();
    }

    public void addEmpSinArea(String id, String nom, String user, String pass) {
        ds.conectar();
        try {
            ds.query.execute("insert into EmpSinArea "
                    + "(Identidad, Nombre, Usuario, Contrasena) "
                    + "Values ('" + id + "', '" + nom + "', '" + user + "','" + pass + "')");
            ds.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
        cargarDatos();
    }

    public void addLocal(String nom, String lat, String lon) {
        ds.conectar();
        try {
            ds.query.execute("insert into Locales "
                    + "(Nombre, Latitud, Longitud) "
                    + "Values ('" + nom + "', '" + lat + "', '" + lon + "')");
            ds.commit();
            cargarLocales();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
        cargarDatos();
    }

    public void addArea(String nom, Local local) {
        ds.conectar();
        try {
            ds.query.execute("insert into Areas "
                    + "(Nombre, IdLocal) "
                    + "Values ('" + nom + "', '" + local.getId() + "')");
            ds.commit();
            cargarDatosLocales();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
        cargarDatos();
    }

    public void addTransaccion(String tipo, int tiempo, Area area) {
        ds.conectar();
        try {
            ds.query.execute("insert into Transacciones "
                    + "(Tipo, Tiempo, IdArea) "
                    + "Values ('" + tipo + "', '" + tiempo + "', '" + area.getId() + "')");
            ds.commit();
            cargarDatosAreas();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
        cargarDatos();
    }

    public void addTranSinArea(String tipo, int tiempo) {
        ds.conectar();
        try {
            ds.query.execute("insert into TranSinArea "
                    + "(Tipo, Tiempo) "
                    + "Values ('" + tipo + "', '" + tiempo + "')");
            ds.commit();
            cargarDatosAreas();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
        cargarDatos();
    }

    public void addBitacora() {
        // cargarBitacora();
    }

    // Metodos para modificar
    // Metodos para eliminar
    public void elimGerente(int id) {
        ds.conectar();
        try {
            ds.query.execute("delete from Gerentes"
                    + " where Id = " + id);
            ds.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
        cargarDatos();
    }

    public void elimGerSinLocal(int id) {
        ds.conectar();
        try {
            ds.query.execute("delete from GerSinLocal"
                    + " where Id = " + id);
            ds.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
        cargarDatos();
    }

    public void elimEmpleado(int id) {
        ds.conectar();
        try {
            ds.query.execute("delete from Empleados"
                    + " where Id = " + id);
            ds.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
        cargarDatos();
    }

    public void elimEmpSinArea(int id) {
        ds.conectar();
        try {
            ds.query.execute("delete from EmpSinArea"
                    + " where Id = " + id);
            ds.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
        cargarDatos();
    }

    public void elimTranSinArea(int id) {
        ds.conectar();
        try {
            ds.query.execute("delete from TranSinArea"
                    + " where Id = " + id);
            ds.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ds.desconectar();
        cargarDatos();
    }

    // Getters y setters
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Local> getLocales() {
        return locales;
    }

    public void setLocales(ArrayList<Local> locales) {
        this.locales = locales;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Gerente> getGerentes() {
        return gerentes;
    }

    public void setGerentes(ArrayList<Gerente> gerentes) {
        this.gerentes = gerentes;
    }

}
