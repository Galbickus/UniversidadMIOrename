
package vistas;

import accesoadatos.MateriaData;
import entidades.Materia;
import javax.swing.JOptionPane;

/**
 *
 * @author Veronica
 */
public class MateriaVista extends javax.swing.JInternalFrame {

    MateriaData md = new MateriaData();
    Materia materiaBuscada;
    Materia materiaEncontrada;

    public MateriaVista() {
        initComponents();
        limpiarFormulario();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfCodigoMateria = new javax.swing.JTextField();
        jtfNombreMateria = new javax.swing.JTextField();
        jtfAnio = new javax.swing.JTextField();
        jrbEstado = new javax.swing.JRadioButton();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardarMateria = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jlTextoMateriaEstado = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jlFondo = new javax.swing.JLabel();

        setTitle("Gestión de Materias por Código");
        setPreferredSize(new java.awt.Dimension(530, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestión de Materias por Código");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 370, 50));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Materia");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código de Materia");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Año de carrera ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jtfCodigoMateria.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtfCodigoMateria.setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().add(jtfCodigoMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 210, 30));
        getContentPane().add(jtfNombreMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 280, 30));

        jtfAnio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        getContentPane().add(jtfAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 130, 30));
        getContentPane().add(jrbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        jbNuevo.setBackground(new java.awt.Color(0, 0, 102));
        jbNuevo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jbNuevo.setForeground(new java.awt.Color(255, 255, 255));
        jbNuevo.setText("Nueva Consulta");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(jbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 120, 40));

