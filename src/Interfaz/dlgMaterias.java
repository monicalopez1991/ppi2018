/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Objetos.Grupo;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import Objetos.Docente;
import Objetos.Estudiante;
import javax.swing.JDialog;

/**
 *
 * @author JhonMario
 */
public class dlgMaterias extends javax.swing.JDialog {

    private void llevar() {
        try {

            String StrClase = cbClase.getSelectedItem().toString();
            if (StrClase.equalsIgnoreCase("Selecciona una Clase.")) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar una clase.", "Error en campo", JOptionPane.WARNING_MESSAGE);
            }
            if (operacion == Operacion.Docente) {
                for (Grupo grupo : docente.getListaClase()) {
                    if (StrClase.equals(grupo.getNombreClase())) {
                        dlgListaNotas dlglistaNotas = new dlgListaNotas(new javax.swing.JDialog(), true, grupo,listaDocentes);
                        dlglistaNotas.setLocationRelativeTo(this);
                        dlglistaNotas.setVisible(true);
                    }
                }
            } else {
                for (Docente profe : listaDocentes) {
                    for (Grupo grupo2 : profe.getListaClase()) {
                        if (grupo2.getNombreClase().equals(StrClase)) {
                            if (grupo2.getListaEstudiantes().contains(estudiante)) {
                                dlgListaNotas dlglistaNotas = new dlgListaNotas(new javax.swing.JDialog(), true, estudiante, StrClase,listaDocentes);
                                dlglistaNotas.setLocationRelativeTo(this);
                                dlglistaNotas.setVisible(true);
                            }
                        }
                    }
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error en campo", JOptionPane.WARNING_MESSAGE);
        }
    }

    enum Operacion {
        Docente, Estudiante;
    }

    Operacion operacion;
    List<Docente> listaDocentes;
    Docente docente;
    Estudiante estudiante;

    public dlgMaterias(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        operacion = dlgMaterias.Operacion.Docente;
        operacion = dlgMaterias.Operacion.Estudiante;
        initComponents();
    }

    public dlgMaterias(javax.swing.JDialog parent, boolean modal, Docente profe, List<Docente> listaDocentes) {
        super(parent, modal);
        initComponents();
        for (Grupo grupo : profe.getListaClase()) {
            cbClase.addItem(grupo.getNombreClase());
        }
        this.listaDocentes = listaDocentes;
        this.docente = profe;
        operacion = Operacion.Docente;
        setTitle("Docente " + profe.getNombre());
    }

    public dlgMaterias(javax.swing.JDialog parent, boolean modal, Vector<String> VtrMaterias, Estudiante alumno, List<Docente> listaDocentes) {
        super(parent, modal);
        initComponents();
        for (int i = 0; i < VtrMaterias.size(); i++) {
            String StrMateria = VtrMaterias.get(i);
            cbClase.addItem(StrMateria);
        }
        this.estudiante = alumno;
        this.listaDocentes = listaDocentes;
        operacion = Operacion.Estudiante;
        setTitle("Estudiante " + estudiante.getNombre());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSalir = new javax.swing.JButton();
        btAceptar = new javax.swing.JButton();
        cbClase = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Selección de Clase");

        btSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        btAceptar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btAceptar.setText("Aceptar");
        btAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAceptarActionPerformed(evt);
            }
        });

        cbClase.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una Clase." }));
        cbClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(btSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAceptar)
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(cbClase, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(cbClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalir)
                    .addComponent(btAceptar))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbClaseActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed

        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Desea Salir?", "Confirmación Salir", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {

            dispose();

        }
    }//GEN-LAST:event_btSalirActionPerformed

    private void btAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarActionPerformed
        llevar();
    }//GEN-LAST:event_btAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAceptar;
    private javax.swing.JButton btSalir;
    private javax.swing.JComboBox<String> cbClase;
    // End of variables declaration//GEN-END:variables
}
