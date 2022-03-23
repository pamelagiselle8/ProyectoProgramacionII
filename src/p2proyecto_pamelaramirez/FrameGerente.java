package p2proyecto_pamelaramirez;

import java.text.*;
import java.util.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class FrameGerente extends javax.swing.JFrame {

    DatosSistema ds = new DatosSistema();
    Date fecha = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Usuario user;
    Local local;

    public FrameGerente() {
        initComponents();
        this.setTitle("Gerente");
        this.setLocationRelativeTo(null);
    }

    public void ingresar(Usuario gerente) {
        this.user = gerente;
        for (Local local : ds.getLocales()) {
            if (local.getGerente() != null) {
                if (local.getGerente().getId() == gerente.getId()) {
                    this.local = local;
                    this.setTitle("Gerente (Local: " + local.getNombre() + ")");
                }
            }
        }
        actualizarTodo();
        this.setVisible(true);
    }

    public void limpiarTab1() {
        txtNomUser.setText(null);
        txtIdUser.setText(null);
        txtNomDeUsuario.setText(null);
        txtPassUser.setText(null);
    }

    public void limpiarTab2() {
    }

    public void limpiarTab3() {

    }

    public void limpiarTab4() {

    }

    // Actualiza todas las tabs con info de arraylists
    public void actualizarTodo() {
        int tab = tabbedPane.getSelectedIndex();
        switch (tab) {
            case 0: {
                // Tab usuarios
                limpiarTab1();
                cboEmpleados.setModel(ds.llenarCboEmpleados(local));
                break;
            }
            case 1: {
                // Tab locales
                limpiarTab2();
                cboArea.setModel(ds.llenarCboAreas(local));
                listEmp.setModel(ds.llenarListEmpleados());
                listTran.setModel(ds.llenarListTran());
                break;
            }
            case 2: {
                // Tab areas

                break;
            }
            case 3: {
                // Tab transacciones
                limpiarTab4();

                break;
            }
            case 4: {
                // Tab citas y tickets

                break;
            }
            case 5: {
                // Tab colas

                break;
            }
            case 6: {
                // Tab bitacora

                break;
            }
            case 7: {
                // Tab analisis de datos

                break;
            }
        }
    }

    public void actualizarEmpTran(Area area) {
        DefaultListModel modeloEmpArea = (DefaultListModel) listEmpArea.getModel();
        DefaultListModel modeloEmp = (DefaultListModel) listEmp.getModel();
        DefaultListModel modeloTranArea = (DefaultListModel) listTranArea.getModel();
        DefaultListModel modeloTran = (DefaultListModel) listTran.getModel();
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
                boolean existe = false;
                if (!ds.getEmpleados().isEmpty()) {
                    for (Empleado empSinArea : ds.getEmpleados()) {
                        if (emp.getId() == empSinArea.getId()) {
                            // Si el empleado ya existe en el array
                            existe = true;
                        }
                    }
                }
                if (!existe) {
                    // Si pasa a ser sin area, se agrega al array
                    ds.addEmpSinArea(emp.getIdentidad(), emp.getNombre(),
                        emp.getNombreUsuario(), emp.getPass());
                }
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
        jPanel15 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnListarEmp = new javax.swing.JButton();
        btnGuardarEmp = new javax.swing.JButton();
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
        btnElimEmp = new javax.swing.JButton();
        btnEditEmp = new javax.swing.JToggleButton();
        lblCboUser = new javax.swing.JLabel();
        cboEmpleados = new javax.swing.JComboBox<>();
        jPanel16 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        cboArea = new javax.swing.JComboBox<>();
        btnElimArea = new javax.swing.JButton();
        btnListarArea = new javax.swing.JButton();
        btnGuardarArea = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        txtNomArea = new javax.swing.JTextField();
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
        jPanel22 = new javax.swing.JPanel();
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
        jPanel23 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
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
        jPanel24 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        treeColas = new javax.swing.JTree();
        jLabel8 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnPDF = new javax.swing.JButton();
        btnMapa = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnCambiarCuentaAdmin = new javax.swing.JMenuItem();
        btnCerrarSesionAdmin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1040, 670));
        setResizable(false);
        setSize(new java.awt.Dimension(1040, 670));
        getContentPane().setLayout(null);

        tabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabbedPaneStateChanged(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(125, 177, 229));
        jPanel15.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(125, 177, 229));
        jPanel1.setForeground(new java.awt.Color(125, 177, 229));
        jPanel1.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/user.png"))); // NOI18N
        jLabel10.setText(" Administración de empleados");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 50, 310, 24);

        btnListarEmp.setBackground(new java.awt.Color(34, 131, 229));
        btnListarEmp.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnListarEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnListarEmp.setText("Listar empleados registrados");
        btnListarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btnListarEmp);
        btnListarEmp.setBounds(520, 340, 220, 35);

        btnGuardarEmp.setBackground(new java.awt.Color(34, 131, 229));
        btnGuardarEmp.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnGuardarEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/save (1).png"))); // NOI18N
        btnGuardarEmp.setText(" Guardar");
        btnGuardarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarEmp);
        btnGuardarEmp.setBounds(140, 450, 220, 35);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nombre");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(140, 160, 220, 17);

        txtNomUser.setBackground(new java.awt.Color(204, 227, 255));
        txtNomUser.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(txtNomUser);
        txtNomUser.setBounds(140, 190, 220, 23);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Identidad");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(140, 230, 55, 17);

        txtIdUser.setBackground(new java.awt.Color(204, 227, 255));
        txtIdUser.setForeground(new java.awt.Color(51, 51, 51));
        try {
            txtIdUser.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtIdUser);
        txtIdUser.setBounds(140, 260, 220, 23);

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre de usuario");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(140, 300, 220, 17);

        txtNomDeUsuario.setBackground(new java.awt.Color(204, 227, 255));
        txtNomDeUsuario.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(txtNomDeUsuario);
        txtNomDeUsuario.setBounds(140, 330, 220, 23);

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Contraseña");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(140, 370, 220, 17);

        txtPassUser.setBackground(new java.awt.Color(204, 227, 255));
        txtPassUser.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(txtPassUser);
        txtPassUser.setBounds(140, 400, 220, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/degradados/Skyline.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-7, -10, 1270, 130);

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 900, 100);

        btnElimEmp.setBackground(new java.awt.Color(34, 131, 229));
        btnElimEmp.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnElimEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnElimEmp.setText("Eliminar empleado");
        btnElimEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btnElimEmp);
        btnElimEmp.setBounds(520, 290, 220, 35);

        btnEditEmp.setBackground(new java.awt.Color(34, 131, 229));
        btnEditEmp.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnEditEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnEditEmp.setText("Modificar empleado");
        btnEditEmp.setSize(new java.awt.Dimension(220, 35));
        btnEditEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditEmp);
        btnEditEmp.setBounds(520, 240, 220, 35);

        lblCboUser.setForeground(new java.awt.Color(255, 255, 255));
        lblCboUser.setText("Empleados registrados");
        jPanel1.add(lblCboUser);
        lblCboUser.setBounds(520, 160, 220, 17);

        cboEmpleados.setBackground(new java.awt.Color(50, 152, 255));
        cboEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        cboEmpleados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));
        cboEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEmpleadosActionPerformed(evt);
            }
        });
        jPanel1.add(cboEmpleados);
        cboEmpleados.setBounds(520, 190, 220, 23);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 83, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel15.add(jPanel14);
        jPanel14.setBounds(0, 0, 994, 719);

        tabbedPane.addTab("Empleados", jPanel15);

        jPanel16.setBackground(new java.awt.Color(125, 177, 229));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        cboArea.setBounds(520, 190, 290, 23);

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
        btnElimArea.setBounds(520, 290, 290, 35);

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
        btnListarArea.setBounds(520, 340, 290, 35);

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

        listEmpArea.setBackground(new java.awt.Color(204, 227, 255));
        listEmpArea.setForeground(new java.awt.Color(51, 51, 51));
        listEmpArea.setModel(new DefaultListModel());
        jScrollPane8.setViewportView(listEmpArea);

        jPanel13.add(jScrollPane8);
        jScrollPane8.setBounds(290, 260, 110, 140);

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Empleados");
        jPanel13.add(jLabel28);
        jLabel28.setBounds(140, 230, 100, 17);

        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Asignados");
        jPanel13.add(jLabel49);
        jLabel49.setBounds(290, 230, 90, 17);

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
        btnAddEmpArea.setBounds(140, 420, 110, 35);

        jLabel50.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("->");
        jPanel13.add(jLabel50);
        jLabel50.setBounds(260, 320, 20, 17);

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
        btnElimEmpArea.setBounds(290, 420, 110, 35);

        listEmp.setBackground(new java.awt.Color(204, 227, 255));
        listEmp.setForeground(new java.awt.Color(51, 51, 51));
        listEmp.setModel(new DefaultListModel());
        jScrollPane9.setViewportView(listEmp);

        jPanel13.add(jScrollPane9);
        jScrollPane9.setBounds(140, 260, 110, 140);

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
        btnEditArea.setBounds(520, 240, 290, 35);

        listTran.setBackground(new java.awt.Color(204, 227, 255));
        listTran.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane12.setViewportView(listTran);

        jPanel13.add(jScrollPane12);
        jScrollPane12.setBounds(520, 420, 120, 90);

        listTranArea.setBackground(new java.awt.Color(204, 227, 255));
        listTranArea.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane13.setViewportView(listTranArea);

        jPanel13.add(jScrollPane13);
        jScrollPane13.setBounds(690, 420, 120, 90);

        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Transacciones");
        jPanel13.add(jLabel53);
        jLabel53.setBounds(520, 390, 84, 17);

        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Asignadas");
        jPanel13.add(jLabel54);
        jLabel54.setBounds(690, 390, 100, 17);

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
        btnAddTranArea.setBounds(520, 530, 120, 35);

        jLabel55.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("->");
        jPanel13.add(jLabel55);
        jLabel55.setBounds(660, 460, 16, 17);

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
        btnElimTranArea.setBounds(690, 530, 120, 35);

        jPanel20.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 720));

        jPanel16.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 660));

        tabbedPane.addTab("Áreas", jPanel16);

        jPanel17.setBackground(new java.awt.Color(125, 177, 229));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel22.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 720));

        jPanel17.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 660));

        tabbedPane.addTab("Transacciones", jPanel17);

        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(125, 177, 229));
        jPanel10.setLayout(null);

        jLabel31.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/calendar.png"))); // NOI18N
        jLabel31.setText(" Administración de citas y tickets");
        jPanel10.add(jLabel31);
        jLabel31.setBounds(60, 50, 311, 24);

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Área");
        jPanel10.add(jLabel33);
        jLabel33.setBounds(140, 290, 220, 17);

        cboAreaCita.setBackground(new java.awt.Color(50, 152, 255));
        cboAreaCita.setForeground(new java.awt.Color(255, 255, 255));
        cboAreaCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));
        jPanel10.add(cboAreaCita);
        cboAreaCita.setBounds(140, 320, 220, 23);

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
        cboGuardarCita.setBounds(140, 370, 220, 35);

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
        btnReenviarTicket.setBounds(140, 420, 220, 35);

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

        jPanel23.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 720));

        jPanel18.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tabbedPane.addTab("Citas y tickets", jPanel18);

        jPanel19.setBackground(new java.awt.Color(125, 177, 229));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel24.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 720));

        jPanel19.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 660));

        tabbedPane.addTab("Colas", jPanel19);

        jPanel21.setBackground(new java.awt.Color(125, 177, 229));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        btnMapa.setBounds(140, 410, 210, 35);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/degradados/Skyline.jpg"))); // NOI18N
        jLabel12.setText("jLabel3");
        jLabel12.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel5.add(jLabel12);
        jLabel12.setBounds(-7, -10, 1270, 130);

        jPanel25.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 720));

        jPanel21.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 660));

        tabbedPane.addTab("Análisis de datos", jPanel21);

        getContentPane().add(tabbedPane);
        tabbedPane.setBounds(0, 0, 1040, 720);

        jMenuBar1.setBackground(new java.awt.Color(34, 131, 229));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/user.png"))); // NOI18N
        jMenu1.setText("Cuenta");

        btnCambiarCuentaAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/log-out.png"))); // NOI18N
        btnCambiarCuentaAdmin.setText("Cerrar sesion");
        btnCambiarCuentaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarCuentaAdminActionPerformed(evt);
            }
        });
        jMenu1.add(btnCambiarCuentaAdmin);

        btnCerrarSesionAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/user-plus.png"))); // NOI18N
        btnCerrarSesionAdmin.setText("Cambiar de cuenta");
        btnCerrarSesionAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionAdminActionPerformed(evt);
            }
        });
        jMenu1.add(btnCerrarSesionAdmin);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCambiarCuentaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarCuentaAdminActionPerformed
        this.setVisible(false);
        ds.addBitacora(user, "Cierre de sesión");
    }//GEN-LAST:event_btnCambiarCuentaAdminActionPerformed

    private void btnCerrarSesionAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionAdminActionPerformed
        this.setVisible(false);
        this.setVisible(true);
        ds.addBitacora(user, "Cierre de sesión");
    }//GEN-LAST:event_btnCerrarSesionAdminActionPerformed

    private void btnListarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarEmpActionPerformed
        new FrameListar().listarUsuarios();
    }//GEN-LAST:event_btnListarEmpActionPerformed

    private void btnGuardarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEmpActionPerformed
        boolean agregado = false;
        if (txtNomUser.getText().isEmpty() || txtNomDeUsuario.getText().isEmpty() || txtPassUser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "Entrada inválida", 2);
        } else {
            if (btnEditEmp.getText().equals("Modificar empleado")) {
                if (ds.idValido(txtIdUser.getText())) {
                    if (ds.userValido(txtNomDeUsuario.getText())) {
                        // Agregar nuevo empleado
                        ds.addEmpSinArea(txtIdUser.getText(), txtNomUser.getText(),
                                txtNomDeUsuario.getText(), txtPassUser.getText());
                        agregado = true;
                    } else {
                        JOptionPane.showMessageDialog(this, "El nombre de usuario ingresado ya está ocupado.", "", 2);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Ya existe un usuario con la identidad ingresada.", "", 2);
                }
            } else {
                // MODIFICAR AQUI
                cboEmpleados.setEnabled(true);
                Empleado emp = (Empleado) cboEmpleados.getModel().getSelectedItem();
                ds.modUsuario(emp.getId(), "EmpSinArea", txtIdUser.getText(),
                        txtNomUser.getText(), txtNomDeUsuario.getText(),
                        txtPassUser.getText());
                ds.modUsuario(emp.getId(), "Empleados", txtIdUser.getText(),
                        txtNomUser.getText(), txtNomDeUsuario.getText(),
                        txtPassUser.getText());
                btnEditEmp.doClick();
                limpiarTab1();
                JOptionPane.showMessageDialog(this, "Empleado modificado exitosamente.", "", 1);
            }
        }
        if (agregado) {
            limpiarTab1();
            cboEmpleados.setModel(ds.llenarCboEmpleados());
            JOptionPane.showMessageDialog(this, "Empleado agregado exitosamente.", "", 1);
        }
    }//GEN-LAST:event_btnGuardarEmpActionPerformed

    private void btnElimEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimEmpActionPerformed
        if (cboEmpleados.getSelectedIndex() >= 0) {
            int confirmar = JOptionPane.showConfirmDialog(this,
                    "¿Está seguro que desea eliminar el empleado seleccionado?"
                    + "\nEsta acción no se puede deshacer.", "Eliminar usuario",
                    JOptionPane.YES_NO_OPTION);
            if (confirmar == JOptionPane.YES_OPTION) {
                Empleado emp = (Empleado) cboEmpleados.getSelectedItem();
                ds.elimEmpSinArea(emp.getId());
                ds.elimEmpleado(emp.getId());
                actualizarTodo();
                JOptionPane.showMessageDialog(this, "Empleado eliminado exitosamente.", "", 1);
            } else {
                JOptionPane.showMessageDialog(this, "Acción cancelada.", "", 1);
            }
        }
    }//GEN-LAST:event_btnElimEmpActionPerformed

    private void btnEditEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditEmpActionPerformed
        if (cboEmpleados.getSelectedIndex() >= 0) {
            if (btnEditEmp.getText().equals("Modificar empleado")) {
                cboEmpleados.setEnabled(false);
                Empleado emp = (Empleado) cboEmpleados.getSelectedItem();
                btnGuardarEmp.setText("Guardar cambios");
                btnEditEmp.setText("Cancelar");
                txtNomUser.setText(emp.getNombre());
                txtIdUser.setText(emp.getIdentidad());
                txtNomDeUsuario.setText(emp.getNombreUsuario());
                txtPassUser.setText(emp.getPass());
            } else {
                cboEmpleados.setEnabled(true);
                btnGuardarEmp.setText("Guardar");
                btnEditEmp.setText("Modificar empleado");
                limpiarTab1();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un empleado.", "", 2);
        }
    }//GEN-LAST:event_btnEditEmpActionPerformed

    private void cboEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEmpleadosActionPerformed

    }//GEN-LAST:event_cboEmpleadosActionPerformed

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

    private void btnListarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAreaActionPerformed
        new FrameListar().listarAreas();
    }//GEN-LAST:event_btnListarAreaActionPerformed

    private void btnGuardarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAreaActionPerformed
        if (txtNomArea.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "", 2);
        } else {
            DefaultListModel modeloEmpArea = (DefaultListModel) listEmpArea.getModel();
            DefaultListModel modeloEmp = (DefaultListModel) listEmp.getModel();
            DefaultListModel modeloTranArea = (DefaultListModel) listTranArea.getModel();
            DefaultListModel modeloTran = (DefaultListModel) listTran.getModel();
            if (btnGuardarArea.getText().equals("Guardar")) {
                ds.addArea(txtNomArea.getText(), local);
                Area area = local.getAreas().get(local.getAreas().size() - 1);
                actualizarEmpTran(area);
                limpiarTab3();
                btnEditArea.doClick();
                cboArea.setModel(ds.llenarCboAreas());
                JOptionPane.showMessageDialog(this, "Área agregada exitosamente.", "", 1);
            } else {
                // MODIFICAR AQUI
                if (cboArea.getSelectedIndex() >= 0) {
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
                listTran.setModel(ds.llenarListTranValidado(area));
                // listTran.setModel(ds.llenarListTran(area));
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

    private void btnListarTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTranActionPerformed
        new FrameListar().listarTransacciones();
    }//GEN-LAST:event_btnListarTranActionPerformed

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
                Transaccion tran = (Transaccion) cboTran.getSelectedItem();
                ds.modTran(tran.getId(), txtTipoTran.getText(),
                        (Integer) spTiemTran.getValue());
                btnEditTran.doClick();
                cboTran.setEnabled(true);
                JOptionPane.showMessageDialog(this, "Transacción modificada exitosamente.", "", 1);
            }
            actualizarTodo();
        }
    }//GEN-LAST:event_btnGuardarTranActionPerformed

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

    private void cboGuardarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGuardarCitaActionPerformed

    }//GEN-LAST:event_cboGuardarCitaActionPerformed

    private void btnCargarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarCitaActionPerformed

    }//GEN-LAST:event_btnCargarCitaActionPerformed

    private void btnReenviarTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReenviarTicketActionPerformed
        // JOptionPane.showInputDialog("Ingrese la posicion de la cola ", fecha,
        // "Reenviar ticket", 2);
    }//GEN-LAST:event_btnReenviarTicketActionPerformed

    private void btnElimEmpLocal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimEmpLocal2ActionPerformed

    }//GEN-LAST:event_btnElimEmpLocal2ActionPerformed

    private void btnMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMapaActionPerformed
        ImageIcon icono = new ImageIcon(FrameAdmin.class.getResource("cargando.gif").getFile());
        JOptionPane.showMessageDialog(this,
                "Por favor espere unos segundos mientras carga el mapa del local."
                + "\nPresione OK para continuar.",
                "Cargando mapa", 1, icono);
        new Mapa().coordenadas(local.getLatitud(), local.getLongitud(), local.getNombre());
    }//GEN-LAST:event_btnMapaActionPerformed

    private void tabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabbedPaneStateChanged
        actualizarTodo();
    }//GEN-LAST:event_tabbedPaneStateChanged

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
            java.util.logging.Logger.getLogger(FrameGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmpArea;
    private javax.swing.JButton btnAddTranArea;
    private javax.swing.JButton btnAgrEmpLocal2;
    private javax.swing.JMenuItem btnCambiarCuentaAdmin;
    private javax.swing.JButton btnCargarCita;
    private javax.swing.JMenuItem btnCerrarSesionAdmin;
    private javax.swing.JToggleButton btnEditArea;
    private javax.swing.JToggleButton btnEditEmp;
    private javax.swing.JToggleButton btnEditTran;
    private javax.swing.JButton btnElimArea;
    private javax.swing.JButton btnElimEmp;
    private javax.swing.JButton btnElimEmpArea;
    private javax.swing.JButton btnElimEmpLocal2;
    private javax.swing.JButton btnElimTran;
    private javax.swing.JButton btnElimTranArea;
    private javax.swing.JButton btnGuardarArea;
    private javax.swing.JButton btnGuardarEmp;
    private javax.swing.JButton btnGuardarTran;
    private javax.swing.JButton btnListarArea;
    private javax.swing.JButton btnListarEmp;
    private javax.swing.JButton btnListarTran;
    private javax.swing.JButton btnMapa;
    private javax.swing.JButton btnPDF;
    private javax.swing.JButton btnReenviarTicket;
    private javax.swing.JComboBox<String> cboArea;
    private javax.swing.JComboBox<String> cboAreaCita;
    private javax.swing.JComboBox<String> cboEmpleados;
    private javax.swing.JButton cboGuardarCita;
    private javax.swing.JComboBox<String> cboTran;
    private com.toedter.calendar.JDateChooser dcCita;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
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
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
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
    private javax.swing.JList<String> listTran;
    private javax.swing.JList<String> listTranArea;
    private javax.swing.JPanel pnlFechaCitaAdmin;
    private javax.swing.JSpinner spTiemTran;
    private p2proyecto_pamelaramirez.UIAdmin tabbedPane;
    private javax.swing.JTree treeColas;
    private javax.swing.JFormattedTextField txtIdCita;
    private javax.swing.JFormattedTextField txtIdUser;
    private javax.swing.JTextField txtNomArea;
    private javax.swing.JTextField txtNomDeUsuario;
    private javax.swing.JTextField txtNomUser;
    private javax.swing.JTextField txtPassUser;
    private javax.swing.JTextField txtTipoTran;
    // End of variables declaration//GEN-END:variables
}
