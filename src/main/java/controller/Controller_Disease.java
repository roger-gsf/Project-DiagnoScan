package controller;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import model.Disease;
import model.DiseaseDAO;
import model.Symptom;
import model.SymptomDAO;

public class Controller_Disease {

    public static boolean addDisease(String name, String description) throws SQLException {
        if (name.isEmpty() || description.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please, fill all the fields.");
            return false;
        } else if (name.length() > 100 || description.length() > 300) {
            JOptionPane.showMessageDialog(null, "Please, provide fewer details in the fields.");
            return false;
        } else {
            Disease disease = new Disease();
            disease.setName(name);
            disease.setDesc(description);

            DiseaseDAO.addDisease(disease);
            JOptionPane.showMessageDialog(null, "Disease successfully registered!");
            return true;
        }
    }

    public static List<Disease> searchDiseaseByText(String name, int i) throws SQLException {
        return DiseaseDAO.searchDiseaseByText(name, i);
    }

    public static boolean checkDisease(String id) throws SQLException {
        return DiseaseDAO.checkDisease(id);
    }

    public static void deleteDisease(int id) throws SQLException {
        DiseaseDAO.deleteDisease(id);
    }

    public static void updateDisease(Disease disease) throws SQLException {
        DiseaseDAO.updateDisease(disease);
    }
}
