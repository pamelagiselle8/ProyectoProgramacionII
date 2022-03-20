
package p2proyecto_pamelaramirez;

import java.text.*;
import java.util.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


public class FrameAdmin extends javax.swing.JFrame {
    Date fecha = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("hh:mm:ss a dd/MM/yyyy");
    Usuario usuarioIngresado;
    ArrayList <Usuario> usuarios = new ArrayList();
    ArrayList <Local> locales = new ArrayList();
    ArrayList <Cita> citas = new ArrayList();
    ArrayList <String> bitacora = new ArrayList();
    Local local;
    Area area;
    
    public FrameAdmin() {
        initComponents();
        this.setTitle("Administrador");
        this.setLocationRelativeTo(null);
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
        jPanel15 = new javax.swing.JPanel();
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
        jPanel17 = new javax.swing.JPanel();
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
        jPanel19 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        treeColas = new javax.swing.JTree();
        jPanel20 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBitacora = new javax.swing.JTextArea();
        jLabel41 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnPDF = new javax.swing.JButton();
        btnMapa = new javax.swing.JButton();
        cboLocalesMapa = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnNoti = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        txtMensaje = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnCambiarCuentaAdmin = new javax.swing.JMenuItem();
        btnCerrarSesionAdmin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabbedPaneStateChanged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(125, 177, 229));
        jPanel1.setForeground(new java.awt.Color(125, 177, 229));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/user.png"))); // NOI18N
        jLabel10.setText(" Administración de usuarios");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tipo de usuario");

