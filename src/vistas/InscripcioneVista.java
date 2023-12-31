package vistas;

import accesoadatos.AlumnoData;
import accesoadatos.InscripcionData;
import accesoadatos.MateriaData;
import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Veronica
 */
public class InscripcioneVista extends javax.swing.JInternalFrame {

    private AlumnoData ad = new AlumnoData();
    private MateriaData md = new MateriaData();
    private InscripcionData id = new InscripcionData();
    private DefaultTableModel modelo = new DefaultTableModel();

    public InscripcioneVista() {
        initComponents();
        cargaAlumnos();
        armaCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbSelecAlumn = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jRBMateriasInscriptas = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbInscribir = new javax.swing.JButton();
        jbAnular = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jlFondo = new javax.swing.JLabel();

        setTitle("Formulario de Inscripción");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Formulario de Inscripcion");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, 22));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione un alumno");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        getContentPane().add(jcbSelecAlumn, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 60, 270, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Listado de Materias");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jRBMateriasInscriptas.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jRBMateriasInscriptas.setForeground(new java.awt.Color(255, 255, 255));
        jRBMateriasInscriptas.setText("Materias Inscriptas");
        jRBMateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBMateriasInscriptasActionPerformed(evt);
            }
        });
        getContentPane().add(jRBMateriasInscriptas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 143, -1, 30));

        jRadioButton2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Materias NO inscriptas");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 143, -1, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 410, 110));

        jbInscribir.setBackground(new java.awt.Color(0, 0, 102));
        jbInscribir.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jbInscribir.setForeground(new java.awt.Color(255, 255, 255));
        jbInscribir.setText("Inscribir");
        jbInscribir.setEnabled(false);
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });
        getContentPane().add(jbInscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, 30));

        jbAnular.setBackground(new java.awt.Color(0, 0, 102));
        jbAnular.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jbAnular.setForeground(new java.awt.Color(255, 255, 255));
        jbAnular.setText("Anular Inscripción");
        jbAnular.setEnabled(false);
        jbAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularActionPerformed(evt);
            }
        });
        getContentPane().add(jbAnular, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 340, 150, 30));

        jbSalir.setBackground(new java.awt.Color(0, 51, 102));
        jbSalir.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        jlFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gradient_2.jpg"))); // NOI18N
        getContentPane().add(jlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jRBMateriasInscriptas.setSelected(false);
        jbAnular.setEnabled(false);
        jbInscribir.setEnabled(true);
        borrarFilas();
        llenarTabla();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRBMateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBMateriasInscriptasActionPerformed
        jRadioButton2.setSelected(false);
        jbAnular.setEnabled(true);
        jbInscribir.setEnabled(false);
        borrarFilas();
        llenarTabla();
    }//GEN-LAST:event_jRBMateriasInscriptasActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        Alumno alumnoSeleccionado = (Alumno) jcbSelecAlumn.getSelectedItem();
        int filaSelec = jTable1.getSelectedRow();
        if (filaSelec != -1) {
            int idM = (Integer) modelo.getValueAt(filaSelec, 0);
            Materia mat = new Materia();
            mat.setIdMateria(idM);
            Inscripcion insc = new Inscripcion(alumnoSeleccionado, mat, 0);  //la nota en cero porque todavía no cursó
            id.guardarInscripcion(insc);

        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una materia");
        }
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularActionPerformed

        Alumno alumnoSeleccionado = (Alumno) jcbSelecAlumn.getSelectedItem();
        int filaSelec = jTable1.getSelectedRow();      //obtengo la fila seleccionada de la tabla
        if (filaSelec != -1) {                              //si la fila seleccionada es distinta de menos 1
            int idM = (Integer) modelo.getValueAt(filaSelec, 0);  //obtengo el id de la materia
            id.borrarInscripcionMateriaAlumno(alumnoSeleccionado.getIdAlumno(), idM);  // le paso el idAlumno y el idMateria
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una materia");
        }
    }//GEN-LAST:event_jbAnularActionPerformed

    private void borrarFilas() {
        int filas = modelo.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRBMateriasInscriptas;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbAnular;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbSelecAlumn;
    private javax.swing.JLabel jlFondo;
    // End of variables declaration//GEN-END:variables

    private void cargaAlumnos() {
        List<Alumno> alumnos = ad.ListarAlumnos();
        for (Alumno alumno : alumnos) {
            jcbSelecAlumn.addItem(alumno);
        }
    }

    private void armaCabecera() {
        ArrayList<Object> titulos = new ArrayList();
        titulos.add("Codigo Materia");
        titulos.add("Nombre");
        titulos.add("Año");

        for (Object titulo : titulos) {
            modelo.addColumn(titulo);
        }
        jTable1.setModel(modelo);
    }

    private void llenarTabla() {
        Alumno alumnoSeleccionado = (Alumno) jcbSelecAlumn.getSelectedItem();
        if (jRadioButton2.isSelected()) {
            List<Materia> materias = id.obtenerMateriasNOCursadas(alumnoSeleccionado.getIdAlumno());
            for (Materia m : materias) {
                modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnio()});
            }
        } else {
            List<Materia> materias = id.obtenerMateriasCursadas(alumnoSeleccionado.getIdAlumno());
            for (Materia m : materias) {
                modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnio()});
            }
        }
    }
}
