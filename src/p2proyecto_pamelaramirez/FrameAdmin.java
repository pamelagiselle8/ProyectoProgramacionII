package p2proyecto_pamelaramirez;

import java.net.URL;
import java.text.*;
import java.util.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class FrameAdmin extends javax.swing.JFrame {

    DatosSistema ds = new DatosSistema();
    Date fecha = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Usuario user;

    public FrameAdmin() {
        initComponents();
        this.setTitle("Administrador");
        this.setLocationRelativeTo(null);
    }
    
    public void ingresar(Usuario user) {
        this.setVisible(true);
        this.user = user;
    }

    public void limpiarTab1() {
        txtNomUser.setText(null);
        txtIdUser.setText(null);
        txtNomDeUsuario.setText(null);
        txtPassUser.setText(null);
    }

    public void limpiarTab2() {
        txtNomLocal.setText(null);
        spLatitud.setValue(-90);
        spLongitud.setValue(-180);
    }

    public void limpiarTab3() {
        txtNomArea.setText(null);
    }

    public void limpiarTab4() {
        txtTipoTran.setText(null);
        spTiemTran.setValue(0);
    }

    // Actualiza todas las tabs con info de arraylists
    public void actualizarTodo() {
        int tab = tabbedPane.getSelectedIndex();
        switch (tab) {
            case 0: {
                // Tab usuarios
                limpiarTab1();
                cboUsuarios.setModel(ds.llenarCboUsuarios());
                break;
            }
            case 1: {
                // Tab locales
                limpiarTab2();
                cboLocal.setModel(ds.llenarCboLocales());
                listGer.setModel(ds.llenarListGerentes());
                listGerLocal.setModel(new DefaultListModel());
                break;
            }
            case 2: {
                // Tab areas
                limpiarTab3();
                cboArea.setModel(ds.llenarCboAreas());
                cboLocalArea.setModel(ds.llenarCboLocales());
                listEmp.setModel(ds.llenarListEmpleados());
                listEmpArea.setModel(new DefaultListModel());
                listTran.setModel(ds.llenarListTran());
                listTranArea.setModel(new DefaultListModel());
                break;
            }
            case 3: {
                // Tab transacciones
                limpiarTab4();
                cboTran.setModel(ds.llenarCboTransacciones());
                break;
            }
            case 4: {
                // Tab citas y tickets
                cboLocalCita.setModel(ds.llenarCboLocales());
                break;
            }
            case 5: {
                // Tab colas
                
                break;
            }
            case 6: {
                // Tab bitacora
                ds.cargarBitacora(tabla);
                break;
            }
            case 7: {
                // Tab analisis de datos
                cboLocalesMapa.setModel(ds.llenarCboLocales());
                break;
            }
        }
    }

    public void actualizarEmpTran(Area area) {
        DefaultListModel modeloEmpArea = (DefaultListModel) listEmpArea.getModel();
        DefaultListModel modeloEmp = (DefaultListModel) listEmp.getModel();
        DefaultListModel modeloTranArea = (DefaultListModel) listTranArea.getModel();
        DefaultListModel modeloTran = (DefaultListModel) listTran.getModel();
        // Reiniciar la tabla de EmpSinArea
        ds.elimEmpSinArea();
        // Eliminar los existentes para evitar duplicados
        ds.elimEmpDeArea(area.getId());
        if (modeloEmpArea.getSize() > 0) {
            for (Object empleado : modeloEmpArea.toArray()) {
                // Actualizar la tabla Empleados
                Empleado emp = (Empleado) empleado;
                ds.addEmpleado(emp.getIdentidad(), emp.getNombre(),
                        emp.getNombreUsuario(), emp.getPass(), area);
            }
        }
        if (modeloEmp.getSize() > 0) {
            for (Object empleado : modeloEmp.toArray()) {
                // Actualizar la tabla EmpSinArea
                Empleado emp = (Empleado) empleado;
                ds.addEmpSinArea(emp.getIdentidad(), emp.getNombre(),
                        emp.getNombreUsuario(), emp.getPass());
            }
        }
        if (modeloTranArea.getSize() > 0) {
            for (Object transaccion : modeloTranArea.toArray()) {
                Transaccion tran = (Transaccion) transaccion;
                ds.addTransaccion(tran.getId(), area);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new p2proyecto_pamelaramirez.UIAdmin();
        jPanel14 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cboTipoUser = new javax.swing.JComboBox<>();
        btnListarUser = new javax.swing.JButton();
        btnGuardarUser = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtNomUser = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtIdUser = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNomDeUsuario = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtPassUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnElimUser = new javax.swing.JButton();
        btnEditUser = new javax.swing.JToggleButton();
        lblCboUser = new javax.swing.JLabel();
        cboUsuarios = new javax.swing.JComboBox<>();
        jPanel15 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cboLocal = new javax.swing.JComboBox<>();
        btnElimLocal = new javax.swing.JButton();
        btnListarLocal = new javax.swing.JButton();
        btnGuardarLocal = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtNomLocal = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        spLatitud = new javax.swing.JSpinner();
        spLongitud = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        listGerLocal = new javax.swing.JList<>();
        jLabel42 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        btnAddGer = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        btnElimGer = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        listGer = new javax.swing.JList<>();
        btnEditLocal = new javax.swing.JToggleButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        cboArea = new javax.swing.JComboBox<>();
        btnElimArea = new javax.swing.JButton();
        btnListarArea = new javax.swing.JButton();
        btnGuardarArea = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        txtNomArea = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        cboLocalArea = new javax.swing.JComboBox<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        listEmpArea = new javax.swing.JList<>();
        jLabel28 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        btnAddEmpArea = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        btnElimEmpArea = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        listEmp = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        btnEditArea = new javax.swing.JToggleButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        listTran = new javax.swing.JList<>();
        jScrollPane13 = new javax.swing.JScrollPane();
        listTranArea = new javax.swing.JList<>();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        btnAddTranArea = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        btnElimTranArea = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        btnElimTran = new javax.swing.JButton();
        btnListarTran = new javax.swing.JButton();
        btnGuardarTran = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        txtTipoTran = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        spTiemTran = new javax.swing.JSpinner();
        cboTran = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnEditTran = new javax.swing.JToggleButton();
        jPanel18 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        cboLocalCita = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        cboAreaCita = new javax.swing.JComboBox<>();
        cboGuardarCita = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        txtIdCita = new javax.swing.JFormattedTextField();
        btnCargarCita = new javax.swing.JButton();
        btnReenviarTicket = new javax.swing.JButton();
        pnlFechaCitaAdmin = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        dcCita = new com.toedter.calendar.JDateChooser();
        jScrollPane6 = new javax.swing.JScrollPane();
        listEmpLocal2 = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        listEmpAsigLocal2 = new javax.swing.JList<>();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        btnAgrEmpLocal2 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        btnElimEmpLocal2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        treeColas = new javax.swing.JTree();
        jLabel8 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnPDF = new javax.swing.JButton();
        btnMapa = new javax.swing.JButton();
        cboLocalesMapa = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabbedPane.setBackground(new java.awt.Color(153, 204, 255));
        tabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabbedPaneStateChanged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(125, 177, 229));
        jPanel1.setForeground(new java.awt.Color(125, 177, 229));
        jPanel1.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/user.png"))); // NOI18N
        jLabel10.setText(" Administración de usuarios");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 50, 269, 24);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tipo de usuario");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(140, 160, 220, 17);

        cboTipoUser.setBackground(new java.awt.Color(50, 152, 255));
        cboTipoUser.setForeground(new java.awt.Color(255, 255, 255));
        cboTipoUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -", "Administrador del sistema", "Gerente", "Empleado" }));
        cboTipoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoUserActionPerformed(evt);
            }
        });
        jPanel1.add(cboTipoUser);
        cboTipoUser.setBounds(140, 190, 220, 23);

        btnListarUser.setBackground(new java.awt.Color(34, 131, 229));
        btnListarUser.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnListarUser.setForeground(new java.awt.Color(255, 255, 255));
        btnListarUser.setText("Listar usuarios registrados");
        btnListarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnListarUser);
        btnListarUser.setBounds(520, 340, 220, 35);

        btnGuardarUser.setBackground(new java.awt.Color(34, 131, 229));
        btnGuardarUser.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnGuardarUser.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/save (1).png"))); // NOI18N
        btnGuardarUser.setText(" Guardar");
        btnGuardarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarUser);
        btnGuardarUser.setBounds(140, 520, 220, 35);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nombre");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(140, 230, 220, 17);

        txtNomUser.setBackground(new java.awt.Color(204, 227, 255));
        txtNomUser.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(txtNomUser);
        txtNomUser.setBounds(140, 260, 220, 23);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Identidad");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(140, 300, 55, 17);

        txtIdUser.setBackground(new java.awt.Color(204, 227, 255));
        txtIdUser.setForeground(new java.awt.Color(51, 51, 51));
        try {
            txtIdUser.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtIdUser);
        txtIdUser.setBounds(140, 330, 220, 23);

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre de usuario");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(140, 370, 220, 17);

        txtNomDeUsuario.setBackground(new java.awt.Color(204, 227, 255));
        txtNomDeUsuario.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(txtNomDeUsuario);
        txtNomDeUsuario.setBounds(140, 400, 220, 23);

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Contraseña");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(140, 440, 220, 17);

        txtPassUser.setBackground(new java.awt.Color(204, 227, 255));
        txtPassUser.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(txtPassUser);
        txtPassUser.setBounds(140, 470, 220, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/degradados/Skyline.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-7, -10, 1270, 130);

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 900, 100);

        btnElimUser.setBackground(new java.awt.Color(34, 131, 229));
        btnElimUser.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnElimUser.setForeground(new java.awt.Color(255, 255, 255));
        btnElimUser.setText("Eliminar usuario");
        btnElimUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnElimUser);
        btnElimUser.setBounds(520, 290, 220, 35);

        btnEditUser.setBackground(new java.awt.Color(34, 131, 229));
        btnEditUser.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnEditUser.setForeground(new java.awt.Color(255, 255, 255));
        btnEditUser.setText("Modificar usuario");
        btnEditUser.setSize(new java.awt.Dimension(220, 35));
        btnEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditUser);
        btnEditUser.setBounds(520, 240, 220, 35);

        lblCboUser.setForeground(new java.awt.Color(255, 255, 255));
        lblCboUser.setText("Usuarios registrados");
        jPanel1.add(lblCboUser);
        lblCboUser.setBounds(520, 160, 220, 17);

        cboUsuarios.setBackground(new java.awt.Color(50, 152, 255));
        cboUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        cboUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));
        cboUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(cboUsuarios);
        cboUsuarios.setBounds(520, 190, 220, 23);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Usuarios", jPanel14);

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(125, 177, 229));
        jPanel8.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/map.png"))); // NOI18N
        jLabel17.setText(" Administración de locales");
        jPanel8.add(jLabel17);
        jLabel17.setBounds(60, 50, 445, 24);

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Locales registrados");
        jPanel8.add(jLabel19);
        jLabel19.setBounds(520, 160, 310, 17);

        cboLocal.setBackground(new java.awt.Color(50, 152, 255));
        cboLocal.setForeground(new java.awt.Color(255, 255, 255));
        cboLocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));
        cboLocal.setSize(new java.awt.Dimension(310, 23));
        jPanel8.add(cboLocal);
        cboLocal.setBounds(520, 190, 310, 23);

        btnElimLocal.setBackground(new java.awt.Color(34, 131, 229));
        btnElimLocal.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnElimLocal.setForeground(new java.awt.Color(255, 255, 255));
        btnElimLocal.setText("Eliminar local");
        btnElimLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimLocalActionPerformed(evt);
            }
        });
        jPanel8.add(btnElimLocal);
        btnElimLocal.setBounds(520, 290, 310, 35);

        btnListarLocal.setBackground(new java.awt.Color(34, 131, 229));
        btnListarLocal.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnListarLocal.setForeground(new java.awt.Color(255, 255, 255));
        btnListarLocal.setText("Listar locales registrados");
        btnListarLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarLocalActionPerformed(evt);
            }
        });
        jPanel8.add(btnListarLocal);
        btnListarLocal.setBounds(520, 340, 310, 35);

        btnGuardarLocal.setBackground(new java.awt.Color(34, 131, 229));
        btnGuardarLocal.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnGuardarLocal.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarLocal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/save (1).png"))); // NOI18N
        btnGuardarLocal.setText(" Guardar");
        btnGuardarLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarLocalActionPerformed(evt);
            }
        });
        jPanel8.add(btnGuardarLocal);
        btnGuardarLocal.setBounds(140, 370, 220, 35);

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Nombre");
        jPanel8.add(jLabel20);
        jLabel20.setBounds(140, 160, 220, 17);

        txtNomLocal.setBackground(new java.awt.Color(204, 227, 255));
        txtNomLocal.setForeground(new java.awt.Color(51, 51, 51));
        jPanel8.add(txtNomLocal);
        txtNomLocal.setBounds(140, 190, 220, 23);

        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Longitud");
        jPanel8.add(jLabel46);
        jLabel46.setBounds(140, 300, 135, 17);

        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Latitud");
        jPanel8.add(jLabel47);
        jLabel47.setBounds(140, 230, 220, 17);

        spLatitud.setModel(new javax.swing.SpinnerNumberModel(-90.0d, -90.0d, 90.0d, 1.0d));
        jPanel8.add(spLatitud);
        spLatitud.setBounds(140, 260, 220, 23);

        spLongitud.setModel(new javax.swing.SpinnerNumberModel(-180.0d, -180.0d, 180.0d, 1.0d));
        jPanel8.add(spLongitud);
        spLongitud.setBounds(140, 330, 220, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/degradados/Skyline.jpg"))); // NOI18N
        jLabel4.setText("jLabel3");
        jLabel4.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel8.add(jLabel4);
        jLabel4.setBounds(-7, -10, 1270, 130);

        listGerLocal.setBackground(new java.awt.Color(204, 227, 255));
        listGerLocal.setForeground(new java.awt.Color(51, 51, 51));
        listGerLocal.setModel(new DefaultListModel());
        jScrollPane10.setViewportView(listGerLocal);

        jPanel8.add(jScrollPane10);
        jScrollPane10.setBounds(700, 420, 130, 90);

        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Gerentes");
        jPanel8.add(jLabel42);
        jLabel42.setBounds(520, 390, 90, 17);

        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Asignado");
        jPanel8.add(jLabel51);
        jLabel51.setBounds(700, 390, 90, 17);

        btnAddGer.setBackground(new java.awt.Color(34, 131, 229));
        btnAddGer.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnAddGer.setForeground(new java.awt.Color(255, 255, 255));
        btnAddGer.setText("Asignar");
        btnAddGer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGerActionPerformed(evt);
            }
        });
        jPanel8.add(btnAddGer);
        btnAddGer.setBounds(520, 530, 130, 35);

        jLabel52.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("->");
        jPanel8.add(jLabel52);
        jLabel52.setBounds(670, 460, 16, 17);

        btnElimGer.setBackground(new java.awt.Color(34, 131, 229));
        btnElimGer.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnElimGer.setForeground(new java.awt.Color(255, 255, 255));
        btnElimGer.setText("Eliminar");
        btnElimGer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimGerActionPerformed(evt);
            }
        });
        jPanel8.add(btnElimGer);
        btnElimGer.setBounds(700, 530, 130, 35);

        listGer.setBackground(new java.awt.Color(204, 227, 255));
        listGer.setForeground(new java.awt.Color(51, 51, 51));
        listGer.setModel(new DefaultListModel());
        jScrollPane11.setViewportView(listGer);

        jPanel8.add(jScrollPane11);
        jScrollPane11.setBounds(520, 420, 130, 90);

        btnEditLocal.setBackground(new java.awt.Color(34, 131, 229));
        btnEditLocal.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnEditLocal.setForeground(new java.awt.Color(255, 255, 255));
        btnEditLocal.setText("Modificar local");
        btnEditLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditLocalActionPerformed(evt);
            }
        });
        jPanel8.add(btnEditLocal);
        btnEditLocal.setBounds(520, 240, 310, 35);

        jPanel15.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 660));

        tabbedPane.addTab("Locales", jPanel15);

        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(125, 177, 229));
        jPanel13.setLayout(null);

        jLabel36.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/map-pin.png"))); // NOI18N
        jLabel36.setText(" Administración de áreas");
        jPanel13.add(jLabel36);
        jLabel36.setBounds(60, 50, 445, 24);

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Áreas registradas");
        jPanel13.add(jLabel37);
        jLabel37.setBounds(520, 160, 310, 17);

        cboArea.setBackground(new java.awt.Color(50, 152, 255));
        cboArea.setForeground(new java.awt.Color(255, 255, 255));
        cboArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));
        jPanel13.add(cboArea);
        cboArea.setBounds(520, 190, 310, 23);

        btnElimArea.setBackground(new java.awt.Color(34, 131, 229));
        btnElimArea.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnElimArea.setForeground(new java.awt.Color(255, 255, 255));
        btnElimArea.setText("Eliminar área");
        btnElimArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimAreaActionPerformed(evt);
            }
        });
        jPanel13.add(btnElimArea);
        btnElimArea.setBounds(520, 290, 310, 35);

        btnListarArea.setBackground(new java.awt.Color(34, 131, 229));
        btnListarArea.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnListarArea.setForeground(new java.awt.Color(255, 255, 255));
        btnListarArea.setText("Listar áreas registradas");
        btnListarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarAreaActionPerformed(evt);
            }
        });
        jPanel13.add(btnListarArea);
        btnListarArea.setBounds(520, 340, 310, 35);

        btnGuardarArea.setBackground(new java.awt.Color(34, 131, 229));
        btnGuardarArea.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnGuardarArea.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/save (1).png"))); // NOI18N
        btnGuardarArea.setText(" Guardar");
        btnGuardarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAreaActionPerformed(evt);
            }
        });
        jPanel13.add(btnGuardarArea);
        btnGuardarArea.setBounds(140, 530, 260, 35);

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Nombre");
        jPanel13.add(jLabel39);
        jLabel39.setBounds(140, 160, 220, 17);

        txtNomArea.setBackground(new java.awt.Color(204, 227, 255));
        txtNomArea.setForeground(new java.awt.Color(51, 51, 51));
        jPanel13.add(txtNomArea);
        txtNomArea.setBounds(140, 190, 260, 23);

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Local");
        jPanel13.add(jLabel40);
        jLabel40.setBounds(140, 230, 220, 17);

        cboLocalArea.setBackground(new java.awt.Color(50, 152, 255));
        cboLocalArea.setForeground(new java.awt.Color(255, 255, 255));
        cboLocalArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));
        jPanel13.add(cboLocalArea);
        cboLocalArea.setBounds(140, 260, 260, 23);

        listEmpArea.setBackground(new java.awt.Color(204, 227, 255));
        listEmpArea.setForeground(new java.awt.Color(51, 51, 51));
        listEmpArea.setModel(new DefaultListModel());
        jScrollPane8.setViewportView(listEmpArea);

        jPanel13.add(jScrollPane8);
        jScrollPane8.setBounds(290, 330, 110, 130);

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Empleados");
        jPanel13.add(jLabel28);
        jLabel28.setBounds(140, 300, 100, 17);

        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Asignados");
        jPanel13.add(jLabel49);
        jLabel49.setBounds(290, 300, 90, 17);

        btnAddEmpArea.setBackground(new java.awt.Color(34, 131, 229));
        btnAddEmpArea.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnAddEmpArea.setForeground(new java.awt.Color(255, 255, 255));
        btnAddEmpArea.setText("Agregar");
        btnAddEmpArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmpAreaActionPerformed(evt);
            }
        });
        jPanel13.add(btnAddEmpArea);
        btnAddEmpArea.setBounds(140, 480, 110, 35);

        jLabel50.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("->");
        jPanel13.add(jLabel50);
        jLabel50.setBounds(260, 390, 20, 17);

        btnElimEmpArea.setBackground(new java.awt.Color(34, 131, 229));
        btnElimEmpArea.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnElimEmpArea.setForeground(new java.awt.Color(255, 255, 255));
        btnElimEmpArea.setText("Eliminar");
        btnElimEmpArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimEmpAreaActionPerformed(evt);
            }
        });
        jPanel13.add(btnElimEmpArea);
        btnElimEmpArea.setBounds(290, 480, 110, 35);

        listEmp.setBackground(new java.awt.Color(204, 227, 255));
        listEmp.setForeground(new java.awt.Color(51, 51, 51));
        listEmp.setModel(new DefaultListModel());
        jScrollPane9.setViewportView(listEmp);

        jPanel13.add(jScrollPane9);
        jScrollPane9.setBounds(140, 330, 110, 130);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/degradados/Skyline.jpg"))); // NOI18N
        jLabel5.setText("jLabel3");
        jLabel5.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel13.add(jLabel5);
        jLabel5.setBounds(-7, -10, 1270, 130);

        btnEditArea.setBackground(new java.awt.Color(34, 131, 229));
        btnEditArea.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnEditArea.setForeground(new java.awt.Color(255, 255, 255));
        btnEditArea.setText("Modificar área");
        btnEditArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAreaActionPerformed(evt);
            }
        });
        jPanel13.add(btnEditArea);
        btnEditArea.setBounds(520, 240, 310, 35);

        listTran.setBackground(new java.awt.Color(204, 227, 255));
        listTran.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane12.setViewportView(listTran);

        jPanel13.add(jScrollPane12);
        jScrollPane12.setBounds(520, 420, 130, 90);

        listTranArea.setBackground(new java.awt.Color(204, 227, 255));
        listTranArea.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane13.setViewportView(listTranArea);

        jPanel13.add(jScrollPane13);
        jScrollPane13.setBounds(700, 420, 130, 90);

        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Transacciones");
        jPanel13.add(jLabel53);
        jLabel53.setBounds(520, 390, 84, 17);

        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Asignadas");
        jPanel13.add(jLabel54);
        jLabel54.setBounds(700, 390, 100, 17);

        btnAddTranArea.setBackground(new java.awt.Color(34, 131, 229));
        btnAddTranArea.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnAddTranArea.setForeground(new java.awt.Color(255, 255, 255));
        btnAddTranArea.setText("Agregar");
        btnAddTranArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTranAreaActionPerformed(evt);
            }
        });
        jPanel13.add(btnAddTranArea);
        btnAddTranArea.setBounds(520, 530, 130, 35);

        jLabel55.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("->");
        jPanel13.add(jLabel55);
        jLabel55.setBounds(670, 460, 16, 17);

        btnElimTranArea.setBackground(new java.awt.Color(34, 131, 229));
        btnElimTranArea.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnElimTranArea.setForeground(new java.awt.Color(255, 255, 255));
        btnElimTranArea.setText("Eliminar");
        btnElimTranArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimTranAreaActionPerformed(evt);
            }
        });
        jPanel13.add(btnElimTranArea);
        btnElimTranArea.setBounds(700, 530, 130, 35);

        jPanel16.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 660));

        tabbedPane.addTab("Áreas", jPanel16);

        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(125, 177, 229));
        jPanel9.setLayout(null);

        jLabel24.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/edit.png"))); // NOI18N
        jLabel24.setText(" Administración de transacciones");
        jPanel9.add(jLabel24);
        jLabel24.setBounds(60, 50, 315, 24);

        btnElimTran.setBackground(new java.awt.Color(34, 131, 229));
        btnElimTran.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnElimTran.setForeground(new java.awt.Color(255, 255, 255));
        btnElimTran.setText("Eliminar transacción");
        btnElimTran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimTranActionPerformed(evt);
            }
        });
        jPanel9.add(btnElimTran);
        btnElimTran.setBounds(520, 290, 220, 35);

        btnListarTran.setBackground(new java.awt.Color(34, 131, 229));
        btnListarTran.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnListarTran.setForeground(new java.awt.Color(255, 255, 255));
        btnListarTran.setText("Listar transacciones");
        btnListarTran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarTranActionPerformed(evt);
            }
        });
        jPanel9.add(btnListarTran);
        btnListarTran.setBounds(520, 340, 220, 35);

        btnGuardarTran.setBackground(new java.awt.Color(34, 131, 229));
        btnGuardarTran.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnGuardarTran.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarTran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/save (1).png"))); // NOI18N
        btnGuardarTran.setText(" Guardar");
        btnGuardarTran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTranActionPerformed(evt);
            }
        });
        jPanel9.add(btnGuardarTran);
        btnGuardarTran.setBounds(140, 340, 220, 35);

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Tipo de transacción");
        jPanel9.add(jLabel27);
        jLabel27.setBounds(140, 160, 220, 17);

        txtTipoTran.setBackground(new java.awt.Color(204, 227, 255));
        txtTipoTran.setForeground(new java.awt.Color(51, 51, 51));
        jPanel9.add(txtTipoTran);
        txtTipoTran.setBounds(140, 180, 220, 23);

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Tiempo estimado");
        jPanel9.add(jLabel29);
        jLabel29.setBounds(140, 220, 220, 17);

        spTiemTran.setModel(new javax.swing.SpinnerNumberModel(10, 10, 120, 10));
        jPanel9.add(spTiemTran);
        spTiemTran.setBounds(140, 250, 220, 23);

        cboTran.setBackground(new java.awt.Color(50, 152, 255));
        cboTran.setForeground(new java.awt.Color(255, 255, 255));
        cboTran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));
        jPanel9.add(cboTran);
        cboTran.setBounds(520, 190, 220, 23);

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Transacciones registradas");
        jPanel9.add(jLabel34);
        jLabel34.setBounds(520, 160, 220, 17);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/degradados/Skyline.jpg"))); // NOI18N
        jLabel6.setText("jLabel3");
        jLabel6.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel9.add(jLabel6);
        jLabel6.setBounds(-7, -10, 1270, 130);

        btnEditTran.setBackground(new java.awt.Color(34, 131, 229));
        btnEditTran.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnEditTran.setForeground(new java.awt.Color(255, 255, 255));
        btnEditTran.setText("Modificar transacción");
        btnEditTran.setSize(new java.awt.Dimension(220, 35));
        btnEditTran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditTranActionPerformed(evt);
            }
        });
        jPanel9.add(btnEditTran);
        btnEditTran.setBounds(520, 240, 220, 35);

        jPanel17.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 660));

        tabbedPane.addTab("Transacciones", jPanel17);

        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(125, 177, 229));
        jPanel10.setLayout(null);

        jLabel31.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/calendar.png"))); // NOI18N
        jLabel31.setText(" Administración de citas y tickets");
        jPanel10.add(jLabel31);
        jLabel31.setBounds(60, 50, 311, 24);

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Local");
        jPanel10.add(jLabel32);
        jLabel32.setBounds(140, 290, 220, 17);

        cboLocalCita.setBackground(new java.awt.Color(50, 152, 255));
        cboLocalCita.setForeground(new java.awt.Color(255, 255, 255));
        cboLocalCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -", "Administrador del sistema", "Gerente", "Empleado" }));
        cboLocalCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLocalCitaActionPerformed(evt);
            }
        });
        jPanel10.add(cboLocalCita);
        cboLocalCita.setBounds(140, 320, 220, 23);

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Área");
        jPanel10.add(jLabel33);
        jLabel33.setBounds(140, 360, 220, 17);

        cboAreaCita.setBackground(new java.awt.Color(50, 152, 255));
        cboAreaCita.setForeground(new java.awt.Color(255, 255, 255));
        cboAreaCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));
        jPanel10.add(cboAreaCita);
        cboAreaCita.setBounds(140, 390, 220, 23);

        cboGuardarCita.setBackground(new java.awt.Color(34, 131, 229));
        cboGuardarCita.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        cboGuardarCita.setForeground(new java.awt.Color(255, 255, 255));
        cboGuardarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/edit.png"))); // NOI18N
        cboGuardarCita.setText(" Guardar cambios");
        cboGuardarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGuardarCitaActionPerformed(evt);
            }
        });
        jPanel10.add(cboGuardarCita);
        cboGuardarCita.setBounds(140, 440, 220, 35);

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Identidad");
        jPanel10.add(jLabel35);
        jLabel35.setBounds(140, 160, 55, 17);

        txtIdCita.setBackground(new java.awt.Color(204, 227, 255));
        txtIdCita.setForeground(new java.awt.Color(51, 51, 51));
        try {
            txtIdCita.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdCita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(txtIdCita);
        txtIdCita.setBounds(140, 190, 220, 23);

        btnCargarCita.setBackground(new java.awt.Color(34, 131, 229));
        btnCargarCita.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnCargarCita.setForeground(new java.awt.Color(255, 255, 255));
        btnCargarCita.setText("Cargar datos del cliente");
        btnCargarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarCitaActionPerformed(evt);
            }
        });
        jPanel10.add(btnCargarCita);
        btnCargarCita.setBounds(140, 240, 220, 35);

        btnReenviarTicket.setBackground(new java.awt.Color(34, 131, 229));
        btnReenviarTicket.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnReenviarTicket.setForeground(new java.awt.Color(255, 255, 255));
        btnReenviarTicket.setText("Reenviar ticket a otra área");
        btnReenviarTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReenviarTicketActionPerformed(evt);
            }
        });
        jPanel10.add(btnReenviarTicket);
        btnReenviarTicket.setBounds(140, 490, 220, 35);

        pnlFechaCitaAdmin.setBackground(new java.awt.Color(125, 177, 229));
        pnlFechaCitaAdmin.setLayout(null);

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Fecha");
        pnlFechaCitaAdmin.add(jLabel30);
        jLabel30.setBounds(0, 0, 220, 17);

        dcCita.setBackground(new java.awt.Color(125, 177, 229));
        dcCita.setForeground(new java.awt.Color(51, 51, 51));
        pnlFechaCitaAdmin.add(dcCita);
        dcCita.setBounds(0, 30, 220, 23);

        jPanel10.add(pnlFechaCitaAdmin);
        pnlFechaCitaAdmin.setBounds(500, 160, 220, 50);

        listEmpLocal2.setBackground(new java.awt.Color(204, 227, 255));
        listEmpLocal2.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane6.setViewportView(listEmpLocal2);

        jPanel10.add(jScrollPane6);
        jScrollPane6.setBounds(500, 320, 130, 160);

        listEmpAsigLocal2.setBackground(new java.awt.Color(204, 227, 255));
        listEmpAsigLocal2.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane7.setViewportView(listEmpAsigLocal2);

        jPanel10.add(jScrollPane7);
        jScrollPane7.setBounds(680, 320, 130, 160);

        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Transacciones");
        jPanel10.add(jLabel44);
        jLabel44.setBounds(500, 290, 84, 17);

        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Asignadas");
        jPanel10.add(jLabel45);
        jLabel45.setBounds(680, 290, 130, 17);

        btnAgrEmpLocal2.setBackground(new java.awt.Color(34, 131, 229));
        btnAgrEmpLocal2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnAgrEmpLocal2.setForeground(new java.awt.Color(255, 255, 255));
        btnAgrEmpLocal2.setText("Agregar");
        jPanel10.add(btnAgrEmpLocal2);
        btnAgrEmpLocal2.setBounds(500, 490, 130, 35);

        jLabel48.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("->");
        jPanel10.add(jLabel48);
        jLabel48.setBounds(650, 390, 16, 17);

        btnElimEmpLocal2.setBackground(new java.awt.Color(34, 131, 229));
        btnElimEmpLocal2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnElimEmpLocal2.setForeground(new java.awt.Color(255, 255, 255));
        btnElimEmpLocal2.setText("Eliminar");
        btnElimEmpLocal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimEmpLocal2ActionPerformed(evt);
            }
        });
        jPanel10.add(btnElimEmpLocal2);
        btnElimEmpLocal2.setBounds(680, 490, 130, 35);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/degradados/Skyline.jpg"))); // NOI18N
        jLabel7.setText("jLabel3");
        jLabel7.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel10.add(jLabel7);
        jLabel7.setBounds(-7, -10, 1270, 130);

        jPanel18.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 680));

        tabbedPane.addTab("Citas y tickets", jPanel18);

        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(125, 177, 229));
        jPanel11.setLayout(null);

        jLabel38.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/users.png"))); // NOI18N
        jLabel38.setText(" Colas en tiempo real");
        jPanel11.add(jLabel38);
        jLabel38.setBounds(60, 50, 220, 24);

        treeColas.setBackground(new java.awt.Color(204, 227, 255));
        treeColas.setForeground(new java.awt.Color(51, 51, 51));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Empresa");
        treeColas.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane3.setViewportView(treeColas);

        jPanel11.add(jScrollPane3);
        jScrollPane3.setBounds(140, 170, 620, 382);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/degradados/Skyline.jpg"))); // NOI18N
        jLabel8.setText("jLabel3");
        jLabel8.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel11.add(jLabel8);
        jLabel8.setBounds(-7, -10, 1270, 130);

        jPanel19.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 680));

        tabbedPane.addTab("Colas", jPanel19);

        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(125, 177, 229));
        jPanel6.setForeground(new java.awt.Color(125, 177, 229));
        jPanel6.setLayout(null);

        jLabel41.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/unlock.png"))); // NOI18N
        jLabel41.setText(" Bitácora de acceso");
        jLabel41.setToolTipText("");
        jPanel6.add(jLabel41);
        jLabel41.setBounds(60, 50, 220, 24);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/degradados/Skyline.jpg"))); // NOI18N
        jLabel9.setText("jLabel3");
        jLabel9.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel6.add(jLabel9);
        jLabel9.setBounds(-7, -10, 1270, 130);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabla);

        jPanel6.add(jScrollPane2);
        jScrollPane2.setBounds(150, 170, 690, 420);

        jPanel20.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 680));

        tabbedPane.addTab("Bitácora de acceso", jPanel20);

        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(125, 177, 229));
        jPanel5.setForeground(new java.awt.Color(125, 177, 229));
        jPanel5.setLayout(null);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/Estadisticas.png"))); // NOI18N
        jPanel5.add(jLabel18);
        jLabel18.setBounds(100, 140, 260, 211);

        jLabel23.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/bar-chart-2.png"))); // NOI18N
        jLabel23.setText(" Análisis de datos");
        jPanel5.add(jLabel23);
        jLabel23.setBounds(60, 50, 200, 24);

        btnPDF.setBackground(new java.awt.Color(34, 131, 229));
        btnPDF.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnPDF.setForeground(new java.awt.Color(255, 255, 255));
        btnPDF.setText("Imprimir reporte estadístico");
        jPanel5.add(btnPDF);
        btnPDF.setBounds(140, 350, 210, 35);

        btnMapa.setBackground(new java.awt.Color(34, 131, 229));
        btnMapa.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnMapa.setForeground(new java.awt.Color(255, 255, 255));
        btnMapa.setText("Ver ubicacion del local");
        btnMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMapaActionPerformed(evt);
            }
        });
        jPanel5.add(btnMapa);
        btnMapa.setBounds(140, 480, 210, 35);

        cboLocalesMapa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel5.add(cboLocalesMapa);
        cboLocalesMapa.setBounds(140, 430, 210, 23);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Locales");
        jPanel5.add(jLabel1);
        jLabel1.setBounds(140, 410, 210, 17);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/degradados/Skyline.jpg"))); // NOI18N
        jLabel12.setText("jLabel3");
        jLabel12.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel5.add(jLabel12);
        jLabel12.setBounds(-7, -10, 1270, 130);

        jPanel21.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 680));

        tabbedPane.addTab("Análisis de datos", jPanel21);

        getContentPane().add(tabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 1130, 660));

        jMenu1.setText("Cuenta");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/user-plus.png"))); // NOI18N
        jMenuItem1.setText("Cambiar de cuenta");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/log-out.png"))); // NOI18N
        jMenuItem2.setText("Cerrar sesión");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarUserActionPerformed
        int tipo = cboTipoUser.getSelectedIndex();
        boolean agregado = false;
        if (txtNomUser.getText().isEmpty() || txtNomDeUsuario.getText().isEmpty() || txtPassUser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "Entrada inválida", 2);
        } else {
            if (btnEditUser.getText().equals("Modificar usuario")) {
                if (ds.idValido(txtIdUser.getText())) {
                    if (ds.userValido(txtNomDeUsuario.getText())) {
                        // Agregar nuevo usuario
                        switch (tipo) {
                            case 1: {
                                ds.addAdmin(txtIdUser.getText(), txtNomUser.getText(),
                                        txtNomDeUsuario.getText(), txtPassUser.getText());
                                agregado = true;
                                break;
                            }
                            case 2: {
                                ds.addGerSinLocal(txtIdUser.getText(), txtNomUser.getText(),
                                        txtNomDeUsuario.getText(), txtPassUser.getText());
                                agregado = true;
                                break;
                            }
                            case 3: {
                                ds.addEmpSinArea(txtIdUser.getText(), txtNomUser.getText(),
                                        txtNomDeUsuario.getText(), txtPassUser.getText());
                                agregado = true;
                                break;
                            }
                            default: {
                                JOptionPane.showMessageDialog(this, "Debe seleccionar un tipo de usuario.",
                                        "Tipo de usuario nulo", 2);
                                break;
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "El nombre de usuario ingresado ya está ocupado.", "", 2);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Ya existe un usuario con la identidad ingresada.", "", 2);
                }
            } else {
                // MODIFICAR AQUI
                cboTipoUser.setEnabled(true);
                Usuario user = (Usuario) cboUsuarios.getModel().getSelectedItem();
                if (user instanceof Administrador) {
                    ds.modUsuario(user.getId(), "Administradores", txtIdUser.getText(),
                            txtNomUser.getText(), txtNomDeUsuario.getText(),
                            txtPassUser.getText());
                } else if (user instanceof Gerente) {
                    ds.modUsuario(user.getId(), "Gerentes", txtIdUser.getText(),
                            txtNomUser.getText(), txtNomDeUsuario.getText(),
                            txtPassUser.getText());
                    ds.modUsuario(user.getId(), "GerSinLocal", txtIdUser.getText(),
                            txtNomUser.getText(), txtNomDeUsuario.getText(),
                            txtPassUser.getText());
                } else {
                    ds.modUsuario(user.getId(), "Empleados", txtIdUser.getText(),
                            txtNomUser.getText(), txtNomDeUsuario.getText(),
                            txtPassUser.getText());
                    ds.modUsuario(user.getId(), "EmpSinArea", txtIdUser.getText(),
                            txtNomUser.getText(), txtNomDeUsuario.getText(),
                            txtPassUser.getText());
                }
                btnEditUser.doClick();
                limpiarTab1();
                JOptionPane.showMessageDialog(this, "Usuario modificado exitosamente.", "", 1);
            }
        }
        if (agregado) {
            limpiarTab1();
            cboUsuarios.setModel(ds.llenarCboUsuarios());
            JOptionPane.showMessageDialog(this, "Usuario agregado exitosamente.", "", 1);
        }
    }//GEN-LAST:event_btnGuardarUserActionPerformed

    private void btnGuardarLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarLocalActionPerformed
        if (txtNomLocal.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "", 2);
        } else {
            if (btnGuardarLocal.getText().equals("Guardar")) {
                DefaultListModel modeloGer = (DefaultListModel) listGer.getModel();
                DefaultListModel modeloGerLocal = (DefaultListModel) listGerLocal.getModel();
                ds.addLocal(txtNomLocal.getText(),
                        String.valueOf(spLatitud.getValue()),
                        String.valueOf(spLongitud.getValue()));
                txtNomLocal.setText(null);
                Local local = ds.getLocales().get(ds.getLocales().size() - 1);
                if (listGerLocal.getModel().getSize() == 1) {
                    Gerente ger = (Gerente) modeloGerLocal.getElementAt(0);
                    ds.addGerente(ger.getIdentidad(), ger.getNombre(),
                            ger.getNombreUsuario(), ger.getPass(), local);
                    ds.elimGerSinLocal(ger.getId());
                }
                limpiarTab2();
                cboLocal.setModel(ds.llenarCboLocales());
                JOptionPane.showMessageDialog(this, "Local agregado exitosamente.", "", 1);
            } else {
                // MODIFICAR AQUI
                DefaultListModel modeloGer = (DefaultListModel) listGer.getModel();
                DefaultListModel modeloGerLocal = (DefaultListModel) listGerLocal.getModel();
                Local local = (Local) cboLocal.getSelectedItem();
                ds.modLocal(local.getId(), txtNomLocal.getText(),
                        String.valueOf(spLatitud.getValue()),
                        String.valueOf(spLongitud.getValue()));
                // Reiniciar la tabla de GerSinLocal
                ds.elimGerSinLocal();
                if (modeloGerLocal.getSize() == 1) {
                    // Asignar gerente al local
                    Gerente ger = (Gerente) modeloGerLocal.getElementAt(0);
                    ds.addGerente(ger.getIdentidad(), ger.getNombre(),
                            ger.getNombreUsuario(), ger.getPass(), local);
                } else {
                    try {
                        ds.elimGerente(local.getGerente().getId());
                    } catch (Exception e) {
                    }
                }
                if (modeloGer.getSize() > 0) {
                    for (Object gerente : modeloGer.toArray()) {
                        Gerente ger = (Gerente) gerente;
                        // Actualizar la tabla GerSinLocal
                        ds.addGerSinLocal(ger.getIdentidad(), ger.getNombre(),
                                ger.getNombreUsuario(), ger.getPass());
                    }
                }
                limpiarTab2();
                btnEditLocal.doClick();
                JOptionPane.showMessageDialog(this, "Local modificado exitosamente.", "", 1);
            }
            actualizarTodo();
        }
    }//GEN-LAST:event_btnGuardarLocalActionPerformed

    private void btnGuardarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAreaActionPerformed
        if (txtNomArea.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "", 2);
        } else {
            DefaultListModel modeloEmpArea = (DefaultListModel) listEmpArea.getModel();
            DefaultListModel modeloEmp = (DefaultListModel) listEmp.getModel();
            DefaultListModel modeloTranArea = (DefaultListModel) listTranArea.getModel();
            DefaultListModel modeloTran = (DefaultListModel) listTran.getModel();
            if (btnGuardarArea.getText().equals("Guardar")) {
                if (cboLocalArea.getSelectedIndex() >= 0) {
                    Local local = (Local) cboLocalArea.getSelectedItem();
                    ds.addArea(txtNomArea.getText(), local);
                    Area area = local.getAreas().get(local.getAreas().size() - 1);
                    actualizarEmpTran(area);
                    limpiarTab3();
                    btnEditArea.doClick();
                    cboArea.setModel(ds.llenarCboAreas());
                    JOptionPane.showMessageDialog(this, "Área agregada exitosamente.", "", 1);
                }
            } else {
                // MODIFICAR AQUI
                if (cboArea.getSelectedIndex() >= 0) {
                    Local local = (Local) cboLocalArea.getSelectedItem();
                    Area area = (Area) cboArea.getSelectedItem();
                    ds.modArea(area.getId(), txtNomArea.getText(), local);
                    actualizarEmpTran(area);
                    limpiarTab3();
                    btnEditArea.doClick();
                    cboArea.setModel(ds.llenarCboAreas());
                    JOptionPane.showMessageDialog(this, "Área modificada exitosamente.", "", 1);
                }
            }
            actualizarTodo();
        }
    }//GEN-LAST:event_btnGuardarAreaActionPerformed

    private void btnAddEmpAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmpAreaActionPerformed
        if (listEmp.getSelectedIndex() >= 0) {
            DefaultListModel listEmpModel = (DefaultListModel) listEmp.getModel();
            DefaultListModel listEmpAreaModel = (DefaultListModel) listEmpArea.getModel();
            Empleado emp = (Empleado) listEmpModel.elementAt(listEmp.getSelectedIndex());
            listEmpAreaModel.addElement(emp);
            listEmpModel.removeElement(emp);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un empleado.", "", 2);
        }
    }//GEN-LAST:event_btnAddEmpAreaActionPerformed

    private void btnElimEmpAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimEmpAreaActionPerformed
        if (listEmpArea.getSelectedIndex() >= 0) {
            DefaultListModel listEmpModel = (DefaultListModel) listEmp.getModel();
            DefaultListModel listEmpAreaModel = (DefaultListModel) listEmpArea.getModel();
            Empleado emp = (Empleado) listEmpAreaModel.elementAt(listEmpArea.getSelectedIndex());
            listEmpModel.addElement(emp);
            listEmpAreaModel.removeElement(emp);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un empleado.", "", 2);
        }
    }//GEN-LAST:event_btnElimEmpAreaActionPerformed

    private void btnGuardarTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTranActionPerformed
        if (txtTipoTran.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "", 2);
        } else {
            if (btnGuardarTran.getText().equals("Guardar")) {
                ds.addTranSinArea(txtTipoTran.getText(),
                        (Integer) spTiemTran.getValue());
                limpiarTab4();
                cboTran.setModel(ds.llenarCboTransacciones());
                JOptionPane.showMessageDialog(this, "Transacción agregada exitosamente.", "", 1);
            } else {
                // MODIFICAR AQUI
                Transaccion tran = (Transaccion)cboTran.getSelectedItem();
                ds.modTran(tran.getId(), txtTipoTran.getText(),
                        (Integer) spTiemTran.getValue());
                btnEditTran.doClick();
                cboTran.setEnabled(true);
                JOptionPane.showMessageDialog(this, "Transacción modificada exitosamente.", "", 1);
            }
            actualizarTodo();
        }
    }//GEN-LAST:event_btnGuardarTranActionPerformed

    private void cboGuardarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGuardarCitaActionPerformed

    }//GEN-LAST:event_cboGuardarCitaActionPerformed

    private void btnCargarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarCitaActionPerformed
        
    }//GEN-LAST:event_btnCargarCitaActionPerformed

    private void btnElimEmpLocal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimEmpLocal2ActionPerformed

    }//GEN-LAST:event_btnElimEmpLocal2ActionPerformed

    private void cboLocalCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLocalCitaActionPerformed
        cboAreaCita.setModel(ds.llenarCboAreas((Local) cboLocalCita.getSelectedItem()));
    }//GEN-LAST:event_cboLocalCitaActionPerformed

    private void btnMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMapaActionPerformed
        if (cboLocalesMapa.getSelectedIndex() >= 0) {
            ImageIcon icono = new ImageIcon(FrameAdmin.class.getResource("cargando.gif").getFile());
            JOptionPane.showMessageDialog(this,
                    "Por favor espere unos segundos mientras carga el mapa del local."
                    + "\nPresione OK para continuar.",
                    "Cargando mapa", 1, icono);
            Local local = (Local) cboLocalesMapa.getSelectedItem();
            new Mapa().coordenadas(local.getLatitud(), local.getLongitud(), local.getNombre());
        }
    }//GEN-LAST:event_btnMapaActionPerformed

    private void tabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabbedPaneStateChanged
        actualizarTodo();
    }//GEN-LAST:event_tabbedPaneStateChanged

    private void cboTipoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoUserActionPerformed

    }//GEN-LAST:event_cboTipoUserActionPerformed

    private void cboUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboUsuariosActionPerformed

    }//GEN-LAST:event_cboUsuariosActionPerformed

    private void btnListarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarUserActionPerformed
        new FrameListar().listarUsuarios();
    }//GEN-LAST:event_btnListarUserActionPerformed

    private void btnReenviarTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReenviarTicketActionPerformed
        // JOptionPane.showInputDialog("Ingrese la posicion de la cola ", fecha,
        // "Reenviar ticket", 2);
    }//GEN-LAST:event_btnReenviarTicketActionPerformed

    private void btnAddGerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGerActionPerformed
        if (listGer.getSelectedIndex() >= 0) {
            DefaultListModel listGerModel = (DefaultListModel) listGer.getModel();
            DefaultListModel listGerLocalModel = (DefaultListModel) listGerLocal.getModel();
            Gerente gerente = (Gerente) listGerModel.elementAt(listGer.getSelectedIndex());
            if (listGerLocal.getModel().getSize() == 1) {
                Gerente asignado = (Gerente) listGerLocalModel.getElementAt(0);
                listGerLocalModel.removeElement(asignado);
                listGerLocalModel.addElement(gerente);
                listGerModel.addElement(asignado);
                listGerModel.removeElement(gerente);
            } else {
                listGerLocalModel.addElement(gerente);
                listGerModel.removeElement(gerente);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un gerente.", "", 2);
        }
    }//GEN-LAST:event_btnAddGerActionPerformed

    private void btnElimGerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimGerActionPerformed
        if (listGerLocal.getSelectedIndex() >= 0) {
            DefaultListModel listGerModel = (DefaultListModel) listGer.getModel();
            DefaultListModel listGerLocalModel = (DefaultListModel) listGerLocal.getModel();
            Gerente gerente = (Gerente) listGerLocalModel.elementAt(listGerLocal.getSelectedIndex());
            listGerLocalModel.removeElement(gerente);
            listGerModel.addElement(gerente);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un gerente.", "", 2);
        }
    }//GEN-LAST:event_btnElimGerActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setVisible(false);
        if (user != null) {
            ds.addBitacora(user, "Cierre de sesión");
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
        if (user != null) {
            ds.addBitacora(user, "Cierre de sesión");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditUserActionPerformed
        if (cboUsuarios.getSelectedIndex() >= 0) {
            if (btnEditUser.getText().equals("Modificar usuario")) {
                cboTipoUser.setEnabled(false);
                cboUsuarios.setEnabled(false);
                btnGuardarUser.setText("Guardar cambios");
                btnEditUser.setText("Cancelar");
                Usuario user = (Usuario) cboUsuarios.getSelectedItem();
                if (user instanceof Administrador) {
                    cboTipoUser.setSelectedIndex(1);
                } else if (user instanceof Gerente) {
                    cboTipoUser.setSelectedIndex(2);
                } else {
                    cboTipoUser.setSelectedIndex(3);
                }
                txtNomUser.setText(user.getNombre());
                txtIdUser.setText(user.getIdentidad());
                txtNomDeUsuario.setText(user.getNombreUsuario());
                txtPassUser.setText(user.getPass());
            } else {
                cboTipoUser.setEnabled(true);
                cboUsuarios.setEnabled(true);
                btnGuardarUser.setText("Guardar");
                btnEditUser.setText("Modificar usuario");
                limpiarTab1();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un usuario.", "", 2);
        }
    }//GEN-LAST:event_btnEditUserActionPerformed

    private void btnEditLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditLocalActionPerformed
        if (cboLocal.getSelectedIndex() >= 0) {
            if (btnEditLocal.getText().equals("Modificar local")) {
                cboLocal.setEnabled(false);
                btnGuardarLocal.setText("Guardar cambios");
                btnEditLocal.setText("Cancelar");
                Local local = (Local) cboLocal.getSelectedItem();
                txtNomLocal.setText(local.getNombre());
                spLatitud.setValue(Double.parseDouble(local.getLatitud()));
                spLongitud.setValue(Double.parseDouble(local.getLongitud()));
                listGer.setModel(ds.llenarListGerentes());
                listGerLocal.setModel(ds.llenarListGerente(local));
            } else {
                cboLocal.setEnabled(true);
                listGer.setModel(ds.llenarListGerentes());
                listGerLocal.setModel(new DefaultListModel());
                btnGuardarLocal.setText("Guardar");
                btnEditLocal.setText("Modificar local");
                limpiarTab2();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un local.", "", 2);
        }
    }//GEN-LAST:event_btnEditLocalActionPerformed

    private void btnEditAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAreaActionPerformed
        if (cboArea.getSelectedIndex() >= 0) {
            if (btnEditArea.getText().equals("Modificar área")) {
                cboArea.setEnabled(false);
                btnGuardarArea.setText("Guardar cambios");
                btnEditArea.setText("Cancelar");
                Area area = (Area) cboArea.getSelectedItem();
                txtNomArea.setText(area.getNombre());
                listEmpArea.setModel(ds.llenarListEmpleados(area));
                listTranArea.setModel(ds.llenarListTranArea(area));
                // listTran.setModel(ds.llenarListTran(area));
                listTran.setModel(ds.llenarListTranValidado(area));
                // Seleccionar en cboLocalArea el local al que pertenece
            } else {
                cboArea.setEnabled(true);
                listEmp.setModel(ds.llenarListEmpleados());
                listTran.setModel(ds.llenarListTran());
                listEmpArea.setModel(new DefaultListModel());
                listTranArea.setModel(new DefaultListModel());
                btnGuardarArea.setText("Guardar");
                btnEditArea.setText("Modificar área");
                limpiarTab3();
                actualizarTodo();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un área.", "", 2);
        }
    }//GEN-LAST:event_btnEditAreaActionPerformed

    private void btnEditTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditTranActionPerformed
        if (cboTran.getSelectedIndex() >= 0) {
            if (btnEditTran.getText().equals("Modificar transacción")) {
                cboTran.setEnabled(false);
                btnGuardarTran.setText("Guardar cambios");
                btnEditTran.setText("Cancelar");
                Transaccion tran = (Transaccion) cboTran.getSelectedItem();
                txtTipoTran.setText(tran.getTipo());
                spTiemTran.setValue(tran.getTiempo());
            } else {
                cboTran.setEnabled(true);
                btnGuardarTran.setText("Guardar");
                btnEditTran.setText("Modificar transacción");
                limpiarTab4();
                actualizarTodo();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una transacción.", "", 2);
        }
    }//GEN-LAST:event_btnEditTranActionPerformed

    private void btnElimTranAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimTranAreaActionPerformed
        if (listTranArea.getSelectedIndex() >= 0) {
            DefaultListModel listTranModel = (DefaultListModel) listTran.getModel();
            DefaultListModel listTranAreaModel = (DefaultListModel) listTranArea.getModel();
            Transaccion tran = (Transaccion) listTranAreaModel.elementAt(listTranArea.getSelectedIndex());
            listTranModel.addElement(tran);
            listTranAreaModel.removeElement(tran);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una transacción.", "", 2);
        }
    }//GEN-LAST:event_btnElimTranAreaActionPerformed

    private void btnAddTranAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTranAreaActionPerformed
        if (listTran.getSelectedIndex() >= 0) {
            DefaultListModel listTranModel = (DefaultListModel) listTran.getModel();
            DefaultListModel listTranAreaModel = (DefaultListModel) listTranArea.getModel();
            boolean valido = true;
            if (listTranAreaModel.getSize() > 0) {
                for (Object tran : listTranAreaModel.toArray()) {
                    String tranSeleccionada = listTranModel.getElementAt(
                            listTran.getSelectedIndex()).toString();
                    String tranAgregada = tran.toString();
                    if (tranSeleccionada.equals(tranAgregada)) {
                        valido = false;
                    }
                }
            }
            if (valido) {
                Transaccion tran = (Transaccion) listTranModel.elementAt(listTran.getSelectedIndex());
                listTranAreaModel.addElement(tran);
                listTranModel.removeElement(tran);
            } else {
                JOptionPane.showMessageDialog(this, "La transacción seleccionada ya ha sido agregada.", "", 2);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una transacción.", "", 2);
        }
    }//GEN-LAST:event_btnAddTranAreaActionPerformed

    private void btnElimUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimUserActionPerformed
        if (cboUsuarios.getSelectedIndex() >= 0) {
            int confirmar = JOptionPane.showConfirmDialog(this,
                    "¿Está seguro que desea eliminar el usuario seleccionado?"
                    + "\nEsta acción no se puede deshacer.", "Eliminar usuario",
                    JOptionPane.YES_NO_OPTION);
            if (confirmar == JOptionPane.YES_OPTION) {
                Usuario user = (Usuario) cboUsuarios.getSelectedItem();
                if (user instanceof Administrador) {
                    ds.elimAdmin(user.getId());
                } else if (user instanceof Gerente) {
                    ds.elimGerSinLocal(user.getId());
                    ds.elimGerente(user.getId());
                } else {
                    ds.elimEmpSinArea(user.getId());
                    ds.elimEmpleado(user.getId());
                }
                actualizarTodo();
                JOptionPane.showMessageDialog(this, "Usuario eliminado exitosamente.", "", 1);
            } else {
                JOptionPane.showMessageDialog(this, "Acción cancelada.", "", 1);
            }
        }
    }//GEN-LAST:event_btnElimUserActionPerformed

    private void btnElimLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimLocalActionPerformed
        if (cboLocal.getSelectedIndex() >= 0) {
            int confirmar = JOptionPane.showConfirmDialog(this,
                    "¿Está seguro que desea eliminar el local seleccionado?"
                    + "\nEsta acción no se puede deshacer.", "Eliminar local",
                    JOptionPane.YES_NO_OPTION);
            if (confirmar == JOptionPane.YES_OPTION) {
                Local local = (Local) cboLocal.getSelectedItem();
                ds.elimLocal(local.getId());
                actualizarTodo();
                JOptionPane.showMessageDialog(this, "Usuario eliminado exitosamente.", "", 1);
            } else {
                JOptionPane.showMessageDialog(this, "Acción cancelada.", "", 1);
            }
        }
    }//GEN-LAST:event_btnElimLocalActionPerformed

    private void btnElimAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimAreaActionPerformed
        if (cboArea.getSelectedIndex() >= 0) {
            int confirmar = JOptionPane.showConfirmDialog(this,
                    "¿Está seguro que desea eliminar el área seleccionada?"
                    + "\nEsta acción no se puede deshacer.", "Eliminar área",
                    JOptionPane.YES_NO_OPTION);
            if (confirmar == JOptionPane.YES_OPTION) {
                Area area = (Area) cboArea.getSelectedItem();
                ds.elimArea(area.getId());
                actualizarTodo();
                JOptionPane.showMessageDialog(this, "Área eliminada exitosamente.", "", 1);
            } else {
                JOptionPane.showMessageDialog(this, "Acción cancelada.", "", 1);
            }
        }
    }//GEN-LAST:event_btnElimAreaActionPerformed

    private void btnElimTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimTranActionPerformed
        if (cboTran.getSelectedIndex() >= 0) {
            int confirmar = JOptionPane.showConfirmDialog(this,
                    "¿Está seguro que desea eliminar la transacción seleccionada?"
                    + "\nSerá borrada también de todas las áreas a las que fue asignada."
                    + "\nEsta acción no se puede deshacer.",
                    "Eliminar transacción",
                    JOptionPane.YES_NO_OPTION);
            if (confirmar == JOptionPane.YES_OPTION) {
                Transaccion tran = (Transaccion) cboTran.getSelectedItem();
                ds.elimTranSinArea(tran.getId());
                actualizarTodo();
                JOptionPane.showMessageDialog(this, "Transacción eliminada exitosamente.", "", 1);
            } else {
                JOptionPane.showMessageDialog(this, "Acción cancelada.", "", 1);
            }
        }
    }//GEN-LAST:event_btnElimTranActionPerformed

    private void btnListarLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarLocalActionPerformed
        new FrameListar().listarLocales();
    }//GEN-LAST:event_btnListarLocalActionPerformed

    private void btnListarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAreaActionPerformed
        new FrameListar().listarAreas();
    }//GEN-LAST:event_btnListarAreaActionPerformed

    private void btnListarTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTranActionPerformed
        new FrameListar().listarTransacciones();
    }//GEN-LAST:event_btnListarTranActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmpArea;
    private javax.swing.JButton btnAddGer;
    private javax.swing.JButton btnAddTranArea;
    private javax.swing.JButton btnAgrEmpLocal2;
    private javax.swing.JButton btnCargarCita;
    private javax.swing.JToggleButton btnEditArea;
    private javax.swing.JToggleButton btnEditLocal;
    private javax.swing.JToggleButton btnEditTran;
    private javax.swing.JToggleButton btnEditUser;
    private javax.swing.JButton btnElimArea;
    private javax.swing.JButton btnElimEmpArea;
    private javax.swing.JButton btnElimEmpLocal2;
    private javax.swing.JButton btnElimGer;
    private javax.swing.JButton btnElimLocal;
    private javax.swing.JButton btnElimTran;
    private javax.swing.JButton btnElimTranArea;
    private javax.swing.JButton btnElimUser;
    private javax.swing.JButton btnGuardarArea;
    private javax.swing.JButton btnGuardarLocal;
    private javax.swing.JButton btnGuardarTran;
    private javax.swing.JButton btnGuardarUser;
    private javax.swing.JButton btnListarArea;
    private javax.swing.JButton btnListarLocal;
    private javax.swing.JButton btnListarTran;
    private javax.swing.JButton btnListarUser;
    private javax.swing.JButton btnMapa;
    private javax.swing.JButton btnPDF;
    private javax.swing.JButton btnReenviarTicket;
    private javax.swing.JComboBox<String> cboArea;
    private javax.swing.JComboBox<String> cboAreaCita;
    private javax.swing.JButton cboGuardarCita;
    private javax.swing.JComboBox<String> cboLocal;
    private javax.swing.JComboBox<String> cboLocalArea;
    private javax.swing.JComboBox<String> cboLocalCita;
    private javax.swing.JComboBox<String> cboLocalesMapa;
    private javax.swing.JComboBox<String> cboTipoUser;
    private javax.swing.JComboBox<String> cboTran;
    private javax.swing.JComboBox<String> cboUsuarios;
    private com.toedter.calendar.JDateChooser dcCita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblCboUser;
    private javax.swing.JList<String> listEmp;
    private javax.swing.JList<String> listEmpArea;
    private javax.swing.JList<String> listEmpAsigLocal2;
    private javax.swing.JList<String> listEmpLocal2;
    private javax.swing.JList<String> listGer;
    private javax.swing.JList<String> listGerLocal;
    private javax.swing.JList<String> listTran;
    private javax.swing.JList<String> listTranArea;
    private javax.swing.JPanel pnlFechaCitaAdmin;
    private javax.swing.JSpinner spLatitud;
    private javax.swing.JSpinner spLongitud;
    private javax.swing.JSpinner spTiemTran;
    private p2proyecto_pamelaramirez.UIAdmin tabbedPane;
    private javax.swing.JTable tabla;
    private javax.swing.JTree treeColas;
    private javax.swing.JFormattedTextField txtIdCita;
    private javax.swing.JFormattedTextField txtIdUser;
    private javax.swing.JTextField txtNomArea;
    private javax.swing.JTextField txtNomDeUsuario;
    private javax.swing.JTextField txtNomLocal;
    private javax.swing.JTextField txtNomUser;
    private javax.swing.JTextField txtPassUser;
    private javax.swing.JTextField txtTipoTran;
    // End of variables declaration//GEN-END:variables

    public void llenarArbolColas() {
        /*if (!locales.isEmpty()) {
            // Modelos
            DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Empresa");
            DefaultTreeModel treeModelo = new DefaultTreeModel(raiz);
            // Nodos
            DefaultMutableTreeNode nodoLocal = new DefaultMutableTreeNode ();
            DefaultMutableTreeNode nodoArea = new DefaultMutableTreeNode();
            DefaultMutableTreeNode nodoEmp = new DefaultMutableTreeNode ();
            DefaultMutableTreeNode nodoCola = new DefaultMutableTreeNode ();
            DefaultMutableTreeNode nodoCliente = new DefaultMutableTreeNode ();
            
            for (Local local : locales) {
                nodoLocal = new DefaultMutableTreeNode(local);
                if (!local.getAreas().isEmpty()) {
                    for (Area area : local.getAreas()) {
                        nodoArea = new DefaultMutableTreeNode(area);
                        if (!area.getCola().isEmpty()) {
                            nodoCola = new DefaultMutableTreeNode("Cola");
                            for (Cliente cliente : area.getCola()) {
                                nodoCliente = new DefaultMutableTreeNode(cliente.identidad);
                                nodoCola.add(nodoCliente);
                            }
                            nodoArea.add(nodoCola);
                        }
                        nodoLocal.add(nodoArea);
                    }
                }
                raiz.add(nodoLocal);
            }
            treeModelo.reload();
            treeColas.setModel(treeModelo);
        }*/
    }

    /*public Cliente buscarCliente() {
        Cliente clienteSeleccionado = null;
        if (!locales.isEmpty()) {
            for (Local local : locales) {
                if (!local.getAreas().isEmpty()) {
                    for (Area area : local.getAreas()) {
                        if (!area.getCola().isEmpty()) {
                            for (Cliente cliente : area.getCola()) {
                                if (cliente.identidad.equalsIgnoreCase(txtIdCita.getText())) {
                                    this.local = local;
                                    this.area = area;
                                    clienteSeleccionado = cliente;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return clienteSeleccionado;
    }*/
    // Metodos de limpiar tabs aqui
}
