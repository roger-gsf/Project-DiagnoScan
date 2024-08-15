package view;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpanelBotoes = new javax.swing.JPanel();
        btnPesquisarDoenca = new javax.swing.JButton();
        btnPesquisarSintoma = new javax.swing.JButton();
        btnCadastrarDoenca = new javax.swing.JButton();
        btnCadastrarSintoma = new javax.swing.JButton();
        btnVincularDoenca = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnPesquisarVinculos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Home");

        jpanelTitulo.setBackground(new java.awt.Color(1, 106, 67));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Diagno Scan");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        javax.swing.GroupLayout jpanelTituloLayout = new javax.swing.GroupLayout(jpanelTitulo);
        jpanelTitulo.setLayout(jpanelTituloLayout);
        jpanelTituloLayout.setHorizontalGroup(
            jpanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpanelTituloLayout.setVerticalGroup(
            jpanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
        );

        jpanelBotoes.setBackground(new java.awt.Color(90, 62, 43));
        jpanelBotoes.setForeground(new java.awt.Color(255, 255, 255));

        btnPesquisarDoenca.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 12)); // NOI18N
        btnPesquisarDoenca.setForeground(new java.awt.Color(0, 0, 0));
        btnPesquisarDoenca.setText("Search disease");
        btnPesquisarDoenca.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 8, 1, new java.awt.Color(0, 0, 0)));
        btnPesquisarDoenca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisarDoenca.setFocusPainted(false);
        btnPesquisarDoenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarDoencaActionPerformed(evt);
            }
        });

        btnPesquisarSintoma.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 12)); // NOI18N
        btnPesquisarSintoma.setForeground(new java.awt.Color(0, 0, 0));
        btnPesquisarSintoma.setText("Search symptom");
        btnPesquisarSintoma.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 8, 1, new java.awt.Color(0, 0, 0)));
        btnPesquisarSintoma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisarSintoma.setFocusPainted(false);
        btnPesquisarSintoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarSintomaActionPerformed(evt);
            }
        });

        btnCadastrarDoenca.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 12)); // NOI18N
        btnCadastrarDoenca.setForeground(new java.awt.Color(0, 0, 0));
        btnCadastrarDoenca.setText("Register disease");
        btnCadastrarDoenca.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 8, 1, new java.awt.Color(0, 0, 0)));
        btnCadastrarDoenca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrarDoenca.setFocusPainted(false);
        btnCadastrarDoenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarDoencaActionPerformed(evt);
            }
        });

        btnCadastrarSintoma.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 12)); // NOI18N
        btnCadastrarSintoma.setForeground(new java.awt.Color(0, 0, 0));
        btnCadastrarSintoma.setText("Register symptom");
        btnCadastrarSintoma.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 8, 1, new java.awt.Color(0, 0, 0)));
        btnCadastrarSintoma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrarSintoma.setFocusPainted(false);
        btnCadastrarSintoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarSintomaActionPerformed(evt);
            }
        });

        btnVincularDoenca.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 12)); // NOI18N
        btnVincularDoenca.setForeground(new java.awt.Color(0, 0, 0));
        btnVincularDoenca.setText("Link D&S");
        btnVincularDoenca.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 8, 1, new java.awt.Color(0, 0, 0)));
        btnVincularDoenca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVincularDoenca.setFocusPainted(false);
        btnVincularDoenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVincularDoencaActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(0, 0, 0));
        btnSair.setText("Exit");
        btnSair.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 8, 1, new java.awt.Color(0, 0, 0)));
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setFocusPainted(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnPesquisarVinculos.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 12)); // NOI18N
        btnPesquisarVinculos.setForeground(new java.awt.Color(0, 0, 0));
        btnPesquisarVinculos.setText("Search links");
        btnPesquisarVinculos.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 8, 1, new java.awt.Color(0, 0, 0)));
        btnPesquisarVinculos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisarVinculos.setFocusPainted(false);
        btnPesquisarVinculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarVinculosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelBotoesLayout = new javax.swing.GroupLayout(jpanelBotoes);
        jpanelBotoes.setLayout(jpanelBotoesLayout);
        jpanelBotoesLayout.setHorizontalGroup(
            jpanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelBotoesLayout.createSequentialGroup()
                .addGroup(jpanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelBotoesLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jpanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCadastrarDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisarDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisarVinculos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrarSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisarSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVincularDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpanelBotoesLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jpanelBotoesLayout.setVerticalGroup(
            jpanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelBotoesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPesquisarSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCadastrarSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVincularDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarVinculos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVincularDoencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVincularDoencaActionPerformed
        LinkDS tdds = new LinkDS(this);
        this.setVisible(false);
        tdds.setVisible(true);
    }//GEN-LAST:event_btnVincularDoencaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnPesquisarDoencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarDoencaActionPerformed
        DiseaseSearch tpd = new DiseaseSearch(this);
        this.setVisible(false);
        tpd.setVisible(true);
    }//GEN-LAST:event_btnPesquisarDoencaActionPerformed

    private void btnPesquisarSintomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarSintomaActionPerformed
        SymptomSearch tps = new SymptomSearch(this);
        this.setVisible(false);
        tps.setVisible(true);
    }//GEN-LAST:event_btnPesquisarSintomaActionPerformed

    private void btnCadastrarDoencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarDoencaActionPerformed
        DiseaseRegistration tcd = new DiseaseRegistration(this);
        this.setVisible(false);
        tcd.setVisible(true);
    }//GEN-LAST:event_btnCadastrarDoencaActionPerformed

    private void btnCadastrarSintomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarSintomaActionPerformed
        SymptomRegistration tcs = new SymptomRegistration(this);
        this.setVisible(false);
        tcs.setVisible(true);
    }//GEN-LAST:event_btnCadastrarSintomaActionPerformed

    private void btnPesquisarVinculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarVinculosActionPerformed
        LinkSearch tvd = new LinkSearch(this);
        this.setVisible(false);
        tvd.setVisible(true);
    }//GEN-LAST:event_btnPesquisarVinculosActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarDoenca;
    private javax.swing.JButton btnCadastrarSintoma;
    private javax.swing.JButton btnPesquisarDoenca;
    private javax.swing.JButton btnPesquisarSintoma;
    private javax.swing.JButton btnPesquisarVinculos;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVincularDoenca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpanelBotoes;
    private javax.swing.JPanel jpanelTitulo;
    // End of variables declaration//GEN-END:variables
}
