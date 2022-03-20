
package p2proyecto_pamelaramirez;

import java.io.*;
import java.text.*;
import java.time.*;
import java.util.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


public class Login extends javax.swing.JFrame {
    // Archivos archivos = new Archivos("./RegistroLocales.cbm", "./RegistroUsuarios.cbm");
    Date fecha = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("hh:mm:ss a dd/MM/yyyy");
    Usuario usuarioIngresado;
    ArrayList <Usuario> usuarios = new ArrayList();
    ArrayList <Local> locales = new ArrayList();
    ArrayList <Cita> citas = new ArrayList();
    ArrayList <String> bitacora = new ArrayList();
    Local local;
    Area area;
    
    public Login() {
        usuarios.add(new Administrador("Admin", "1234-1234-12345", "a", "a"));
        usuarios.add(new Gerente("Gerente", "1234-1234-12345", "gerente", "a"));
        usuarios.add(new Empleado("Juan", "1234-1234-12345", "juan", "a"));
        usuarios.add(new Empleado("Pedro", "1234-1234-12345", "pedro", "a"));
        locales.add(new Local("Local 1", 90, 90));
        ArrayList <Empleado> empleados = new ArrayList();
        locales.get(0).getAreas().add(new Area("Area 1", empleados));
        locales.get(0).getAreas().get(0).getTransacciones().add(new Transaccion("Transferencia", 10));
        locales.get(0).getAreas().get(0).getTransacciones().add(new Transaccion("Deposito", 20));
        locales.get(0).getAreas().get(0).getTransacciones().add(new Transaccion("Retiro", 30));
        this.setTitle("Iniciar sesión");
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void limpiarRegistro(){
        txtNombreRegistro.setText(null);
        ftxtIdRegistro.setText(null);
        txtNomUsuarioRegistro.setText(null);
        txtContrasenaRegistro.setText(null);
        btngTipoUsuario.clearSelection();
        Registro.setVisible(false);
    }

    public void limpiarInicioSesion(){
        txtNombreUsuario.setText(null);
        txtPassword.setText(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registro = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        ftxtIdRegistro = new javax.swing.JFormattedTextField();
        btnGuardarRegistro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNomUsuarioRegistro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rbtnAdmin = new javax.swing.JRadioButton();
        rbtnEmpleado = new javax.swing.JRadioButton();
        rbtnGerente = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombreRegistro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtContrasenaRegistro = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        btngTipoUsuario = new javax.swing.ButtonGroup();
        frameAdministrador = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cboTipoUser = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cboUser = new javax.swing.JComboBox<>();
        btnEditUser = new javax.swing.JButton();
        cboElimUser = new javax.swing.JButton();
        cboListarUser = new javax.swing.JButton();
        btnGuardarUser = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtNomUser = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtIdUser = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNomDeUsuario = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtPassUser = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cboLocal = new javax.swing.JComboBox<>();
        btnEditLocal = new javax.swing.JButton();
        btnElimLocal = new javax.swing.JButton();
        btnListarLocal = new javax.swing.JButton();
        btnGuardarLocal = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtNomLocal = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        spLatitud = new javax.swing.JSpinner();
        spLongitud = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        cboGerLocal = new javax.swing.JComboBox<>();
        rbtnElimGerLocal = new javax.swing.JRadioButton();
        jPanel12 = new javax.swing.JPanel();
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
        jLabel40 = new javax.swing.JLabel();
        cboLocalArea = new javax.swing.JComboBox<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        listEmpAsigLocal = new javax.swing.JList<>();
        jLabel28 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        btnAgrEmpLocal = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        btnElimEmpLocal = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        listEmpLocal = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        cboLocalTran = new javax.swing.JComboBox<>();
        btnEditTran = new javax.swing.JButton();
        btnElimTran = new javax.swing.JButton();
        btnListarTran = new javax.swing.JButton();
        btnGuardarTran = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        txtTipoTran = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        spTiemTran = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        cboAreaTran = new javax.swing.JComboBox<>();
        cboTran = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
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
        jPanel7 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        treeColas = new javax.swing.JTree();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBitacora = new javax.swing.JTextArea();
        jLabel41 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnCambiarCuentaAdmin = new javax.swing.JMenuItem();
        btnCerrarSesionAdmin = new javax.swing.JMenuItem();
        frameGerente = new javax.swing.JFrame();
        frameEmpleado = new javax.swing.JFrame();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel14 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtNombreUsuario = new javax.swing.JTextField();
        btnIniciarSesion = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();

        Registro.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        Registro.setSize(new java.awt.Dimension(490, 465));

        jLabel4.setText("Número de identidad");

        try {
            ftxtIdRegistro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtIdRegistro.setSize(new java.awt.Dimension(135, 23));

        btnGuardarRegistro.setText("Guardar");
        btnGuardarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRegistroActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre de usuario");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setText("Registro");

        btngTipoUsuario.add(rbtnAdmin);
        rbtnAdmin.setText("Administrador");

        btngTipoUsuario.add(rbtnEmpleado);
        rbtnEmpleado.setText("Empleado");

        btngTipoUsuario.add(rbtnGerente);
        rbtnGerente.setText("Gerente");

        jLabel7.setText("Tipo de usuario");

        jLabel8.setText("Nombre");

        jLabel9.setText("Contraseña");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegistroLayout = new javax.swing.GroupLayout(Registro.getContentPane());
        Registro.getContentPane().setLayout(RegistroLayout);
        RegistroLayout.setHorizontalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(RegistroLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegistroLayout.createSequentialGroup()
                                .addComponent(rbtnAdmin)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnGerente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnEmpleado)
                                .addGap(9, 9, 9))
                            .addGroup(RegistroLayout.createSequentialGroup()
                                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtContrasenaRegistro)
                                    .addComponent(txtNomUsuarioRegistro)
                                    .addComponent(ftxtIdRegistro)
                                    .addComponent(txtNombreRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111)))
                .addGap(94, 94, 94))
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftxtIdRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomUsuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContrasenaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnAdmin)
                    .addComponent(rbtnEmpleado)
                    .addComponent(rbtnGerente))
                .addGap(24, 24, 24)
                .addComponent(btnGuardarRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegresar)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        frameAdministrador.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        frameAdministrador.setResizable(false);
        frameAdministrador.setSize(new java.awt.Dimension(900, 660));

        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 163, 183));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/user.png"))); // NOI18N
        jLabel10.setText(" Administración de usuarios");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tipo de usuario");

        cboTipoUser.setBackground(new java.awt.Color(204, 163, 183));
        cboTipoUser.setForeground(new java.awt.Color(255, 255, 255));
        cboTipoUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -", "Administrador del sistema", "Gerente", "Empleado" }));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Usuario");

        cboUser.setBackground(new java.awt.Color(204, 163, 183));
        cboUser.setForeground(new java.awt.Color(255, 255, 255));
        cboUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));

        btnEditUser.setBackground(new java.awt.Color(140, 89, 113));
        btnEditUser.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnEditUser.setForeground(new java.awt.Color(255, 255, 255));
        btnEditUser.setText("Modificar usuario");
        btnEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditUserActionPerformed(evt);
            }
        });

        cboElimUser.setBackground(new java.awt.Color(140, 89, 113));
        cboElimUser.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        cboElimUser.setForeground(new java.awt.Color(255, 255, 255));
        cboElimUser.setText("Eliminar usuario");

        cboListarUser.setBackground(new java.awt.Color(140, 89, 113));
        cboListarUser.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        cboListarUser.setForeground(new java.awt.Color(255, 255, 255));
        cboListarUser.setText("Listar usuarios registrados");

        btnGuardarUser.setBackground(new java.awt.Color(140, 89, 113));
        btnGuardarUser.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnGuardarUser.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/save (1).png"))); // NOI18N
        btnGuardarUser.setText(" Guardar");
        btnGuardarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarUserActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nombre");

        txtNomUser.setBackground(new java.awt.Color(236, 222, 229));
        txtNomUser.setForeground(new java.awt.Color(51, 51, 51));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Identidad");

        txtIdUser.setBackground(new java.awt.Color(236, 222, 229));
        txtIdUser.setForeground(new java.awt.Color(51, 51, 51));
        try {
            txtIdUser.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre de usuario");

        txtNomDeUsuario.setBackground(new java.awt.Color(236, 222, 229));
        txtNomDeUsuario.setForeground(new java.awt.Color(51, 51, 51));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Contraseña");

        txtPassUser.setBackground(new java.awt.Color(236, 222, 229));
        txtPassUser.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cboTipoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(cboUser, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomUser, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(160, 160, 160)
                        .addComponent(btnEditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(325, 325, 325)
                        .addComponent(cboElimUser, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(160, 160, 160)
                        .addComponent(cboListarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNomDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassUser, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel10)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboTipoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(12, 12, 12)
                        .addComponent(txtNomUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnEditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel14))
                    .addComponent(cboElimUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(cboListarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(txtNomDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(12, 12, 12)
                .addComponent(txtPassUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Usuarios", jPanel1);

        jPanel8.setBackground(new java.awt.Color(204, 163, 183));
        jPanel8.setSize(new java.awt.Dimension(900, 660));

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/map.png"))); // NOI18N
        jLabel17.setText(" Administración de locales");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Local");

        cboLocal.setBackground(new java.awt.Color(204, 163, 183));
        cboLocal.setForeground(new java.awt.Color(255, 255, 255));
        cboLocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));

        btnEditLocal.setBackground(new java.awt.Color(140, 89, 113));
        btnEditLocal.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnEditLocal.setForeground(new java.awt.Color(255, 255, 255));
        btnEditLocal.setText("Modificar local");

        btnElimLocal.setBackground(new java.awt.Color(140, 89, 113));
        btnElimLocal.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnElimLocal.setForeground(new java.awt.Color(255, 255, 255));
        btnElimLocal.setText("Eliminar local");

        btnListarLocal.setBackground(new java.awt.Color(140, 89, 113));
        btnListarLocal.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnListarLocal.setForeground(new java.awt.Color(255, 255, 255));
        btnListarLocal.setText("Listar locales registrados");

        btnGuardarLocal.setBackground(new java.awt.Color(140, 89, 113));
        btnGuardarLocal.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnGuardarLocal.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarLocal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/save (1).png"))); // NOI18N
        btnGuardarLocal.setText(" Guardar");
        btnGuardarLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarLocalActionPerformed(evt);
            }
        });

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Nombre");

        txtNomLocal.setBackground(new java.awt.Color(236, 222, 229));
        txtNomLocal.setForeground(new java.awt.Color(51, 51, 51));

        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Longitud");

        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Latitud");

        spLatitud.setModel(new javax.swing.SpinnerNumberModel(-90.0d, -90.0d, 90.0d, 1.0d));

        spLongitud.setModel(new javax.swing.SpinnerNumberModel(-180.0d, -180.0d, 180.0d, 1.0d));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Gerente asignado");

        cboGerLocal.setBackground(new java.awt.Color(204, 163, 183));
        cboGerLocal.setForeground(new java.awt.Color(255, 255, 255));
        cboGerLocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));

        rbtnElimGerLocal.setForeground(new java.awt.Color(255, 255, 255));
        rbtnElimGerLocal.setText("Eliminar gerente del local");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtNomLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(cboLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spLatitud, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(160, 160, 160)
                        .addComponent(btnEditLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(245, 245, 245)
                        .addComponent(btnElimLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(spLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(btnListarLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboGerLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnElimGerLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel17)
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19))
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addGap(12, 12, 12)
                        .addComponent(spLatitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnEditLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel46))
                    .addComponent(btnElimLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnListarLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jLabel22)
                .addGap(12, 12, 12)
                .addComponent(cboGerLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbtnElimGerLocal)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Locales", jPanel2);

        jPanel13.setBackground(new java.awt.Color(204, 163, 183));
        jPanel13.setSize(new java.awt.Dimension(900, 660));

        jLabel36.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/map-pin.png"))); // NOI18N
        jLabel36.setText(" Administración de áreas");

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Área");

        cboArea.setBackground(new java.awt.Color(204, 163, 183));
        cboArea.setForeground(new java.awt.Color(255, 255, 255));
        cboArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));

        btnEditLocal1.setBackground(new java.awt.Color(140, 89, 113));
        btnEditLocal1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnEditLocal1.setForeground(new java.awt.Color(255, 255, 255));
        btnEditLocal1.setText("Modificar área");

        btnElimLocal1.setBackground(new java.awt.Color(140, 89, 113));
        btnElimLocal1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnElimLocal1.setForeground(new java.awt.Color(255, 255, 255));
        btnElimLocal1.setText("Eliminar área");

        btnListarLocal1.setBackground(new java.awt.Color(140, 89, 113));
        btnListarLocal1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnListarLocal1.setForeground(new java.awt.Color(255, 255, 255));
        btnListarLocal1.setText("Listar áreas registradas");

        btnGuardarArea.setBackground(new java.awt.Color(140, 89, 113));
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

        txtNomArea.setBackground(new java.awt.Color(236, 222, 229));
        txtNomArea.setForeground(new java.awt.Color(51, 51, 51));

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Local");

        cboLocalArea.setBackground(new java.awt.Color(204, 163, 183));
        cboLocalArea.setForeground(new java.awt.Color(255, 255, 255));
        cboLocalArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));

        listEmpAsigLocal.setBackground(new java.awt.Color(236, 222, 229));
        listEmpAsigLocal.setForeground(new java.awt.Color(51, 51, 51));
        listEmpAsigLocal.setModel(new DefaultListModel());
        jScrollPane8.setViewportView(listEmpAsigLocal);

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Empleados");

        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Asignados");

        btnAgrEmpLocal.setBackground(new java.awt.Color(140, 89, 113));
        btnAgrEmpLocal.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnAgrEmpLocal.setForeground(new java.awt.Color(255, 255, 255));
        btnAgrEmpLocal.setText("Agregar");
        btnAgrEmpLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrEmpLocalActionPerformed(evt);
            }
        });

        jLabel50.setText("->");

        btnElimEmpLocal.setBackground(new java.awt.Color(140, 89, 113));
        btnElimEmpLocal.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnElimEmpLocal.setForeground(new java.awt.Color(255, 255, 255));
        btnElimEmpLocal.setText("Eliminar");
        btnElimEmpLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimEmpLocalActionPerformed(evt);
            }
        });

        listEmpLocal.setBackground(new java.awt.Color(236, 222, 229));
        listEmpLocal.setForeground(new java.awt.Color(51, 51, 51));
        listEmpLocal.setModel(new DefaultListModel());
        jScrollPane9.setViewportView(listEmpLocal);

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
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboLocalArea, javax.swing.GroupLayout.Alignment.LEADING, 0, 220, Short.MAX_VALUE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnAgrEmpLocal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnElimEmpLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(190, Short.MAX_VALUE))
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
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboLocalArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnElimEmpLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(btnAgrEmpLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGap(18, 18, 18)
                .addComponent(btnGuardarArea, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Áreas", jPanel12);

        jPanel9.setBackground(new java.awt.Color(204, 163, 183));
        jPanel9.setSize(new java.awt.Dimension(900, 600));

        jLabel24.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/edit.png"))); // NOI18N
        jLabel24.setText(" Administración de transacciones");

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Área");

        cboLocalTran.setBackground(new java.awt.Color(204, 163, 183));
        cboLocalTran.setForeground(new java.awt.Color(255, 255, 255));
        cboLocalTran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));
        cboLocalTran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLocalTranActionPerformed(evt);
            }
        });

        btnEditTran.setBackground(new java.awt.Color(140, 89, 113));
        btnEditTran.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnEditTran.setForeground(new java.awt.Color(255, 255, 255));
        btnEditTran.setText("Modificar transacción");

        btnElimTran.setBackground(new java.awt.Color(140, 89, 113));
        btnElimTran.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnElimTran.setForeground(new java.awt.Color(255, 255, 255));
        btnElimTran.setText("Eliminar transacción");

        btnListarTran.setBackground(new java.awt.Color(140, 89, 113));
        btnListarTran.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnListarTran.setForeground(new java.awt.Color(255, 255, 255));
        btnListarTran.setText("Listar transacciones");

        btnGuardarTran.setBackground(new java.awt.Color(140, 89, 113));
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

        txtTipoTran.setBackground(new java.awt.Color(236, 222, 229));
        txtTipoTran.setForeground(new java.awt.Color(51, 51, 51));

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Tiempo estimado");

        spTiemTran.setModel(new javax.swing.SpinnerNumberModel(10, 10, 120, 10));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Local");

        cboAreaTran.setBackground(new java.awt.Color(204, 163, 183));
        cboAreaTran.setForeground(new java.awt.Color(255, 255, 255));
        cboAreaTran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));

        cboTran.setBackground(new java.awt.Color(204, 163, 183));
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
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(98, 98, 98))
                                .addComponent(cboLocalTran, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboAreaTran, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                .addComponent(txtTipoTran, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spTiemTran, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardarTran, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(160, 160, 160)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnElimTran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditTran, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnListarTran, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cboTran, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel24))
                .addContainerGap(282, Short.MAX_VALUE))
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
                        .addComponent(btnElimTran, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnListarTran, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboLocalTran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboAreaTran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addGap(12, 12, 12)
                        .addComponent(txtTipoTran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29)))
                .addGap(18, 18, 18)
                .addComponent(spTiemTran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarTran, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 147, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 982, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Transacciones", jPanel3);

        jPanel10.setBackground(new java.awt.Color(204, 163, 183));
        jPanel10.setSize(new java.awt.Dimension(900, 600));

        jLabel31.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/calendar.png"))); // NOI18N
        jLabel31.setText(" Administración de citas y tickets");

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Local");

        cboLocalCita.setBackground(new java.awt.Color(204, 163, 183));
        cboLocalCita.setForeground(new java.awt.Color(255, 255, 255));
        cboLocalCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -", "Administrador del sistema", "Gerente", "Empleado" }));
        cboLocalCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLocalCitaActionPerformed(evt);
            }
        });

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Área");

        cboAreaCita.setBackground(new java.awt.Color(204, 163, 183));
        cboAreaCita.setForeground(new java.awt.Color(255, 255, 255));
        cboAreaCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));

        cboGuardarCita.setBackground(new java.awt.Color(140, 89, 113));
        cboGuardarCita.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        cboGuardarCita.setForeground(new java.awt.Color(255, 255, 255));
        cboGuardarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/edit.png"))); // NOI18N
        cboGuardarCita.setText(" Guardar cambios");
        cboGuardarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGuardarCitaActionPerformed(evt);
            }
        });

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Identidad");

        txtIdCita.setBackground(new java.awt.Color(236, 222, 229));
        txtIdCita.setForeground(new java.awt.Color(51, 51, 51));
        try {
            txtIdCita.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdCita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdCita.setSize(new java.awt.Dimension(135, 23));

        btnCargarCita.setBackground(new java.awt.Color(140, 89, 113));
        btnCargarCita.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnCargarCita.setForeground(new java.awt.Color(255, 255, 255));
        btnCargarCita.setText("Cargar datos de la cita");
        btnCargarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarCitaActionPerformed(evt);
            }
        });

        btnReenviarTicket.setBackground(new java.awt.Color(140, 89, 113));
        btnReenviarTicket.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnReenviarTicket.setForeground(new java.awt.Color(255, 255, 255));
        btnReenviarTicket.setText("Reenviar ticket a otra área");

        pnlFechaCitaAdmin.setBackground(new java.awt.Color(204, 163, 183));

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Fecha");

        dcCita.setBackground(java.awt.Color.white);
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

        listEmpLocal2.setBackground(new java.awt.Color(236, 222, 229));
        listEmpLocal2.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane6.setViewportView(listEmpLocal2);

        listEmpAsigLocal2.setBackground(new java.awt.Color(236, 222, 229));
        listEmpAsigLocal2.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane7.setViewportView(listEmpAsigLocal2);

        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Transacciones");

        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Asignadas");

        btnAgrEmpLocal2.setBackground(new java.awt.Color(140, 89, 113));
        btnAgrEmpLocal2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnAgrEmpLocal2.setForeground(new java.awt.Color(255, 255, 255));
        btnAgrEmpLocal2.setText("Agregar");

        jLabel48.setText("->");

        btnElimEmpLocal2.setBackground(new java.awt.Color(140, 89, 113));
        btnElimEmpLocal2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnElimEmpLocal2.setForeground(new java.awt.Color(255, 255, 255));
        btnElimEmpLocal2.setText("Eliminar");
        btnElimEmpLocal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimEmpLocal2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(txtIdCita, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCargarCita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cboLocalCita, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboAreaCita, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnReenviarTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboGuardarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(160, 160, 160)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlFechaCitaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel44)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(btnAgrEmpLocal2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnElimEmpLocal2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlFechaCitaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnCargarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboLocalCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboAreaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel44)
                            .addComponent(jLabel45))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel48))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboGuardarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAgrEmpLocal2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnReenviarTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(btnElimEmpLocal2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 982, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Citas y tickets", jPanel4);

        jPanel11.setBackground(new java.awt.Color(204, 163, 183));
        jPanel11.setSize(new java.awt.Dimension(900, 600));

        jLabel38.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/users.png"))); // NOI18N
        jLabel38.setText(" Colas en tiempo real");

        treeColas.setBackground(new java.awt.Color(236, 222, 229));
        treeColas.setForeground(new java.awt.Color(51, 51, 51));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Empresa");
        treeColas.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane3.setViewportView(treeColas);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(512, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel38)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 982, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Colas", jPanel7);

        jPanel6.setBackground(new java.awt.Color(204, 163, 183));

        txtBitacora.setEditable(false);
        txtBitacora.setBackground(new java.awt.Color(236, 222, 229));
        txtBitacora.setColumns(20);
        txtBitacora.setForeground(new java.awt.Color(51, 51, 51));
        txtBitacora.setRows(5);
        jScrollPane1.setViewportView(txtBitacora);

        jLabel41.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/unlock.png"))); // NOI18N
        jLabel41.setText(" Bitácora de acceso");
        jLabel41.setToolTipText("");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel41)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );

        jTabbedPane1.addTab("Bitacora de acceso", jPanel6);

        jPanel5.setBackground(new java.awt.Color(125, 177, 229));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/Estadisticas.png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/bar-chart-2.png"))); // NOI18N
        jLabel23.setText(" Análisis de datos");

        jButton1.setBackground(new java.awt.Color(34, 131, 229));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Imprimir reporte estadístico");

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
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 160, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
        );

        jTabbedPane1.addTab("Análisis de datos", jPanel5);

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

        frameAdministrador.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout frameAdministradorLayout = new javax.swing.GroupLayout(frameAdministrador.getContentPane());
        frameAdministrador.getContentPane().setLayout(frameAdministradorLayout);
        frameAdministradorLayout.setHorizontalGroup(
            frameAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameAdministradorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        frameAdministradorLayout.setVerticalGroup(
            frameAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameAdministradorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout frameGerenteLayout = new javax.swing.GroupLayout(frameGerente.getContentPane());
        frameGerente.getContentPane().setLayout(frameGerenteLayout);
        frameGerenteLayout.setHorizontalGroup(
            frameGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        frameGerenteLayout.setVerticalGroup(
            frameGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout frameEmpleadoLayout = new javax.swing.GroupLayout(frameEmpleado.getContentPane());
        frameEmpleado.getContentPane().setLayout(frameEmpleadoLayout);
        frameEmpleadoLayout.setHorizontalGroup(
            frameEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        frameEmpleadoLayout.setVerticalGroup(
            frameEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(760, 595));

        jPanel14.setBackground(new java.awt.Color(242, 169, 169));
        jPanel14.setPreferredSize(new java.awt.Dimension(760, 595));
        jPanel14.setSize(new java.awt.Dimension(760, 595));
        jPanel14.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Iniciar sesión");
        jPanel14.add(jLabel1);
        jLabel1.setBounds(310, 50, 126, 25);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/at-sign.png"))); // NOI18N
        jLabel2.setText(" Nombre de usuario");
        jPanel14.add(jLabel2);
        jLabel2.setBounds(200, 310, 161, 24);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/lock.png"))); // NOI18N
        jLabel3.setText(" Contraseña");
        jPanel14.add(jLabel3);
        jLabel3.setBounds(200, 360, 109, 24);

        txtPassword.setBackground(new java.awt.Color(255, 229, 229));
        txtPassword.setForeground(new java.awt.Color(51, 51, 51));
        txtPassword.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtPassword.setSelectionColor(new java.awt.Color(236, 120, 120));
        jPanel14.add(txtPassword);
        txtPassword.setBounds(400, 360, 165, 23);

        txtNombreUsuario.setBackground(new java.awt.Color(255, 229, 229));
        txtNombreUsuario.setForeground(new java.awt.Color(51, 51, 51));
        txtNombreUsuario.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtNombreUsuario.setSelectionColor(new java.awt.Color(236, 120, 120));
        jPanel14.add(txtNombreUsuario);
        txtNombreUsuario.setBounds(400, 310, 165, 23);

        btnIniciarSesion.setBackground(new java.awt.Color(204, 60, 60));
        btnIniciarSesion.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/log-in.png"))); // NOI18N
        btnIniciarSesion.setText(" Iniciar sesión");
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel14.add(btnIniciarSesion);
        btnIniciarSesion.setBounds(290, 420, 165, 35);

        btnCancelar.setBackground(new java.awt.Color(204, 60, 60));
        btnCancelar.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel14.add(btnCancelar);
        btnCancelar.setBounds(290, 480, 165, 35);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/Login.png"))); // NOI18N
        jPanel14.add(jLabel25);
        jLabel25.setBounds(250, 90, 254, 191);

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/esquinasupizqu.png"))); // NOI18N
        jLabel42.setText("jLabel42");
        jPanel14.add(jLabel42);
        jLabel42.setBounds(-10, -20, 250, 200);

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/esquinainfderecha.png"))); // NOI18N
        jPanel14.add(jLabel43);
        jLabel43.setBounds(550, 420, 210, 180);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRegistroActionPerformed
        if (txtNombreRegistro.getText().isEmpty() || ftxtIdRegistro.getText().isEmpty()
                || txtNomUsuarioRegistro.getText().isEmpty() || txtContrasenaRegistro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(Registro, "Debe llenar todos los campos.", "Datos inválidos", 2);
        }
        else {
            if (rbtnAdmin.isSelected()) {
                usuarios.add(new Administrador(txtNombreRegistro.getText(), ftxtIdRegistro.getText(), txtNomUsuarioRegistro.getText(), txtContrasenaRegistro.getText()));
            }
            else if (rbtnGerente.isSelected()) {
                usuarios.add(new Gerente(txtNombreRegistro.getText(), ftxtIdRegistro.getText(), txtNomUsuarioRegistro.getText(), txtContrasenaRegistro.getText()));
            }
            else if (rbtnEmpleado.isSelected()) {
                usuarios.add(new Empleado(txtNombreRegistro.getText(), ftxtIdRegistro.getText(), txtNomUsuarioRegistro.getText(), txtContrasenaRegistro.getText()));
            }
            limpiarRegistro();
            JOptionPane.showMessageDialog(Registro, "Usuario registrado exitosamente.", "Registro", 1);
            this.setVisible(true);
        }
    }//GEN-LAST:event_btnGuardarRegistroActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarInicioSesion();
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        if (txtNombreUsuario.getText().isEmpty() || txtPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(Registro, "Debe llenar todos los campos.", "Datos inválidos", 2);
        }
        else {
            boolean entro = false;
            for (Usuario usuario : usuarios) {
                if (usuario.getNombreUsuario().equals(txtNombreUsuario.getText())
                        && usuario.getPass().equals(new String(txtPassword.getPassword()))) {
                    entro = true;
                    usuarioIngresado = usuario;
                }
            }
            if (entro) {
                bitacora.add("Nuevo inicio de sesión " + formato.format(fecha)
                        + " (Usuario: " + usuarioIngresado.getNombreUsuario() + ")\n");
                limpiarInicioSesion();
                JOptionPane.showMessageDialog(Registro, "Bienvenido(a) de nuevo.", "Sesion iniciada", 1);
                if (usuarioIngresado instanceof Administrador) {
                    // Mostrar frame administrador
                    //frameAdministrador.setLocationRelativeTo(null);
                    //frameAdministrador.setVisible(true);
                    //frameAdministrador.setTitle("Administrador");
                    new FrameAdmin().setVisible(true);
                }
                else if (usuarioIngresado instanceof Gerente) {
                    // Mostrar frame gerente
                }
                else {
                    // Mostrar frame empleado
                }
                this.setVisible(false);
            }
            else {
                JOptionPane.showMessageDialog(Registro, "Usuario o contraseña inválida.", "Credenciales incorrectas", 2);
            }
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        limpiarRegistro();
        Registro.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnCambiarCuentaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarCuentaAdminActionPerformed
        frameAdministrador.setVisible(false);
        bitacora.add("Cierre de sesión " + formato.format(fecha)
                        + " (Usuario: " + usuarioIngresado.getNombreUsuario() + ")\n");
        usuarioIngresado = null;
    }//GEN-LAST:event_btnCambiarCuentaAdminActionPerformed

    private void btnCerrarSesionAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionAdminActionPerformed
        frameAdministrador.setVisible(false);
        this.setVisible(true);
        bitacora.add("Cierre de sesión " + formato.format(fecha)
                        + " (Usuario: " + usuarioIngresado.getNombreUsuario() + ")\n");
        usuarioIngresado = null;
    }//GEN-LAST:event_btnCerrarSesionAdminActionPerformed

    private void btnGuardarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarUserActionPerformed
        int tipo = cboTipoUser.getSelectedIndex();
        String nom, id, nomUser, pass;
        nom = txtNomUser.getText();
        id = txtIdUser.getText();
        nomUser = txtNomDeUsuario.getText();
        pass = txtPassUser.getText();
        boolean agregado = false;
        if (txtNomUser.getText().isEmpty() || txtIdUser.getText().isEmpty()
            || txtNomDeUsuario.getText().isEmpty() || txtPassUser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameAdministrador, "Debe llenar todos los campos.", "", 2);
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
                    JOptionPane.showMessageDialog(frameAdministrador, "Debe seleccionar un tipo de usuario.", "", 2);
                    break;
                }
            }
        }
        if (agregado) {
            actualizarTodo();
            JOptionPane.showMessageDialog(frameAdministrador, "Usuario agregado exitosamente.", "", 1);
        }
    }//GEN-LAST:event_btnGuardarUserActionPerformed

    private void btnGuardarLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarLocalActionPerformed
        boolean agregado = false;
        if (txtNomLocal.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameAdministrador, "Debe llenar todos los campos.", "", 2);
        }
        else {
            Local local = new Local(txtNomLocal.getText(), (double)spLatitud.getValue(), (double)spLongitud.getValue());
            try {
                local.setGerente((Gerente)cboGerLocal.getSelectedItem());
            } catch (Exception e) {
            }
            locales.add(local);
            agregado = true;
        }
        if (agregado) {
            actualizarTodo();
            JOptionPane.showMessageDialog(frameAdministrador, "Local agregado exitosamente.", "", 1);
        }
    }//GEN-LAST:event_btnGuardarLocalActionPerformed

    private void btnGuardarTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTranActionPerformed
        if (txtTipoTran.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameAdministrador, "Debe llenar todos los campos.", "", 2);
        }
        else {
            if (cboLocalTran.getSelectedIndex() >= 0) {
                Local local = (Local)cboLocalTran.getSelectedItem();
                if (cboAreaTran.getSelectedIndex() >= 0) {
                    Area area = (Area)cboAreaTran.getSelectedItem();
                    area.getTransacciones().add(new Transaccion(txtTipoTran.getText(), (Integer)spTiemTran.getValue()));
                    actualizarTodo();
                    JOptionPane.showMessageDialog(frameAdministrador, "Transacción agregada exitosamente.", "", 1);
                }
            }
        }
    }//GEN-LAST:event_btnGuardarTranActionPerformed

    private void cboGuardarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGuardarCitaActionPerformed
        
    }//GEN-LAST:event_cboGuardarCitaActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        actualizarTodo();
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void btnGuardarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAreaActionPerformed
        if (txtNomArea.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameAdministrador, "Debe llenar todos los campos.", "", 2);
        }
        else {
            ArrayList <Empleado> empleados = new ArrayList();
            DefaultListModel modeloEmp = (DefaultListModel) listEmpAsigLocal.getModel();
            try {
                for (Object emp : modeloEmp.toArray()) {
                    if (emp instanceof Empleado) {
                        empleados.add((Empleado)emp);
                    }
                }
                ((Local)cboLocalArea.getSelectedItem()).getAreas().add(new Area(txtNomArea.getText(), empleados));
                actualizarTodo();
                JOptionPane.showMessageDialog(frameAdministrador, "Área agregada exitosamente.", "", 1);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btnGuardarAreaActionPerformed

    private void btnElimEmpLocal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimEmpLocal2ActionPerformed
        
    }//GEN-LAST:event_btnElimEmpLocal2ActionPerformed

    private void cboLocalTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLocalTranActionPerformed
        /*Local localSeleccionado = (Local) cboLocalTran.getSelectedItem();
        llenarCboAreas((Local) cboLocalTran.getSelectedItem());
        DefaultComboBoxModel cboAreaModel = new DefaultComboBoxModel();
        for (Area area : localSeleccionado.getAreas()) {
            cboAreaModel.addElement(area);
        }*/
        cboAreaTran.setModel(llenarCboAreas((Local)cboLocalTran.getSelectedItem()));
    }//GEN-LAST:event_cboLocalTranActionPerformed

    private void cboLocalCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLocalCitaActionPerformed
        cboAreaCita.setModel(llenarCboAreas((Local) cboLocalCita.getSelectedItem()));
    }//GEN-LAST:event_cboLocalCitaActionPerformed

    private void btnAgrEmpLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrEmpLocalActionPerformed
        if (listEmpLocal.getSelectedIndex() >= 0) {
            DefaultListModel listEmpModel = (DefaultListModel) listEmpLocal.getModel();
            DefaultListModel listEmpAsigLocalModel = (DefaultListModel) listEmpAsigLocal.getModel();
            Empleado empSeleccionado = (Empleado) listEmpModel.elementAt(listEmpLocal.getSelectedIndex());
            listEmpAsigLocalModel.addElement(empSeleccionado);
            listEmpModel.removeElement(empSeleccionado);
            usuarios.remove(empSeleccionado);
        }
        else {
            JOptionPane.showMessageDialog(frameAdministrador, "Debe seleccionar un empleado.", "", 2);
        }
    }//GEN-LAST:event_btnAgrEmpLocalActionPerformed

    private void btnElimEmpLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimEmpLocalActionPerformed
        if (listEmpAsigLocal.getSelectedIndex() >= 0) {
            DefaultListModel listEmpModel = (DefaultListModel) listEmpLocal.getModel();
            DefaultListModel listEmpAsigLocalModel = (DefaultListModel) listEmpAsigLocal.getModel();
            Empleado empSeleccionado = (Empleado) listEmpAsigLocalModel.elementAt(listEmpAsigLocal.getSelectedIndex());
            listEmpModel.addElement(empSeleccionado);
            listEmpAsigLocalModel.removeElement(empSeleccionado);
            usuarios.add(empSeleccionado);
        }
        else {
            JOptionPane.showMessageDialog(frameAdministrador, "Debe seleccionar un empleado.", "", 2);
        }
    }//GEN-LAST:event_btnElimEmpLocalActionPerformed

    private void btnCargarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarCitaActionPerformed
        Cliente clienteSeleccionado = buscarCliente();
        if (clienteSeleccionado instanceof Cita) {
            dcCita.setDate(((Cita)clienteSeleccionado).getFechaAgendada());
        }
        DefaultListModel listTranModel = new DefaultListModel();
        for (Transaccion tran : clienteSeleccionado.getTransacciones()) {
            listTranModel.addElement(tran);
        }
        listEmpAsigLocal2.setModel(listTranModel);
        cboLocalCita.setSelectedItem(local);
        cboAreaCita.setSelectedItem(area);
    }//GEN-LAST:event_btnCargarCitaActionPerformed

    private void btnEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditUserActionPerformed
        Usuario user = (Usuario)cboUser.getSelectedItem();
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
        txtIdUser.setText(user.getIdentidad());
        txtNomDeUsuario.setText(user.getNombreUsuario());
        txtPassUser.setText(user.getPass());
    }//GEN-LAST:event_btnEditUserActionPerformed

    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Registro;
    private javax.swing.JButton btnAgrEmpLocal;
    private javax.swing.JButton btnAgrEmpLocal2;
    private javax.swing.JMenuItem btnCambiarCuentaAdmin;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCargarCita;
    private javax.swing.JMenuItem btnCerrarSesionAdmin;
    private javax.swing.JButton btnEditLocal;
    private javax.swing.JButton btnEditLocal1;
    private javax.swing.JButton btnEditTran;
    private javax.swing.JButton btnEditUser;
    private javax.swing.JButton btnElimEmpLocal;
    private javax.swing.JButton btnElimEmpLocal2;
    private javax.swing.JButton btnElimLocal;
    private javax.swing.JButton btnElimLocal1;
    private javax.swing.JButton btnElimTran;
    private javax.swing.JButton btnGuardarArea;
    private javax.swing.JButton btnGuardarLocal;
    private javax.swing.JButton btnGuardarRegistro;
    private javax.swing.JButton btnGuardarTran;
    private javax.swing.JButton btnGuardarUser;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnListarLocal;
    private javax.swing.JButton btnListarLocal1;
    private javax.swing.JButton btnListarTran;
    private javax.swing.JButton btnReenviarTicket;
    private javax.swing.JButton btnRegresar;
    private javax.swing.ButtonGroup btngTipoUsuario;
    private javax.swing.JComboBox<String> cboArea;
    private javax.swing.JComboBox<String> cboAreaCita;
    private javax.swing.JComboBox<String> cboAreaTran;
    private javax.swing.JButton cboElimUser;
    private javax.swing.JComboBox<String> cboGerLocal;
    private javax.swing.JButton cboGuardarCita;
    private javax.swing.JButton cboListarUser;
    private javax.swing.JComboBox<String> cboLocal;
    private javax.swing.JComboBox<String> cboLocalArea;
    private javax.swing.JComboBox<String> cboLocalCita;
    private javax.swing.JComboBox<String> cboLocalTran;
    private javax.swing.JComboBox<String> cboTipoUser;
    private javax.swing.JComboBox<String> cboTran;
    private javax.swing.JComboBox<String> cboUser;
    private com.toedter.calendar.JDateChooser dcCita;
    private javax.swing.JFrame frameAdministrador;
    private javax.swing.JFrame frameEmpleado;
    private javax.swing.JFrame frameGerente;
    private javax.swing.JFormattedTextField ftxtIdRegistro;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> listEmpAsigLocal;
    private javax.swing.JList<String> listEmpAsigLocal2;
    private javax.swing.JList<String> listEmpLocal;
    private javax.swing.JList<String> listEmpLocal2;
    private javax.swing.JPanel pnlFechaCitaAdmin;
    private javax.swing.JRadioButton rbtnAdmin;
    private javax.swing.JRadioButton rbtnElimGerLocal;
    private javax.swing.JRadioButton rbtnEmpleado;
    private javax.swing.JRadioButton rbtnGerente;
    private javax.swing.JSpinner spLatitud;
    private javax.swing.JSpinner spLongitud;
    private javax.swing.JSpinner spTiemTran;
    private javax.swing.JTree treeColas;
    private javax.swing.JTextArea txtBitacora;
    private javax.swing.JTextField txtContrasenaRegistro;
    private javax.swing.JFormattedTextField txtIdCita;
    private javax.swing.JFormattedTextField txtIdUser;
    private javax.swing.JTextField txtNomArea;
    private javax.swing.JTextField txtNomDeUsuario;
    private javax.swing.JTextField txtNomLocal;
    private javax.swing.JTextField txtNomUser;
    private javax.swing.JTextField txtNomUsuarioRegistro;
    private javax.swing.JTextField txtNombreRegistro;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtPassUser;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTipoTran;
    // End of variables declaration//GEN-END:variables
    
    // Actualiza todas las tabs con info de arraylists
    public void actualizarTodo(){
        int tab = jTabbedPane1.getSelectedIndex();
        // Modelos
        DefaultComboBoxModel cboUserModel = new DefaultComboBoxModel();
        DefaultComboBoxModel cboLocalModel = new DefaultComboBoxModel();
        DefaultComboBoxModel cboAreaModel = new DefaultComboBoxModel();
        DefaultComboBoxModel cboGerModel = new DefaultComboBoxModel();
        DefaultComboBoxModel cboTranModel = new DefaultComboBoxModel();
        DefaultListModel listEmpModel = new DefaultListModel();
        DefaultListModel listEmpLocalModel = new DefaultListModel();
        // Actualizar modelos
        if (!usuarios.isEmpty()) {
            for (Usuario usuario : usuarios) {
                cboUserModel.addElement(usuario);
                if (usuario instanceof Gerente) {
                    cboGerModel.addElement(usuario);
                }
                else if (usuario instanceof Empleado) {
                    listEmpModel.addElement(usuario);
                }
            } 
        }
        if (!locales.isEmpty()) {
            for (Local local : locales) {
                cboLocalModel.addElement(local);
                if (!local.getAreas().isEmpty()) {
                    for (Area area : local.getAreas()) {
                        cboAreaModel.addElement(area);
                        if (!area.getTransacciones().isEmpty()) {
                            for (Transaccion tran : area.getTransacciones()) {
                                cboTranModel.addElement(tran);
                            }
                        }
                    }
                }
            }
        }
        switch(tab) {
            case 0: {
                // Tab usuarios
                cboUser.setModel(cboUserModel);
                break;
            }
            case 1: {
                // Tab locales
                cboLocal.setModel(cboLocalModel);
                cboGerLocal.setModel(cboGerModel);
                listEmpLocal.setModel(listEmpModel);
                listEmpAsigLocal.setModel(listEmpLocalModel);
                break;
            }
            case 2: {
                // Tab areas
                cboLocalArea.setModel(cboLocalModel);
                cboArea.setModel(cboAreaModel);
                break;
            }
            case 3: {
                // Tab transacciones
                cboLocalTran.setModel(cboLocalModel);
                cboTran.setModel(cboTranModel);
                break;
            }
            case 4: {
                // Tab citas y tickets
                cboLocalCita.setModel(cboLocalModel);
                break;
            }
            case 5: {
                // Tab colas
                llenarArbolColas();
                break;
            }
            case 6: {
                // Tab bitacora
                txtBitacora.setText(null);
                for (String string : bitacora) {
                    txtBitacora.setText(string);
                }
                break;
            }
            case 7: {
                // Tab analisis de datos
                break;
            }
        }
    }
    
    public DefaultComboBoxModel llenarCboAreas(Local localSeleccionado) {
        DefaultComboBoxModel cboAreaModel = new DefaultComboBoxModel();
        for (Area area : localSeleccionado.getAreas()) {
            cboAreaModel.addElement(area);
        }
        return cboAreaModel;
    }
    
    public DefaultComboBoxModel llenarCboLocales() {
        DefaultComboBoxModel cboLocalModel = new DefaultComboBoxModel();
        if (!locales.isEmpty()) {
            for (Local local : locales) {
                cboLocalModel.addElement(local);
            }
        }
        return cboLocalModel;
    }
    
    public DefaultListModel llenarListTran(Area areaSeleccionada) {
        DefaultListModel listTranModel = new DefaultListModel();
        if (!areaSeleccionada.getTransacciones().isEmpty()) {
            for (Transaccion tran : areaSeleccionada.getTransacciones()) {
                listTranModel.addElement(tran);
            }
        }
        return listTranModel;
    }
    
    public void llenarArbolColas() {
        if (!locales.isEmpty()) {
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
        }
    }
    
    public Cliente buscarCliente() {
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
    }
    
    // Metodos de limpiar tabs aqui
    
}
