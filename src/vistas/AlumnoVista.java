
package vistas;

import accesoadatos.*;
import entidades.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Veronica
 */
public class AlumnoVista extends javax.swing.JInternalFrame {
        AlumnoData ad =new AlumnoData();
        Alumno alumnoBuscado;
        Alumno alumnoEncontrado;

    public AlumnoVista() {
        initComponents();
        limpiarFormulario();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jL1 = new javax.swing.JLabel();
        jL2 = new javax.swing.JLabel();
        jL3 = new javax.swing.JLabel();
        jL4 = new javax.swing.JLabel();
        jL5 = new javax.swing.JLabel();
        jL6 = new javax.swing.JLabel();
        jtfDNI = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jRadioButtonEstado = new javax.swing.JRadioButton();
        jBSalir = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jbBuscar = new javax.swing.JButton();
        jbNuevaConsulta = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jlEstado = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 102));
        setTitle("Alumnos");
        setName("Alumnos"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL1.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        jL1.setForeground(new java.awt.Color(255, 255, 255));
        jL1.setText("Alumno");
        getContentPane().add(jL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 70, 30));

        jL2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jL2.setForeground(new java.awt.Color(255, 255, 255));
        jL2.setText("DNI");
        getContentPane().add(jL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 50, 30));

        jL3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jL3.setForeground(new java.awt.Color(255, 255, 255));
        jL3.setText("Apellido");
        getContentPane().add(jL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, -1));

        jL4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jL4.setForeground(new java.awt.Color(255, 255, 255));
        jL4.setText("Nombre");
        getContentPane().add(jL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 70, -1));

        jL5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jL5.setForeground(new java.awt.Color(255, 255, 255));
        jL5.setText("Estado");
        getContentPane().add(jL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 60, 20));

        jL6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jL6.setForeground(new java.awt.Color(255, 255, 255));
        jL6.setText("Fecha de Nacimiento");
        getContentPane().add(jL6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 150, -1));
        getContentPane().add(jtfDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 160, 30));
        getContentPane().add(jtfApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 230, 30));
        getContentPane().add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 230, 30));
        getContentPane().add(jRadioButtonEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        jBSalir.setBackground(new java.awt.Color(0, 51, 102));
        jBSalir.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, 30));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 230, 30));

        jbBuscar.setBackground(new java.awt.Color(0, 51, 153));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        jbBuscar.setText("jButton1");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 40, 30));

        jbNuevaConsulta.setBackground(new java.awt.Color(0, 0, 102));
        jbNuevaConsulta.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jbNuevaConsulta.setForeground(new java.awt.Color(255, 255, 255));
        jbNuevaConsulta.setText("Nueva Consulta");
        jbNuevaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(jbNuevaConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 110, 40));

        jbEliminar.setBackground(new java.awt.Color(0, 0, 102));
        jbEliminar.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbEliminar.setText("Eliminar Alumno");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 110, 40));

        jbGuardar.setBackground(new java.awt.Color(0, 0, 102));
        jbGuardar.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jbGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jbGuardar.setText("Guardar Alumno Nuevo");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 140, 40));

        jbModificar.setBackground(new java.awt.Color(0, 0, 102));
        jbModificar.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(255, 255, 255));
        jbModificar.setText("Modificar Alumno");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 130, 40));

        jlEstado.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jlEstado.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jlEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 224, 170, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gradient_2.jpg"))); // NOI18N
        jLabelFondo.setText("Estado");
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed

        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        try {
            int dniBuscado = Integer.parseInt(jtfDNI.getText());
            alumnoBuscado = ad.buscarTodosAlumnoPorDNI(dniBuscado);   //este método trae tanto alumnos activos como inactivos

            if (alumnoBuscado != null) {                //se encontró el alumno en la BD
                alumnoEncontrado = alumnoBuscado;

                jbEliminar.setEnabled(true);
                jbGuardar.setEnabled(false);  //esta de más????? porque inicié en el constructor como false???? ver
                jbModificar.setEnabled(true);

                habilitarLlenadoDeCampos();

                jtfApellido.setText(alumnoEncontrado.getApellido());
                jtfNombre.setText(alumnoEncontrado.getNombre());
                jRadioButtonEstado.setSelected(alumnoEncontrado.isActivo());

                if (alumnoEncontrado.isActivo() == true) {
                    jlEstado.setText("Alumno   Activo");
                } else {
                    jlEstado.setText("Alumno   Inactivo");
                }

                jDateChooser1.setDate(Date.valueOf(alumnoEncontrado.getFechaNac()));

            } else {       //la BD no devuelve alumno
                JOptionPane.showMessageDialog(this, " Si desea guardar al alumno complete TODOS los campos.");

                jbEliminar.setEnabled(false);
                jbGuardar.setEnabled(true);
                jbModificar.setEnabled(false);

                habilitarLlenadoDeCampos();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El DNI solo debe contener números. " + ex.getMessage());
            jtfDNI.setText("");
        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbNuevaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaConsultaActionPerformed
        // TODO add your handling code here:
        limpiarFormulario();
            
    }//GEN-LAST:event_jbNuevaConsultaActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        int dni = Integer.parseInt(jtfDNI.getText());

        String apellido = jtfApellido.getText();
        String nombre = jtfNombre.getText();
        SimpleDateFormat formatoFecha =new SimpleDateFormat("dd-MM-yyyy");
        String fecha = formatoFecha.format(jDateChooser1.getDate());
        LocalDate fn =LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        Boolean estado = jRadioButtonEstado.isSelected();

        Alumno alumnoNuevo = new Alumno(dni, apellido, nombre, fn, estado); 
            
        ad.guardarAlumno(alumnoNuevo);
        limpiarFormulario();
        inhabilitarLlenadoDeCampos();

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        int dniAEliminar = Integer.parseInt(jtfDNI.getText());
        Alumno alumnoAEliminar = ad.buscarAlumnoPorDNI(dniAEliminar);   //este método trae solo alumnos activos 
        if(alumnoAEliminar!=null){
        ad.eliminarAlumno(alumnoEncontrado.getIdAlumno());
        }
        limpiarFormulario();                    //ver si lo dejo o lo saco
        inhabilitarLlenadoDeCampos();

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:

        try {
            int dniBuscado = Integer.parseInt(jtfDNI.getText());    //
            alumnoBuscado = ad.buscarAlumnoPorDNI(dniBuscado);
            if (alumnoBuscado != null) {
                alumnoEncontrado = alumnoBuscado;

                alumnoEncontrado.setDni(Integer.parseInt(jtfDNI.getText()));
                alumnoEncontrado.setApellido(jtfApellido.getText());
                alumnoEncontrado.setNombre(jtfNombre.getText());

                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
                String fecha = formatoFecha.format(jDateChooser1.getDate());
                LocalDate fn = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

                alumnoEncontrado.setFechaNac(fn);

                ad.modificarAlumno(alumnoEncontrado);

                limpiarFormulario();
                inhabilitarLlenadoDeCampos();
            } else {
                limpiarFormulario();
                inhabilitarLlenadoDeCampos();

            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El DNI solo debe contener números.");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar completos " + ex);
        }
    }//GEN-LAST:event_jbModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jL1;
    private javax.swing.JLabel jL2;
    private javax.swing.JLabel jL3;
    private javax.swing.JLabel jL4;
    private javax.swing.JLabel jL5;
    private javax.swing.JLabel jL6;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JRadioButton jRadioButtonEstado;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevaConsulta;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfDNI;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables

    public void limpiarFormulario() {
        jtfDNI.setText("");
        jtfApellido.setText("");
        jtfNombre.setText("");
        jRadioButtonEstado.setSelected(false);
        jlEstado.setText("");
        jDateChooser1.setDate(null);

        jbEliminar.setEnabled(false);
        jbGuardar.setEnabled(false);
        jbModificar.setEnabled(false);
        jRadioButtonEstado.setEnabled(false);
        jtfApellido.setEnabled(false);
        jtfNombre.setEnabled(false);
        jDateChooser1.setEnabled(false);
    }
    public void habilitarLlenadoDeCampos(){
                   
            jtfApellido.setEnabled(true);        
            jtfNombre.setEnabled(true); 
            jDateChooser1.setEnabled(true);
             
    }

    public void inhabilitarLlenadoDeCampos() {

        jtfApellido.setEnabled(false);
        jtfNombre.setEnabled(false);
        jDateChooser1.setEnabled(false);
    }

}
