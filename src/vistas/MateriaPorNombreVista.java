
package vistas;

import accesoadatos.MateriaData;
import entidades.Materia;
import javax.swing.JOptionPane;

/**
 *
 * @author Veronica
 */
public class MateriaPorNombreVista extends javax.swing.JInternalFrame {


    public MateriaPorNombreVista() {
        initComponents();
        jtfNombre.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlCodigo = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbNuevaConsulta = new javax.swing.JButton();
        jlFondo = new javax.swing.JLabel();

        setTitle("Buscador de Materia por Nombre");
        setPreferredSize(new java.awt.Dimension(530, 400));

        jPanel1.setPreferredSize(new java.awt.Dimension(530, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscador de Materias por nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 39, 380, 50));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese el nombre de la materia:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 300, 40));

        jlCodigo.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jlCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jlCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 200, 90));
        jPanel1.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 410, 40));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("El código de materia es: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 30));

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        jbBuscar.setBackground(new java.awt.Color(0, 51, 153));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 50, 40));

        jbNuevaConsulta.setBackground(new java.awt.Color(0, 51, 153));
        jbNuevaConsulta.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jbNuevaConsulta.setForeground(new java.awt.Color(255, 255, 255));
        jbNuevaConsulta.setText("Nueva Consulta");
        jbNuevaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaConsultaActionPerformed(evt);
            }
        });
        jPanel1.add(jbNuevaConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 150, 30));

        jlFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gradient_2.jpg"))); // NOI18N
        jPanel1.add(jlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

            String nombreMateria = jtfNombre.getText(); // Obtengo el nombre de la materia a buscar

            if (!nombreMateria.isEmpty()) {
                MateriaData md = new MateriaData();
                Materia materiaBuscada = md.buscarMateriaPorNombre(nombreMateria);

                if (materiaBuscada != null) {
                    jlCodigo.setText(materiaBuscada.getIdMateria() + "");
                    jtfNombre.setEnabled(false);
                } else {
                    jlCodigo.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(this, "El campo NO puede estar vacio.");
                jtfNombre.setText("");
            }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbNuevaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaConsultaActionPerformed
        jtfNombre.setText("");
        jlCodigo.setText("");
        jtfNombre.setEnabled(true);
    }//GEN-LAST:event_jbNuevaConsultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbNuevaConsulta;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlFondo;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
