package interfaz;

import dominio.ComprobarFormato;
import dominio.Evaluador;
import dominio.Sistema;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author nacho
 */
public class VentanaRegistroEvaluador extends javax.swing.JFrame {
    Evaluador evaluador;

    public VentanaRegistroEvaluador(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textCedula = new javax.swing.JTextField();
        TextDireccion = new javax.swing.JTextField();
        textAnoDeIngreso = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Registro Evaluador");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(67, 0, 180, 22);

        jLabel2.setText("Cedula:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 73, 60, 20);

        jLabel3.setText("Direccion:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 103, 70, 20);

        jLabel4.setText("Año de ingreso a la empresa:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 131, 184, 17);

        jLabel6.setText("Nombre:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 43, 60, 20);

        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });
        getContentPane().add(textNombre);
        textNombre.setBounds(132, 43, 170, 20);
        getContentPane().add(textCedula);
        textCedula.setBounds(132, 73, 170, 20);
        getContentPane().add(TextDireccion);
        TextDireccion.setBounds(132, 103, 170, 20);
        getContentPane().add(textAnoDeIngreso);
        textAnoDeIngreso.setBounds(228, 131, 74, 20);

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrar);
        botonRegistrar.setBounds(212, 166, 90, 23);

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelar);
        botonCancelar.setBounds(20, 166, 90, 23);

        setBounds(0, 0, 414, 307);
    }// </editor-fold>//GEN-END:initComponents

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        String[] valores = {textNombre.getText(), textCedula.getText(), TextDireccion.getText(),textAnoDeIngreso.getText()};
        boolean bien = true;
        for (int i = 0; i < valores.length && bien; i++) {
            if (!(valores[i].length() > 1) || valores[i] == null) {
                bien = false;
            }
        }
        
        if (!ComprobarFormato.soloNumeros(textCedula.getText()) || !ComprobarFormato.soloNumeros(textAnoDeIngreso.getText())) {
            bien = false;
        }
        
        if (bien) {
            long cedula=Long.parseLong(textCedula.getText());
            int anoIngreso =parseInt(textAnoDeIngreso.getText());
            evaluador = new Evaluador(textNombre.getText(),cedula, TextDireccion.getText(),anoIngreso);
            if(sistema.esUnica(evaluador)==true){
               //hacer metodo de agregar al hashmap el evaluador 
            }
            sistema.limpiarCamposField(textCedula);
            sistema.limpiarCamposField(TextDireccion);
            sistema.limpiarCamposField(textNombre);
            sistema.limpiarCamposField(textAnoDeIngreso);

            
        } else {
            JOptionPane.showMessageDialog(null, "Error de formato en alguno de los datos.", "Alta de postulante", JOptionPane.INFORMATION_MESSAGE);
        }

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
            java.util.logging.Logger.getLogger(VentanaRegistroEvaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroEvaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroEvaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroEvaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sistema sistema = new Sistema();
                new VentanaRegistroEvaluador(sistema).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextDireccion;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField textAnoDeIngreso;
    private javax.swing.JTextField textCedula;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
    private Sistema sistema;

}
