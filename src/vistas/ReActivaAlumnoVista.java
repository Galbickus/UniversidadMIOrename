package vistas;

import accesoadatos.AlumnoData;
import entidades.Alumno;
import javax.swing.JOptionPane;

/**
 *
 * @author Veronica
 */
public class ReActivaAlumnoVista extends javax.swing.JInternalFrame {

    private Alumno aluAReactivar = null;
    AlumnoData ad = new AlumnoData();

    public ReActivaAlumnoVista() {
        initComponents();
        jbReinscribir.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbSalir = new javax.swing.JButton();
        jtfDni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jbReinscribir = new javax.swing.JButton();
        jlNombre = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlFondo = new javax.swing.JLabel();

        setTitle("Reactivación de alumnos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbSalir.setBackground(new java.awt.Color(0, 51, 102));
        jbSalir.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));
        getContentPane().add(jtfDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 180, 30));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reinscripciones");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DNI");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jbBuscar.setBackground(new java.awt.Color(0, 0, 153));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 50, 30));

        jbReinscribir.setBackground(new java.awt.Color(0, 0, 102));
        jbReinscribir.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jbReinscribir.setForeground(new java.awt.Color(255, 255, 255));
        jbReinscribir.setText("Reinscribir");
        jbReinscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReinscribirActionPerformed(evt);
            }
        });
        getContentPane().add(jbReinscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 100, 40));

        jlNombre.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 130, 30));

        jlApellido.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jlApellido.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jlApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 140, 30));

        jlFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gradient_2.jpg"))); // NOI18N
        getContentPane().add(jlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        try {
            int dni = Integer.parseInt(jtfDni.getText());

            aluAReactivar = ad.AlumnosInactivosPorDNI(dni);
            if (aluAReactivar != null) {
                jlApellido.setText(aluAReactivar.getApellido());
                jlNombre.setText(aluAReactivar.getNombre());
                jbReinscribir.setEnabled(true);
                jtfDni.setEnabled(false);
            } else {
                limpiar();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El DNI solo debe contener números. " + ex);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "El campo DNI debe estar completo. " + ex.getMessage());
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbReinscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReinscribirActionPerformed
        ad.activarAlumno(aluAReactivar.getIdAlumno());
        limpiar();
        this.dispose();
    }//GEN-LAST:event_jbReinscribirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbReinscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlFondo;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTextField jtfDni;
    // End of variables declaration//GEN-END:variables
public void limpiar() {
        jtfDni.setText("");
        jlApellido.setText("");
        jlNombre.setText("");
        jbReinscribir.setEnabled(false);
    }
}
