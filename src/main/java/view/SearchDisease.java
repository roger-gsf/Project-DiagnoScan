package view;

import controller.Controller_Disease;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Disease;

public class SearchDisease extends javax.swing.JFrame {

    Menu menu;

    public SearchDisease(Menu menu) {
        initComponents();
        this.menu = menu;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jpnInput = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        lblText = new javax.swing.JLabel();
        btnAlter = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jScrollPaneData = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        rbtnId = new javax.swing.JRadioButton();
        rbtnName = new javax.swing.JRadioButton();
        jpnTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Disease research");

        jpnInput.setBackground(new java.awt.Color(90, 62, 43));

        btnDelete.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 0, 0));
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 8, 1, new java.awt.Color(0, 0, 0)));
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setFocusPainted(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
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

        txtSearch.setSelectedTextColor(new java.awt.Color(204, 255, 255));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        lblText.setBackground(new java.awt.Color(255, 255, 255));
        lblText.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 12)); // NOI18N
        lblText.setForeground(new java.awt.Color(0, 0, 0));
        lblText.setText("Search disease:");

        btnAlter.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 12)); // NOI18N
        btnAlter.setForeground(new java.awt.Color(0, 0, 0));
        btnAlter.setText("Alter");
        btnAlter.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 8, 1, new java.awt.Color(0, 0, 0)));
        btnAlter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlter.setFocusPainted(false);
        btnAlter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 0, 0));
        btnSearch.setText("Search");
        btnSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 8, 1, new java.awt.Color(0, 0, 0)));
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.setFocusPainted(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblData.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 12)); // NOI18N
        tblData.setForeground(new java.awt.Color(0, 0, 0));
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneData.setViewportView(tblData);

        rbtnId.setBackground(new java.awt.Color(90, 62, 43));
        buttonGroup.add(rbtnId);
        rbtnId.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 12)); // NOI18N
        rbtnId.setForeground(new java.awt.Color(0, 0, 0));
        rbtnId.setText("Id");
        rbtnId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnIdItemStateChanged(evt);
            }
        });
        rbtnId.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtnIdStateChanged(evt);
            }
        });

        rbtnName.setBackground(new java.awt.Color(90, 62, 43));
        buttonGroup.add(rbtnName);
        rbtnName.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 12)); // NOI18N
        rbtnName.setForeground(new java.awt.Color(0, 0, 0));
        rbtnName.setText("Name");
        rbtnName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnNameItemStateChanged(evt);
            }
        });
        rbtnName.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtnNameStateChanged(evt);
            }
        });
        rbtnName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNameActionPerformed(evt);
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
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnId, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnInputLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblText))
                    .addGroup(jpnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jpnInputLayout.createSequentialGroup()
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPaneData, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jpnInputLayout.createSequentialGroup()
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlter, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jpnInputLayout.setVerticalGroup(
            jpnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnInputLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnName)
                    .addComponent(rbtnId))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneData, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
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

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tblData.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Select a disease to delete", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Get the ID of the selected disease
        int disease_id = (int) tblData.getValueAt(selectedRow, 0);

        // Confirm the deletion
        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this disease?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            // Delete the disease using the DiseaseController
            try {
                Controller_Disease.deleteDisease(disease_id);
                JOptionPane.showMessageDialog(this, "Disease successfully deleted!");
                // Refresh the table after deletion
                searchDisease();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error deleting disease: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnAlterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterActionPerformed
        int selectedRow = tblData.getSelectedRow();
        if (selectedRow != -1) {
            int id = (int) tblData.getValueAt(selectedRow, 0);
            String name = (String) tblData.getValueAt(selectedRow, 1);
            String description = (String) tblData.getValueAt(selectedRow, 2);

            showEditDialog(id, name, description);
            searchDisease();
        } else {
            JOptionPane.showMessageDialog(this, "Select a symptom to edit.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        searchDisease();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void rbtnNameStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtnNameStateChanged

    }//GEN-LAST:event_rbtnNameStateChanged

    private void rbtnIdStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtnIdStateChanged

    }//GEN-LAST:event_rbtnIdStateChanged

    private void rbtnNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnNameItemStateChanged
        lblText.setText("Search disease by name:");
    }//GEN-LAST:event_rbtnNameItemStateChanged

    private void rbtnIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnIdItemStateChanged
        lblText.setText("Search disease by id:");
    }//GEN-LAST:event_rbtnIdItemStateChanged

    private void rbtnNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnNameActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchDisease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            new SearchDisease(new Menu()).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlter;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JScrollPane jScrollPaneData;
    private javax.swing.JPanel jpnInput;
    private javax.swing.JPanel jpnTitle;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton rbtnId;
    private javax.swing.JRadioButton rbtnName;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private JRadioButton getSelectedButton(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return (JRadioButton) button;
            }
        }
        return null;
    }

    private void searchDisease() {
        String text = (txtSearch.getText()).trim();
        int i = 0; // 0 == Name; 1 == Id;
        JRadioButton selectedRadioButton = getSelectedButton(buttonGroup);
        if (selectedRadioButton != null) {
            if (selectedRadioButton.getText().equals("Name")) {
                i = 0;
            } else if (selectedRadioButton.getText().equals("Id")) {
                i = 1;
            }

            try {
                List<Disease> diseases = Controller_Disease.searchDiseaseByText(text, i);
                DefaultTableModel model = (DefaultTableModel) tblData.getModel();
                model.setRowCount(0);  // Clear the table before adding the results

                for (Disease disease : diseases) {
                    model.addRow(new Object[]{disease.getId(), disease.getName(), disease.getDesc()});
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error searching diseases: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Select a radio button!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void showEditDialog(int id, String name, String description) {

        // Create the components
        JLabel idLabel = new JLabel("ID: " + id);
        JTextField diseaseField = new JTextField(name, 20);
        JTextField descriptionField = new JTextField(description, 20);
        JButton saveButton = new JButton("Save");
        JButton cancelButton = new JButton("Cancel");

        // Panel to organize the components
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(idLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Disease:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(diseaseField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Description:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(descriptionField, gbc);

        // Create the JOptionPane
        Object[] options = {saveButton, cancelButton};
        JOptionPane optionPane = new JOptionPane(panel, JOptionPane.PLAIN_MESSAGE, JOptionPane.DEFAULT_OPTION, null, options, null);

        // Create the JDialog
        JDialog dialog = optionPane.createDialog("Editing disease: " + name);

        // Action for the Save button
        saveButton.addActionListener((ActionEvent e) -> {
            // Logic to update the information
            String newDiseaseName = diseaseField.getText();
            String newDescription = descriptionField.getText();
            
            Disease disease = new Disease();
            disease.setId(id);  // Set the ID of the disease to be updated
            disease.setName(newDiseaseName);
            disease.setDesc(newDescription);
            
            try {
                Controller_Disease.updateDisease(disease);
                JOptionPane.showMessageDialog(dialog, "Disease updated successfully!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(dialog, "Error updating disease: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            dialog.dispose();
        });

        // Action for the Cancel button
        cancelButton.addActionListener((ActionEvent e) -> {
            dialog.dispose();
        });

        // Display the dialog
        dialog.setVisible(true);
    }

}
