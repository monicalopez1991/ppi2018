package Interfaz;

import Objetos.Docente;
import Objetos.Estudiante;
import Objetos.Evaluacion;
import Objetos.Grupo;
import java.awt.Color;
import java.awt.Component;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JhonMario y Moni.
 */
public class dlgListaNotas extends javax.swing.JDialog {

    List<Estudiante> listaFiltro = new ArrayList<>();
    List<Docente> listaDocentes = new ArrayList<>();
    List<Estudiante> listaEstudiante = new ArrayList<>();
    Estudiante estudiante;

//constructor predeterminado de la clase JDialogol.
    public dlgListaNotas(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

//constructor cuando inicia un maestro.
    public dlgListaNotas(javax.swing.JDialog parent, boolean modal, Grupo grupo, List<Docente> listaDocentes) {
        super(parent, modal);
        initComponents();
        setTitle(grupo.getNombreClase());
        this.listaDocentes = listaDocentes;
        this.listaEstudiante = grupo.getListaEstudiantes();
        poblarTablaEstudiantes();
    }

//constructor cuando inicia un alumno.
    public dlgListaNotas(javax.swing.JDialog parent, boolean modal, Estudiante estudiante, String StrClase, List<Docente> listaDocentes) {
        super(parent, modal);
        initComponents();
        Panel1.setVisible(false);
        setTitle(StrClase);
        this.listaDocentes = listaDocentes;
        this.estudiante = estudiante;
        poblarTablaEstudiante();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblestudiante = new javax.swing.JTable();
        Panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rbID = new javax.swing.JRadioButton();
        rbnombre = new javax.swing.JRadioButton();
        rbdefinitiva = new javax.swing.JRadioButton();
        btagregar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        bteditar = new javax.swing.JButton();
        txtfiltrar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblestudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Seguimiento (50%)", "Parcial ()20%", "Final (30%)", "Definitiva (100%)"
            }
        ));
        jScrollPane3.setViewportView(tblestudiante);

        jLabel1.setText("Ordenar Por:");

        buttonGroup1.add(rbID);
        rbID.setSelected(true);
        rbID.setText("ID");
        rbID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIDActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbnombre);
        rbnombre.setText("Nombre");
        rbnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnombreActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbdefinitiva);
        rbdefinitiva.setText("Definitiva");
        rbdefinitiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbdefinitivaActionPerformed(evt);
            }
        });

        btagregar.setText("Agregar");
        btagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btagregarActionPerformed(evt);
            }
        });

        bteliminar.setText("Eliminar");
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });

        bteditar.setText("Editar");
        bteditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditarActionPerformed(evt);
            }
        });

        txtfiltrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfiltrarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfiltrarKeyTyped(evt);
            }
        });

        jLabel2.setText("Filtrar estuduantes que contengan:");

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(btagregar)
                                .addGap(94, 94, 94)
                                .addComponent(bteliminar)
                                .addGap(82, 82, 82)
                                .addComponent(bteditar))
                            .addComponent(rbnombre)
                            .addComponent(rbdefinitiva))
                        .addContainerGap(290, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(rbID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtfiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57))))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbID)
                            .addComponent(txtfiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbdefinitiva)
                        .addGap(0, 81, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btagregar)
                            .addComponent(bteliminar)
                            .addComponent(bteditar))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bteditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditarActionPerformed
        try {

            int[] filasSeleccionadas = tblestudiante.getSelectedRows();

            if (filasSeleccionadas.length == 1) {
                Estudiante SlcEstudiante = listaEstudiante.get(tblestudiante.getSelectedRow());
                dlgNotas dlgnotas = new dlgNotas(new javax.swing.JDialog(), true, SlcEstudiante, listaEstudiante);
                // Centra la ventana modal respecto a la ventana padre
                dlgnotas.setLocationRelativeTo(this);
                dlgnotas.setVisible(true);

                poblarTablaEstudiantes();
            } else {
                JOptionPane.showMessageDialog(this, "Debes seleccionar un estudiante", "Debes seleccionar filas", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error en campo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bteditarActionPerformed

    private void txtfiltrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfiltrarKeyReleased
        try {

            String buscar = txtfiltrar.getText();

            NumberFormat formatter = new DecimalFormat("#0.0");

            for (Estudiante c : listaEstudiante) {
                if (c.getNombre().toUpperCase().contains(buscar.toUpperCase())) {
                    listaFiltro.add(c);
                } else {
                    if (String.valueOf(c.getID()).contains(buscar)) {
                        listaFiltro.add(c);
                    }
                }
            }
            aplicarFiltro(listaFiltro);
            listaFiltro.clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error en campo", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtfiltrarKeyReleased

    private void txtfiltrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfiltrarKeyTyped

    }//GEN-LAST:event_txtfiltrarKeyTyped

    private void rbIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIDActionPerformed
        if (rbID.isSelected()) {
            poblarTablaEstudiantes();
        }
    }//GEN-LAST:event_rbIDActionPerformed

    private void rbnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnombreActionPerformed
        // TODO add your handling code here:
        if (rbnombre.isSelected()) {
            poblarTablaEstudiantes();
        }
    }//GEN-LAST:event_rbnombreActionPerformed

    private void rbdefinitivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbdefinitivaActionPerformed
        // TODO add your handling code here:
        if (rbdefinitiva.isSelected()) {
            poblarTablaEstudiantes();
        }
    }//GEN-LAST:event_rbdefinitivaActionPerformed

    private void btagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btagregarActionPerformed
        // TODO add your handling code here:
        dlgCrear dlgcrear = new dlgCrear(this, true, listaEstudiante.get(0).getListaNotas(), listaEstudiante, listaEstudiante.get(0).getListaNotas().get((listaEstudiante.get(0).getListaNotas().size() - 1)).NActividad);

        dlgcrear.setLocationRelativeTo(this);
        dlgcrear.setVisible(true);
        poblarTablaEstudiantes();
    }//GEN-LAST:event_btagregarActionPerformed

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
        try {

            int[] filasSeleccionadas = tblestudiante.getSelectedRows();

            if (filasSeleccionadas.length > 0) {
                int confirmacion
                        = JOptionPane.showConfirmDialog(this, "¿Esta seguro?",
                                "Confirmar Borrado", JOptionPane.YES_NO_OPTION);
                if (confirmacion == JOptionPane.YES_OPTION) {
                    for (int i = 0; i < filasSeleccionadas.length; i++) {
                        int filasSeleccionada = filasSeleccionadas[i];

                        int idSeleccionado = (int) tblestudiante.getModel().getValueAt(filasSeleccionada, 0);

                        for (int j = 0; j < listaEstudiante.size(); j++) {
                            if (listaEstudiante.get(j).getID() == idSeleccionado) {
                                listaEstudiante.remove(j);
                            }
                        }
                    }
                    poblarTablaEstudiantes();
                }

            } else {
                JOptionPane.showMessageDialog(this, "Debes seleccionar al menos un cliente",
                        "Debes seleccionar filas", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error en campo", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_bteliminarActionPerformed

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
            java.util.logging.Logger.getLogger(dlgListaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgListaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgListaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgListaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgListaNotas dialog = new dlgListaNotas(new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

//este metodo filtra y pobla la tabla con el estudiante q tenga en su nombre o id el texto q ingresan en el Textfile del filtrar.
    private void aplicarFiltro(List<Estudiante> listaFiltro) {
        try {

            ordenarEstudiante();

            DefaultTableModel dModeloTabla = (DefaultTableModel) tblestudiante.getModel();

            dModeloTabla.setColumnCount(0);
            NumberFormat formato = new DecimalFormat("#0.0");
            Estudiante Alumno = listaFiltro.get(0);
            dModeloTabla.addColumn("ID Estudiante");
            dModeloTabla.addColumn("Nombre");
            for (Evaluacion evaluacion : Alumno.getListaNotas()) {
                String strValTemporal = (evaluacion.getNombreActividad() + " " + evaluacion.getPorcentaje() + "%");
                dModeloTabla.addColumn(strValTemporal);
            }
            dModeloTabla.addColumn("Definitiva");

            Vector<String> vtrDatosTemporales = new Vector<String>();
            // Limpia la tabla cliente
            dModeloTabla.setRowCount(0);
//        NumberFormat formatter = new DecimalFormat("#0.0");
            for (Estudiante Alumno2 : listaFiltro) {

                vtrDatosTemporales.clear();

                for (Evaluacion evaluacion : Alumno2.getListaNotas()) {
                    vtrDatosTemporales.add(Double.toString(evaluacion.getNota()));
                }

                String strValTemporal2 = vtrDatosTemporales.toString();
                strValTemporal2 = strValTemporal2.replace("[", "");
                strValTemporal2 = strValTemporal2.replace("]", "");
                strValTemporal2.trim();
                Object[] bandera = strValTemporal2.split(",");
                Object[] fila = new Object[bandera.length + 3];
                fila[0] = Alumno2.getID();
                fila[1] = Alumno2.getNombre();
                int i = 2;
                for (int j = 0; j < bandera.length; j++) {
                    fila[i] = bandera[j];
                    i++;
                }
                fila[i] = Alumno2.getDefinitiva();

                dModeloTabla.addRow(fila);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error en campo", JOptionPane.WARNING_MESSAGE);
        }
    }

//metodo q pobla la tabla con los estudiamtes de una clase.
    private void poblarTablaEstudiantes() {
        try {
            archivo.Archivo.guardar(listaDocentes);
            ordenarEstudiante();

            DefaultTableModel dModeloTabla = (DefaultTableModel) tblestudiante.getModel();

            dModeloTabla.setColumnCount(0);
            NumberFormat formato = new DecimalFormat("#0.0");
            Estudiante est = listaEstudiante.get(0);
            dModeloTabla.addColumn("ID Estudiante");
            dModeloTabla.addColumn("Nombre");
            for (Evaluacion evaluacion : est.getListaNotas()) {
                String strTemporal = (evaluacion.getNombreActividad() + " " + evaluacion.getPorcentaje() + "%");
                dModeloTabla.addColumn(strTemporal);
            }
            dModeloTabla.addColumn("Definitiva 100%");

            tblestudiante.setDefaultRenderer(Object.class, new EstudiantesTableCellRenderer());

            Vector<String> vteTemporal = new Vector<String>();
            // Limpia la tabla cliente
            dModeloTabla.setRowCount(0);

            for (Estudiante Alumno : listaEstudiante) {

                vteTemporal.clear();

                for (Evaluacion evaluacion : Alumno.getListaNotas()) {
                    vteTemporal.add(Double.toString(evaluacion.getNota()));
                }

                String strTemporal = vteTemporal.toString();
                strTemporal = strTemporal.replace("[", "");
                strTemporal = strTemporal.replace("]", "");
                strTemporal.trim();
                Object[] bandera = strTemporal.split(",");
                Object[] fila = new Object[bandera.length + 3];
                fila[0] = Alumno.getID();
                fila[1] = Alumno.getNombre();
                int i = 2;
                for (int j = 0; j < bandera.length; j++) {
                    fila[i] = bandera[j];
                    i++;
                }
                fila[i] = Alumno.getDefinitiva();

                dModeloTabla.addRow(fila);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error en campo", JOptionPane.WARNING_MESSAGE);
        }
    }

//este metodo pobla la tabla con los datps de un solo estudiante.
    private void poblarTablaEstudiante() {
        try {
            archivo.Archivo.guardar(listaDocentes);
            ordenarEstudiante();

            DefaultTableModel dModeloTabla = (DefaultTableModel) tblestudiante.getModel();

            dModeloTabla.setColumnCount(0);
            NumberFormat formato = new DecimalFormat("#0.0");
            dModeloTabla.addColumn("ID Estudiante");
            dModeloTabla.addColumn("Nombre");
            for (Evaluacion evaluacion : estudiante.getListaNotas()) {
                String strTemporal = (evaluacion.getNombreActividad() + " " + evaluacion.getPorcentaje() + "%");
                dModeloTabla.addColumn(strTemporal);
            }
            dModeloTabla.addColumn("Definitiva 100%");

            Vector<String> VtrTemporal = new Vector<String>();
            // Limpia la tabla cliente
            dModeloTabla.setRowCount(0);

            VtrTemporal.clear();

            for (Evaluacion d : estudiante.getListaNotas()) {
                VtrTemporal.add(Double.toString(d.getNota()));
            }

            String strTemporal = VtrTemporal.toString();
            strTemporal = strTemporal.replace("[", "");
            strTemporal = strTemporal.replace("]", "");
            strTemporal.trim();
            Object[] bandera = strTemporal.split(",");
            Object[] fila = new Object[bandera.length + 3];
            fila[0] = estudiante.getID();
            fila[1] = estudiante.getNombre();
            int i = 2;
            for (int j = 0; j < bandera.length; j++) {
                fila[i] = bandera[j];
                i++;
            }
            fila[i] = estudiante.getDefinitiva();

            dModeloTabla.addRow(fila);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error en campo", JOptionPane.WARNING_MESSAGE);
        }
    }

//este metodo ordena la tabla de menor a mayor segun el radiobotton que este seleccionado.
    private void ordenarEstudiante() {
        try {
            if (rbID.isSelected()) {
                Collections.sort(listaEstudiante, new Comparator<Estudiante>() {
                    public int compare(Estudiante c1, Estudiante c2) {
                        if (c1.getID() == c2.getID()) {
                            return 0;
                        }
                        return c1.getID() < c2.getID() ? -1 : 1;
                    }
                });
            }
            if (rbnombre.isSelected()) {
                Collections.sort(listaEstudiante, new Comparator<Estudiante>() {
                    public int compare(Estudiante c1, Estudiante c2) {
                        return c1.getNombre().compareTo(c2.getNombre());
                    }
                });
            }
            if (rbdefinitiva.isSelected()) {
                Collections.sort(listaEstudiante, new Comparator<Estudiante>() {
                    public int compare(Estudiante c1, Estudiante c2) {
                        if (c1.getDefinitiva() == c2.getDefinitiva()) {
                            return 0;
                        }
                        return c1.getDefinitiva() < c2.getDefinitiva() ? -1 : 1;
                    }
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error en campo", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton btagregar;
    private javax.swing.JButton bteditar;
    private javax.swing.JButton bteliminar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rbID;
    private javax.swing.JRadioButton rbdefinitiva;
    private javax.swing.JRadioButton rbnombre;
    private javax.swing.JTable tblestudiante;
    private javax.swing.JTextField txtfiltrar;
    // End of variables declaration//GEN-END:variables
}

class EstudiantesTableCellRenderer extends DefaultTableCellRenderer {

    
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        if (column >= 2) {
            Double number = Double.parseDouble(value.toString());

            if (number < 3.0) {

                setForeground(Color.RED);
               
            }else{
                setForeground(Color.BLACK);
            }
        }else{
            setForeground(Color.BLACK);
        }
        setText(value.toString());
        return this;
    }
}
