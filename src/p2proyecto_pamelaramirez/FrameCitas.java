package p2proyecto_pamelaramirez;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
import javax.swing.*;

public class FrameCitas extends javax.swing.JFrame {

    DatosSistema ds = new DatosSistema();
    Login login = new Login();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    HiloHora hora;
    Date fecha = new Date();

    public FrameCitas() {
        initComponents();
        pnlMostrarTicket.setVisible(false);
        pnlEncuesta.setVisible(false);
        this.setTitle("Sistema de gestión de colas inteligentes");
        this.hora = new HiloHora(lblHora);
        this.hora.start();
        ocultarPanelesTab1();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ds.cargarDatos();
    }

    public CNormal buscarCliente() {
        CNormal clienteSeleccionado = null;
        /*pnlMostrarTicket.setVisible(true);
        if (!login.locales.isEmpty()) {
            for (Local local : login.locales) {
                if (!local.getAreas().isEmpty()) {
                    for (Area area : local.getAreas()) {
                        if (!area.getCola().isEmpty()) {
                            for (Cliente cliente : area.getCola()) {
                                if (cliente.identidad.equalsIgnoreCase(txtIdInfo.getText())) {
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
        }*/
        return clienteSeleccionado;
    }

    public void limpiarTab1() {
        cboLocalCita.setSelectedIndex(0);
        txtIdCita.setText(null);
        dcFechaCita.setDate(null);
        txtHoraCita.setText(null);
        listTranCita.setModel(ds.llenarListTran());
        listTranAsigCita.setModel(new DefaultListModel());
        ocultarPanelesTab1();
    }

