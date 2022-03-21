
package p2proyecto_pamelaramirez;

import java.text.*;
import java.util.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


public class FrameGerente extends javax.swing.JFrame {
    DatosSistema ds = new DatosSistema();
    Date fecha = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("hh:mm:ss a dd/MM/yyyy");
    Usuario usuarioIngresado;
    ArrayList <Usuario> usuarios = new ArrayList();
    ArrayList <Local> locales = new ArrayList();
    ArrayList <Cita> citas = new ArrayList();
    ArrayList <String> bitacora = new ArrayList();
    Local local;
    Area area;
    
    public FrameGerente() {
        initComponents();
        this.setTitle("Gerente");
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new p2proyecto_pamelaramirez.UIAdmin();
        jPanel15 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cboUser = new javax.swing.JComboBox<>();
        btnEditUser = new javax.swing.JButton();
        cboElimUser = new javax.swing.JButton();
        cboListarUser = new javax.swing.JButton();
        btnGuardarEmp = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtNomUser = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtIdUser = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNomDeUsuario = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtPassUser = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cboAreaEmp = new javax.swing.JComboBox<>();
        jPanel16 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        cboArea = new javax.swing.JComboBox<>();
        btnEditLocal1 = new javax.swing.JButton();
        btnElimLocal1 = new javax.swing.JButton();
        btnListarLocal1 = new javax.swing.JButton();
        btnGuardarArea = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        txtNomArea = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        listEmpArea = new javax.swing.JList<>();
        jLabel28 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        btnAgrEmp = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        btnElimEmp = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        listEmp = new javax.swing.JList<>();
        jPanel17 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnEditTran = new javax.swing.JButton();
        btnElimTransaccion = new javax.swing.JButton();
        btnListarTran = new javax.swing.JButton();
        btnGuardarTran = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        txtTipoTran = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        spTiemTran = new javax.swing.JSpinner();
        cboAreaTran = new javax.swing.JComboBox<>();
        cboTran = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
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
        listTran = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        listTranCita = new javax.swing.JList<>();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        btnAgrTran = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        btnElimTran = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        treeColas = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel40 = new javax.swing.JLabel();
        cboAreaColas = new javax.swing.JComboBox<>();
        jPanel21 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnReporte = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnCambiarCuentaAdmin = new javax.swing.JMenuItem();
        btnCerrarSesionAdmin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(125, 177, 229));
        jPanel1.setForeground(new java.awt.Color(125, 177, 229));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/user.png"))); // NOI18N
        jLabel10.setText(" Administración de empleados");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Empleado");