        jbEliminar.setBackground(new java.awt.Color(0, 0, 102));
        jbEliminar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbEliminar.setText("Eliminar Materia");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 120, 40));

        jbGuardarMateria.setBackground(new java.awt.Color(0, 0, 102));
        jbGuardarMateria.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jbGuardarMateria.setForeground(java.awt.Color.white);
        jbGuardarMateria.setText("Guardar  Nueva Materia");
        jbGuardarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarMateriaActionPerformed(evt);
            }
        });
        getContentPane().add(jbGuardarMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 140, 40));

        jbBuscar.setBackground(new java.awt.Color(0, 0, 102));
        jbBuscar.setForeground(new java.awt.Color(0, 0, 204));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 40, 40));

        jbSalir.setBackground(new java.awt.Color(0, 51, 102));
        jbSalir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 80, -1));

        jlTextoMateriaEstado.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jlTextoMateriaEstado.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jlTextoMateriaEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 240, 30));

        jbModificar.setBackground(new java.awt.Color(0, 0, 102));
        jbModificar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jbModificar.setForeground(java.awt.Color.white);
        jbModificar.setText("Modificar Materia");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 130, 40));

        jlFondo.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jlFondo.setForeground(new java.awt.Color(255, 255, 255));
        jlFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gradient_2.jpg"))); // NOI18N
        jlFondo.setText("Estado");
        getContentPane().add(jlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        try {
            int idMateria = Integer.parseInt(jtfCodigoMateria.getText()); //creo una variable int para el ID y guardo el campo 
            Materia materiaBuscada = md.buscarTodaMateriaPorID(idMateria);      //CREO UN OBJETO materiaBuscada y guardo el resultado de una busqueda por ID

            if (materiaBuscada != null) {
                jtfCodigoMateria.setEnabled(false);
                materiaEncontrada = materiaBuscada;

                jbEliminar.setEnabled(true);
                jbModificar.setEnabled(true);

                jtfNombreMateria.setEnabled(true);           //habilito llenado de campos por si quiere modificar
                jtfAnio.setEnabled(true);                     //idem con año
                //  COMPLETO CAMPOS
                jtfNombreMateria.setText(materiaEncontrada.getNombre());  //CON EL RESULTADO DE LA BUSQUEDA CARGO LOS CAMPOS PARA QUE LOS VEA EL USUARIO
                jtfAnio.setText(materiaEncontrada.getAnio() + "");            //IDEM con el año
                jrbEstado.setSelected(materiaEncontrada.isEstado());          //idem con el radioButtom

                if (materiaEncontrada.isEstado()) {                         //si materiaBuscada estado es igual a true
                    jlTextoMateriaEstado.setText("Materia  Activa");       //escribe los label   
                } else {
                    jlTextoMateriaEstado.setText("Materia  Inactiva");
                }
            } else {                                    //SI LA BD no devuelve un alumno
                JOptionPane.showMessageDialog(this, " Si desea guardar la nueva Materia complete TODOS los campos.");
                jtfCodigoMateria.setEnabled(false);
                jbGuardarMateria.setEnabled(true);
                jtfNombreMateria.setEnabled(true);           //habilito llenado de campos por si quiere guardar una materia nueva
                jtfAnio.setEnabled(true);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El Código de materia solo debe contener números. " + ex.getMessage());
            jtfCodigoMateria.setText("");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        limpiarFormulario();
        jtfCodigoMateria.setEnabled(true);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarMateriaActionPerformed
          int idMateria = Integer.parseInt(jtfCodigoMateria.getText());
          String nombreMateria = jtfNombreMateria.getText();
          int anio = Integer.parseInt(jtfAnio.getText());
          Materia materiaNueva = new Materia(idMateria, nombreMateria,anio,true);  //harcodeamos en true porque estoy creando la materia
          md.guardarMateriaPorID(materiaNueva);
          limpiarFormulario();
    }//GEN-LAST:event_jbGuardarMateriaActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
           int idMateria = Integer.parseInt(jtfCodigoMateria.getText());
           Materia materiaAEliminar = md.buscarMateriaPorID(idMateria);   //este método trae solo materias activas
           if(materiaAEliminar!=null){
               md.eliminarMateria(idMateria);
           }
        limpiarFormulario();   
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
                                           
    try {
        int idMateria = Integer.parseInt(jtfCodigoMateria.getText());
        Materia materiaAModificar = md.buscarMateriaPorID(idMateria);
        // Verificar si el campo nombre está vacío
        String nombreMateria = jtfNombreMateria.getText().trim(); // Elimina espacios en blanco al principio y al final
        if (nombreMateria.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo nombre no puede estar vacío");
            return; // Salir del método sin realizar la modificación
        }
        // Verificar si el campo año está vacío
        String anioText = jtfAnio.getText().trim(); // Elimina espacios en blanco al principio y al final
        if (anioText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo año no puede estar vacío");
            return; // Salir del método sin realizar la modificación
        }
        int anio = Integer.parseInt(anioText);
        materiaAModificar.setNombre(nombreMateria);
        materiaAModificar.setAnio(anio);
        md.modificarMateria(materiaAModificar);
        limpiarFormulario();
        jtfNombreMateria.setEnabled(false);
        jtfAnio.setEnabled(false);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "El campo año debe ser un número válido");
    } catch (NullPointerException ex) {
        JOptionPane.showMessageDialog(this, "Todos los campos deben estar completos");
    }
    }//GEN-LAST:event_jbModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardarMateria;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlFondo;
    private javax.swing.JLabel jlTextoMateriaEstado;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtfAnio;
    private javax.swing.JTextField jtfCodigoMateria;
    private javax.swing.JTextField jtfNombreMateria;
    // End of variables declaration//GEN-END:variables

    public void limpiarFormulario() {
        jtfCodigoMateria.setText("");
        jtfNombreMateria.setText("");
        jtfAnio.setText("");
        jrbEstado.setSelected(false);
        jlTextoMateriaEstado.setText("");

        jtfNombreMateria.setEnabled(false);
        jtfAnio.setEnabled(false);
        jrbEstado.setEnabled(false);

        jbEliminar.setEnabled(false);
        jbGuardarMateria.setEnabled(false);
        jbModificar.setEnabled(false);
    }
}