    public void ocultarPanelesTab1() {
        pnlMostrarTicket.setVisible(false);
        pnlTicket.setVisible(false);
        pnlCita.setVisible(false);
        pnlNotis.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameTicket = new javax.swing.JFrame();
        frameCita = new javax.swing.JFrame();
        btngEncuesta = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        pnlTicket = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        txtIdCita = new javax.swing.JFormattedTextField();
        rbtnNotis = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        pnlCita = new javax.swing.JPanel();
        txtHoraCita = new javax.swing.JFormattedTextField();
        cboAmPm = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        dcFechaCita = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        cboAreaCita = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cboLocalCita = new javax.swing.JComboBox<>();
        btnGuardarCita = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTranCita = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listTranAsigCita = new javax.swing.JList<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnAgregarTran = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        btnElimTran = new javax.swing.JButton();
        rbtnPreferencial = new javax.swing.JRadioButton();
        pnlNotis = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAgendarCita = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnGenerarTicket = new javax.swing.JButton();
        lblHora = new javax.swing.JLabel();
        pnl2 = new javax.swing.JPanel();
        pnlMostrarTicket = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtTicket = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        pnlEncuesta = new javax.swing.JPanel();
        lbPregunta = new javax.swing.JLabel();
        rbtnExc = new javax.swing.JRadioButton();
        rbtnBue = new javax.swing.JRadioButton();
        rbtnMod = new javax.swing.JRadioButton();
        rbtnMal = new javax.swing.JRadioButton();
        rbtnPes = new javax.swing.JRadioButton();
        btnGuardarEncuesta = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnAsistencia = new javax.swing.JButton();
        btnTicket = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEncuesta = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtIdInfo = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnIniciarSesion = new javax.swing.JMenu();
        btnmenuInicioSesion = new javax.swing.JMenuItem();

        javax.swing.GroupLayout frameTicketLayout = new javax.swing.GroupLayout(frameTicket.getContentPane());
        frameTicket.getContentPane().setLayout(frameTicketLayout);
        frameTicketLayout.setHorizontalGroup(
            frameTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        frameTicketLayout.setVerticalGroup(
            frameTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout frameCitaLayout = new javax.swing.GroupLayout(frameCita.getContentPane());
        frameCita.getContentPane().setLayout(frameCitaLayout);
        frameCitaLayout.setHorizontalGroup(
            frameCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        frameCitaLayout.setVerticalGroup(
            frameCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(220, 180, 180));

        jPanel1.setBackground(new java.awt.Color(255, 102, 255));
        jPanel1.setOpaque(false);

        tabbedPane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabbedPaneStateChanged(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(247, 157, 179));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        pnlTicket.setBackground(new java.awt.Color(247, 157, 179));

        jLabel35.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Número de identidad");

        txtIdCita.setBackground(new java.awt.Color(250, 234, 241));
        txtIdCita.setForeground(new java.awt.Color(51, 51, 51));
        try {
            txtIdCita.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdCita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdCita.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtIdCita.setSelectionColor(new java.awt.Color(255, 92, 133));

        rbtnNotis.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        rbtnNotis.setForeground(new java.awt.Color(255, 255, 255));
        rbtnNotis.setText("Me gustaría recibir notificaciones");
        rbtnNotis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNotisActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Nombre");

        txtNom.setBackground(new java.awt.Color(250, 234, 241));
        txtNom.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtNom.setSelectionColor(new java.awt.Color(255, 92, 133));

        pnlCita.setBackground(new java.awt.Color(247, 157, 179));
        pnlCita.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHoraCita.setBackground(new java.awt.Color(250, 234, 241));
        txtHoraCita.setForeground(new java.awt.Color(51, 51, 51));
        try {
            txtHoraCita.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHoraCita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoraCita.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtHoraCita.setSelectionColor(new java.awt.Color(255, 92, 133));
        pnlCita.add(txtHoraCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 124, -1));

        cboAmPm.setBackground(new java.awt.Color(255, 92, 133));
        cboAmPm.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        cboAmPm.setForeground(new java.awt.Color(255, 255, 255));
        cboAmPm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "am", "pm" }));
        pnlCita.add(cboAmPm, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 90, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha");
        pnlCita.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, -1));

        dcFechaCita.setBackground(new java.awt.Color(234, 163, 195));
        dcFechaCita.setForeground(new java.awt.Color(51, 51, 51));
        dcFechaCita.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        pnlCita.add(dcFechaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 220, -1));

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Hora");
        pnlCita.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        cboAreaCita.setBackground(new java.awt.Color(255, 92, 133));
        cboAreaCita.setForeground(new java.awt.Color(255, 255, 255));
        cboAreaCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));
        cboAreaCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAreaCitaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Local");

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Area");

        cboLocalCita.setBackground(new java.awt.Color(255, 92, 133));
        cboLocalCita.setForeground(new java.awt.Color(255, 255, 255));
        cboLocalCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));
        cboLocalCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLocalCitaActionPerformed(evt);
            }
        });

        btnGuardarCita.setBackground(new java.awt.Color(216, 75, 110));
        btnGuardarCita.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnGuardarCita.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/save (1).png"))); // NOI18N
        btnGuardarCita.setText("Guardar");
        btnGuardarCita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCitaActionPerformed(evt);
            }
        });

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        listTranCita.setBackground(new java.awt.Color(250, 234, 241));
        listTranCita.setForeground(new java.awt.Color(51, 51, 51));
        listTranCita.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(listTranCita);

        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        listTranAsigCita.setBackground(new java.awt.Color(250, 234, 241));
        listTranAsigCita.setForeground(new java.awt.Color(51, 51, 51));
        listTranAsigCita.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(listTranAsigCita);

        jLabel18.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Transacciones disponibles");

        jLabel23.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Transacciones a realizar");

        btnAgregarTran.setBackground(new java.awt.Color(216, 75, 110));
        btnAgregarTran.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnAgregarTran.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarTran.setText("Agregar");
        btnAgregarTran.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarTran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTranActionPerformed(evt);
            }
        });

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("->");

        btnElimTran.setBackground(new java.awt.Color(216, 75, 110));
        btnElimTran.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnElimTran.setForeground(new java.awt.Color(255, 255, 255));
        btnElimTran.setText("Eliminar");
        btnElimTran.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnElimTran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimTranActionPerformed(evt);
            }
        });

        rbtnPreferencial.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        rbtnPreferencial.setForeground(new java.awt.Color(255, 255, 255));
        rbtnPreferencial.setText("Cliente preferencial");

        pnlNotis.setBackground(new java.awt.Color(247, 157, 179));

        jLabel16.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Número telefónico");

        txtNumero.setBackground(new java.awt.Color(250, 234, 241));
        txtNumero.setForeground(new java.awt.Color(51, 51, 51));
        try {
            txtNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumero.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtNumero.setSelectionColor(new java.awt.Color(255, 92, 133));

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Correo electrónico");

        txtCorreo.setBackground(new java.awt.Color(250, 234, 241));
        txtCorreo.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtCorreo.setSelectionColor(new java.awt.Color(255, 92, 133));

        javax.swing.GroupLayout pnlNotisLayout = new javax.swing.GroupLayout(pnlNotis);
        pnlNotis.setLayout(pnlNotisLayout);
        pnlNotisLayout.setHorizontalGroup(
            pnlNotisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNotisLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlNotisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnlNotisLayout.setVerticalGroup(
            pnlNotisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotisLayout.createSequentialGroup()
                .addComponent(jLabel16)
                .addGap(13, 13, 13)
                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel15)
                .addGap(13, 13, 13)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout pnlTicketLayout = new javax.swing.GroupLayout(pnlTicket);
        pnlTicket.setLayout(pnlTicketLayout);
        pnlTicketLayout.setHorizontalGroup(
            pnlTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTicketLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdCita, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnlNotis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtnPreferencial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlCita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtnNotis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addGroup(pnlTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboLocalCita, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboAreaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTicketLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel23))
                    .addGroup(pnlTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnlTicketLayout.createSequentialGroup()
                            .addComponent(btnAgregarTran, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnElimTran, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTicketLayout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnGuardarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        pnlTicketLayout.setVerticalGroup(
            pnlTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTicketLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(pnlTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTicketLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel19))
                    .addComponent(jLabel11))
                .addGap(10, 10, 10)
                .addGroup(pnlTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTicketLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cboLocalCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTicketLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel35))
                    .addComponent(jLabel12))
                .addGap(9, 9, 9)
                .addGroup(pnlTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTicketLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtIdCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cboAreaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTicketLayout.createSequentialGroup()
                        .addComponent(rbtnNotis)
                        .addGap(20, 20, 20)
                        .addComponent(pnlNotis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnPreferencial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlCita, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTicketLayout.createSequentialGroup()
                        .addGroup(pnlTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel18))
                        .addGap(13, 13, 13)
                        .addGroup(pnlTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlTicketLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel25))
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarTran, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnElimTran, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(247, 157, 179));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Programar una cita futura");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 170, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/41-home-outline.gif"))); // NOI18N
        jLabel5.setText("Citas y tickets");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 230, -1));

        btnAgendarCita.setBackground(new java.awt.Color(216, 75, 110));
        btnAgendarCita.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnAgendarCita.setForeground(new java.awt.Color(255, 255, 255));
        btnAgendarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/23-calendar-outline (1).gif"))); // NOI18N
        btnAgendarCita.setText(" Agendar cita");
        btnAgendarCita.setBorderPainted(false);
        btnAgendarCita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgendarCita.setFocusPainted(false);
        btnAgendarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarCitaActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgendarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 230, 50));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Generar ticket virtual para caja");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        btnGenerarTicket.setBackground(new java.awt.Color(216, 75, 110));
        btnGenerarTicket.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnGenerarTicket.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/70-ticket-outline.gif"))); // NOI18N
        btnGenerarTicket.setText(" Generar ticket virtual");
        btnGenerarTicket.setBorderPainted(false);
        btnGenerarTicket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerarTicket.setFocusPainted(false);
        btnGenerarTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarTicketActionPerformed(evt);
            }
        });
        jPanel3.add(btnGenerarTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 230, 50));

        lblHora.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("Hora");
        jPanel3.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 140, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pnlTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbedPane.addTab("Registro", jPanel2);

        pnl2.setBackground(new java.awt.Color(247, 157, 179));
        pnl2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnl2.setLayout(null);

        pnlMostrarTicket.setBackground(new java.awt.Color(247, 157, 179));

        txtTicket.setEditable(false);
        txtTicket.setBackground(new java.awt.Color(236, 222, 229));
        txtTicket.setColumns(20);
        txtTicket.setRows(5);
        txtTicket.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane4.setViewportView(txtTicket);

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Ticket registrado");

        pnlEncuesta.setBackground(new java.awt.Color(247, 157, 179));

        lbPregunta.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lbPregunta.setForeground(new java.awt.Color(255, 255, 255));
        lbPregunta.setText("¿Cómo considera que fue el tiempo de espera?");

        btngEncuesta.add(rbtnExc);
        rbtnExc.setForeground(new java.awt.Color(255, 255, 255));
        rbtnExc.setText("Excelente");
        rbtnExc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btngEncuesta.add(rbtnBue);
        rbtnBue.setForeground(new java.awt.Color(255, 255, 255));
        rbtnBue.setText("Bueno");
        rbtnBue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btngEncuesta.add(rbtnMod);
        rbtnMod.setForeground(new java.awt.Color(255, 255, 255));
        rbtnMod.setText("Moderado");
        rbtnMod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btngEncuesta.add(rbtnMal);
        rbtnMal.setForeground(new java.awt.Color(255, 255, 255));
        rbtnMal.setText("Malo");
        rbtnMal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btngEncuesta.add(rbtnPes);
        rbtnPes.setForeground(new java.awt.Color(255, 255, 255));
        rbtnPes.setText("Pésimo");
        rbtnPes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnGuardarEncuesta.setBackground(new java.awt.Color(216, 75, 110));
        btnGuardarEncuesta.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnGuardarEncuesta.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarEncuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/save (1).png"))); // NOI18N
        btnGuardarEncuesta.setText(" Guardar respuesta");
        btnGuardarEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEncuestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEncuestaLayout = new javax.swing.GroupLayout(pnlEncuesta);
        pnlEncuesta.setLayout(pnlEncuestaLayout);
        pnlEncuestaLayout.setHorizontalGroup(
            pnlEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEncuestaLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(lbPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(pnlEncuestaLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(pnlEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnPes)
                    .addComponent(rbtnMal)
                    .addComponent(rbtnMod)
                    .addComponent(rbtnBue)
                    .addComponent(rbtnExc)
                    .addComponent(btnGuardarEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlEncuestaLayout.setVerticalGroup(
            pnlEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncuestaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lbPregunta)
                .addGap(18, 18, 18)
                .addComponent(rbtnExc)
                .addGap(18, 18, 18)
                .addComponent(rbtnBue)
                .addGap(18, 18, 18)
                .addComponent(rbtnMod)
                .addGap(18, 18, 18)
                .addComponent(rbtnMal)
                .addGap(18, 18, 18)
                .addComponent(rbtnPes)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMostrarTicketLayout = new javax.swing.GroupLayout(pnlMostrarTicket);
        pnlMostrarTicket.setLayout(pnlMostrarTicketLayout);
        pnlMostrarTicketLayout.setHorizontalGroup(
            pnlMostrarTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMostrarTicketLayout.createSequentialGroup()
                .addGroup(pnlMostrarTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMostrarTicketLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnlMostrarTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlMostrarTicketLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMostrarTicketLayout.setVerticalGroup(
            pnlMostrarTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMostrarTicketLayout.createSequentialGroup()
                .addComponent(pnlEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pnl2.add(pnlMostrarTicket);
        pnlMostrarTicket.setBounds(560, 180, 360, 290);

        jLabel36.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Identidad");
        pnl2.add(jLabel36);
        jLabel36.setBounds(590, 110, 170, 17);

        jPanel4.setBackground(new java.awt.Color(247, 157, 179));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAsistencia.setBackground(new java.awt.Color(216, 75, 110));
        btnAsistencia.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnAsistencia.setForeground(new java.awt.Color(255, 255, 255));
        btnAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/clock.png"))); // NOI18N
        btnAsistencia.setText(" Registrar asistencia");
        btnAsistencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsistenciaActionPerformed(evt);
            }
        });
        jPanel4.add(btnAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 230, 50));

        btnTicket.setBackground(new java.awt.Color(216, 75, 110));
        btnTicket.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnTicket.setForeground(new java.awt.Color(255, 255, 255));
        btnTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/edit.png"))); // NOI18N
        btnTicket.setText(" Consultar ticket");
        btnTicket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketActionPerformed(evt);
            }
        });
        jPanel4.add(btnTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 230, 50));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ver información de su ticket");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 210, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Asistencia a cita programada");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 230, 20));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/info (1).png"))); // NOI18N
        jLabel3.setText(" Información");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 230, 40));

        btnEncuesta.setBackground(new java.awt.Color(216, 75, 110));
        btnEncuesta.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnEncuesta.setForeground(new java.awt.Color(255, 255, 255));
        btnEncuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/star.png"))); // NOI18N
        btnEncuesta.setText(" Encuesta de satisfacción");
        btnEncuesta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncuestaActionPerformed(evt);
            }
        });
        jPanel4.add(btnEncuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 230, 50));
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 920));

        pnl2.add(jPanel4);
        jPanel4.setBounds(0, 0, 470, 971);

        txtIdInfo.setBackground(new java.awt.Color(250, 234, 241));
        txtIdInfo.setForeground(new java.awt.Color(51, 51, 51));
        try {
            txtIdInfo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdInfo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnl2.add(txtIdInfo);
        txtIdInfo.setBounds(590, 140, 220, 23);

        tabbedPane.addTab("Servicio al cliente", pnl2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1357, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 971, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jMenuBar1.setSize(new java.awt.Dimension(200, 100));

        btnIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/63-settings-cog-outline.gif"))); // NOI18N
        btnIniciarSesion.setText("Administración");
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        btnmenuInicioSesion.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnmenuInicioSesion.setForeground(new java.awt.Color(0, 0, 0));
        btnmenuInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/login-1.1s-24px.png"))); // NOI18N
        btnmenuInicioSesion.setText("Iniciar sesión");
        btnmenuInicioSesion.setBorderPainted(false);
        btnmenuInicioSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmenuInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuInicioSesionActionPerformed(evt);
            }
        });
        btnIniciarSesion.add(btnmenuInicioSesion);

        jMenuBar1.add(btnIniciarSesion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmenuInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuInicioSesionActionPerformed
        // Mostrar ventanita de login
        login.setVisible(true);
        login.setLocationRelativeTo(this);
    }//GEN-LAST:event_btnmenuInicioSesionActionPerformed

    private void btnGenerarTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarTicketActionPerformed
        // Mostrar panel para crear un ticket virtual para caja
        cboLocalCita.setModel(ds.llenarCboLocales());
        pnlTicket.setVisible(true);
        pnlCita.setVisible(false);
        pnlMostrarTicket.setVisible(false);
    }//GEN-LAST:event_btnGenerarTicketActionPerformed

    private void btnGuardarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCitaActionPerformed
        if (ds.idValido(txtIdCita.getText())) {
            if (listTranAsigCita.getModel().getSize() > 0) {
                Area area = (Area) cboAreaCita.getSelectedItem();
                String id = txtIdCita.getText(), nom = txtNom.getText(), correo = txtCorreo.getText(),
                        tel = txtNumero.getText(), hora = txtHoraCita.getText(),
                        fecha = sdf.format(this.fecha), fechaCita = "";
                try {
                    fechaCita = sdf.format(dcFechaCita.getDate());
                } catch (Exception e) {
                }
                int posNormal = 0, posPref = 0, notis = 0, pref = 0;
                if (rbtnNotis.isSelected()) {
                    notis = 1;
                }
                if (rbtnPreferencial.isSelected()) {
                    pref = 1;
                }
                if (!area.getNormal().isEmpty()) {
                    posNormal = area.getNormal().size();
                }
                if (!area.getPreferencial().isEmpty()) {
                    posNormal = area.getPreferencial().size();
                }
                // Clientes normales y preferenciales
                if (!pnlCita.isVisible()) {
                    if (!rbtnPreferencial.isSelected()) {
                        // Cliente normal
                        ds.addNormal(posNormal, id, nom, notis, correo, tel, fecha, area);
                    }
                    else if (rbtnPreferencial.isSelected()) {
                        // Cliente preferencial 
                        ds.addPreferencial(posPref, id, nom, notis, correo, tel, fecha, area);
                    }
                    JOptionPane.showMessageDialog(this, "Ticket generado exitosamente.", "", 1);
                }
                else {
                    // Citas normales y preferenciales
                    ds.addCitaNotis(0, id, nom, notis, pref, correo, tel, fecha, fechaCita, hora, area);
                    JOptionPane.showMessageDialog(this, "Cita programada exitosamente.", "", 1);
                    System.out.println(area.getCitas().get(0).getNombre());
                }
                
            } else {
                JOptionPane.showMessageDialog(this, "Ya existe un ticket/cita "
                        + "con el número de identidad ingresado.", "", 2);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar las transacciones a realizar.", "", 2);
        }
    }//GEN-LAST:event_btnGuardarCitaActionPerformed

    private void btnAgendarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarCitaActionPerformed
        // Mostrar panel para agendar cita
        cboLocalCita.setModel(ds.llenarCboLocales());
        pnlTicket.setVisible(true);
        pnlCita.setVisible(true);
    }//GEN-LAST:event_btnAgendarCitaActionPerformed

    private void btnTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketActionPerformed
        // Mostrar panel ticket
        pnlEncuesta.setVisible(false);
        pnlMostrarTicket.setVisible(true);
        try {
            CNormal cliente = buscarCliente();
            txtTicket.setText(cliente.getTicket());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el número de identidad del cliente.", "", 2);
        }
    }//GEN-LAST:event_btnTicketActionPerformed

    private void btnAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsistenciaActionPerformed
        // Registrar asistencia a cita programada
        CNormal cliente = buscarCliente();
        if (true) {
            // Codigo registrar asistencia aqui
            JOptionPane.showMessageDialog(this, "Asistencia registrada exitosamente.", "", 1);
        } else {
            JOptionPane.showMessageDialog(this, "Su ticket no pertenece a una cita agendada.", "", 2);
        }
    }//GEN-LAST:event_btnAsistenciaActionPerformed

    private void cboLocalCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLocalCitaActionPerformed
        if (cboLocalCita.getSelectedIndex() >= 0) {
            Local local = (Local) cboLocalCita.getSelectedItem();
            cboAreaCita.setModel(ds.llenarCboAreas(local));
        }
    }//GEN-LAST:event_cboLocalCitaActionPerformed

    private void btnAgregarTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTranActionPerformed
        if (listTranCita.getSelectedIndex() >= 0) {
            DefaultListModel listTranModel = (DefaultListModel) listTranCita.getModel();
            DefaultListModel listTranAsigModel = (DefaultListModel) listTranAsigCita.getModel();
            Transaccion tranSeleccionada = (Transaccion) listTranModel.getElementAt(listTranCita.getSelectedIndex());
            listTranAsigModel.addElement(tranSeleccionada);
            listTranAsigCita.setModel(listTranAsigModel);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una transacción.", "", 2);
        }
    }//GEN-LAST:event_btnAgregarTranActionPerformed

    private void cboAreaCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAreaCitaActionPerformed
        if (cboAreaCita.getSelectedIndex() >= 0) {
            try {
                Area area = (Area) cboAreaCita.getSelectedItem();
                listTranCita.setModel(ds.llenarListTranArea(area));
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un área.", "", 2);
        }
    }//GEN-LAST:event_cboAreaCitaActionPerformed

    private void btnElimTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimTranActionPerformed
        if (listTranAsigCita.getSelectedIndex() >= 0) {
            DefaultListModel listTranModel = (DefaultListModel) listTranCita.getModel();
            DefaultListModel listTranAsigModel = (DefaultListModel) listTranAsigCita.getModel();
            Transaccion tranSeleccionada = (Transaccion) listTranAsigModel.getElementAt(listTranAsigCita.getSelectedIndex());
            listTranAsigModel.removeElement(tranSeleccionada);
            listTranCita.setModel(listTranModel);
            listTranAsigCita.setModel(listTranAsigModel);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una transacción.", "", 2);
        }
    }//GEN-LAST:event_btnElimTranActionPerformed

    private void btnEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncuestaActionPerformed
        // Mostrar panel encuesta
        pnlEncuesta.setVisible(true);
        pnlMostrarTicket.setVisible(false);
        CNormal cliente = buscarCliente();
    }//GEN-LAST:event_btnEncuestaActionPerformed

    private void btnGuardarEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEncuestaActionPerformed
        if (lbPregunta.getText().equals("¿Cómo considera que fue el tiempo de espera?")) {
            // codigo aquiii
            lbPregunta.setText("¿Cómo calificaría el servicio brindado?");
        } else {
            // codigo aquiii
            lbPregunta.setText("¿Cómo considera que fue el tiempo de espera?");
            pnlEncuesta.setVisible(false);
            JOptionPane.showMessageDialog(this, "Gracias por su opinión.", "", 1);
        }
    }//GEN-LAST:event_btnGuardarEncuestaActionPerformed

    private void rbtnNotisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNotisActionPerformed
        pnlNotis.setVisible(rbtnNotis.isSelected());
        JOptionPane.showMessageDialog(this, "Su número debe estar verificado en Twilio para recibir notificaciones del sistema.", "Aviso", 1);
    }//GEN-LAST:event_rbtnNotisActionPerformed

    private void tabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabbedPaneStateChanged
        int tab = tabbedPane.getSelectedIndex();
        if (tab == 0) {

        } else {

        }
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
            java.util.logging.Logger.getLogger(FrameCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendarCita;
    private javax.swing.JButton btnAgregarTran;
    private javax.swing.JButton btnAsistencia;
    private javax.swing.JButton btnElimTran;
    private javax.swing.JButton btnEncuesta;
    private javax.swing.JButton btnGenerarTicket;
    private javax.swing.JButton btnGuardarCita;
    private javax.swing.JButton btnGuardarEncuesta;
    private javax.swing.JMenu btnIniciarSesion;
    private javax.swing.JButton btnTicket;
    private javax.swing.ButtonGroup btngEncuesta;
    private javax.swing.JMenuItem btnmenuInicioSesion;
    private javax.swing.JComboBox<String> cboAmPm;
    private javax.swing.JComboBox<String> cboAreaCita;
    private javax.swing.JComboBox<String> cboLocalCita;
    private com.toedter.calendar.JDateChooser dcFechaCita;
    private javax.swing.JFrame frameCita;
    private javax.swing.JFrame frameTicket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbPregunta;
    private javax.swing.JLabel lblHora;
    private javax.swing.JList<String> listTranAsigCita;
    private javax.swing.JList<String> listTranCita;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnlCita;
    private javax.swing.JPanel pnlEncuesta;
    private javax.swing.JPanel pnlMostrarTicket;
    private javax.swing.JPanel pnlNotis;
    private javax.swing.JPanel pnlTicket;
    private javax.swing.JRadioButton rbtnBue;
    private javax.swing.JRadioButton rbtnExc;
    private javax.swing.JRadioButton rbtnMal;
    private javax.swing.JRadioButton rbtnMod;
    private javax.swing.JRadioButton rbtnNotis;
    private javax.swing.JRadioButton rbtnPes;
    private javax.swing.JRadioButton rbtnPreferencial;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JFormattedTextField txtHoraCita;
    private javax.swing.JFormattedTextField txtIdCita;
    private javax.swing.JFormattedTextField txtIdInfo;
    private javax.swing.JTextField txtNom;
    private javax.swing.JFormattedTextField txtNumero;
    private javax.swing.JTextArea txtTicket;
    // End of variables declaration//GEN-END:variables

}
