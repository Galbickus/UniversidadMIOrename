package vistas;

import accesoadatos.*;
import entidades.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Veronica
 */
public class CargaDeNotasVista extends javax.swing.JInternalFrame {

    private AlumnoData ad = new AlumnoData();
    private MateriaData md = new MateriaData();
    private InscripcionData id = new InscripcionData();
    private DefaultTableModel modelo;
    
    public CargaDeNotasVista() {
        initComponents();
        modelo = (DefaultTableModel) jTable1.getModel();  //ver
        cargarCombo();
        llenarTabla();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcbAlumnos = new javax.swing.JComboBox<>();
        jbSalir = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlFondo = new javax.swing.JLabel();

        setTitle("Carga de notas");
        setPreferredSize(new java.awt.Dimension(536, 424));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcbAlumnos.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcbAlumnosPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jcbAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbAlumnosMouseClicked(evt);
            }
        });
        getContentPane().add(jcbAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 250, 30));

        jbSalir.setBackground(new java.awt.Color(0, 51, 102));
        jbSalir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jbGuardar.setBackground(new java.awt.Color(0, 51, 102));
        jbGuardar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idMateria", "Nombre", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 150));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione un alumno: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 160, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Carga de notas");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 210, 30));

        jlFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gradient_2.jpg"))); // NOI18N
        getContentPane().add(jlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbAlumnosMouseClicked
        borrarFilas();
        llenarTabla();
    }//GEN-LAST:event_jcbAlumnosMouseClicked

    private void jcbAlumnosPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbAlumnosPopupMenuWillBecomeInvisible
        borrarFilas();
        llenarTabla();
    }//GEN-LAST:event_jcbAlumnosPopupMenuWillBecomeInvisible

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada != -1) {
            Alumno alumno = (Alumno) jcbAlumnos.getSelectedItem();
            int idMateria = (Integer) modelo.getValueAt(filaSeleccionada, 0);
            String notaString = modelo.getValueAt(filaSeleccionada, 2).toString();   //en vez de castear, tirale un toString
            double n = Double.parseDouble(notaString);
            id.actualizarNota(n, alumno.getIdAlumno(), idMateria);
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumnos;
    private javax.swing.JLabel jlFondo;
    // End of variables declaration//GEN-END:variables
public void cargarCombo() {
    
    ad.ListarAlumnos().forEach(alumno -> jcbAlumnos.addItem(alumno)); //forma pro
    
//forma no pro pero cool 
    
//       List<Alumno>alumnos=ad.ListarAlumnos();
//       for(Alumno alumno:ad.ListarAlumnos()){
//           jcbAlumnos.addItem(alumno);
//       }
    }

    private void llenarTabla() {
        Alumno alumnoSeleccionado = (Alumno) jcbAlumnos.getSelectedItem();
        
        List<Analitico> analiticos = id.listarParaGestionDeNotas(alumnoSeleccionado.getIdAlumno());
        for (Analitico a : analiticos) {
            modelo.addRow(new Object[]{a.getIdMateria(), a.getNombre(), a.getNota()});
        }
    }

    private void borrarFilas() {
        int filas = modelo.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }

    }
}
