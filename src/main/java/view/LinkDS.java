package view;

import controller.Controller_DS;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class LinkDS extends javax.swing.JFrame {

    Menu menu;

    public LinkDS(Menu menu) {
        initComponents();
        this.menu = menu;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupDisease = new javax.swing.ButtonGroup();
        buttonGroupSymptom = new javax.swing.ButtonGroup();
        jpnInput = new javax.swing.JPanel();
        lblDisease = new javax.swing.JLabel();
        txtDisease = new javax.swing.JTextField();
        rbtnDiseaseName = new javax.swing.JRadioButton();
        rbtnDiseaseId = new javax.swing.JRadioButton();
        lblSymptom = new javax.swing.JLabel();
        txtSymptom = new javax.swing.JTextField();
        rbtnSymptomName = new javax.swing.JRadioButton();
        rbtnSymptomId = new javax.swing.JRadioButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jpnTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Link disease & symptom");

        jpnInput.setBackground(new java.awt.Color(90, 62, 43));

        lblDisease.setBackground(new java.awt.Color(255, 255, 255));
        lblDisease.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 12)); // NOI18N
        lblDisease.setForeground(new java.awt.Color(0, 0, 0));
        lblDisease.setText("Enter the disease name:");

        txtDisease.setSelectedTextColor(new java.awt.Color(204, 255, 255));

        rbtnDiseaseName.setBackground(new java.awt.Color(90, 62, 43));
        buttonGroupDisease.add(rbtnDiseaseName);
        rbtnDiseaseName.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 12)); // NOI18N
        rbtnDiseaseName.setForeground(new java.awt.Color(0, 0, 0));
        rbtnDiseaseName.setText("Name");

        rbtnDiseaseId.setBackground(new java.awt.Color(90, 62, 43));
        buttonGroupDisease.add(rbtnDiseaseId);
        rbtnDiseaseId.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 12)); // NOI18N
        rbtnDiseaseId.setForeground(new java.awt.Color(0, 0, 0));
        rbtnDiseaseId.setText("Id");
        rbtnDiseaseId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnDiseaseIdItemStateChanged(evt);
            }
        });

        lblSymptom.setBackground(new java.awt.Color(255, 255, 255));
        lblSymptom.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 12)); // NOI18N
        lblSymptom.setForeground(new java.awt.Color(0, 0, 0));
        lblSymptom.setText("Enter the symptom name:");

        txtSymptom.setSelectedTextColor(new java.awt.Color(204, 255, 255));

        rbtnSymptomName.setBackground(new java.awt.Color(90, 62, 43));
        buttonGroupSymptom.add(rbtnSymptomName);
        rbtnSymptomName.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 12)); // NOI18N
        rbtnSymptomName.setForeground(new java.awt.Color(0, 0, 0));
        rbtnSymptomName.setText("Name");

        rbtnSymptomId.setBackground(new java.awt.Color(90, 62, 43));
        buttonGroupSymptom.add(rbtnSymptomId);
        rbtnSymptomId.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 12)); // NOI18N
        rbtnSymptomId.setForeground(new java.awt.Color(0, 0, 0));
        rbtnSymptomId.setText("Id");
        rbtnSymptomId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnSymptomIdItemStateChanged(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 0, 0));
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 8, 1, new java.awt.Color(0, 0, 0)));
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.setFocusPainted(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 0, 0));
        btnCancel.setText("Cancel");
        btnCancel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 8, 1, new java.awt.Color(0, 0, 0)));
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.setFocusPainted(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnInputLayout = new javax.swing.GroupLayout(jpnInput);
        jpnInput.setLayout(jpnInputLayout);
        jpnInputLayout.setHorizontalGroup(
            jpnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnInputLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jpnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnInputLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnInputLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jpnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDisease)
                            .addComponent(lblSymptom)))
                    .addGroup(jpnInputLayout.createSequentialGroup()
                        .addGroup(jpnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpnInputLayout.createSequentialGroup()
                                .addComponent(txtSymptom, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbtnSymptomName))
                            .addGroup(jpnInputLayout.createSequentialGroup()
                                .addComponent(txtDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbtnDiseaseName)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rbtnDiseaseId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbtnSymptomId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jpnInputLayout.setVerticalGroup(
            jpnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnInputLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblDisease)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDisease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnDiseaseId)
                    .addComponent(rbtnDiseaseName))
                .addGap(31, 31, 31)
                .addComponent(lblSymptom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSymptom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnSymptomId)
                    .addComponent(rbtnSymptomName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jpnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jpnTitle.setBackground(new java.awt.Color(1, 106, 67));

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Franklin Gothic Heavy", 3, 48)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Diagno Scan");
        lblTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        javax.swing.GroupLayout jpnTitleLayout = new javax.swing.GroupLayout(jpnTitle);
        jpnTitle.setLayout(jpnTitleLayout);
        jpnTitleLayout.setHorizontalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
        );
        jpnTitleLayout.setVerticalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
            .addGroup(jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnTitleLayout.createSequentialGroup()
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void rbtnDiseaseIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnDiseaseIdItemStateChanged
        lblDisease.setText("Enter the disease id:");
    }//GEN-LAST:event_rbtnDiseaseIdItemStateChanged

    private void rbtnSymptomIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnSymptomIdItemStateChanged
        lblSymptom.setText("Enter the symptom id:");
    }//GEN-LAST:event_rbtnSymptomIdItemStateChanged

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            String diseaseInput = txtDisease.getText().trim();
            String symptomInput = txtSymptom.getText().trim();

            if (diseaseInput.isEmpty() || symptomInput.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all fields", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String diseaseType = getSelectedButtonText(buttonGroupDisease);
            String symptomType = getSelectedButtonText(buttonGroupSymptom);

            if (diseaseType == null || symptomType == null) {
                JOptionPane.showMessageDialog(null, "Please select whether you want to use the name or ID for both disease and symptom.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            boolean isDiseaseId = diseaseType.equals("Id");
            boolean isSymptomId = symptomType.equals("Id");

            if (isDiseaseId && !isNumeric(diseaseInput)) {
                JOptionPane.showMessageDialog(null, "Invalid input for disease ID. Please enter a number.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (isSymptomId && !isNumeric(symptomInput)) {
                JOptionPane.showMessageDialog(null, "Invalid input for symptom ID. Please enter a number.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (Controller_DS.addDiseases_Symptoms(diseaseInput, isDiseaseId, symptomInput, isSymptomId)) {
                JOptionPane.showMessageDialog(null, "Link successfully created", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "An error occurred while creating the link. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            Logger.getLogger(LinkDS.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

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
        } catch (ClassNotFoundException
                | InstantiationException
                | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LinkDS.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LinkDS(new Menu()).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroupDisease;
    private javax.swing.ButtonGroup buttonGroupSymptom;
    private javax.swing.JPanel jpnInput;
    private javax.swing.JPanel jpnTitle;
    private javax.swing.JLabel lblDisease;
    private javax.swing.JLabel lblSymptom;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton rbtnDiseaseId;
    private javax.swing.JRadioButton rbtnDiseaseName;
    private javax.swing.JRadioButton rbtnSymptomId;
    private javax.swing.JRadioButton rbtnSymptomName;
    private javax.swing.JTextField txtDisease;
    private javax.swing.JTextField txtSymptom;
    // End of variables declaration//GEN-END:variables

    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }
}
