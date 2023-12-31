package vistas;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Veronica
 */
public class MenuPpalVista extends javax.swing.JFrame {

    public MenuPpalVista() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/rocket24.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBexitGeneral = new javax.swing.JButton();
        jdpEscritorio = new javax.swing.JDesktopPane();
        jlNombre = new javax.swing.JLabel();
        jLabelFONDO1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAlumno = new javax.swing.JMenu();
        jmiFormularioAlu = new javax.swing.JMenuItem();
        jMenuItemReinscripciones = new javax.swing.JMenuItem();
        jmMateria = new javax.swing.JMenu();
        jmiFormularioMateria = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmAdministracion = new javax.swing.JMenu();
        jmiManejoInscripciones = new javax.swing.JMenuItem();
        jmiManipulNotas = new javax.swing.JMenuItem();
        jmConsulta = new javax.swing.JMenu();
        jmiAlumnosPorMateria = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBexitGeneral.setBackground(new java.awt.Color(0, 51, 102));
        jBexitGeneral.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jBexitGeneral.setForeground(new java.awt.Color(255, 255, 255));
        jBexitGeneral.setText("Salir");
        jBexitGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexitGeneralActionPerformed(evt);
            }
        });
        getContentPane().add(jBexitGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 10, 70, -1));

        jdpEscritorio.setBackground(new java.awt.Color(0, 0, 102));

        jlNombre.setFont(new java.awt.Font("Roboto Black", 1, 70)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(255, 255, 255));
        jlNombre.setText("Universidad");

        jLabelFONDO1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gradient_2.jpg"))); // NOI18N

        jdpEscritorio.setLayer(jlNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritorio.setLayer(jLabelFONDO1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpEscritorioLayout = new javax.swing.GroupLayout(jdpEscritorio);
        jdpEscritorio.setLayout(jdpEscritorioLayout);
        jdpEscritorioLayout.setHorizontalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpEscritorioLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jlNombre)
                .addGap(120, 120, Short.MAX_VALUE))
            .addComponent(jLabelFONDO1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jdpEscritorioLayout.setVerticalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpEscritorioLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jdpEscritorioLayout.createSequentialGroup()
                .addComponent(jLabelFONDO1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jdpEscritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 420));

        jMenuBar1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(256, 35));

        jmAlumno.setForeground(new java.awt.Color(0, 0, 153));
        jmAlumno.setText("Alumno");
        jmAlumno.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N

        jmiFormularioAlu.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jmiFormularioAlu.setForeground(new java.awt.Color(0, 0, 153));
        jmiFormularioAlu.setText("Formulario de Alumno");
        jmiFormularioAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormularioAluActionPerformed(evt);
            }
        });
        jmAlumno.add(jmiFormularioAlu);

        jMenuItemReinscripciones.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jMenuItemReinscripciones.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItemReinscripciones.setText("Reinscripciones");
        jMenuItemReinscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReinscripcionesActionPerformed(evt);
            }
        });
        jmAlumno.add(jMenuItemReinscripciones);

        jMenuBar1.add(jmAlumno);

        jmMateria.setForeground(new java.awt.Color(0, 0, 153));
        jmMateria.setText("Materia");
        jmMateria.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N

        jmiFormularioMateria.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jmiFormularioMateria.setForeground(new java.awt.Color(0, 0, 153));
        jmiFormularioMateria.setText("Formulario de Materia");
        jmiFormularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormularioMateriaActionPerformed(evt);
            }
        });
        jmMateria.add(jmiFormularioMateria);

        jMenuItem1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem1.setText("Busca Materia por Nombre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmMateria.add(jMenuItem1);

        jMenuBar1.add(jmMateria);

        jmAdministracion.setForeground(new java.awt.Color(0, 0, 153));
        jmAdministracion.setText("Administración");
        jmAdministracion.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N

        jmiManejoInscripciones.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jmiManejoInscripciones.setForeground(new java.awt.Color(0, 0, 153));
        jmiManejoInscripciones.setText("Manejo de Inscripciones");
        jmiManejoInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManejoInscripcionesActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmiManejoInscripciones);

        jmiManipulNotas.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jmiManipulNotas.setForeground(new java.awt.Color(0, 0, 153));
        jmiManipulNotas.setText("Manipulacion de notas");
        jmiManipulNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManipulNotasActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmiManipulNotas);

        jMenuBar1.add(jmAdministracion);

        jmConsulta.setForeground(new java.awt.Color(0, 0, 153));
        jmConsulta.setText("Consultas");
        jmConsulta.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N

        jmiAlumnosPorMateria.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jmiAlumnosPorMateria.setForeground(new java.awt.Color(0, 0, 153));
        jmiAlumnosPorMateria.setText("Alumnos por Materia");
        jmiAlumnosPorMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlumnosPorMateriaActionPerformed(evt);
            }
        });
        jmConsulta.add(jmiAlumnosPorMateria);

        jMenuBar1.add(jmConsulta);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBexitGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexitGeneralActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBexitGeneralActionPerformed

    private void jmiFormularioAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormularioAluActionPerformed
        AlumnoVista fa = new AlumnoVista();
        fa.setVisible(true);
        jdpEscritorio.add(fa);
        fa.moveToFront();
    }//GEN-LAST:event_jmiFormularioAluActionPerformed

    private void jmiManejoInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManejoInscripcionesActionPerformed
        InscripcioneVista iv = new InscripcioneVista();
        iv.setVisible(true);
        jdpEscritorio.add(iv);
        iv.moveToFront();
    }//GEN-LAST:event_jmiManejoInscripcionesActionPerformed

    private void jMenuItemReinscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReinscripcionesActionPerformed
        ReActivaAlumnoVista r = new ReActivaAlumnoVista();
        r.setVisible(true);
        jdpEscritorio.add(r);
        r.moveToFront();
    }//GEN-LAST:event_jMenuItemReinscripcionesActionPerformed

    private void jmiFormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormularioMateriaActionPerformed
        MateriaVista mv = new MateriaVista();
        mv.setVisible(true);
        jdpEscritorio.add(mv);
        mv.moveToFront();
    }//GEN-LAST:event_jmiFormularioMateriaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MateriaPorNombreVista mn = new MateriaPorNombreVista();
        mn.setVisible(true);
        jdpEscritorio.add(mn);
        mn.moveToFront();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmiManipulNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManipulNotasActionPerformed
        CargaDeNotasVista nv =new CargaDeNotasVista();
        nv.setVisible(true);
        jdpEscritorio.add(nv);
        nv.moveToFront();
    }//GEN-LAST:event_jmiManipulNotasActionPerformed

    private void jmiAlumnosPorMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlumnosPorMateriaActionPerformed
        AluPorMateVista apmv = new AluPorMateVista();
        apmv.setVisible(true);
        jdpEscritorio.add(apmv);
        apmv.moveToFront();
    }//GEN-LAST:event_jmiAlumnosPorMateriaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuPpalVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPpalVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPpalVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPpalVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPpalVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBexitGeneral;
    private javax.swing.JLabel jLabelFONDO1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemReinscripciones;
    private javax.swing.JDesktopPane jdpEscritorio;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JMenu jmAdministracion;
    private javax.swing.JMenu jmAlumno;
    private javax.swing.JMenu jmConsulta;
    private javax.swing.JMenu jmMateria;
    private javax.swing.JMenuItem jmiAlumnosPorMateria;
    private javax.swing.JMenuItem jmiFormularioAlu;
    private javax.swing.JMenuItem jmiFormularioMateria;
    private javax.swing.JMenuItem jmiManejoInscripciones;
    private javax.swing.JMenuItem jmiManipulNotas;
    // End of variables declaration//GEN-END:variables
}
