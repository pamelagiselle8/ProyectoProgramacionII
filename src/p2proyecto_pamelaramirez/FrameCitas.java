
package p2proyecto_pamelaramirez;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
import javax.swing.*;

public class FrameCitas extends javax.swing.JFrame {
    Login login = new Login();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Date fecha = new Date();
    Local local;
    Area area;
    // ArrayList <Ticket> tickets = new ArrayList();
    
    public FrameCitas() {
        initComponents();
        //this.setLocationRelativeTo(null);
        //txtTicket.setVisible(false);
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        pnlTicket = new javax.swing.JPanel();
        cboAreaCita = new javax.swing.JComboBox<>();
        btnGuardarCita = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cboLocalCita = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTranCita = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listTranAsigCita = new javax.swing.JList<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnAgregarTran = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        btnElimTran = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        txtIdCita = new javax.swing.JFormattedTextField();
        rbtnPreferencial = new javax.swing.JRadioButton();
        pnlCita = new javax.swing.JPanel();
        txtHoraCita = new javax.swing.JFormattedTextField();
        cboAmPm = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        dcFechaCita = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAgendarCita = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnGenerarTicket = new javax.swing.JButton();
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

        jPanel1.setOpaque(false);

        cboAreaCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));
        cboAreaCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAreaCitaActionPerformed(evt);
            }
        });

        btnGuardarCita.setText("Guardar");
        btnGuardarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCitaActionPerformed(evt);
            }
        });

        jLabel11.setText("Local");

        jLabel12.setText("Area");

        cboLocalCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));
        cboLocalCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLocalCitaActionPerformed(evt);
            }
        });

        listTranCita.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(listTranCita);

        listTranAsigCita.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(listTranAsigCita);

        jLabel18.setText("Transacciones disponibles");

        jLabel23.setText("Transacciones a realizar");

        btnAgregarTran.setText("Agregar");
        btnAgregarTran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTranActionPerformed(evt);
            }
        });

        jLabel25.setText("->");

        btnElimTran.setText("Eliminar");
        btnElimTran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimTranActionPerformed(evt);
            }
        });

        jLabel35.setText("Identidad");

        try {
            txtIdCita.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdCita.setSize(new java.awt.Dimension(135, 23));

        rbtnPreferencial.setText("Cliente preferencial");

        javax.swing.GroupLayout pnlTicketLayout = new javax.swing.GroupLayout(pnlTicket);
        pnlTicket.setLayout(pnlTicketLayout);
        pnlTicketLayout.setHorizontalGroup(
            pnlTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTicketLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTicketLayout.createSequentialGroup()
                        .addGroup(pnlTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarTran, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addGroup(pnlTicketLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnElimTran, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnGuardarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(rbtnPreferencial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboAreaCita, javax.swing.GroupLayout.Alignment.LEADING, 0, 220, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addComponent(cboLocalCita, javax.swing.GroupLayout.Alignment.LEADING, 0, 220, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdCita)
                            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
        );
        pnlTicketLayout.setVerticalGroup(
            pnlTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTicketLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboLocalCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboAreaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbtnPreferencial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(pnlTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTicketLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel25)))
                .addGap(18, 18, 18)
                .addGroup(pnlTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarTran)
                    .addComponent(btnElimTran))
                .addGap(18, 18, 18)
                .addComponent(btnGuardarCita)
                .addGap(29, 29, 29))
        );

        try {
            txtHoraCita.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHoraCita.setSize(new java.awt.Dimension(135, 23));

        cboAmPm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "am", "pm" }));

        jLabel7.setText("Fecha");

        jLabel13.setText("Hora");

        javax.swing.GroupLayout pnlCitaLayout = new javax.swing.GroupLayout(pnlCita);
        pnlCita.setLayout(pnlCitaLayout);
        pnlCitaLayout.setHorizontalGroup(
            pnlCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCitaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dcFechaCita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlCitaLayout.createSequentialGroup()
                            .addComponent(txtHoraCita, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cboAmPm, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel13)))
                .addGap(30, 30, 30))
        );
        pnlCitaLayout.setVerticalGroup(
            pnlCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCitaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dcFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCitaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(pnlCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboAmPm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoraCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13))
                .addGap(71, 71, 71))
        );

        jLabel4.setText("Programar una cita futura");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setText("Citas y tickets");

        btnAgendarCita.setText("Agendar cita");
        btnAgendarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarCitaActionPerformed(evt);
            }
        });

        jLabel6.setText("Generar ticket virtual para caja");

        btnGenerarTicket.setText("Generar ticket virtual");
        btnGenerarTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnGenerarTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgendarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(15, 15, 15))))))
                .addGap(187, 187, 187)
                .addComponent(pnlTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel5)
                        .addGap(46, 46, 46)
                        .addComponent(btnGenerarTicket)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(43, 43, 43)
                        .addComponent(btnAgendarCita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Solicitar cita", jPanel2);

        pnl2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setText("Información");
        pnl2.add(jLabel3);
        jLabel3.setBounds(210, 150, 103, 23);

        btnTicket.setText("Consultar ticket");
        btnTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketActionPerformed(evt);
            }
        });
        pnl2.add(btnTicket);
        btnTicket.setBounds(210, 210, 145, 23);

        jLabel2.setText("Ver información de su ticket");
        pnl2.add(jLabel2);
        jLabel2.setBounds(200, 250, 163, 17);

        btnAsistencia.setText("Registrar asistencia");
        btnAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsistenciaActionPerformed(evt);
            }
        });
        pnl2.add(btnAsistencia);
        btnAsistencia.setBounds(210, 300, 145, 23);

        jLabel1.setText("Asistencia a cita programada");
        pnl2.add(jLabel1);
        jLabel1.setBounds(200, 340, 170, 17);

        btnEncuesta.setText("Llenar encuesta de satisfacción");
        btnEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncuestaActionPerformed(evt);
            }
        });
        pnl2.add(btnEncuesta);
        btnEncuesta.setBounds(178, 394, 215, 40);

        txtTicket.setEditable(false);
        txtTicket.setColumns(20);
        txtTicket.setRows(5);
        jScrollPane4.setViewportView(txtTicket);

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        jLabel17.setText("Ticket registrado");

        lbPregunta.setText("¿Cómo considera que fue el tiempo de espera?");

        btngEncuesta.add(rbtnExc);
        rbtnExc.setText("Excelente");

        btngEncuesta.add(rbtnBue);
        rbtnBue.setText("Bueno");

        btngEncuesta.add(rbtnMod);
        rbtnMod.setText("Moderado");

        btngEncuesta.add(rbtnMal);
        rbtnMal.setText("Malo");

        btngEncuesta.add(rbtnPes);
        rbtnPes.setText("Pésimo");

        btnGuardarEncuesta.setText("Guardar respuesta");
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
                    .addComponent(btnGuardarEncuesta)
                    .addComponent(rbtnPes)
                    .addComponent(rbtnMal)
                    .addComponent(rbtnMod)
                    .addComponent(rbtnBue)
                    .addComponent(rbtnExc))
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
                .addComponent(btnGuardarEncuesta)
                .addContainerGap(45, Short.MAX_VALUE))
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

        jLabel36.setText("Identidad");
        pnl2.add(jLabel36);
        jLabel36.setBounds(590, 110, 170, 17);

        try {
            txtIdInfo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pnl2.add(txtIdInfo);
        txtIdInfo.setBounds(590, 140, 220, 23);

        jTabbedPane1.addTab("Servicio al cliente", pnl2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenuBar1.setSize(new java.awt.Dimension(200, 100));

        btnIniciarSesion.setText("Administración");

        btnmenuInicioSesion.setText("Iniciar sesión");
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        //llenarCboLocales();
        pnlTicket.setVisible(true);
        pnlCita.setVisible(false);
        pnlMostrarTicket.setVisible(false);
    }//GEN-LAST:event_btnGenerarTicketActionPerformed

    private void btnGuardarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCitaActionPerformed
        // Mostrar ticket al guardar y guardar cita
        if (txtIdCita.getText().isEmpty() || txtHoraCita.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "", 2);
        }
        else {
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
        Cliente cliente = buscarCliente();
        txtTicket.setText(cliente.getTicket());
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
            Area area = (Area)cboAreaCita.getSelectedItem();
            listTranCita.setModel(login.llenarListTran(area));
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
            listTranModel.addElement(tranSeleccionada);
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
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
    private javax.swing.JFormattedTextField txtHoraCita;
    private javax.swing.JFormattedTextField txtIdCita;
    private javax.swing.JFormattedTextField txtIdInfo;
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
