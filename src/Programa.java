/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ING-JUANMATA
 */
public class Programa extends javax.swing.JFrame {

    Grafo grafo;

    /**
     * Creates new form Programa
     */
    public Programa() {
        initComponents();
        grafo = new Grafo();
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
        txtValor = new javax.swing.JTextField();
        btnVertice = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        comboOrigen = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboDestino = new javax.swing.JComboBox<>();
        btnAgregarArista = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        comboVertices = new javax.swing.JComboBox<>();
        btnLista = new javax.swing.JButton();
        btnMatriz = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCamino = new javax.swing.JTextField();
        btnCamino = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        btnEliminar = new javax.swing.JButton();
        btnEliminarArista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Valor");

        btnVertice.setText("Agregar Vertice");
        btnVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerticeActionPerformed(evt);
            }
        });

        jLabel2.setText("De");

        jLabel3.setText("Hacia");

        btnAgregarArista.setText("Agregar Arista");
        btnAgregarArista.setEnabled(false);
        btnAgregarArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAristaActionPerformed(evt);
            }
        });

        jLabel4.setText("Vertices");

        btnLista.setText("Lista Adyacencia");
        btnLista.setEnabled(false);
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });

        btnMatriz.setText("Matriz Adyacencia");
        btnMatriz.setEnabled(false);
        btnMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrizActionPerformed(evt);
            }
        });

        jLabel5.setText("Camino");

        btnCamino.setText("Validar");
        btnCamino.setEnabled(false);
        btnCamino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaminoActionPerformed(evt);
            }
        });

        txtSalida.setColumns(20);
        txtSalida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSalida.setRows(5);
        jScrollPane1.setViewportView(txtSalida);

        btnEliminar.setText("Eliminar Vertice");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEliminarArista.setText("Eliminar Arista");
        btnEliminarArista.setEnabled(false);
        btnEliminarArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAristaActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(17, 17, 17)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel1)
                                    .add(jLabel2))
                                .add(18, 18, 18)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(txtValor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(18, 18, 18)
                                        .add(btnVertice))
                                    .add(layout.createSequentialGroup()
                                        .add(comboOrigen, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(18, 18, 18)
                                        .add(jLabel3)
                                        .add(18, 18, 18)
                                        .add(comboDestino, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(18, 18, 18)
                                        .add(btnAgregarArista)
                                        .add(18, 18, 18)
                                        .add(btnEliminarArista))))
                            .add(layout.createSequentialGroup()
                                .add(jLabel5)
                                .add(18, 18, 18)
                                .add(txtCamino, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(btnCamino)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btnLista))
                            .add(layout.createSequentialGroup()
                                .add(jLabel4)
                                .add(18, 18, 18)
                                .add(comboVertices, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(btnEliminar)
                                .add(12, 12, 12)
                                .add(btnMatriz)))
                        .add(0, 27, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(21, 21, 21)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(txtValor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnVertice))
                .add(25, 25, 25)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(comboOrigen, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3)
                    .add(comboDestino, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnAgregarArista)
                    .add(btnEliminarArista))
                .add(24, 24, 24)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(comboVertices, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnMatriz)
                    .add(btnEliminar))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(txtCamino, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnCamino)
                    .add(btnLista))
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 250, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerticeActionPerformed
        char c = txtValor.getText().charAt(0);
        if (grafo.insertarVertice(c)) {
            comboDestino.addItem(c);
            comboOrigen.addItem(c);
            comboVertices.addItem(c);
            if (!btnEliminar.isEnabled()) {
                btnMatriz.setEnabled(true);
                btnLista.setEnabled(true);
                btnAgregarArista.setEnabled(true);
                btnEliminar.setEnabled(true);
                btnEliminarArista.setEnabled(true);
                btnCamino.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnVerticeActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        char v = (char) comboVertices.getSelectedItem();
        if (grafo.eliminarVertice(v)) {
            comboVertices.removeItem(v);
            comboDestino.removeItem(v);
            comboOrigen.removeItem(v);
            if (grafo.contarVertices() == 0) {
                btnMatriz.setEnabled(false);
                btnLista.setEnabled(false);
                btnAgregarArista.setEnabled(false);
                btnEliminar.setEnabled(false);
                btnEliminarArista.setEnabled(false);
                btnCamino.setEnabled(false);
            }
            txtSalida.setText("VERTICE ELIMINADO CORRECTAMENTE");

            return;
        }

        txtSalida.setText("EL VERTICE AUN CUENTA CON ARISTAS");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAristaActionPerformed
        grafo.insertarAristas((char) comboOrigen.getSelectedItem(), (char) comboDestino.getSelectedItem());
    }//GEN-LAST:event_btnAgregarAristaActionPerformed

    private void btnMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatrizActionPerformed
        boolean datos[][] = grafo.matrizAdyacencia();
        String salida = "   ";
        for (int i = 0; i < comboVertices.getItemCount(); i++) {
            salida += comboVertices.getItemAt(i) + " ";
        }

        for (int i = 0; i < comboVertices.getItemCount(); i++) {
            salida += "\n" + comboVertices.getItemAt(i) + " ";
            for (int j = 0; j < comboVertices.getItemCount(); j++) {
                salida += datos[i][j] ? "1 " : "0 ";
            }
        }

        txtSalida.setText(salida);
    }//GEN-LAST:event_btnMatrizActionPerformed

    private void btnEliminarAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAristaActionPerformed
        grafo.eliminarArista((char) comboOrigen.getSelectedItem(), (char) comboDestino.getSelectedItem());
    }//GEN-LAST:event_btnEliminarAristaActionPerformed

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        if (comboVertices.getItemCount() > 0)
            txtSalida.setText(grafo.listaAdyacencia((char) comboVertices.getSelectedItem()));
    }//GEN-LAST:event_btnListaActionPerformed

    private void btnCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaminoActionPerformed
        String camino = txtCamino.getText().trim();

        if (camino.matches("^[a-zA-z0-9]{2,}$") || camino.equals("")) {
            txtSalida.setText("ENTRADA DE TEXTO INCORRECTA\nFORMATO: A,B,C,D...");
            return;
        }

        if (camino.matches("^\\S[A-z0-9]?[,]?([A-z0-9][,])*[A-z0-9]?$")) {
            String txt = txtCamino.getText().trim().replaceAll(",", "");
            txtSalida.setText(grafo.validar(txt.toCharArray()));
        }
    }//GEN-LAST:event_btnCaminoActionPerformed

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
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarArista;
    private javax.swing.JButton btnCamino;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarArista;
    private javax.swing.JButton btnLista;
    private javax.swing.JButton btnMatriz;
    private javax.swing.JButton btnVertice;
    private javax.swing.JComboBox<Character> comboDestino;
    private javax.swing.JComboBox<Character> comboOrigen;
    private javax.swing.JComboBox<Character> comboVertices;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCamino;
    private javax.swing.JTextArea txtSalida;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

}
