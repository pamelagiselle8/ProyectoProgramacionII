
package p2proyecto_pamelaramirez;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    public Login() {
        usuarios.add(new Administrador("pame", "1234-1234-12345", "a", "a"));
        initComponents();
        //this.setVisible(false);
        this.setLocationRelativeTo(null);
        //Ingresar.setVisible(true);
        //Ingresar.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtNombreUsuario = new javax.swing.JTextField();
        btnIniciarSesion = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Ingresar al sistema");

        jLabel2.setText("Nombre de usuario");

        jLabel3.setText("Contraseña");

        btnIniciarSesion.setText("Iniciar sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(189, 189, 189))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIniciarSesion)
                    .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(219, 219, 219))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnIniciarSesion)
                .addGap(27, 27, 27)
                .addComponent(btnRegistrarse)
                .addGap(38, 38, 38)
                .addComponent(btnCancelar)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        Registro.setLocationRelativeTo(this);
        Registro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistrarseActionPerformed

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
        this.setVisible(false);
        System.out.println(bitacora);
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
                }
            }
            if (entro) {
                Date fecha = new Date();
                SimpleDateFormat formato = new SimpleDateFormat("hh:mm:ss a dd/MM/yyyy");
                formato.format(fecha);
                //  + LocalDateTime.now().getHour()
                bitacora += "Nuevo inicio de sesión " + formato.format(fecha) + ", usuario: " + txtNombreUsuario.getText() + ".\n";
                limpiarInicioSesion();
                JOptionPane.showMessageDialog(Registro, "Bienvenido(a) de nuevo.", "Sesion iniciada", 1);
                
            }
            else {
                JOptionPane.showMessageDialog(Registro, "Usuario o contraseña inválida.", "Credenciales incorrectas", 2);
            }
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Registro.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardarRegistro;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnRegresar;
    private javax.swing.ButtonGroup btngTipoUsuario;
    private javax.swing.JFormattedTextField ftxtIdRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbtnAdmin;
    private javax.swing.JRadioButton rbtnEmpleado;
    private javax.swing.JRadioButton rbtnGerente;
    private javax.swing.JTextField txtContrasenaRegistro;
    private javax.swing.JTextField txtNomUsuarioRegistro;
    private javax.swing.JTextField txtNombreRegistro;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
    
    // Mis variables
    ArrayList <Usuario> usuarios = new ArrayList();
    String bitacora;
    
    // Mis metodos
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
}
