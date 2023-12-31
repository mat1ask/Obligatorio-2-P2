package interfaz;

import ArchivoTexto.ArchivoGrabacion;
import dominio.*;
import java.util.*;
import javax.swing.*;

public class VentanaConsultaPuestos extends javax.swing.JFrame implements Observer {

    private Sistema sistema;
    private ArrayList<Postulante> posConEntrevista;
    private DefaultListModel<Puesto> listPuestos = new DefaultListModel<>();
    private DefaultListModel<Postulante> listPostulantes = new DefaultListModel<>();
    private ArrayList<Postulante> paraExportar;

    public VentanaConsultaPuestos(Sistema sistema) {
        this.sistema = sistema;
        sistema.addObserver(this);
        actualizarVentana();
        initComponents();
    }

    public void actualizarVentana() {
        this.listPuestos = new DefaultListModel<>();
        this.listPostulantes = new DefaultListModel<>();

        this.listPuestos.addAll(sistema.getPuestos());

        posConEntrevista = new ArrayList<>();
        ArrayList<Postulante> postulantes = new ArrayList<>();
        postulantes.addAll(sistema.getPostulantes().values());
        for (int i = postulantes.size() - 1; i >= 0; i--) {
            if (!posConEntrevista.contains(postulantes.get(i))) {
                posConEntrevista.add(postulantes.get(i));
            }
        }
        Collections.sort(posConEntrevista, new Comparator<Postulante>() {
            @Override
            public int compare(Postulante obj1, Postulante obj2) {
                return Integer.compare(obj1.getPuntajeUltimaEntrevista(), obj2.getPuntajeUltimaEntrevista());
            }
        });
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

        listaPuestos.setModel(this.listPuestos);
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
                .addComponent(panelPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNivel)
                    .addComponent(spinNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonConsultar))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 47, 372, 211);

        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Postulantes:");

        listaPostulantes.setModel(this.listPostulantes);
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
        jPanel2.setBounds(20, 281, 372, 186);

        setBounds(0, 0, 412, 546);
    }// </editor-fold>//GEN-END:initComponents

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        if (!listaPuestos.isSelectionEmpty()) {
            paraExportar = new ArrayList<Postulante>();
            listPostulantes.clear();
            int nivelD = (int) spinNivel.getValue();
            Puesto puesto = this.listaPuestos.getSelectedValue();
            String[] temasPuesto = (puesto).getTemas();
            for (Postulante pos : posConEntrevista) {
                boolean losTemas = true;
                boolean formaTrabajo = false;
                HashMap<String, Integer> temasPos = pos.getTemas();
                if (pos.getFormato().equals(puesto.getformato())) {
                    formaTrabajo = true;
                }
                boolean agregado = false;
                for (int i = 0; i < temasPuesto.length && formaTrabajo && losTemas && !agregado; i++) {
                    if (temasPos.containsKey(temasPuesto[i])) {
                        if (temasPos.get(temasPuesto[i]) >= nivelD) {
                            listPostulantes.addElement(pos);
                            paraExportar.add(pos);
                            agregado = true;
                        }
                    } else {
                        losTemas = false;
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un puesto", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonConsultarActionPerformed

    private void botonExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExportarActionPerformed
        ArchivoGrabacion arch = new ArchivoGrabacion("Consulta.txt");
        for (Postulante pos : this.paraExportar) {
            arch.grabarLinea(pos.paraArchivo());
        }
        arch.cerrar();
        JOptionPane.showMessageDialog(this, "Se ha guardado su consulta en \"Conslta.txt\"");
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
    private javax.swing.JList<Postulante> listaPostulantes;
    private javax.swing.JList<Puesto> listaPuestos;
    private javax.swing.JScrollPane panelPostulantes;
    private javax.swing.JScrollPane panelPuestos;
    private javax.swing.JSpinner spinNivel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        actualizarVentana();
    }
}
