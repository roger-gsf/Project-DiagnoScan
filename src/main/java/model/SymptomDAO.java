package model;

import com.mycompany.util.DB_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SymptomDAO {

    public static void addSymptom(Symptom symptom) throws SQLException {
        String sql = "INSERT INTO symptoms (symptom_name, symptom_desc) VALUES (?, ?)";
        try (Connection conn = DB_Connection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, symptom.getName());
            stmt.setString(2, symptom.getDesc());
            stmt.executeUpdate();
        }
    }

    public static List<Symptom> searchSymptomByText(String text, int i) throws SQLException {
        String column = "";
        if (i == 0) {
            column = "symptom_name";
        } else if (i == 1) {
            column = "symptom_id";
        }
        String sql = "SELECT * FROM symptoms WHERE " + column + " LIKE ?";
        try (Connection conn = DB_Connection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + text + "%");
            ResultSet rs = stmt.executeQuery();

            List<Symptom> symptoms = new ArrayList<>();
            while (rs.next()) {
                Symptom symptom = new Symptom();
                symptom.setId(rs.getInt("symptom_id"));
                symptom.setName(rs.getString("symptom_name"));
                symptom.setDesc(rs.getString("symptom_desc"));
                symptoms.add(symptom);
            }
            return symptoms;
        }
    }

    public static void deleteSymptom(int id) throws SQLException {
        String sql = "DELETE FROM symptoms WHERE symptom_id = ?";
        try (Connection conn = DB_Connection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    public static void updateSymptom(Symptom symptom) throws SQLException {
        String sql = "UPDATE symptoms SET symptom_name = ?, symptom_desc = ? WHERE symptom_id = ?";
        try (Connection conn = DB_Connection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, symptom.getName());
            stmt.setString(2, symptom.getDesc());
            stmt.setInt(3, symptom.getId());
            stmt.executeUpdate();
        }
    }

    public static boolean checkSymptom(String id) throws SQLException {
        String sql = "SELECT * FROM symptoms WHERE symptom_id LIKE ?";
        try (Connection conn = DB_Connection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            int idInt = Integer.parseInt(id);
            stmt.setInt(1, idInt);
            ResultSet rs = stmt.executeQuery();
            int supposedId = 0;
            supposedId = (rs.getInt("disease_id"));
            return supposedId != -1;
        } catch (Exception e) {
            return false;
        }
    }
}
