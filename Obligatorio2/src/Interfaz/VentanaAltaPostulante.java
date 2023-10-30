package Interfaz;

import Dominio.Postulante;
import Dominio.Sistema;
import Dominio.ComprobarFormato;
import javax.swing.JOptionPane;

public class VentanaAltaPostulante extends javax.swing.JFrame {

    private Sistema sistema;

    public VentanaAltaPostulante(Sistema sistema) {
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

        grupoFormato = new javax.swing.ButtonGroup();
        Titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        botonSiguiente = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        textNombre = new javax.swing.JTextField();
        textLinkedin = new javax.swing.JTextField();
        textMail = new javax.swing.JTextField();
        textTelefono = new javax.swing.JTextField();
        textDireccion = new javax.swing.JTextField();
        textCedula = new javax.swing.JTextField();
        radioRemoto = new javax.swing.JRadioButton();
        radioPresencial = new javax.swing.JRadioButton();
        radioMixto = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Titulo.setText("Alta Postulante");
        getContentPane().add(Titulo);
        Titulo.setBounds(180, 10, 150, 22);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 50, 55, 15);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Direccion:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 120, 61, 15);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Telefono:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 160, 70, 15);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Mail:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 200, 55, 15);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Linkedin:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 240, 60, 15);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Formato:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 280, 55, 15);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Cedula:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 80, 55, 15);

        botonSiguiente.setText("Siguiente");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(botonSiguiente);
        botonSiguiente.setBounds(330, 320, 90, 23);

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelar);
        botonCancelar.setBounds(20, 320, 90, 23);

        textNombre.setAlignmentX(0.0F);
        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });
        getContentPane().add(textNombre);
        textNombre.setBounds(110, 40, 317, 23);

        textLinkedin.setAlignmentX(0.0F);
        getContentPane().add(textLinkedin);
        textLinkedin.setBounds(110, 240, 317, 23);

        textMail.setAlignmentX(0.0F);
        getContentPane().add(textMail);
        textMail.setBounds(110, 200, 317, 23);

        textTelefono.setAlignmentX(0.0F);
        getContentPane().add(textTelefono);
        textTelefono.setBounds(110, 160, 317, 23);

        textDireccion.setAlignmentX(0.0F);
        getContentPane().add(textDireccion);
        textDireccion.setBounds(110, 120, 317, 23);

        textCedula.setAlignmentX(0.0F);
        getContentPane().add(textCedula);
        textCedula.setBounds(110, 80, 317, 23);

        grupoFormato.add(radioRemoto);
        radioRemoto.setText("Remoto");
        radioRemoto.setAlignmentY(0.0F);
        getContentPane().add(radioRemoto);
        radioRemoto.setBounds(110, 280, 90, 21);

        grupoFormato.add(radioPresencial);
        radioPresencial.setText("Presencial");
        radioPresencial.setAlignmentY(0.0F);
        radioPresencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPresencialActionPerformed(evt);
            }
        });
        getContentPane().add(radioPresencial);
        radioPresencial.setBounds(220, 280, 100, 21);

        grupoFormato.add(radioMixto);
        radioMixto.setText("Mixto");
        radioMixto.setAlignmentY(0.0F);
        radioMixto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMixtoActionPerformed(evt);
            }
        });
        getContentPane().add(radioMixto);
        radioMixto.setBounds(330, 280, 80, 21);

        setBounds(0, 0, 483, 398);
    }// </editor-fold>//GEN-END:initComponents

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        String formato = "";
        if (radioMixto.isSelected()) {
            formato = "Mixto";
        } else {
            if (radioPresencial.isSelected()) {
                formato = "Presencial";
            } else {
                if (radioRemoto.isSelected()) {
                    formato = "Remoto";
                }
            }
        }

        String[] valores = {textNombre.getText(), textCedula.getText(), textDireccion.getText(), textTelefono.getText(), textMail.getText(), textLinkedin.getText(), formato};

        //PASAR CADA METODO A VALID INPUT EN SU CAMPO CORRESPONDIENTE ????
        boolean bien = true;

        for (int i = 0; i < valores.length && bien; i++) {
            if (!(valores[i].length() > 1) || valores[i] == null) {
                bien = false;
            }
        }

        if (/*!ComprobarFormato.linkedin(textLinkedin.getText()) || !ComprobarFormato.mail(textMail.getText()) || */!ComprobarFormato.soloNumeros(textCedula.getText()) || !ComprobarFormato.soloNumeros(textTelefono.getText())) {
            bien = false;
        }
        if (bien) {
            Postulante postulante = new Postulante(textNombre.getText(), textCedula.getText(), textDireccion.getText(), textTelefono.getText(), textMail.getText(), textLinkedin.getText(), formato);
            VentanaAltaPostulante2 ventana = new VentanaAltaPostulante2(this.sistema, postulante);
            ventana.setVisible(true);
            sistema.limpiarCamposField(textCedula);
            sistema.limpiarCamposField(textMail);
            sistema.limpiarCamposField(textDireccion);
            sistema.limpiarCamposField(textNombre);
            sistema.limpiarCamposField(textTelefono);
            sistema.limpiarCamposField(textLinkedin);
            
        } else {
            JOptionPane.showMessageDialog(null, "Error de formato en alguno de los datos.", "Alta de postulante", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

    private void radioPresencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPresencialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPresencialActionPerformed

    private void radioMixtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMixtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMixtoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAltaPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAltaPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAltaPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAltaPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sistema sistema = new Sistema();
                new VentanaAltaPostulante(sistema).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.ButtonGroup grupoFormato;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton radioMixto;
    private javax.swing.JRadioButton radioPresencial;
    private javax.swing.JRadioButton radioRemoto;
    private javax.swing.JTextField textCedula;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textLinkedin;
    private javax.swing.JTextField textMail;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textTelefono;
    // End of variables declaration//GEN-END:variables
}