        cboTipoUser.setBackground(new java.awt.Color(50, 152, 255));
        cboTipoUser.setForeground(new java.awt.Color(255, 255, 255));
        cboTipoUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -", "Administrador del sistema", "Gerente", "Empleado" }));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Usuario");

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
                    .addComponent(btnGuardarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200, Short.MAX_VALUE))
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
                .addComponent(btnGuardarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Usuarios", jPanel14);

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(125, 177, 229));

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/map.png"))); // NOI18N
        jLabel17.setText(" Administración de locales");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Local");

        cboLocal.setBackground(new java.awt.Color(50, 152, 255));
        cboLocal.setForeground(new java.awt.Color(255, 255, 255));
        cboLocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));

        btnEditLocal.setBackground(new java.awt.Color(34, 131, 229));
        btnEditLocal.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnEditLocal.setForeground(new java.awt.Color(255, 255, 255));
        btnEditLocal.setText("Modificar local");

        btnElimLocal.setBackground(new java.awt.Color(34, 131, 229));
        btnElimLocal.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnElimLocal.setForeground(new java.awt.Color(255, 255, 255));
        btnElimLocal.setText("Eliminar local");

        btnListarLocal.setBackground(new java.awt.Color(34, 131, 229));
        btnListarLocal.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnListarLocal.setForeground(new java.awt.Color(255, 255, 255));
        btnListarLocal.setText("Listar locales registrados");

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

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Nombre");

        txtNomLocal.setBackground(new java.awt.Color(204, 227, 255));
        txtNomLocal.setForeground(new java.awt.Color(51, 51, 51));

        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Longitud");

        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Latitud");

        spLatitud.setModel(new javax.swing.SpinnerNumberModel(-90.0d, -90.0d, 90.0d, 1.0d));

        spLongitud.setModel(new javax.swing.SpinnerNumberModel(-180.0d, -180.0d, 180.0d, 1.0d));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Gerente asignado");

        cboGerLocal.setBackground(new java.awt.Color(50, 152, 255));
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

        jPanel15.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        tabbedPane.addTab("Locales", jPanel15);

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

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Local");

        cboLocalArea.setBackground(new java.awt.Color(50, 152, 255));
        cboLocalArea.setForeground(new java.awt.Color(255, 255, 255));
        cboLocalArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));

        listEmpAsigLocal.setBackground(new java.awt.Color(204, 227, 255));
        listEmpAsigLocal.setForeground(new java.awt.Color(51, 51, 51));
        listEmpAsigLocal.setModel(new DefaultListModel());
        jScrollPane8.setViewportView(listEmpAsigLocal);

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Empleados");

        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Asignados");

        btnAgrEmpLocal.setBackground(new java.awt.Color(34, 131, 229));
        btnAgrEmpLocal.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnAgrEmpLocal.setForeground(new java.awt.Color(255, 255, 255));
        btnAgrEmpLocal.setText("Agregar");
        btnAgrEmpLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrEmpLocalActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("->");

        btnElimEmpLocal.setBackground(new java.awt.Color(34, 131, 229));
        btnElimEmpLocal.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnElimEmpLocal.setForeground(new java.awt.Color(255, 255, 255));
        btnElimEmpLocal.setText("Eliminar");
        btnElimEmpLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimEmpLocalActionPerformed(evt);
            }
        });

        listEmpLocal.setBackground(new java.awt.Color(204, 227, 255));
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
                .addContainerGap(139, Short.MAX_VALUE))
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

        cboLocalTran.setBackground(new java.awt.Color(50, 152, 255));
        cboLocalTran.setForeground(new java.awt.Color(255, 255, 255));
        cboLocalTran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));
        cboLocalTran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLocalTranActionPerformed(evt);
            }
        });

        btnEditTran.setBackground(new java.awt.Color(34, 131, 229));
        btnEditTran.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnEditTran.setForeground(new java.awt.Color(255, 255, 255));
        btnEditTran.setText("Modificar transacción");

        btnElimTran.setBackground(new java.awt.Color(34, 131, 229));
        btnElimTran.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnElimTran.setForeground(new java.awt.Color(255, 255, 255));
        btnElimTran.setText("Eliminar transacción");

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

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Local");

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
                .addGap(0, 223, Short.MAX_VALUE))
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

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Local");
        jPanel10.add(jLabel32);
        jLabel32.setBounds(100, 209, 220, 17);

        cboLocalCita.setBackground(new java.awt.Color(50, 152, 255));
        cboLocalCita.setForeground(new java.awt.Color(255, 255, 255));
        cboLocalCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -", "Administrador del sistema", "Gerente", "Empleado" }));
        cboLocalCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLocalCitaActionPerformed(evt);
            }
        });
        jPanel10.add(cboLocalCita);
        cboLocalCita.setBounds(100, 238, 220, 23);

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Área");
        jPanel10.add(jLabel33);
        jLabel33.setBounds(100, 279, 220, 17);

        cboAreaCita.setBackground(new java.awt.Color(50, 152, 255));
        cboAreaCita.setForeground(new java.awt.Color(255, 255, 255));
        cboAreaCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));
        jPanel10.add(cboAreaCita);
        cboAreaCita.setBounds(100, 308, 220, 23);

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
        cboGuardarCita.setBounds(100, 352, 220, 35);

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
        btnReenviarTicket.setBounds(100, 405, 220, 35);

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

        listEmpLocal2.setBackground(new java.awt.Color(204, 227, 255));
        listEmpLocal2.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane6.setViewportView(listEmpLocal2);

        jPanel10.add(jScrollPane6);
        jScrollPane6.setBounds(460, 260, 130, 130);

        listEmpAsigLocal2.setBackground(new java.awt.Color(204, 227, 255));
        listEmpAsigLocal2.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane7.setViewportView(listEmpAsigLocal2);

        jPanel10.add(jScrollPane7);
        jScrollPane7.setBounds(640, 260, 130, 130);

        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Transacciones");
        jPanel10.add(jLabel44);
        jLabel44.setBounds(460, 230, 84, 17);

        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Asignadas");
        jPanel10.add(jLabel45);
        jLabel45.setBounds(640, 230, 130, 17);

        btnAgrEmpLocal2.setBackground(new java.awt.Color(34, 131, 229));
        btnAgrEmpLocal2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnAgrEmpLocal2.setForeground(new java.awt.Color(255, 255, 255));
        btnAgrEmpLocal2.setText("Agregar");
        jPanel10.add(btnAgrEmpLocal2);
        btnAgrEmpLocal2.setBounds(460, 400, 130, 35);

        jLabel48.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("->");
        jPanel10.add(jLabel48);
        jLabel48.setBounds(610, 320, 16, 17);

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
        btnElimEmpLocal2.setBounds(640, 400, 130, 35);

        jPanel18.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        tabbedPane.addTab("Citas y tickets", jPanel18);

        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(125, 177, 229));

        jLabel38.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/users.png"))); // NOI18N
        jLabel38.setText(" Colas en tiempo real");

        treeColas.setBackground(new java.awt.Color(204, 227, 255));
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
                .addContainerGap(430, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel38)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        jPanel19.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        tabbedPane.addTab("Colas", jPanel19);

        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(125, 177, 229));
        jPanel6.setForeground(new java.awt.Color(125, 177, 229));

        txtBitacora.setEditable(false);
        txtBitacora.setBackground(new java.awt.Color(204, 227, 255));
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(430, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel41)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        jPanel20.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        tabbedPane.addTab("Bitácora de acceso", jPanel20);

        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(125, 177, 229));
        jPanel5.setForeground(new java.awt.Color(125, 177, 229));
        jPanel5.setLayout(null);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/Estadisticas.png"))); // NOI18N
        jPanel5.add(jLabel18);
        jLabel18.setBounds(67, 118, 260, 211);

        jLabel23.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/bar-chart-2.png"))); // NOI18N
        jLabel23.setText(" Análisis de datos");
        jPanel5.add(jLabel23);
        jLabel23.setBounds(100, 50, 265, 56);

        btnPDF.setBackground(new java.awt.Color(34, 131, 229));
        btnPDF.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnPDF.setForeground(new java.awt.Color(255, 255, 255));
        btnPDF.setText("Imprimir reporte estadístico");
        jPanel5.add(btnPDF);
        btnPDF.setBounds(100, 347, 210, 35);

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
        btnMapa.setBounds(100, 470, 210, 35);

        cboLocalesMapa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel5.add(cboLocalesMapa);
        cboLocalesMapa.setBounds(100, 423, 210, 23);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Locales");
        jPanel5.add(jLabel1);
        jLabel1.setBounds(100, 400, 210, 17);

        btnNoti.setBackground(new java.awt.Color(34, 131, 229));
        btnNoti.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnNoti.setForeground(new java.awt.Color(255, 255, 255));
        btnNoti.setText("Enviar notificacion");
        btnNoti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotiActionPerformed(evt);
            }
        });
        jPanel5.add(btnNoti);
        btnNoti.setBounds(420, 470, 210, 35);

        txtNumero.setText("numero");
        jPanel5.add(txtNumero);
        txtNumero.setBounds(420, 340, 210, 23);

        txtMensaje.setText("mensaje");
        jPanel5.add(txtMensaje);
        txtMensaje.setBounds(420, 390, 210, 23);

        jPanel21.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        tabbedPane.addTab("Análisis de datos", jPanel21);

        getContentPane().add(tabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 1040, 630));

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
        }
    }//GEN-LAST:event_btnGuardarUserActionPerformed

    private void btnGuardarLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarLocalActionPerformed
        boolean agregado = false;
        if (txtNomLocal.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "", 2);
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
            JOptionPane.showMessageDialog(this, "Local agregado exitosamente.", "", 1);
        }
    }//GEN-LAST:event_btnGuardarLocalActionPerformed

    private void btnGuardarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAreaActionPerformed
        if (txtNomArea.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "", 2);
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
                JOptionPane.showMessageDialog(this, "Área agregada exitosamente.", "", 1);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btnGuardarAreaActionPerformed

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
            JOptionPane.showMessageDialog(this, "Debe seleccionar un empleado.", "", 2);
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
            JOptionPane.showMessageDialog(this, "Debe seleccionar un empleado.", "", 2);
        }
    }//GEN-LAST:event_btnElimEmpLocalActionPerformed

    private void cboLocalTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLocalTranActionPerformed
        /*Local localSeleccionado = (Local) cboLocalTran.getSelectedItem();
        llenarCboAreas((Local) cboLocalTran.getSelectedItem());
        DefaultComboBoxModel cboAreaModel = new DefaultComboBoxModel();
        for (Area area : localSeleccionado.getAreas()) {
            cboAreaModel.addElement(area);
        }*/
        cboAreaTran.setModel(llenarCboAreas((Local)cboLocalTran.getSelectedItem()));
    }//GEN-LAST:event_cboLocalTranActionPerformed

    private void btnGuardarTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTranActionPerformed
        if (txtTipoTran.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "", 2);
        }
        else {
            if (cboLocalTran.getSelectedIndex() >= 0) {
                Local local = (Local)cboLocalTran.getSelectedItem();
                if (cboAreaTran.getSelectedIndex() >= 0) {
                    Area area = (Area)cboAreaTran.getSelectedItem();
                    area.getTransacciones().add(new Transaccion(txtTipoTran.getText(), (Integer)spTiemTran.getValue()));
                    actualizarTodo();
                    JOptionPane.showMessageDialog(this, "Transacción agregada exitosamente.", "", 1);
                }
            }
        }
    }//GEN-LAST:event_btnGuardarTranActionPerformed

    private void cboGuardarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGuardarCitaActionPerformed

    }//GEN-LAST:event_cboGuardarCitaActionPerformed

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
        // cboLocalCita.setSelectedItem(local);
        cboAreaCita.setSelectedItem(area);
    }//GEN-LAST:event_btnCargarCitaActionPerformed

    private void btnElimEmpLocal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimEmpLocal2ActionPerformed

    }//GEN-LAST:event_btnElimEmpLocal2ActionPerformed

    private void cboLocalCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLocalCitaActionPerformed
        cboAreaCita.setModel(llenarCboAreas((Local) cboLocalCita.getSelectedItem()));
    }//GEN-LAST:event_cboLocalCitaActionPerformed

    private void btnMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMapaActionPerformed
        if (cboLocalesMapa.getSelectedIndex() >= 0) {
            //new Mapa().coordenadas(ALLBITS, HEIGHT);
            //actualizarTodo();
            JOptionPane.showMessageDialog(this, "Por favor espere un segundo mientras carga el mapa del local.");
            Local local = (Local) cboLocalesMapa.getSelectedItem();
            new Mapa().coordenadas(local.getLatitud(), local.getLongitud(), local.getNombre());
            
            //Mapa ubicacion = new Mapa();
            //ubicacion.coordenadas(local.getLatitud(), local.getLongitud());
        }
    }//GEN-LAST:event_btnMapaActionPerformed

    private void tabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabbedPaneStateChanged
        actualizarTodo();
    }//GEN-LAST:event_tabbedPaneStateChanged

    private void btnNotiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotiActionPerformed
        new Notificaciones().enviarNotificacion(txtMensaje.getText(), txtNumero.getText());
        JOptionPane.showMessageDialog(this, "Notificacion enviada exitosamente");
    }//GEN-LAST:event_btnNotiActionPerformed

    
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
    private javax.swing.JButton btnAgrEmpLocal;
    private javax.swing.JButton btnAgrEmpLocal2;
    private javax.swing.JMenuItem btnCambiarCuentaAdmin;
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
    private javax.swing.JButton btnGuardarTran;
    private javax.swing.JButton btnGuardarUser;
    private javax.swing.JButton btnListarLocal;
    private javax.swing.JButton btnListarLocal1;
    private javax.swing.JButton btnListarTran;
    private javax.swing.JButton btnMapa;
    private javax.swing.JButton btnNoti;
    private javax.swing.JButton btnPDF;
    private javax.swing.JButton btnReenviarTicket;
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
    private javax.swing.JComboBox<String> cboLocalesMapa;
    private javax.swing.JComboBox<String> cboTipoUser;
    private javax.swing.JComboBox<String> cboTran;
    private javax.swing.JComboBox<String> cboUser;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
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
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JList<String> listEmpAsigLocal;
    private javax.swing.JList<String> listEmpAsigLocal2;
    private javax.swing.JList<String> listEmpLocal;
    private javax.swing.JList<String> listEmpLocal2;
    private javax.swing.JPanel pnlFechaCitaAdmin;
    private javax.swing.JRadioButton rbtnElimGerLocal;
    private javax.swing.JSpinner spLatitud;
    private javax.swing.JSpinner spLongitud;
    private javax.swing.JSpinner spTiemTran;
    private p2proyecto_pamelaramirez.UIAdmin tabbedPane;
    private javax.swing.JTree treeColas;
    private javax.swing.JTextArea txtBitacora;
    private javax.swing.JFormattedTextField txtIdCita;
    private javax.swing.JFormattedTextField txtIdUser;
    private javax.swing.JTextField txtMensaje;
    private javax.swing.JTextField txtNomArea;
    private javax.swing.JTextField txtNomDeUsuario;
    private javax.swing.JTextField txtNomLocal;
    private javax.swing.JTextField txtNomUser;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPassUser;
    private javax.swing.JTextField txtTipoTran;
    // End of variables declaration//GEN-END:variables
    
    // Actualiza todas las tabs con info de arraylists
    public void actualizarTodo(){
        int tab = tabbedPane.getSelectedIndex();
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
                //cboLocalCita.setModel(cboLocalModel);
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
                //cboLocalesMapa.setModel(cboAreaModel);
                cboLocalesMapa.setModel(llenarCboLocales());
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