        cboUser.setBackground(new java.awt.Color(50, 152, 255));
        cboUser.setForeground(new java.awt.Color(255, 255, 255));
        cboUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));

        btnEditUser.setBackground(new java.awt.Color(34, 131, 229));
        btnEditUser.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnEditUser.setForeground(new java.awt.Color(255, 255, 255));
        btnEditUser.setText("Modificar usuario");
        btnEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditUserActionPerformed(evt);
            }
        });

        cboElimUser.setBackground(new java.awt.Color(34, 131, 229));
        cboElimUser.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        cboElimUser.setForeground(new java.awt.Color(255, 255, 255));
        cboElimUser.setText("Eliminar usuario");

        cboListarUser.setBackground(new java.awt.Color(34, 131, 229));
        cboListarUser.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        cboListarUser.setForeground(new java.awt.Color(255, 255, 255));
        cboListarUser.setText("Listar usuarios registrados");

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

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nombre");

        txtNomUser.setBackground(new java.awt.Color(204, 227, 255));
        txtNomUser.setForeground(new java.awt.Color(51, 51, 51));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Identidad");

        txtIdUser.setBackground(new java.awt.Color(204, 227, 255));
        txtIdUser.setForeground(new java.awt.Color(51, 51, 51));
        try {
            txtIdUser.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre de usuario");

        txtNomDeUsuario.setBackground(new java.awt.Color(204, 227, 255));
        txtNomDeUsuario.setForeground(new java.awt.Color(51, 51, 51));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Contraseña");

        txtPassUser.setBackground(new java.awt.Color(204, 227, 255));
        txtPassUser.setForeground(new java.awt.Color(51, 51, 51));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Área");

        cboAreaEmp.setBackground(new java.awt.Color(50, 152, 255));
        cboAreaEmp.setForeground(new java.awt.Color(255, 255, 255));
        cboAreaEmp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboAreaEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomUser, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassUser, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(160, 160, 160)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboUser, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboElimUser, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboListarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel12)
                        .addGap(12, 12, 12)
                        .addComponent(cboUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(btnEditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(cboElimUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(cboListarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(12, 12, 12)
                        .addComponent(txtNomUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(3, 3, 3)
                        .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addGap(12, 12, 12)
                        .addComponent(txtNomDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addGap(12, 12, 12)
                        .addComponent(txtPassUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(12, 12, 12)
                .addComponent(cboAreaEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        jPanel15.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tabbedPane.addTab("Empleados", jPanel15);

        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(125, 177, 229));

        jLabel36.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/map-pin.png"))); // NOI18N
        jLabel36.setText(" Administración de áreas");

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Área");

        cboArea.setBackground(new java.awt.Color(50, 152, 255));
        cboArea.setForeground(new java.awt.Color(255, 255, 255));
        cboArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));

        btnEditLocal1.setBackground(new java.awt.Color(34, 131, 229));
        btnEditLocal1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnEditLocal1.setForeground(new java.awt.Color(255, 255, 255));
        btnEditLocal1.setText("Modificar área");

        btnElimLocal1.setBackground(new java.awt.Color(34, 131, 229));
        btnElimLocal1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnElimLocal1.setForeground(new java.awt.Color(255, 255, 255));
        btnElimLocal1.setText("Eliminar área");

        btnListarLocal1.setBackground(new java.awt.Color(34, 131, 229));
        btnListarLocal1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnListarLocal1.setForeground(new java.awt.Color(255, 255, 255));
        btnListarLocal1.setText("Listar áreas registradas");

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

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Nombre");

        txtNomArea.setBackground(new java.awt.Color(204, 227, 255));
        txtNomArea.setForeground(new java.awt.Color(51, 51, 51));

        listEmpArea.setBackground(new java.awt.Color(204, 227, 255));
        listEmpArea.setForeground(new java.awt.Color(51, 51, 51));
        listEmpArea.setModel(new DefaultListModel());
        jScrollPane8.setViewportView(listEmpArea);

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Empleados");

        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Asignados");

        btnAgrEmp.setBackground(new java.awt.Color(34, 131, 229));
        btnAgrEmp.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnAgrEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnAgrEmp.setText("Agregar");
        btnAgrEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrEmpActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("->");

        btnElimEmp.setBackground(new java.awt.Color(34, 131, 229));
        btnElimEmp.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnElimEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnElimEmp.setText("Eliminar");
        btnElimEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimEmpActionPerformed(evt);
            }
        });

        listEmp.setBackground(new java.awt.Color(204, 227, 255));
        listEmp.setForeground(new java.awt.Color(51, 51, 51));
        listEmp.setModel(new DefaultListModel());
        jScrollPane9.setViewportView(listEmp);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnAgrEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnElimEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNomArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                            .addComponent(btnGuardarArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(160, 160, 160)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnListarLocal1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnElimLocal1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditLocal1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnElimEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel13Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel13Layout.createSequentialGroup()
                                                .addGap(71, 71, 71)
                                                .addComponent(jLabel50))))
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(jLabel49)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(btnAgrEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardarArea, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditLocal1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnElimLocal1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnListarLocal1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(209, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        tabbedPane.addTab("Áreas", jPanel16);

        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(125, 177, 229));

        jLabel24.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/edit.png"))); // NOI18N
        jLabel24.setText(" Administración de transacciones");

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Área");

        btnEditTran.setBackground(new java.awt.Color(34, 131, 229));
        btnEditTran.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnEditTran.setForeground(new java.awt.Color(255, 255, 255));
        btnEditTran.setText("Modificar transacción");

        btnElimTransaccion.setBackground(new java.awt.Color(34, 131, 229));
        btnElimTransaccion.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnElimTransaccion.setForeground(new java.awt.Color(255, 255, 255));
        btnElimTransaccion.setText("Eliminar transacción");

        btnListarTran.setBackground(new java.awt.Color(34, 131, 229));
        btnListarTran.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnListarTran.setForeground(new java.awt.Color(255, 255, 255));
        btnListarTran.setText("Listar transacciones");

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

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Tipo de transacción");

        txtTipoTran.setBackground(new java.awt.Color(204, 227, 255));
        txtTipoTran.setForeground(new java.awt.Color(51, 51, 51));

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Tiempo estimado");

        spTiemTran.setModel(new javax.swing.SpinnerNumberModel(10, 10, 120, 10));

        cboAreaTran.setBackground(new java.awt.Color(50, 152, 255));
        cboAreaTran.setForeground(new java.awt.Color(255, 255, 255));
        cboAreaTran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));

        cboTran.setBackground(new java.awt.Color(50, 152, 255));
        cboTran.setForeground(new java.awt.Color(255, 255, 255));
        cboTran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Transacción");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(258, 258, 258))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboAreaTran, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                        .addComponent(txtTipoTran, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spTiemTran, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGuardarTran, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(160, 160, 160)))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnElimTransaccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditTran, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnListarTran, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cboTran, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel24))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboTran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditTran, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnElimTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnListarTran, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboAreaTran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addGap(12, 12, 12)
                        .addComponent(txtTipoTran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29)
                        .addGap(18, 18, 18)
                        .addComponent(spTiemTran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardarTran, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 293, Short.MAX_VALUE))
        );

        jPanel17.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        tabbedPane.addTab("Transacciones", jPanel17);

        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(125, 177, 229));
        jPanel10.setLayout(null);

        jLabel31.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/calendar.png"))); // NOI18N
        jLabel31.setText(" Administración de citas y tickets");
        jPanel10.add(jLabel31);
        jLabel31.setBounds(100, 50, 311, 24);

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Área");
        jPanel10.add(jLabel33);
        jLabel33.setBounds(100, 210, 220, 17);

        cboAreaCita.setBackground(new java.awt.Color(50, 152, 255));
        cboAreaCita.setForeground(new java.awt.Color(255, 255, 255));
        cboAreaCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));
        jPanel10.add(cboAreaCita);
        cboAreaCita.setBounds(100, 240, 220, 23);

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
        cboGuardarCita.setBounds(100, 290, 220, 35);

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Identidad");
        jPanel10.add(jLabel35);
        jLabel35.setBounds(100, 86, 55, 17);

        txtIdCita.setBackground(new java.awt.Color(204, 227, 255));
        txtIdCita.setForeground(new java.awt.Color(51, 51, 51));
        try {
            txtIdCita.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdCita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(txtIdCita);
        txtIdCita.setBounds(100, 115, 220, 23);

        btnCargarCita.setBackground(new java.awt.Color(34, 131, 229));
        btnCargarCita.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnCargarCita.setForeground(new java.awt.Color(255, 255, 255));
        btnCargarCita.setText("Cargar datos de la cita");
        btnCargarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarCitaActionPerformed(evt);
            }
        });
        jPanel10.add(btnCargarCita);
        btnCargarCita.setBounds(100, 156, 220, 35);

        btnReenviarTicket.setBackground(new java.awt.Color(34, 131, 229));
        btnReenviarTicket.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnReenviarTicket.setForeground(new java.awt.Color(255, 255, 255));
        btnReenviarTicket.setText("Reenviar ticket a otra área");
        jPanel10.add(btnReenviarTicket);
        btnReenviarTicket.setBounds(100, 340, 220, 35);

        pnlFechaCitaAdmin.setBackground(new java.awt.Color(125, 177, 229));

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Fecha");

        dcCita.setBackground(new java.awt.Color(125, 177, 229));
        dcCita.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout pnlFechaCitaAdminLayout = new javax.swing.GroupLayout(pnlFechaCitaAdmin);
        pnlFechaCitaAdmin.setLayout(pnlFechaCitaAdminLayout);
        pnlFechaCitaAdminLayout.setHorizontalGroup(
            pnlFechaCitaAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFechaCitaAdminLayout.createSequentialGroup()
                .addGroup(pnlFechaCitaAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dcCita, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        pnlFechaCitaAdminLayout.setVerticalGroup(
            pnlFechaCitaAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFechaCitaAdminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dcCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel10.add(pnlFechaCitaAdmin);
        pnlFechaCitaAdmin.setBounds(460, 80, 240, 60);

        listTran.setBackground(new java.awt.Color(204, 227, 255));
        listTran.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane6.setViewportView(listTran);

        jPanel10.add(jScrollPane6);
        jScrollPane6.setBounds(460, 200, 130, 130);

        listTranCita.setBackground(new java.awt.Color(204, 227, 255));
        listTranCita.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane7.setViewportView(listTranCita);

        jPanel10.add(jScrollPane7);
        jScrollPane7.setBounds(640, 200, 130, 130);

        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Transacciones");
        jPanel10.add(jLabel44);
        jLabel44.setBounds(460, 170, 84, 17);

        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Asignadas");
        jPanel10.add(jLabel45);
        jLabel45.setBounds(640, 170, 130, 17);

        btnAgrTran.setBackground(new java.awt.Color(34, 131, 229));
        btnAgrTran.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnAgrTran.setForeground(new java.awt.Color(255, 255, 255));
        btnAgrTran.setText("Agregar");
        jPanel10.add(btnAgrTran);
        btnAgrTran.setBounds(460, 340, 130, 35);

        jLabel48.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("->");
        jPanel10.add(jLabel48);
        jLabel48.setBounds(610, 260, 16, 17);

        btnElimTran.setBackground(new java.awt.Color(34, 131, 229));
        btnElimTran.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnElimTran.setForeground(new java.awt.Color(255, 255, 255));
        btnElimTran.setText("Eliminar");
        btnElimTran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimTranActionPerformed(evt);
            }
        });
        jPanel10.add(btnElimTran);
        btnElimTran.setBounds(640, 340, 130, 35);

        jPanel18.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        tabbedPane.addTab("Citas y tickets", jPanel18);

        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(125, 177, 229));

        jLabel38.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/users.png"))); // NOI18N
        jLabel38.setText(" Colas en tiempo real y citas programadas");

        treeColas.setBackground(new java.awt.Color(204, 227, 255));
        treeColas.setForeground(new java.awt.Color(51, 51, 51));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Empresa");
        treeColas.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane3.setViewportView(treeColas);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Área");

        cboAreaColas.setBackground(new java.awt.Color(50, 152, 255));
        cboAreaColas.setForeground(new java.awt.Color(255, 255, 255));
        cboAreaColas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboAreaColas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel38)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboAreaColas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jPanel19.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 630));

        tabbedPane.addTab("Colas", jPanel19);

        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(125, 177, 229));
        jPanel5.setForeground(new java.awt.Color(125, 177, 229));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/Estadisticas.png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/bar-chart-2.png"))); // NOI18N
        jLabel23.setText(" Análisis de datos");

        btnReporte.setBackground(new java.awt.Color(34, 131, 229));
        btnReporte.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnReporte.setForeground(new java.awt.Color(255, 255, 255));
        btnReporte.setText("Imprimir reporte estadístico");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(617, 617, 617))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
        );

        jPanel21.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        tabbedPane.addTab("Análisis de datos", jPanel21);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCambiarCuentaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarCuentaAdminActionPerformed
        this.setVisible(false);
        bitacora.add("Cierre de sesión " + formato.format(fecha)
            + " (Usuario: " + usuarioIngresado.getNombreUsuario() + ")\n");
        usuarioIngresado = null;
    }//GEN-LAST:event_btnCambiarCuentaAdminActionPerformed

    private void btnCerrarSesionAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionAdminActionPerformed
        this.setVisible(false);
        this.setVisible(true);
        bitacora.add("Cierre de sesión " + formato.format(fecha)
            + " (Usuario: " + usuarioIngresado.getNombreUsuario() + ")\n");
        usuarioIngresado = null;
    }//GEN-LAST:event_btnCerrarSesionAdminActionPerformed

    private void btnGuardarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAreaActionPerformed
        if (txtNomArea.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "", 2);
        }
        else {
            ArrayList <Empleado> empleados = new ArrayList();
            DefaultListModel modeloEmp = (DefaultListModel) listEmpArea.getModel();
            try {
                for (Object emp : modeloEmp.toArray()) {
                    if (emp instanceof Empleado) {
                        empleados.add((Empleado)emp);
                    }
                }
                //((Local)cboLocalArea.getSelectedItem()).getAreas().add(new Area(txtNomArea.getText(), empleados));
                //actualizarTodo();
                JOptionPane.showMessageDialog(this, "Área agregada exitosamente.", "", 1);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btnGuardarAreaActionPerformed

    private void btnAgrEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrEmpActionPerformed
        if (listEmp.getSelectedIndex() >= 0) {
            DefaultListModel listEmpModel = (DefaultListModel) listEmp.getModel();
            DefaultListModel listEmpAsigLocalModel = (DefaultListModel) listEmpArea.getModel();
            Empleado empSeleccionado = (Empleado) listEmpModel.elementAt(listEmp.getSelectedIndex());
            listEmpAsigLocalModel.addElement(empSeleccionado);
            listEmpModel.removeElement(empSeleccionado);
            usuarios.remove(empSeleccionado);
        }
        else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un empleado.", "", 2);
        }
    }//GEN-LAST:event_btnAgrEmpActionPerformed

    private void btnElimEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimEmpActionPerformed
        if (listEmpArea.getSelectedIndex() >= 0) {
            DefaultListModel listEmpModel = (DefaultListModel) listEmp.getModel();
            DefaultListModel listEmpAsigLocalModel = (DefaultListModel) listEmpArea.getModel();
            Empleado empSeleccionado = (Empleado) listEmpAsigLocalModel.elementAt(listEmpArea.getSelectedIndex());
            listEmpModel.addElement(empSeleccionado);
            listEmpAsigLocalModel.removeElement(empSeleccionado);
            usuarios.add(empSeleccionado);
        }
        else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un empleado.", "", 2);
        }
    }//GEN-LAST:event_btnElimEmpActionPerformed

    private void btnGuardarTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTranActionPerformed
        if (txtTipoTran.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "", 2);
        }
        else {
            //if (cboLocalTran.getSelectedIndex() >= 0) {
                //Local local = (Local)cboLocalTran.getSelectedItem();
                if (cboAreaTran.getSelectedIndex() >= 0) {
                    Area area = (Area)cboAreaTran.getSelectedItem();
                    // area.getTransacciones().add(new Transaccion(txtTipoTran.getText(), (Integer)spTiemTran.getValue()));
                    //actualizarTodo();
                    JOptionPane.showMessageDialog(this, "Transacción agregada exitosamente.", "", 1);
                }
            //}
        }
    }//GEN-LAST:event_btnGuardarTranActionPerformed

    private void cboGuardarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGuardarCitaActionPerformed

    }//GEN-LAST:event_cboGuardarCitaActionPerformed

    private void btnCargarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarCitaActionPerformed
        /*Cliente clienteSeleccionado = buscarCliente();
        if (clienteSeleccionado instanceof Cita) {
            dcCita.setDate(((Cita)clienteSeleccionado).getFechaAgendada());
        }
        DefaultListModel listTranModel = new DefaultListModel();
        for (Transaccion tran : clienteSeleccionado.getTransacciones()) {
            listTranModel.addElement(tran);
        }
        listEmpAsigLocal2.setModel(listTranModel);
        cboLocalCita.setSelectedItem(local);
        cboAreaCita.setSelectedItem(area);*/
    }//GEN-LAST:event_btnCargarCitaActionPerformed

    private void btnElimTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimTranActionPerformed

    }//GEN-LAST:event_btnElimTranActionPerformed

    private void btnEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditUserActionPerformed
        /*Usuario user = (Usuario)cboUser.getSelectedItem();
        if (user instanceof Administrador) {
            cboTipoUser.setSelectedIndex(1);
        }
        else if (user instanceof Gerente) {
            cboTipoUser.setSelectedIndex(2);
        }
        else if (user instanceof Empleado) {
            cboTipoUser.setSelectedIndex(3);
        }
        txtNomUser.setText(user.getNombre());
        txtIdUser.setText(user.getId());
        txtNomDeUsuario.setText(user.getNombreUsuario());
        txtPassUser.setText(user.getPass());*/
    }//GEN-LAST:event_btnEditUserActionPerformed

    private void btnGuardarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEmpActionPerformed
        /*int tipo = cboTipoUser.getSelectedIndex();
        String nom, id, nomUser, pass;
        nom = txtNomUser.getText();
        id = txtIdUser.getText();
        nomUser = txtNomDeUsuario.getText();
        pass = txtPassUser.getText();
        boolean agregado = false;
        if (txtNomUser.getText().isEmpty() || txtIdUser.getText().isEmpty()
            || txtNomDeUsuario.getText().isEmpty() || txtPassUser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "", 2);
        }
        else {
            switch(tipo) {
                case 1: {
                    usuarios.add(new Administrador(nom, id, nomUser, pass));
                    agregado = true;
                    break;
                }
                case 2: {
                    usuarios.add(new Gerente(nom, id, nomUser, pass));
                    agregado = true;
                    break;
                }
                case 3: {
                    usuarios.add(new Empleado(nom, id, nomUser, pass));
                    agregado = true;
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(this, "Debe seleccionar un tipo de usuario.", "", 2);
                    break;
                }
            }
        }
        if (agregado) {
            actualizarTodo();
            JOptionPane.showMessageDialog(this, "Usuario agregado exitosamente.", "", 1);
        }*/
    }//GEN-LAST:event_btnGuardarEmpActionPerformed

    
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
    private javax.swing.JButton btnAgrEmp;
    private javax.swing.JButton btnAgrTran;
    private javax.swing.JMenuItem btnCambiarCuentaAdmin;
    private javax.swing.JButton btnCargarCita;
    private javax.swing.JMenuItem btnCerrarSesionAdmin;
    private javax.swing.JButton btnEditLocal1;
    private javax.swing.JButton btnEditTran;
    private javax.swing.JButton btnEditUser;
    private javax.swing.JButton btnElimEmp;
    private javax.swing.JButton btnElimLocal1;
    private javax.swing.JButton btnElimTran;
    private javax.swing.JButton btnElimTransaccion;
    private javax.swing.JButton btnGuardarArea;
    private javax.swing.JButton btnGuardarEmp;
    private javax.swing.JButton btnGuardarTran;
    private javax.swing.JButton btnListarLocal1;
    private javax.swing.JButton btnListarTran;
    private javax.swing.JButton btnReenviarTicket;
    private javax.swing.JButton btnReporte;
    private javax.swing.JComboBox<String> cboArea;
    private javax.swing.JComboBox<String> cboAreaCita;
    private javax.swing.JComboBox<String> cboAreaColas;
    private javax.swing.JComboBox<String> cboAreaEmp;
    private javax.swing.JComboBox<String> cboAreaTran;
    private javax.swing.JButton cboElimUser;
    private javax.swing.JButton cboGuardarCita;
    private javax.swing.JButton cboListarUser;
    private javax.swing.JComboBox<String> cboTran;
    private javax.swing.JComboBox<String> cboUser;
    private com.toedter.calendar.JDateChooser dcCita;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JList<String> listEmp;
    private javax.swing.JList<String> listEmpArea;
    private javax.swing.JList<String> listTran;
    private javax.swing.JList<String> listTranCita;
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
