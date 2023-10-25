/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

/**
 *
 * @author matiaskunin
 */
public class VentanaMenu extends javax.swing.JFrame {

    /**
     * Creates new form menuFrame
     */
    public VentanaMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TituloMenu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemRegistroTematica = new javax.swing.JMenuItem();
        menuItemAltaPostulante = new javax.swing.JMenuItem();
        menuItemBajaPostulante = new javax.swing.JMenuItem();
        menuItemREgistroEvaluador = new javax.swing.JMenuItem();
        menuItemRegistroPuesto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItemConsultaPuesto = new javax.swing.JMenuItem();
        menuItemHistorialPostulante = new javax.swing.JMenuItem();
        menuHistorialConsultaTematica = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        TituloMenu.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        TituloMenu.setText("Bienvenidos a ETCHUNIN:");
        getContentPane().add(TituloMenu);
        TituloMenu.setBounds(160, 10, 240, 42);

        jLabel1.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel1.setText("Sistema para la gestion de postulantes llamados a puestos de trabajo.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 50, 480, 33);

        jMenuBar1.setToolTipText("");
        jMenuBar1.setAlignmentX(0.0F);

        jMenu1.setText("Registro");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        menuItemRegistroTematica.setText("Registro tematica");
        menuItemRegistroTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistroTematicaActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemRegistroTematica);

        menuItemAltaPostulante.setText("Alta postulante");
        menuItemAltaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAltaPostulanteActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemAltaPostulante);

        menuItemBajaPostulante.setText("Baja posutlante");
        menuItemBajaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBajaPostulanteActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemBajaPostulante);

        menuItemREgistroEvaluador.setText("Registro evaluador");
        jMenu1.add(menuItemREgistroEvaluador);

        menuItemRegistroPuesto.setText("Registro puesto");
        jMenu1.add(menuItemRegistroPuesto);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consulta");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        menuItemConsultaPuesto.setText("Consulta puesto");
        menuItemConsultaPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemConsultaPuestoActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemConsultaPuesto);

        menuItemHistorialPostulante.setText("Historial postulante");
        menuItemHistorialPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemHistorialPostulanteActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemHistorialPostulante);

        menuHistorialConsultaTematica.setText("Consulta tematica");
        menuHistorialConsultaTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHistorialConsultaTematicaActionPerformed(evt);
            }
        });
        jMenu2.add(menuHistorialConsultaTematica);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ingresos");

        jMenuItem2.setText("Ingreso de entrevista");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 581, 186);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemRegistroTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistroTematicaActionPerformed
        // ESTA BIEN???
        VentanaRegistroTematica ventRegTematica = new VentanaRegistroTematica();
        ventRegTematica.setVisible(true);
    }//GEN-LAST:event_menuItemRegistroTematicaActionPerformed

    private void menuItemConsultaPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemConsultaPuestoActionPerformed
        VentanaConsultaPuestos ventana = new VentanaConsultaPuestos();
            ventana.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_menuItemConsultaPuestoActionPerformed

    private void menuItemHistorialPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemHistorialPostulanteActionPerformed
        VentanaHistorialPostulante ventana = new VentanaHistorialPostulante();
        ventana.setVisible(true);
    }//GEN-LAST:event_menuItemHistorialPostulanteActionPerformed

    private void menuHistorialConsultaTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHistorialConsultaTematicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuHistorialConsultaTematicaActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        VentanaRegistroTematica ventana = new VentanaRegistroTematica();
            ventana.setVisible(true);
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void menuItemBajaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBajaPostulanteActionPerformed
        VentanaBajaPostulante ventana = new VentanaBajaPostulante();
        ventana.setVisible(true);
    }//GEN-LAST:event_menuItemBajaPostulanteActionPerformed

    private void menuItemAltaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAltaPostulanteActionPerformed
        VentanaAltaPostulante ventana = new VentanaAltaPostulante();
            ventana.setVisible(true);
    }//GEN-LAST:event_menuItemAltaPostulanteActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        VentanaHistorialPostulante ventana = new VentanaHistorialPostulante();
            ventana.setVisible(true);         
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem menuHistorialConsultaTematica;
    private javax.swing.JMenuItem menuItemAltaPostulante;
    private javax.swing.JMenuItem menuItemBajaPostulante;
    private javax.swing.JMenuItem menuItemConsultaPuesto;
    private javax.swing.JMenuItem menuItemHistorialPostulante;
    private javax.swing.JMenuItem menuItemREgistroEvaluador;
    private javax.swing.JMenuItem menuItemRegistroPuesto;
    private javax.swing.JMenuItem menuItemRegistroTematica;
    // End of variables declaration//GEN-END:variables
}
