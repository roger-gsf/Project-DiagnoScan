package view;

import controller.Controller_Symptom;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import model.Symptom;

public class SymptomSearch extends javax.swing.JFrame {

    public void searchSymptoms() {

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
                List<Symptom> symptoms = Controller_Symptom.searchSymptomByText(text, i);
                DefaultTableModel model = (DefaultTableModel) tblData.getModel();
                model.setRowCount(0);  // Clears the table before adding the results

                for (Symptom symptom : symptoms) {
                    model.addRow(new Object[]{symptom.getId(), symptom.getName(), symptom.getDesc()});
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error searching symptoms: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Please select a radio button!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    Menu menu;

    public SymptomSearch(Menu menu) {
        initComponents();
        this.menu = menu;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jpbInput = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        lblSymptom = new javax.swing.JLabel();
        btnAlter = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jScrollPaneData = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        rbtnSymptomId = new javax.swing.JRadioButton();
        rbtnSymptomName = new javax.swing.JRadioButton();
        jpnTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Pesquisar sintoma");

        jpbInput.setBackground(new java.awt.Color(90, 62, 43));

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

        lblSymptom.setBackground(new java.awt.Color(255, 255, 255));
        lblSymptom.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 12)); // NOI18N
        lblSymptom.setForeground(new java.awt.Color(0, 0, 0));
        lblSymptom.setText("Search for symptom name:");

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

        tblData.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
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

        rbtnSymptomId.setBackground(new java.awt.Color(90, 62, 43));
        buttonGroup.add(rbtnSymptomId);
        rbtnSymptomId.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 12)); // NOI18N
        rbtnSymptomId.setForeground(new java.awt.Color(0, 0, 0));
        rbtnSymptomId.setText("Id");
        rbtnSymptomId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnSymptomIdItemStateChanged(evt);
            }
        });
        rbtnSymptomId.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtnSymptomIdStateChanged(evt);
            }
        });

        rbtnSymptomName.setBackground(new java.awt.Color(90, 62, 43));
        buttonGroup.add(rbtnSymptomName);
        rbtnSymptomName.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 12)); // NOI18N
        rbtnSymptomName.setForeground(new java.awt.Color(0, 0, 0));
        rbtnSymptomName.setText("Name");
        rbtnSymptomName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnSymptomNameItemStateChanged(evt);
            }
        });
        rbtnSymptomName.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtnSymptomNameStateChanged(evt);
            }
        });
        rbtnSymptomName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSymptomNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpbInputLayout = new javax.swing.GroupLayout(jpbInput);
        jpbInput.setLayout(jpbInputLayout);
        jpbInputLayout.setHorizontalGroup(
            jpbInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpbInputLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jpbInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpbInputLayout.createSequentialGroup()
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlter, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpbInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jpbInputLayout.createSequentialGroup()
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPaneData, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(jpbInputLayout.createSequentialGroup()
                            .addGroup(jpbInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblSymptom, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbtnSymptomName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbtnSymptomId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jpbInputLayout.setVerticalGroup(
            jpbInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpbInputLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblSymptom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpbInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnSymptomName)
                    .addComponent(rbtnSymptomId))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneData, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpbInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpbInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jpnTitle.setBackground(new java.awt.Color(1, 106, 67));

        lblTitle.setBackground(new java.awt.Color(1, 106, 67));
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
                .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE))
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
            .addComponent(jpbInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jpbInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tblData.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a symptom to delete", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

// Get the ID of the selected symptom
        int symptom_id = (int) tblData.getValueAt(selectedRow, 0);

// Confirm the deletion
        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this symptom?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            // Delete the symptom using the SymptomController
            try {
                Controller_Symptom.deleteSymptom(symptom_id);
                JOptionPane.showMessageDialog(this, "Symptom deleted successfully!");
                // Refresh the table after deletion
                searchSymptoms();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error deleting symptom: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
            int symptom_id = (int) tblData.getValueAt(selectedRow, 0);
            String symptom_name = (String) tblData.getValueAt(selectedRow, 1);
            String symptom_desc = (String) tblData.getValueAt(selectedRow, 2);

            alterDialog(symptom_id, symptom_name, symptom_desc);
            searchSymptoms();
        } else {
            JOptionPane.showMessageDialog(this, "Select a symptom to alter.", "Advice", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        searchSymptoms();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void rbtnSymptomIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnSymptomIdItemStateChanged
        lblSymptom.setText("Search by symptom id:");
    }//GEN-LAST:event_rbtnSymptomIdItemStateChanged

    private void rbtnSymptomIdStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtnSymptomIdStateChanged

    }//GEN-LAST:event_rbtnSymptomIdStateChanged

    private void rbtnSymptomNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnSymptomNameItemStateChanged
        lblSymptom.setText("Search by symptom name:");
    }//GEN-LAST:event_rbtnSymptomNameItemStateChanged

    private void rbtnSymptomNameStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtnSymptomNameStateChanged

    }//GEN-LAST:event_rbtnSymptomNameStateChanged

    private void rbtnSymptomNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSymptomNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnSymptomNameActionPerformed

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
            java.util.logging.Logger.getLogger(SymptomSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SymptomSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SymptomSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SymptomSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SymptomSearch(new Menu()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlter;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JScrollPane jScrollPaneData;
    private javax.swing.JPanel jpbInput;
    private javax.swing.JPanel jpnTitle;
    private javax.swing.JLabel lblSymptom;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton rbtnSymptomId;
    private javax.swing.JRadioButton rbtnSymptomName;
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

    private static void alterDialog(int id, String name, String description) {

        // Creating components
        JLabel idLabel = new JLabel("ID: " + id);
        JTextField symptomField = new JTextField(name, 20);
        JTextField descriptionField = new JTextField(description, 20);
        JButton saveButton = new JButton("Save");
        JButton cancelButton = new JButton("Cancel");

        // Panel to organize components
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(idLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Symptom:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(symptomField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Description:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(descriptionField, gbc);

        // Creating JOptionPane
        Object[] options = {saveButton, cancelButton};
        JOptionPane optionPane = new JOptionPane(panel, JOptionPane.PLAIN_MESSAGE, JOptionPane.DEFAULT_OPTION, null, options, null);

        // Creating JDialog
        JDialog dialog = optionPane.createDialog("Editing symptom: " + name);

        // Save button action
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic to update the information
                String newSymptom = symptomField.getText();
                String newDescription = descriptionField.getText();

                Symptom symptom = new Symptom();
                symptom.setId(id);  // Set the ID of the symptom to be updated
                symptom.setName(newSymptom);
                symptom.setDesc(newDescription);

                try {
                    Controller_Symptom.updateSymptom(symptom);
                    JOptionPane.showMessageDialog(dialog, "Symptom updated successfully!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(dialog, "Error updating symptom: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }

                dialog.dispose();
            }
        });

        // Cancel button action
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });

        // Displaying the dialog
        dialog.setVisible(true);
    }
}
