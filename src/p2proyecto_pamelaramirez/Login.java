package p2proyecto_pamelaramirez;

import java.io.*;
import java.text.*;
import java.time.*;
import java.util.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Login extends javax.swing.JFrame {
    DatosSistema ds = new DatosSistema();
    Date fecha = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("hh:mm:ss a dd/MM/yyyy");

    public Login() {
        this.setTitle("Iniciar sesión");
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void limpiarInicioSesion() {
        txtNombreUsuario.setText(null);
        txtPassword.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(760, 595));

        pnlLogin.setBackground(new java.awt.Color(242, 169, 169));
        pnlLogin.setPreferredSize(new java.awt.Dimension(760, 595));
        pnlLogin.setSize(new java.awt.Dimension(760, 595));
        pnlLogin.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Iniciar sesión");
        pnlLogin.add(jLabel1);
        jLabel1.setBounds(310, 50, 126, 25);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/at-sign.png"))); // NOI18N
        jLabel2.setText(" Nombre de usuario");
        pnlLogin.add(jLabel2);
        jLabel2.setBounds(200, 310, 161, 24);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/lock.png"))); // NOI18N
        jLabel3.setText(" Contraseña");
        pnlLogin.add(jLabel3);
        jLabel3.setBounds(200, 360, 109, 24);

        txtPassword.setBackground(new java.awt.Color(255, 229, 229));
        txtPassword.setForeground(new java.awt.Color(51, 51, 51));
        txtPassword.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtPassword.setSelectionColor(new java.awt.Color(236, 120, 120));
        pnlLogin.add(txtPassword);
        txtPassword.setBounds(400, 360, 165, 23);

        txtNombreUsuario.setBackground(new java.awt.Color(255, 229, 229));
        txtNombreUsuario.setForeground(new java.awt.Color(51, 51, 51));
        txtNombreUsuario.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtNombreUsuario.setSelectionColor(new java.awt.Color(236, 120, 120));
        pnlLogin.add(txtNombreUsuario);
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
        pnlLogin.add(btnIniciarSesion);
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
        pnlLogin.add(btnCancelar);
        btnCancelar.setBounds(290, 480, 165, 35);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/Login.png"))); // NOI18N
        pnlLogin.add(jLabel25);
        jLabel25.setBounds(250, 90, 254, 191);

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/esquinasupizqu.png"))); // NOI18N
        jLabel42.setText("jLabel42");
        pnlLogin.add(jLabel42);
        jLabel42.setBounds(-10, -20, 250, 200);

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2proyecto_pamelaramirez/Icons/esquinainfderecha.png"))); // NOI18N
        pnlLogin.add(jLabel43);
        jLabel43.setBounds(550, 420, 210, 180);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarInicioSesion();
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        if (txtNombreUsuario.getText().isEmpty() || txtPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "Entrada inválida", 2);
        } else {
            boolean user = false, pass = false;
            for (Usuario usuario : ds.getUsuarios()) {
                if (usuario.getNombreUsuario().equals(txtNombreUsuario.getText())) {
                    user = true;
                }
                if (usuario.getPass().equals(new String(txtPassword.getPassword()))) {
                    pass = true;
                }
            }
            if (user && pass) {
                JOptionPane.showMessageDialog(this, "Bienvenido(a) de nuevo.", "Sesion iniciada", 1);
            } else if (!user) {
                JOptionPane.showMessageDialog(this, "Por favor verifique el nombre de usuario ingresado.", "Usuario inválido", 2);
            } else if (!pass && user) {
                JOptionPane.showMessageDialog(this, "Por favor verifique la contraseña ingresada.", "Contraseña incorrecta", 2);
            }
            // Bitacora aqui !!!  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
            new FrameAdmin().setVisible(true);
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

    /*public void llenarArbolColas() {
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
    }*/
    // Metodos de limpiar tabs aqui
}
