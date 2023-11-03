package interfaz;

import dominio.Sistema;

public class VentanaIngresoEntrevista extends javax.swing.JFrame {

    private Sistema sistema;

    /**
     * Creates new form IngresosDeEntrevista
     */
    public VentanaIngresoEntrevista(Sistema sistema) {
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

        jLabel1 = new javax.swing.JLabel();
        comboPostulante = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        ComboEvaluador = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Puntaje = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        botonRegistrar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaComentarios = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Ingreso de entrevista");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 0, 230, 40);

        comboPostulante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPostulanteActionPerformed(evt);
            }
        });
        getContentPane().add(comboPostulante);
        comboPostulante.setBounds(116, 70, 150, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Evaluador:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 41, 90, 18);

        ComboEvaluador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboEvaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboEvaluadorActionPerformed(evt);
            }
        });
        getContentPane().add(ComboEvaluador);
        ComboEvaluador.setBounds(116, 40, 150, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Postulante:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 71, 90, 18);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setText("Puntaje:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 102, 90, 17);
        getContentPane().add(Puntaje);
        Puntaje.setBounds(116, 100, 80, 23);

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setText("Comentarios:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 139, 90, 17);

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrar);
        botonRegistrar.setBounds(260, 235, 90, 23);

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelar);
        botonCancelar.setBounds(20, 235, 90, 23);

        textAreaComentarios.setColumns(20);
        textAreaComentarios.setRows(5);
        textAreaComentarios.setPreferredSize(new java.awt.Dimension(230, 80));
        jScrollPane2.setViewportView(textAreaComentarios);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(116, 132, 234, 91);

        setBounds(0, 0, 370, 307);
    }// </editor-fold>//GEN-END:initComponents

    private void ComboEvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboEvaluadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboEvaluadorActionPerformed

    private void comboPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPostulanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPostulanteActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaIngresoEntrevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresoEntrevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresoEntrevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresoEntrevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sistema sistema = new Sistema();
                new VentanaIngresoEntrevista(sistema).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboEvaluador;
    private javax.swing.JSpinner Puntaje;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JComboBox<String> comboPostulante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea textAreaComentarios;
    // End of variables declaration//GEN-END:variables
}
