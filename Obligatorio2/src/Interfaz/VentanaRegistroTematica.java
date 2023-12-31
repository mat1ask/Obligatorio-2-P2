package interfaz;

import dominio.Tematica;
import dominio.Sistema;
import java.util.*;
import javax.swing.*;

public class VentanaRegistroTematica extends javax.swing.JFrame {

    public VentanaRegistroTematica(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
    }

    private boolean esNombreVacio() {
        String nombreT = textNombre.getText().trim(); // Obtengo el texto del campo y elimina espacios en blanco al inicio y al final
        return nombreT.isEmpty(); // Devuelve true si el campo está vacío, de lo contrario, devuelve false
    }

    public boolean yaRegistrada() {
        boolean registrada = false;
        String nombreT = textNombre.getText();
        ArrayList<Tematica> listaNombres = sistema.getTematicas();
        for (Tematica elemento : listaNombres) {
            if (nombreT.equals(elemento.toString())) {
                registrada = true;
            }
        }
        return registrada;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        botonCancelar = new javax.swing.JButton();
        botonRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDescripcion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Registro Tematica");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 15, 210, 22);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 58, 80, 15);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Descripcion:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 97, 100, 15);
        getContentPane().add(textNombre);
        textNombre.setBounds(106, 58, 309, 23);

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelar);
        botonCancelar.setBounds(20, 257, 99, 23);

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrar);
        botonRegistrar.setBounds(316, 257, 99, 23);

        textDescripcion.setColumns(20);
        textDescripcion.setRows(5);
        jScrollPane1.setViewportView(textDescripcion);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(110, 100, 300, 130);

        setBounds(0, 0, 460, 357);
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        if (esNombreVacio()) {
            JOptionPane.showMessageDialog(this, "El campo Nombre está vacío, por favor ingrese un nombre.");
        } else if (yaRegistrada()) {
            JOptionPane.showMessageDialog(this, "Esta temática ya ha sido ingresada, intente nuevamente.");
        } else if (textDescripcion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Descripcion está vacío, por favor ingrese una descripcion.");
        } else {
            Tematica tema = new Tematica(textNombre.getText(), textDescripcion.getText());
            sistema.agregarTematica(tema);
            Sistema.limpiarCamposField(textNombre);
            Sistema.limpiarCamposArea(textDescripcion);
            JOptionPane.showMessageDialog(this, "La temática ha sido ingresada correctamente.");
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaRegistroTematica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroTematica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroTematica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroTematica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sistema sistema = new Sistema();
                new VentanaRegistroTematica(sistema).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textDescripcion;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
    private Sistema sistema;
}
