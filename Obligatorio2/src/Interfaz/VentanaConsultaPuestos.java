package interfaz;


import dominio.*;
import java.util.*;
import javax.swing.*;

public class VentanaConsultaPuestos extends javax.swing.JFrame {

    private Sistema sistema;
    private DefaultListModel<String> listPuestos = new DefaultListModel<>();
    private ArrayList<Puesto> puestos = sistema.getPuestos();
    private DefaultListModel<String> listPostulantes = new DefaultListModel<>();

        public VentanaConsultaPuestos(Sistema sistema) {
            listaPuestos.setModel(listPuestos);
            listaPostulantes.setModel(listPostulantes);
            
        
        for (Puesto elemento : puestos) {
            listPuestos.addElement(elemento.toString());
        }
            
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        botonExportar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        spinNivel = new javax.swing.JSpinner();
        Puestos = new javax.swing.JLabel();
        panelPuestos = new javax.swing.JScrollPane();
        listaPuestos = new javax.swing.JList<>();
        labelNivel = new javax.swing.JLabel();
        botonConsultar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelPostulantes = new javax.swing.JScrollPane();
        listaPostulantes = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Titulo.setText("Consulta para puesto");
        Titulo.setAlignmentY(0.0F);
        getContentPane().add(Titulo);
        Titulo.setBounds(100, 15, 210, 20);

        botonCancelar.setText("Cancelar");
        botonCancelar.setAlignmentY(0.0F);
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelar);
        botonCancelar.setBounds(30, 470, 90, 23);

        botonExportar.setText("Exportar");
        botonExportar.setAlignmentY(0.0F);
        botonExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExportarActionPerformed(evt);
            }
        });
        getContentPane().add(botonExportar);
        botonExportar.setBounds(304, 472, 80, 23);

        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);

        spinNivel.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        Puestos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Puestos.setText("Puestos:");

        listaPuestos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        panelPuestos.setViewportView(listaPuestos);

        labelNivel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNivel.setText("Nivel:");

        botonConsultar.setText("Consultar");
        botonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Puestos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelNivel)
                        .addGap(66, 66, 66)
                        .addComponent(spinNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(botonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Puestos)
                .addGap(5, 5, 5)
                .addComponent(panelPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNivel)
                    .addComponent(spinNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonConsultar))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 47, 372, 228);

        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Postulantes:");

        listaPostulantes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        panelPostulantes.setViewportView(listaPostulantes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPostulantes, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(panelPostulantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 281, 372, 179);

        setBounds(0, 0, 412, 546);
    }// </editor-fold>//GEN-END:initComponents

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        HashMap<String, Postulante> postulantes= sistema.getPostulantes();
        Puesto puestosD = sistema.devolverPuestos(puestos.get(listaPostulantes.getSelectedIndex()).getNombres());
        int nivelD=(int)spinNivel.getValue();
        boolean esta=false;
        boolean formaTrabajo=false;
        boolean nivelMayorIgual=false;
        ArrayList<Entrevista> entrevistas = new ArrayList<>();
        entrevistas = sistema.getEntrevista();
        for (String cedula : postulantes.keySet()) {
            Postulante postulante = postulantes.get(cedula);
            for(Entrevista elem : entrevistas){
                if(elem.getPostulante()==postulante){
                    esta=true;
                    if(puestosD.getformato().equals(postulante.getFormato())){
                        formaTrabajo=true;
                        String[]temasPuesto = puestosD.getTemas();
                        HashMap temasPost = postulante.getTemas();
                        boolean estanTodos = true;
                        for (String temaAct : temasPuesto) {
                            if(temasPost.containsKey(temaAct)){
                                if(temasPost.get(temaAct) >= nivelD)
                            } else {
                                estanTodos = false;
                            }
                        }
                        if(>=nivelD){
                            nivelMayorIgual=true;
                        }
                    }
                }
            }
            listPostulantes.addElement(postulante.getNombre());
        }
        int level = (int) spinNivel.getValue();
    }//GEN-LAST:event_botonConsultarActionPerformed

    private void botonExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExportarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonExportarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaConsultaPuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultaPuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultaPuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultaPuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sistema sistema = new Sistema();
                new VentanaConsultaPuestos(sistema).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Puestos;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JButton botonExportar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelNivel;
    private javax.swing.JList<String> listaPostulantes;
    private javax.swing.JList<String> listaPuestos;
    private javax.swing.JScrollPane panelPostulantes;
    private javax.swing.JScrollPane panelPuestos;
    private javax.swing.JSpinner spinNivel;
    // End of variables declaration//GEN-END:variables
}
