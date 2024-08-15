package model;

import com.mycompany.util.DB_Connection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import javax.swing.table.DefaultTableModel;

public class Diseases_SymptomsDAO {

    public static void addDS(Diseases_Symptoms ds) throws SQLException {
        String sql = "INSERT INTO diseases_symptoms (symptom_id, disease_id) VALUES (?, ?)";
        try (Connection conn = DB_Connection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, ds.getSymptomId());
            stmt.setInt(2, ds.getDiseaseId());
            stmt.executeUpdate();
        }
    }

    public static void deleteDS(int ds_id) throws SQLException {
        String sql = "DELETE FROM diseases_symptoms WHERE ds_id = ?";
        try (Connection conn = DB_Connection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, ds_id);
            stmt.executeUpdate();
        }
    }

    public static boolean checkDS(int symptom, int disease) throws SQLException {
        try (Connection conn = DB_Connection.getConnection(); CallableStatement callableStatement
                = conn.prepareCall("{CALL CheckSymptomAndDisease(?, ?, ?)}")) {
            callableStatement.setInt(1, symptom);
            callableStatement.setInt(2, disease);
            callableStatement.registerOutParameter(3, Types.TINYINT);
            callableStatement.execute();

            boolean result = callableStatement.getBoolean(3);

            callableStatement.close();
            conn.close();

            return result;
        } catch (Exception E) {
            return false;
        }
    }

    public static void searchDS(String idString, DefaultTableModel modelo) throws SQLException {
        String sql = "SELECT ds.ds_id, diseases.disease_name AS Disease_name, "
                + "GROUP_CONCAT(symptoms.symptom_name SEPARATOR ', ') AS Symptoms "
                + "FROM diseases_symptoms ds "
                + "JOIN diseases ON ds.disease_id = diseases.disease_id "
                + "JOIN symptoms ON ds.symptom_id = symptoms.symptom_id "
                + "WHERE ds.ds_id = ? "
                + "GROUP BY ds.ds_id, diseases.disease_name";
        if (idString.isEmpty() == true) {
            idString = "0";
            sql = "SELECT ds.ds_id, disease.disease_name AS Disease_name, "
                    + "GROUP_CONCAT(symptoms.symptom_name SEPARATOR ', ') AS Symptoms "
                    + "FROM diseases_symptoms ds "
                    + "JOIN diseases ON ds.disease_id = diseases.disease_id "
                    + "JOIN symptoms ON ds.symptom_id = symptoms.symptom_id "
                    + "WHERE ds.ds_id LIKE '%' "
                    + "GROUP BY ds.ds_id, diseases.disease_name";
        }
        int idInt = Integer.parseInt(idString);

        try (Connection conn = DB_Connection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            if (idInt != 0) {
                stmt.setInt(1, idInt);
            }
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("ds_id");
                String diseaseName = rs.getString("disease_name");
                String symptoms = rs.getString("symptoms");
                modelo.addRow(new Object[]{id, diseaseName, symptoms});
            }
        }
    }
}
