package interfaz;

import dominio.*;
import java.awt.Cursor;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class VentanaHistorialPostulante extends javax.swing.JFrame implements Observer{
    
    private Sistema sistema;
    
    private DefaultListModel<Postulante> listaPostulantes = new DefaultListModel<>();
    private ArrayList<String> cedulas = new ArrayList<>();
    private DefaultListModel<String> listaTematicas = new DefaultListModel<>();
    private TableColumnModel modeloTabla;
    
    public VentanaHistorialPostulante(Sistema sistema) {
        this.sistema = sistema;
        actualizarVentana();
        initComponents();
        sistema.addObserver(this);
        
        modeloTabla = tablaEntrevista.getColumnModel();
        modeloTabla.getColumn(0).setPreferredWidth(55);
        modeloTabla.getColumn(1).setPreferredWidth(255);
        modeloTabla.getColumn(2).setPreferredWidth(125);
        modeloTabla.getColumn(3).setPreferredWidth(500);
        
    }
    
    private void actualizarVentana() {
        HashMap<String, Postulante> postulantes = sistema.getPostulantes();
        cedulas.clear();
        listaTematicas = new DefaultListModel<>();
        // Agregar las claves (cedulas) al ArrayList
        for (String cedula : postulantes.keySet()) {
            cedulas.add(cedula);
        }

        // Ordenar el ArrayList de cédulas de manera creciente
        Collections.sort(cedulas);

        // Agregar los nombres de los postulantes a la lista
        for (String cedula : cedulas) {
            Postulante postulante = postulantes.get(cedula);
            listaPostulantes.addElement(postulante);
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        panelPostulantes = new javax.swing.JScrollPane();
        listPostulantes = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelExperiencia = new javax.swing.JScrollPane();
        listExperiencia = new javax.swing.JList<>();
        labelNombre = new javax.swing.JLabel();
        JLabelCedula = new javax.swing.JLabel();
        JLabelDireccion = new javax.swing.JLabel();
        JLabelTelefono = new javax.swing.JLabel();
        JLabelMail = new javax.swing.JLabel();
        JLabelLinkedin = new javax.swing.JLabel();
        JLabelFormato = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        textBuscar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaEntrevista = new javax.swing.JTable();
        botonBuscar = new javax.swing.JButton();
        botonReset = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        listPostulantes.setModel(this.listaPostulantes);
        listPostulantes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listPostulantesValueChanged(evt);
            }
        });
        panelPostulantes.setViewportView(listPostulantes);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Postulantes:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPostulantes, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(5, 5, 5)
                .addComponent(panelPostulantes)
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Experiencia:");
        jLabel8.setAlignmentY(0.0F);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Formato:");
        jLabel10.setAlignmentY(0.0F);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Cedula:");
        jLabel3.setAlignmentY(0.0F);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Linkedin:");
        jLabel9.setAlignmentY(0.0F);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Direccion:");
        jLabel4.setAlignmentY(0.0F);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");
        jLabel2.setAlignmentY(0.0F);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Telefono:");
        jLabel5.setAlignmentY(0.0F);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Mail:");
        jLabel6.setAlignmentY(0.0F);

        panelExperiencia.setViewportView(listExperiencia);

        labelNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNombre.setText(" ");
        labelNombre.setAlignmentY(0.0F);

        JLabelCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLabelCedula.setText(" ");
        JLabelCedula.setAlignmentY(0.0F);

        JLabelDireccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLabelDireccion.setText(" ");
        JLabelDireccion.setAlignmentY(0.0F);

        JLabelTelefono.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLabelTelefono.setText(" ");
        JLabelTelefono.setAlignmentY(0.0F);

        JLabelMail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLabelMail.setText(" ");
        JLabelMail.setAlignmentY(0.0F);

        JLabelLinkedin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLabelLinkedin.setText("  ");
        JLabelLinkedin.setAlignmentY(0.0F);
        JLabelLinkedin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabelLinkedinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLabelLinkedinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLabelLinkedinMouseExited(evt);
            }
        });

        JLabelFormato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLabelFormato.setText(" ");
        JLabelFormato.setAlignmentY(0.0F);
        JLabelFormato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabelFormatoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLabelFormatoMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelExperiencia, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLabelCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLabelDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLabelTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLabelMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLabelLinkedin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLabelFormato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(86, 86, 86))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel2, jLabel3, jLabel4, jLabel5});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelNombre))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JLabelCedula))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JLabelDireccion))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JLabelTelefono))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JLabelMail))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JLabelLinkedin))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(JLabelFormato))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(panelExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel8, jLabel9});

        textBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBuscarActionPerformed(evt);
            }
        });

        jLabel11.setText("Buscar:");

        tablaEntrevista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nro", "Evaluador", "Puntaje", "Comentarios"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEntrevista.setAlignmentX(0.0F);
        tablaEntrevista.setAlignmentY(0.0F);
        tablaEntrevista.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane3.setViewportView(tablaEntrevista);

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        botonReset.setText("Resetear");
        botonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(15, 15, 15)
                        .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(botonBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(botonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botonBuscar, botonReset});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textBuscar)
                    .addComponent(botonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botonBuscar, botonReset});

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(18, 65, 1026, 604);

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir);
        botonSalir.setBounds(24, 680, 72, 23);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Historial de postulante");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 950, 22);

        setBounds(0, 0, 1041, 747);
    }// </editor-fold>//GEN-END:initComponents

    private void botonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResetActionPerformed
        cargaTablaDefecto(sistema.getEntrevistaPostulante(this.listPostulantes.getSelectedValue(), ""));
    }//GEN-LAST:event_botonResetActionPerformed

    private void textBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBuscarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        String palabra = this.textBuscar.getText();
        ArrayList<Entrevista> entrevistas = sistema.getEntrevistaPostulante(this.listPostulantes.getSelectedValue(),palabra);
        
        cargaTablaBuscador(entrevistas,palabra);
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void listPostulantesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listPostulantesValueChanged
        Postulante postulante = this.listPostulantes.getSelectedValue();
        if (postulante != null) {
            labelNombre.setText(postulante.getNombre());
            JLabelCedula.setText(postulante.getCedula()+"");
            JLabelDireccion.setText(postulante.getDireccion());
            JLabelTelefono.setText(postulante.getTelefono());
            JLabelMail.setText(postulante.getMail());
            JLabelLinkedin.setText("<html><a href=\"" + postulante.getLinkedin() + "\">" + postulante.getLinkedin() + "</a></html>");
            JLabelFormato.setText(postulante.getFormato());
            listaTematicas = new DefaultListModel<>();
            String[] losTemas = postulante.temasToArray();
            listExperiencia.setListData(losTemas);
            cargaTablaDefecto(sistema.getEntrevistaPostulante(postulante,""));
        } else {
            JOptionPane.showMessageDialog(this, "Error: Postulante no encontrado");
        }
    }//GEN-LAST:event_listPostulantesValueChanged

    private void JLabelFormatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelFormatoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JLabelFormatoMouseClicked

    private void JLabelFormatoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelFormatoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_JLabelFormatoMouseEntered

    private void JLabelLinkedinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelLinkedinMouseClicked
        Postulante postulante = this.listPostulantes.getSelectedValue();
        String linkedinUrl = postulante.getLinkedin();

        if (linkedinUrl != null && !linkedinUrl.isEmpty()) {
            try {
                Desktop desktop = Desktop.getDesktop();
                URI uri = new URI(linkedinUrl);
                desktop.browse(uri);
            } catch (IOException | URISyntaxException e) {
                JOptionPane.showMessageDialog(this, "Error abriendo el link");
            }
        } else {
            JOptionPane.showMessageDialog(this, "El link no esta disponible");
        }
    }//GEN-LAST:event_JLabelLinkedinMouseClicked

    private void JLabelLinkedinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelLinkedinMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_JLabelLinkedinMouseEntered

    private void JLabelLinkedinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelLinkedinMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_JLabelLinkedinMouseExited
    
    public String colorPalabra(String comentarios, String palabra) {
        String ret = "";
        int comienzo = comentarios.indexOf(palabra);
        int fin = comienzo + palabra.length();
        
        ret = "<html><font color='black'>" + comentarios.substring(0,comienzo) + "</font>" + "<font color='red'>" + palabra + "</font>";
        ret += "<font color='black'>" + comentarios.substring(fin, comentarios.length()) + "</font></html>";

        return ret;
    }
    
    public void cargaTablaDefecto(ArrayList<Entrevista> entrevistas){
        DefaultTableModel modeloT = (DefaultTableModel) tablaEntrevista.getModel();
        modeloT.setRowCount(0);
        for (Entrevista ent : entrevistas) {
           Object[] fila = {ent.getNumero() , ent.getEvaluadores() , ent.getPuntaje() , ent.getComentarios()};
           modeloT.addRow(fila);
        }
    }
    
    public void cargaTablaBuscador(ArrayList<Entrevista> entrevistas , String palabra) {
        DefaultTableModel modeloT = (DefaultTableModel) tablaEntrevista.getModel();
        modeloT.setRowCount(0);
        for (Entrevista ent : entrevistas ) {
            String comentario = ent.getComentarios();
            Object[] fila = {ent.getNumero() , ent.getEvaluadores() , ent.getPuntaje() , colorPalabra(comentario, palabra)};
            modeloT.addRow(fila);
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(VentanaHistorialPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaHistorialPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaHistorialPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaHistorialPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sistema sistema = new Sistema();
                new VentanaHistorialPostulante(sistema).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelCedula;
    private javax.swing.JLabel JLabelDireccion;
    private javax.swing.JLabel JLabelFormato;
    private javax.swing.JLabel JLabelLinkedin;
    private javax.swing.JLabel JLabelMail;
    private javax.swing.JLabel JLabelTelefono;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonReset;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JList<String> listExperiencia;
    private javax.swing.JList<Postulante> listPostulantes;
    private javax.swing.JScrollPane panelExperiencia;
    private javax.swing.JScrollPane panelPostulantes;
    private javax.swing.JTable tablaEntrevista;
    private javax.swing.JTextField textBuscar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        actualizarVentana();
    }
}
