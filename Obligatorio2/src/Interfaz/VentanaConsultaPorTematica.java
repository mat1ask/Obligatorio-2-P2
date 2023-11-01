/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import dominio.Sistema;

/**
 *
 * @author matiaskunin
 */
public class VentanaConsultaPorTematica extends javax.swing.JFrame {
    private Sistema sistema;
    /**
     * Creates new form VentanaConsultaPorTematica
     */
    public VentanaConsultaPorTematica(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonCerrar = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textCantMay5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textCantPuestos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        botonCerrar.setText("Cerrar");
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCerrar);
        botonCerrar.setBounds(20, 190, 90, 23);

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Titulo.setText("Consulta por tematica");
        Titulo.setAlignmentY(0.0F);
        getContentPane().add(Titulo);
        Titulo.setBounds(160, 0, 210, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Tematicas:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 30, 80, 16);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(26, 52, 74, 120);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Cantidad de postulantes con nivel mayor a 5:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(118, 52, 298, 22);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Estadisticas:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(118, 30, 80, 16);

        textCantMay5.setEditable(false);
        textCantMay5.setText("CantMay5");
        getContentPane().add(textCantMay5);
        textCantMay5.setBounds(422, 52, 79, 22);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Cantidad de peuestos que lo requieren:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(118, 80, 298, 16);

        textCantPuestos.setEditable(false);
        textCantPuestos.setText("CantPuestos");
        textCantPuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCantPuestosActionPerformed(evt);
            }
        });
        getContentPane().add(textCantPuestos);
        textCantPuestos.setBounds(422, 80, 79, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void textCantPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCantPuestosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCantPuestosActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaConsultaPorTematica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultaPorTematica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultaPorTematica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultaPorTematica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sistema sistema = new Sistema();
                new VentanaConsultaPorTematica(sistema).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textCantMay5;
    private javax.swing.JTextField textCantPuestos;
    // End of variables declaration//GEN-END:variables
}
