package controller;

import com.mycompany.util.DB_Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Diseases_Symptoms;
import model.Diseases_SymptomsDAO;
import javax.swing.table.DefaultTableModel;

public class Controller_DS {

    public static boolean addDiseases_Symptoms(String disease, boolean isDiseaseId, String symptom, boolean isSymptomId) throws SQLException {
        if (disease.isEmpty() || symptom.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please, fill all the fields.");
            return false;
        } else {
            Diseases_Symptoms ds = new Diseases_Symptoms();

            try {
                if (isDiseaseId) {
                    ds.setDiseaseId(Integer.parseInt(disease));
                } else {
                    ds.setDiseaseId(getDiseaseIdByName(disease));
                }

                if (isSymptomId) {
                    ds.setSymptomId(Integer.parseInt(symptom));
                } else {
                    ds.setSymptomId(getSymptomIdByName(symptom));
                }

                Diseases_SymptomsDAO.addDS(ds);
                return true;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid ID format. Please enter numeric values for IDs.", "Warning", JOptionPane.WARNING_MESSAGE);
                return false;
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
    }

    private static int getDiseaseIdByName(String name) throws SQLException {
        String query = "SELECT disease_id FROM diseases WHERE disease_name = ?";
        try (java.sql.Connection conn = DB_Connection.getConnection(); java.sql.PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            try (java.sql.ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("disease_id");
                } else {
                    throw new SQLException("Disease name not found: " + name);
                }
            }
        }
    }

    private static int getSymptomIdByName(String name) throws SQLException {
        String query = "SELECT symptom_id FROM symptoms WHERE symptom_name = ?";
        try (java.sql.Connection conn = DB_Connection.getConnection(); java.sql.PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            try (java.sql.ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("symptom_id");
                } else {
                    throw new SQLException("Symptom name not found: " + name);
                }
            }
        }
    }

    public static void deleteDS(int id) throws SQLException {
        Diseases_SymptomsDAO.deleteDS(id);
    }

    public static boolean checkDS(int symptom, int disease) throws SQLException {
        return Diseases_SymptomsDAO.checkDS(symptom, disease);
    }

    public static void searchDS(String idString, DefaultTableModel model) throws SQLException {
        Diseases_SymptomsDAO.searchDS(idString, model);
    }
}
