/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import dominio.Sistema;
import javax.swing.JOptionPane;

public class VentanaMenu extends javax.swing.JFrame {
    
    /**
     * Creates new form menuFrame
     */
    public VentanaMenu() {
        initComponents();
        this.sistema = new Sistema();
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
        MenuRegistro = new javax.swing.JMenu();
        menuItemRegistroTematica = new javax.swing.JMenuItem();
        menuItemAltaPostulante = new javax.swing.JMenuItem();
        menuItemBajaPostulante = new javax.swing.JMenuItem();
        menuItemRegistroEvaluador = new javax.swing.JMenuItem();
        menuItemRegistroPuesto = new javax.swing.JMenuItem();
        menuConsulta = new javax.swing.JMenu();
        menuItemConsultaPuesto = new javax.swing.JMenuItem();
        menuItemHistorialPostulante = new javax.swing.JMenuItem();
        menuItemHistorialConsultaTematica = new javax.swing.JMenuItem();
        menuIngresos = new javax.swing.JMenu();
        menuItemIngresoEntrevista = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        TituloMenu.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        TituloMenu.setText("Bienvenidos a ETCHUNIN:");
        getContentPane().add(TituloMenu);
        TituloMenu.setBounds(160, 10, 240, 22);

        jLabel1.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel1.setText("Sistema para la gestion de postulantes llamados a puestos de trabajo.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 50, 520, 17);

        jMenuBar1.setToolTipText("");
        jMenuBar1.setAlignmentX(0.0F);

        MenuRegistro.setText("Registro");
        MenuRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegistroActionPerformed(evt);
            }
        });

        menuItemRegistroTematica.setText("Registro tematica");
        menuItemRegistroTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistroTematicaActionPerformed(evt);
            }
        });
        MenuRegistro.add(menuItemRegistroTematica);

        menuItemAltaPostulante.setText("Alta postulante");
        menuItemAltaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAltaPostulanteActionPerformed(evt);
            }
        });
        MenuRegistro.add(menuItemAltaPostulante);

        menuItemBajaPostulante.setText("Baja posutlante");
        menuItemBajaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBajaPostulanteActionPerformed(evt);
            }
        });
        MenuRegistro.add(menuItemBajaPostulante);

        menuItemRegistroEvaluador.setText("Registro evaluador");
        menuItemRegistroEvaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistroEvaluadorActionPerformed(evt);
            }
        });
        MenuRegistro.add(menuItemRegistroEvaluador);

        menuItemRegistroPuesto.setText("Registro puesto");
        menuItemRegistroPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistroPuestoActionPerformed(evt);
            }
        });
        MenuRegistro.add(menuItemRegistroPuesto);

        jMenuBar1.add(MenuRegistro);

        menuConsulta.setText("Consulta");
        menuConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaActionPerformed(evt);
            }
        });

        menuItemConsultaPuesto.setText("Consulta puesto");
        menuItemConsultaPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemConsultaPuestoActionPerformed(evt);
            }
        });
        menuConsulta.add(menuItemConsultaPuesto);

        menuItemHistorialPostulante.setText("Historial postulante");
        menuItemHistorialPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemHistorialPostulanteActionPerformed(evt);
            }
        });
        menuConsulta.add(menuItemHistorialPostulante);

        menuItemHistorialConsultaTematica.setText("Consulta tematica");
        menuItemHistorialConsultaTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemHistorialConsultaTematicaActionPerformed(evt);
            }
        });
        menuConsulta.add(menuItemHistorialConsultaTematica);

        jMenuBar1.add(menuConsulta);

        menuIngresos.setText("Ingresos");

        menuItemIngresoEntrevista.setText("Ingreso de entrevista");
        menuItemIngresoEntrevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemIngresoEntrevistaActionPerformed(evt);
            }
        });
        menuIngresos.add(menuItemIngresoEntrevista);

        jMenuBar1.add(menuIngresos);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 581, 300);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemRegistroTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistroTematicaActionPerformed
        VentanaRegistroTematica ventana = new VentanaRegistroTematica(this.sistema);
        ventana.setVisible(true);
    }//GEN-LAST:event_menuItemRegistroTematicaActionPerformed

    private void menuItemConsultaPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemConsultaPuestoActionPerformed
        VentanaConsultaPuestos ventana = new VentanaConsultaPuestos(this.sistema);
        ventana.setVisible(true);
    }//GEN-LAST:event_menuItemConsultaPuestoActionPerformed

    private void menuItemHistorialPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemHistorialPostulanteActionPerformed
        VentanaHistorialPostulante ventana = new VentanaHistorialPostulante(this.sistema);
        ventana.setVisible(true);
    }//GEN-LAST:event_menuItemHistorialPostulanteActionPerformed

    private void menuItemHistorialConsultaTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemHistorialConsultaTematicaActionPerformed
        VentanaConsultaPorTematica ventana = new VentanaConsultaPorTematica(this.sistema);
        ventana.setVisible(true);
    }//GEN-LAST:event_menuItemHistorialConsultaTematicaActionPerformed

    private void MenuRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegistroActionPerformed

    }//GEN-LAST:event_MenuRegistroActionPerformed

    private void menuItemBajaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBajaPostulanteActionPerformed
        if(sistema.hay("postulantes")){
            VentanaBajaPostulante ventana = new VentanaBajaPostulante(this.sistema);
            ventana.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Debe ingresar Postulantes primero");
        }
    }//GEN-LAST:event_menuItemBajaPostulanteActionPerformed

    private void menuItemAltaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAltaPostulanteActionPerformed
        if(sistema.hay("tematicas")){
            VentanaAltaPostulante ventana = new VentanaAltaPostulante(this.sistema);
            ventana.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Debe ingresar tematicas primero");
        }
    }//GEN-LAST:event_menuItemAltaPostulanteActionPerformed

    private void menuConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaActionPerformed
        VentanaHistorialPostulante ventana = new VentanaHistorialPostulante(this.sistema);
        ventana.setVisible(true);         
    }//GEN-LAST:event_menuConsultaActionPerformed

    private void menuItemIngresoEntrevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemIngresoEntrevistaActionPerformed
        VentanaIngresoEntrevista ventana = new VentanaIngresoEntrevista(this.sistema);
        ventana.setVisible(true);
    }//GEN-LAST:event_menuItemIngresoEntrevistaActionPerformed

    private void menuItemRegistroEvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistroEvaluadorActionPerformed
        VentanaRegistroEvaluador ventana = new VentanaRegistroEvaluador(this.sistema);
        ventana.setVisible(true);
    }//GEN-LAST:event_menuItemRegistroEvaluadorActionPerformed

    private void menuItemRegistroPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistroPuestoActionPerformed
        VentanaRegistroPuesto ventana = new VentanaRegistroPuesto(this.sistema);
        ventana.setVisible(true);
    }//GEN-LAST:event_menuItemRegistroPuestoActionPerformed

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
    private javax.swing.JMenu MenuRegistro;
    private javax.swing.JLabel TituloMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuConsulta;
    private javax.swing.JMenu menuIngresos;
    private javax.swing.JMenuItem menuItemAltaPostulante;
    private javax.swing.JMenuItem menuItemBajaPostulante;
    private javax.swing.JMenuItem menuItemConsultaPuesto;
    private javax.swing.JMenuItem menuItemHistorialConsultaTematica;
    private javax.swing.JMenuItem menuItemHistorialPostulante;
    private javax.swing.JMenuItem menuItemIngresoEntrevista;
    private javax.swing.JMenuItem menuItemRegistroEvaluador;
    private javax.swing.JMenuItem menuItemRegistroPuesto;
    private javax.swing.JMenuItem menuItemRegistroTematica;
    // End of variables declaration//GEN-END:variables
    private Sistema sistema;
}
