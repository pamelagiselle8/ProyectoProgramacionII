
package p2proyecto_pamelaramirez;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
import javax.swing.*;

public class FrameCitas extends javax.swing.JFrame {
    Archivos archivos = new Archivos("./RegistroClientes.cbm");
    Login login = new Login();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Date fecha = new Date();
    Local local;
    Area area;
    
    public FrameCitas() {
        initComponents();
        pnlMostrarTicket.setVisible(false);
        pnlEncuesta.setVisible(false);
        this.setTitle("Sistema de gestión de colas inteligentes");
        ocultarPanelesTab1();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public void ocultarPanelesTab1() {
        pnlMostrarTicket.setVisible(false);
        pnlTicket.setVisible(false);
        pnlCita.setVisible(false);
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
        rbtnPreferencial = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnAgendarCita = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnGenerarTicket = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnl2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnTicket = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnAsistencia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEncuesta = new javax.swing.JButton();
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

        jPanel2.setBackground(new java.awt.Color(234, 163, 195));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        pnlTicket.setBackground(new java.awt.Color(234, 163, 195));
        pnlTicket.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Número de identidad");
        pnlTicket.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 144, 220, -1));

        txtIdCita.setBackground(new java.awt.Color(250, 234, 241));
        txtIdCita.setForeground(new java.awt.Color(51, 51, 51));
        try {
            txtIdCita.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdCita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlTicket.add(txtIdCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 173, 220, -1));

