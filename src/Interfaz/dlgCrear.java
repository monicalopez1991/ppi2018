package Interfaz;

import Objetos.Estudiante;
import Objetos.Evaluacion;
import java.util.List;
import javax.swing.JOptionPane;

public class dlgCrear extends javax.swing.JDialog {

    List<Estudiante> listaeEstudiantes;
    List<Evaluacion> listaNotas;
    int Nnotas;

    public dlgCrear(javax.swing.JDialog parent, boolean modal, List<Evaluacion> listaNotas, List<Estudiante> listaEstudiante, int Nnotas) {
        super(parent, modal);
        initComponents();
        setTitle("Crear Estudiante Nuevo");
        this.listaeEstudiantes = listaEstudiante;
        this.listaNotas = listaNotas;
        this.Nnotas = Nnotas;
    }

    private boolean idYaExiste(int id) {
        try {
            for (Estudiante estudiante : listaeEstudiantes) {
                if (estudiante.getID() == id) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error en campo", JOptionPane.WARNING_MESSAGE);
        }
        return false;
    }

    public dlgCrear(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        btAceptar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btAceptar.setText("Crear");
        btAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAceptarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ID:");

        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Correo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAceptar)
                        .addGap(78, 78, 78)
                        .addComponent(btCancelar)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCorreo))))
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAceptar)
                    .addComponent(btCancelar))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarActionPerformed
        try {
            int id = 0;
            String strId = txtID.getText().trim();

            if (strId.isEmpty()) {
                txtID.requestFocus();
                txtID.selectAll();
                throw new Exception("Campo ID es obligatorio");
            }
            try {
                id = Integer.parseInt(txtID.getText());
            } catch (NumberFormatException numberFormatException) {
                txtID.requestFocus();
                txtID.selectAll();
                throw new Exception("Campo ID debe ser entero");
            }

            if (idYaExiste(id)) {
                txtID.requestFocus();
                txtID.selectAll();
                throw new Exception("Ya existe un estudiante con este identificador");
            }

            String nombre = txtNombre.getText();
            if (nombre.isEmpty()) {
                txtNombre.requestFocus();
                txtNombre.selectAll();
                throw new Exception("Campo nombre es obligatorio");
            }

            String Usuario = "";
            try {
                Usuario = txtCorreo.getText();
                if (Usuario.isEmpty()) {
                    txtNombre.requestFocus();
                    txtNombre.selectAll();
                    throw new Exception("Campo usuario es obligatorio");
                }

            } catch (NumberFormatException numberFormatException) {
                txtCorreo.requestFocus();
                txtCorreo.selectAll();
                throw new Exception("Campo seguimiento debe ser real");
            }
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Desea guardar este estudiante?", "Confirmación Guardar", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {

                Estudiante alumno = new Estudiante(id, Usuario, nombre, Nnotas);
                for (Evaluacion evaluacion : listaNotas) {
                    alumno.setNombreActividad(evaluacion.getNombreActividad(), evaluacion.NActividad);
                    alumno.setPorcentaje(evaluacion.getPorcentaje(), evaluacion.NActividad);
                }
                listaeEstudiantes.add(alumno);

                dlgNotas dlgnotas = new dlgNotas(new javax.swing.JDialog(), true, alumno, listaeEstudiantes);
                // Centra la ventana modal respecto a la ventana padre
                dlgnotas.setLocationRelativeTo(this);
                dlgnotas.setVisible(true);

                dispose();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error en campo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btAceptarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAceptar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
