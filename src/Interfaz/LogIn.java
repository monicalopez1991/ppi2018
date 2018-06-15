/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Objetos.Docente;
import Objetos.Estudiante;
import Objetos.Evaluacion;
import Objetos.Grupo;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author JhonMario
 */
public class LogIn extends javax.swing.JFrame {

    // Crea una lista en memoria dinámica
    List<Estudiante> listaEstudiantes = new ArrayList<>();
    List<Evaluacion> listaNotas = new ArrayList<>();
    List<Docente> listaDocentes = new ArrayList<>();
    List<Grupo> listaClase = new ArrayList<>();

    //Este metodo recibe una cadena tipo String y revisa si contiene numero
    private static boolean esNumerico(String cadena) throws Exception {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            throw new Exception("El campo USUARIO o CONTRASEÑA son incorrectos.");
        }
    }

    /**
     * Creates new form LogIn
     */
    public LogIn() {
        setLocationRelativeTo(null);
        initComponents();
        try {
            listaDocentes=archivo.Archivo.leer();            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error en campo", JOptionPane.WARNING_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfUsuario = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfContraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In");
        setLocation(new java.awt.Point(700, 375));

        tfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsuarioActionPerformed(evt);
            }
        });

        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Usuario");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Contraseña:");

        tfContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfContraseñaActionPerformed(evt);
            }
        });
        tfContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfContraseñaKeyTyped(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoppi.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(btnAceptar)
                .addGap(89, 89, 89)
                .addComponent(btnCancelar)
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfContraseña)
                            .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(162, 162, 162))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addGap(60, 60, 60))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsuarioActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        Ingreso();

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void tfContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContraseñaActionPerformed

    private void tfContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfContraseñaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContraseñaKeyTyped

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField tfContraseña;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables

    private void Ingreso() {
        try {

            String StrUsuario = tfUsuario.getText().trim();
            String StrContraseña = tfContraseña.getText().trim();
            Vector<String> VtrMaterias = new Vector<String>();

            if (!(esNumerico(StrContraseña))) {
                tfUsuario.setText("");
                tfContraseña.setText("");
                tfUsuario.requestFocus();
                JOptionPane.showMessageDialog(null, "El campo USUARIO o CONTRASEÑA son incorrectos.", "Error en campo", JOptionPane.WARNING_MESSAGE);
            }

            for (Docente Profe : listaDocentes) {
                if (Profe.getIDDocente() == (Integer.parseInt(StrContraseña)) && Profe.getUsuario().equals(StrUsuario)) {

                    dlgMaterias dlgmaterias = new dlgMaterias(new javax.swing.JDialog(), true, Profe,listaDocentes);
                    dlgmaterias.setLocationRelativeTo(this);
                    dlgmaterias.setVisible(true);
                    tfUsuario.setText("");
                    tfContraseña.setText("");

                } else {
                    for (Grupo grupo : Profe.getListaClase()) {
                        for (Estudiante Alumno : grupo.getListaEstudiantes()) {
                            if (Alumno.getID() == (Integer.parseInt(StrContraseña)) && Alumno.getUsuario().equals(StrUsuario)) {
                                for (Docente Profe2 : listaDocentes) {
                                    for (Grupo grupo2 : Profe2.getListaClase()) {
                                        if (grupo2.listaEstudiantes.contains(Alumno)) {
                                            VtrMaterias.add(grupo2.getNombreClase());
                                        }
                                    }
                                }
                                dlgMaterias dlgmaterias = new dlgMaterias(new javax.swing.JDialog(), true, VtrMaterias, Alumno, listaDocentes);
                                dlgmaterias.setLocationRelativeTo(this);
                                dlgmaterias.setVisible(true);
                                tfUsuario.setText("");
                                tfContraseña.setText("");

                                return;
                            }
                        }
                    }
                    tfUsuario.requestFocus();
                    tfUsuario.selectAll();
                    tfContraseña.setText("");
                    JOptionPane.showMessageDialog(null, "El campo USUARIO o CONTRASEÑA son incorrectos.", "Error en campo", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error en campo", JOptionPane.WARNING_MESSAGE);
        }
    }
}
