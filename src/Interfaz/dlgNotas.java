package Interfaz;

import Objetos.Estudiante;
import Objetos.Evaluacion;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class dlgNotas extends javax.swing.JDialog {

    private void poblartabla(int modo) {
        try {
            NumberFormat formatter = new DecimalFormat("#0.00");
            DefaultTableModel dModeloTabla = (DefaultTableModel) tblEstudiante.getModel();
            if (modo == 0) {
                dModeloTabla.addColumn(estudiante.getID());
            }

            Vector<String> VtrDatos = new Vector<String>();

            dModeloTabla.setRowCount(0);
            VtrDatos.add("Nombre");
            VtrDatos.add(estudiante.getNombre());
            String strTemporal = VtrDatos.toString();
            strTemporal = strTemporal.replace("[", "");
            strTemporal = strTemporal.replace("]", "");
            strTemporal.trim();
            Object[] bandera = strTemporal.split(",");
            dModeloTabla.addRow(bandera);
            VtrDatos.clear();
            for (Evaluacion evaluacion : estudiante.getListaNotas()) {
                VtrDatos.add((evaluacion.getNombreActividad() + " " + Double.toString(evaluacion.getPorcentaje()) + "%"));
                VtrDatos.add(Double.toString(evaluacion.getNota()));
                strTemporal = VtrDatos.toString();
                strTemporal = strTemporal.replace("[", "");
                strTemporal = strTemporal.replace("]", "");
                strTemporal.trim();
                bandera = strTemporal.split(",");
                dModeloTabla.addRow(bandera);
                VtrDatos.clear();
            }
            VtrDatos.add("Definitiva 100%");
            VtrDatos.add(Double.toString(estudiante.getDefinitiva()));
            dModeloTabla.addRow(VtrDatos);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error en campo", JOptionPane.WARNING_MESSAGE);
        }

    }

    List<Estudiante> listaeEstudiantes;
    Estudiante estudiante;

    public dlgNotas(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Creación Estudiante.");
    }

    public dlgNotas(javax.swing.JDialog parent, boolean modal, Estudiante estudiante, List<Estudiante> listaEstudiantes) {
        super(parent, modal);
        initComponents();
        this.estudiante = estudiante;
        this.listaeEstudiantes = listaEstudiantes;
        setTitle("Editar Estudiante: " + estudiante.getNombre());

        poblartabla(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstudiante = new javax.swing.JTable();
        btnCambiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblEstudiante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Estudiante."
            }
        ));
        jScrollPane1.setViewportView(tblEstudiante);

        btnCambiar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCambiar.setText("Cambiar");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(btnCambiar)
                .addGap(101, 101, 101)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCambiar)
                    .addComponent(btnSalir))
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        try {
            int[] filasSeleccionadas = tblEstudiante.getSelectedRows();

            if (filasSeleccionadas.length == 1) {
                int fila = filasSeleccionadas[0];
                if (tblEstudiante.getValueAt(fila, 0) == "Definitiva 100%") {
                    JOptionPane.showMessageDialog(this, "La DEFINITIVA no se puede modificar.", "Debes seleccionar fila diferente.", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    if (filasSeleccionadas[0] == 0) {
                        String name = (String.valueOf(tblEstudiante.getValueAt(fila, 1)));
                        estudiante.setNombre(name);
                        poblartabla(1);
                    } else {
                        double nota = Double.parseDouble(String.valueOf(tblEstudiante.getValueAt(fila, 1)));
                        if (nota > 5 || nota < 0) {
                            JOptionPane.showMessageDialog(this, "La NOTA debe ser un valor entre 0 y 5.", "NOTA.", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Esta seguro?", "Confirmar Cambio", JOptionPane.YES_NO_OPTION);
                            if (confirmacion == JOptionPane.YES_OPTION) {
                                estudiante.getListaNotas().get(filasSeleccionadas[0] - 1).setNota(nota);
                                poblartabla(1);
                            }
                        }

                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debes seleccionar la fila de la nota editada", "Debes seleccionar fila", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error en campo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCambiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEstudiante;
    // End of variables declaration//GEN-END:variables
}
