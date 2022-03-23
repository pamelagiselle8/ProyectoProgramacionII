
package p2proyecto_pamelaramirez;

import java.text.SimpleDateFormat;
import java.util.Date;


public class FrameEmpleado extends javax.swing.JFrame {
    DatosSistema ds = new DatosSistema();
    Date fecha = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Usuario user;
    Area area;
    
    public FrameEmpleado() {
        initComponents();
        this.setTitle("Empleado");
        this.setLocationRelativeTo(null);
    }

    public void ingresar(Usuario empleado, Area area) {
        this.user = empleado;
        this.area = area;
        System.out.println(area + "\nnombre: " + user.getNombre());
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uIAdmin1 = new p2proyecto_pamelaramirez.UIAdmin();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnVentanilla = new javax.swing.JToggleButton();
        btnSiguiente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pbAtender = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        uIAdmin1.setBackground(new java.awt.Color(125, 177, 229));

        jPanel1.setBackground(new java.awt.Color(125, 177, 229));
        jPanel1.setForeground(new java.awt.Color(125, 177, 229));
        jPanel1.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/user.png"))); // NOI18N
        jLabel10.setText(" Ventanilla");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 50, 180, 24);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/degradados/Skyline.jpg"))); // NOI18N
        jLabel5.setText("jLabel3");
        jLabel5.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 1270, 130);

        btnVentanilla.setBackground(new java.awt.Color(34, 131, 229));
        btnVentanilla.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnVentanilla.setForeground(new java.awt.Color(255, 255, 255));
        btnVentanilla.setText("Abrir ventanilla");
        btnVentanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentanillaActionPerformed(evt);
            }
        });
        jPanel1.add(btnVentanilla);
        btnVentanilla.setBounds(140, 240, 170, 40);

        btnSiguiente.setBackground(new java.awt.Color(34, 131, 229));
        btnSiguiente.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setText("Llamar siguiente");
        jPanel1.add(btnSiguiente);
        btnSiguiente.setBounds(140, 410, 170, 40);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("#");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 340, 170, 50);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cliente actual");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 310, 170, 17);

        pbAtender.setForeground(new java.awt.Color(34, 131, 229));
        jPanel1.add(pbAtender);
        pbAtender.setBounds(430, 270, 450, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cliente en ventanilla");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(430, 240, 130, 17);

        uIAdmin1.addTab("Ventanilla", jPanel1);

        jPanel3.setBackground(new java.awt.Color(125, 177, 229));
        jPanel3.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/users.png"))); // NOI18N
        jLabel11.setText(" Cola");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(50, 50, 180, 24);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/degradados/Skyline.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel3.add(jLabel3);
        jLabel3.setBounds(0, 0, 1270, 130);

        uIAdmin1.addTab("Cola", jPanel3);

        getContentPane().add(uIAdmin1);
        uIAdmin1.setBounds(0, 0, 1020, 670);

        jMenu1.setText("Cuenta");

        jMenuItem1.setText("Cerrar sesión");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentanillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentanillaActionPerformed
        if (btnVentanilla.getText().equals("Abrir ventanilla")) {
            btnVentanilla.setText("Cerrar ventanilla");
            
        }
    }//GEN-LAST:event_btnVentanillaActionPerformed

    
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
            java.util.logging.Logger.getLogger(FrameEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JToggleButton btnVentanilla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar pbAtender;
    private p2proyecto_pamelaramirez.UIAdmin uIAdmin1;
    // End of variables declaration//GEN-END:variables
}