        rbtnPreferencial.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        rbtnPreferencial.setForeground(new java.awt.Color(255, 255, 255));
        rbtnPreferencial.setText("Cliente preferencial");
        pnlTicket.add(rbtnPreferencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 220, -1));

        jLabel19.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Nombre");
        pnlTicket.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 73, 220, -1));

        jTextField2.setBackground(new java.awt.Color(250, 234, 241));
        pnlTicket.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 103, 220, -1));

        jLabel16.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Número telefónico");
        pnlTicket.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 214, 220, -1));

        txtNumero.setBackground(new java.awt.Color(250, 234, 241));
        txtNumero.setForeground(new java.awt.Color(51, 51, 51));
        try {
            txtNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlTicket.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 244, 220, -1));

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Correo electrónico");
        pnlTicket.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 285, 220, -1));

        jTextField1.setBackground(new java.awt.Color(250, 234, 241));
        pnlTicket.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 315, 220, -1));

        pnlCita.setBackground(new java.awt.Color(234, 163, 195));
        pnlCita.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHoraCita.setBackground(new java.awt.Color(250, 234, 241));
        txtHoraCita.setForeground(new java.awt.Color(51, 51, 51));
        try {
            txtHoraCita.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHoraCita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlCita.add(txtHoraCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 124, -1));

        cboAmPm.setBackground(new java.awt.Color(255, 63, 156));
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

        pnlTicket.add(pnlCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 230, 120));

        cboAreaCita.setBackground(new java.awt.Color(255, 63, 156));
        cboAreaCita.setForeground(new java.awt.Color(255, 255, 255));
        cboAreaCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));
        cboAreaCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAreaCitaActionPerformed(evt);
            }
        });
        pnlTicket.add(cboAreaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 220, -1));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Local");
        pnlTicket.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 220, -1));

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Area");
        pnlTicket.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 220, -1));

        cboLocalCita.setBackground(new java.awt.Color(255, 63, 156));
        cboLocalCita.setForeground(new java.awt.Color(255, 255, 255));
        cboLocalCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));
        cboLocalCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLocalCitaActionPerformed(evt);
            }
        });
        pnlTicket.add(cboLocalCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 220, -1));

        btnGuardarCita.setBackground(new java.awt.Color(204, 58, 129));
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
        pnlTicket.add(btnGuardarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 352, 34));

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        listTranCita.setBackground(new java.awt.Color(250, 234, 241));
        listTranCita.setForeground(new java.awt.Color(51, 51, 51));
        listTranCita.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(listTranCita);

        pnlTicket.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 150, -1));

        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        listTranAsigCita.setBackground(new java.awt.Color(250, 234, 241));
        listTranAsigCita.setForeground(new java.awt.Color(51, 51, 51));
        listTranAsigCita.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(listTranAsigCita);

        pnlTicket.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 150, -1));

        jLabel18.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Transacciones disponibles");
        pnlTicket.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        jLabel23.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Transacciones a realizar");
        pnlTicket.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, -1, -1));

        btnAgregarTran.setBackground(new java.awt.Color(204, 58, 129));
        btnAgregarTran.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnAgregarTran.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarTran.setText("Agregar");
        btnAgregarTran.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarTran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTranActionPerformed(evt);
            }
        });
        pnlTicket.add(btnAgregarTran, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 150, 31));

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("->");
        pnlTicket.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 50, -1));

        btnElimTran.setBackground(new java.awt.Color(204, 58, 129));
        btnElimTran.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnElimTran.setForeground(new java.awt.Color(255, 255, 255));
        btnElimTran.setText("Eliminar");
        btnElimTran.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnElimTran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimTranActionPerformed(evt);
            }
        });
        pnlTicket.add(btnElimTran, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 150, 31));

        jPanel2.add(pnlTicket);
        pnlTicket.setBounds(536, 56, 770, 620);

        jPanel3.setBackground(new java.awt.Color(234, 163, 195));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Programar una cita futura");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 170, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/41-home-outline.gif"))); // NOI18N
        jLabel5.setText("Citas y tickets");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 230, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/circuloNaranjaOscuro250.png"))); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, -160, 260, 300));

        btnAgendarCita.setBackground(new java.awt.Color(204, 58, 129));
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
        jPanel3.add(btnAgendarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 230, 50));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Generar ticket virtual para caja");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        btnGenerarTicket.setBackground(new java.awt.Color(204, 58, 129));
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
        jPanel3.add(btnGenerarTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 230, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/esquinasupderPINK.png"))); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-260, -10, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/circuloNaranjaOscuro250.png"))); // NOI18N
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, -160, 260, 300));

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 530, 971);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/circuloNaranjaOscuro250.png"))); // NOI18N
        jPanel2.add(jLabel22);
        jLabel22.setBounds(1040, 840, 250, 280);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/basePink2.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel8);
        jLabel8.setBounds(890, 740, 590, 270);

        tabbedPane.addTab("Registro", jPanel2);

        pnl2.setBackground(new java.awt.Color(204, 163, 183));
        pnl2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnl2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/info (1).png"))); // NOI18N
        jLabel3.setText(" Información");
        pnl2.add(jLabel3);
        jLabel3.setBounds(190, 150, 190, 25);

        btnTicket.setBackground(new java.awt.Color(140, 89, 113));
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
        pnl2.add(btnTicket);
        btnTicket.setBounds(190, 230, 190, 50);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ver información de su ticket");
        pnl2.add(jLabel2);
        jLabel2.setBounds(180, 300, 210, 17);

        btnAsistencia.setBackground(new java.awt.Color(140, 89, 113));
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
        pnl2.add(btnAsistencia);
        btnAsistencia.setBounds(190, 370, 190, 50);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Asistencia a cita programada");
        pnl2.add(jLabel1);
        jLabel1.setBounds(180, 440, 210, 20);

        btnEncuesta.setBackground(new java.awt.Color(140, 89, 113));
        btnEncuesta.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnEncuesta.setForeground(new java.awt.Color(255, 255, 255));
        btnEncuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/star.png"))); // NOI18N
        btnEncuesta.setText(" Llenar encuesta de satisfacción");
        btnEncuesta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncuestaActionPerformed(evt);
            }
        });
        pnl2.add(btnEncuesta);
        btnEncuesta.setBounds(150, 520, 270, 50);

        pnlMostrarTicket.setBackground(new java.awt.Color(204, 163, 183));

        txtTicket.setEditable(false);
        txtTicket.setBackground(new java.awt.Color(236, 222, 229));
        txtTicket.setColumns(20);
        txtTicket.setRows(5);
        txtTicket.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane4.setViewportView(txtTicket);

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Ticket registrado");

        pnlEncuesta.setBackground(new java.awt.Color(204, 163, 183));

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

        btnGuardarEncuesta.setBackground(new java.awt.Color(140, 89, 113));
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

        txtIdInfo.setBackground(new java.awt.Color(236, 222, 229));
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
            .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1462, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        cboLocalCita.setModel(login.llenarCboLocales());
        pnlTicket.setVisible(true);
        pnlCita.setVisible(false);
        pnlMostrarTicket.setVisible(false);
    }//GEN-LAST:event_btnGenerarTicketActionPerformed

    private void btnGuardarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCitaActionPerformed
        // Mostrar ticket al guardar y guardar cita
        if (txtIdCita.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "", 2);
        }
        else {
            if (cboLocalCita.getSelectedIndex() >= 0 && cboAreaCita.getSelectedIndex() >= 0) {
                Local local = (Local) cboLocalCita.getSelectedItem();
                Area area = (Area) cboAreaCita.getSelectedItem();
                String id = txtIdCita.getText();
                ArrayList transacciones = new ArrayList();
                boolean preferencial = false;
                if (rbtnPreferencial.isSelected()) {
                    preferencial = true;
                }
                if (listTranAsigCita.getModel().getSize() >= 0) {
                    for (int i = 0; i < listTranAsigCita.getModel().getSize(); i++) {
                        transacciones.add(listTranAsigCita.getModel().getElementAt(i));
                    }
                    if (pnlCita.isVisible()) {
                        // Cita programada
                        Date fechaCita = dcFechaCita.getDate();
                        String hora = txtHoraCita.getText() + cboAmPm.getSelectedItem().toString();
                        // posici[on, preferencial y espera se settean
                        // cuando llegue a la cita y se agregue a la fila
                        Cita cita = new Cita(fechaCita, hora, id, false, fecha, transacciones);
                        area.getCitas().add(cita);
                        JOptionPane.showMessageDialog(this, "Cita guardada exitosamente.", "", 1);
                    }
                    else {
                        // Generar ticket
                        int espera = 0;
                        if (area.getCola().size() > 0) {
                            for (int i = 0; i < area.getCola().size(); i++) {
                                for (Transaccion tran : area.getCola().get(i).getTransacciones()) {
                                    espera += tran.getTiempo();
                                }
                            }
                        }
                        Cliente cliente = new Cliente(id, area.getCola().size() + 1, espera, preferencial, fecha, transacciones);
                        cliente.setTicket(local, area);
                        area.getCola().add(cliente);
                        limpiarTab1();
                        JOptionPane.showMessageDialog(this, "Cliente agregado a la cola exitosamente.", "", 1);
                    }
                }
                else {
                    JOptionPane.showMessageDialog(this, "Debe seleccionar las transacciones a realizar.", "", 2);
                }
            }
            else {
                JOptionPane.showMessageDialog(this, "Debe seleccionar el local y el área.", "", 2);
            }
        }
        
    }//GEN-LAST:event_btnGuardarCitaActionPerformed

    private void btnAgendarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarCitaActionPerformed
        // Mostrar panel para agendar cita
        // login.llenarCboAreas(localSeleccionado);;
        //llenarCboLocales();
        cboLocalCita.setModel(login.llenarCboLocales());
        pnlTicket.setVisible(true);
        pnlCita.setVisible(true);
    }//GEN-LAST:event_btnAgendarCitaActionPerformed

    private void btnTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketActionPerformed
        // Mostrar panel ticket
        pnlEncuesta.setVisible(false);
        pnlMostrarTicket.setVisible(true);
        try {
            Cliente cliente = buscarCliente();
            txtTicket.setText(cliente.getTicket());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el número de identidad del cliente.", "", 2);
        }
    }//GEN-LAST:event_btnTicketActionPerformed

    private void btnAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsistenciaActionPerformed
        // Registrar asistencia a cita programada
        Cliente cliente = buscarCliente();
        if (cliente instanceof Cita) {
            
            JOptionPane.showMessageDialog(this, "Asistencia registrada exitosamente.", "", 1);
        }
        else {
            JOptionPane.showMessageDialog(this, "Su ticket no pertenece a una cita agendada.", "", 2);
        }
    }//GEN-LAST:event_btnAsistenciaActionPerformed

    private void cboLocalCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLocalCitaActionPerformed
        if (cboLocalCita.getSelectedIndex() >= 0) {
            Local local = (Local) cboLocalCita.getSelectedItem();
            cboAreaCita.setModel(login.llenarCboAreas(local));
        }
    }//GEN-LAST:event_cboLocalCitaActionPerformed

    private void btnAgregarTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTranActionPerformed
        if (listTranCita.getSelectedIndex() >= 0) {
            DefaultListModel listTranModel = (DefaultListModel) listTranCita.getModel();
            DefaultListModel listTranAsigModel = (DefaultListModel) listTranAsigCita.getModel();
            Transaccion tranSeleccionada = (Transaccion) listTranModel.getElementAt(listTranCita.getSelectedIndex());
            listTranAsigModel.addElement(tranSeleccionada);
            listTranAsigCita.setModel(listTranAsigModel);
        }
        else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una transacción.", "", 2);
        }
    }//GEN-LAST:event_btnAgregarTranActionPerformed

    private void cboAreaCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAreaCitaActionPerformed
        if (cboAreaCita.getSelectedIndex() >= 0) {
            try {
                Area area = (Area)cboAreaCita.getSelectedItem();
                listTranCita.setModel(login.llenarListTran(area));
            } catch (Exception e) {
            }
            
        }
        else {
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
        }
        else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una transacción.", "", 2);
        }
    }//GEN-LAST:event_btnElimTranActionPerformed

    private void btnEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncuestaActionPerformed
        // Mostrar panel encuesta
        pnlEncuesta.setVisible(true);
        pnlMostrarTicket.setVisible(false);
        Cliente cliente = buscarCliente();
    }//GEN-LAST:event_btnEncuestaActionPerformed

    private void btnGuardarEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEncuestaActionPerformed
        if (lbPregunta.getText().equals("¿Cómo considera que fue el tiempo de espera?")) {
            // codigo aquiii
            lbPregunta.setText("¿Cómo calificaría el servicio brindado?");
        }
        else {
            // codigo aquiii
            lbPregunta.setText("¿Cómo considera que fue el tiempo de espera?");
            pnlEncuesta.setVisible(false);
            JOptionPane.showMessageDialog(this, "Gracias por su opinión.", "", 1);
        }
    }//GEN-LAST:event_btnGuardarEncuestaActionPerformed

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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbPregunta;
    private javax.swing.JList<String> listTranAsigCita;
    private javax.swing.JList<String> listTranCita;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnlCita;
    private javax.swing.JPanel pnlEncuesta;
    private javax.swing.JPanel pnlMostrarTicket;
    private javax.swing.JPanel pnlTicket;
    private javax.swing.JRadioButton rbtnBue;
    private javax.swing.JRadioButton rbtnExc;
    private javax.swing.JRadioButton rbtnMal;
    private javax.swing.JRadioButton rbtnMod;
    private javax.swing.JRadioButton rbtnPes;
    private javax.swing.JRadioButton rbtnPreferencial;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JFormattedTextField txtHoraCita;
    private javax.swing.JFormattedTextField txtIdCita;
    private javax.swing.JFormattedTextField txtIdInfo;
    private javax.swing.JFormattedTextField txtNumero;
    private javax.swing.JTextArea txtTicket;
    // End of variables declaration//GEN-END:variables
    
    public void llenarCboLocales() {
        if (!login.locales.isEmpty()) {
            DefaultComboBoxModel cboLocalModel = new DefaultComboBoxModel();
            for (Local local : login.locales) {
                cboLocalModel.addElement(local);
            }
            cboLocalCita.setModel(cboLocalModel);
        }
    }
    
    public Cliente buscarCliente() {
        Cliente clienteSeleccionado = null;
        pnlMostrarTicket.setVisible(true);
        if (!login.locales.isEmpty()) {
            for (Local local : login.locales) {
                if (!local.getAreas().isEmpty()) {
                    for (Area area : local.getAreas()) {
                        if (!area.getCola().isEmpty()) {
                            for (Cliente cliente : area.getCola()) {
                                if (cliente.id.equalsIgnoreCase(txtIdInfo.getText())) {
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
    
    public void limpiarTab1() {
        cboLocalCita.setSelectedIndex(0);
        txtIdCita.setText(null);
        dcFechaCita.setDate(null);
        txtHoraCita.setText(null);
        listTranAsigCita.setModel(new DefaultListModel());
    }
}
