package model;

import com.mycompany.util.DB_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DiseaseDAO {

    public static void addDisease(Disease disease) throws SQLException {
        String sql = "INSERT INTO diseases (disease_name, disease_desc) VALUES (?, ?)";
        try (Connection conn = DB_Connection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, disease.getName());
            stmt.setString(2, disease.getDesc());
            stmt.executeUpdate();
        }
    }

    public static List<Disease> searchDiseaseByText(String text, int i) throws SQLException {
        String column = "";
        if (i == 0) {
            column = "disease_name";
        } else if (i == 1) {
            column = "disease_id";
        }
        String sql = "SELECT * FROM diseases WHERE " + column + " LIKE ?";
        try (Connection conn = DB_Connection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + text + "%");
            ResultSet rs = stmt.executeQuery();

            List<Disease> diseases = new ArrayList<>();
            while (rs.next()) {
                Disease disease = new Disease();
                disease.setId(rs.getInt("disease_id"));
                disease.setName(rs.getString("disease_name"));
                disease.setDesc(rs.getString("disease_desc"));
                diseases.add(disease);
            }
            return diseases;
        }
    }

    public static void deleteDisease(int id) throws SQLException {
        String sql = "DELETE FROM diseases WHERE disease_id = ?";
        try (Connection conn = DB_Connection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    public static void updateDisease(Disease disease) throws SQLException {
        String sql = "UPDATE diseases SET disease_name = ?, disease_desc = ? WHERE disease_id = ?";
        try (Connection conn = DB_Connection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, disease.getName());
            stmt.setString(2, disease.getDesc());
            stmt.setInt(3, disease.getId());
            stmt.executeUpdate();
        }
    }

    public static boolean checkDisease(String id) throws SQLException {
        String sql = "SELECT * FROM diseases WHERE disease_id LIKE ?";
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
