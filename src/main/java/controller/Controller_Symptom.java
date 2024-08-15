package controller;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import model.Symptom;
import model.SymptomDAO;

public class Controller_Symptom {

    public static boolean addSymptom(String symptom_name, String symptom_desc) throws SQLException {
        if (symptom_name.isEmpty() || symptom_desc.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please, fill all the fields.");
            return false;
        } else if (symptom_name.length() > 100 || symptom_desc.length() > 300) {
            JOptionPane.showMessageDialog(null, "Please, provide fewer details in the fields.");
            return false;
        } else {
            Symptom symptom = new Symptom();
            symptom.setName(symptom_name);
            symptom.setDesc(symptom_desc);

            SymptomDAO.addSymptom(symptom);
            JOptionPane.showMessageDialog(null, "Symptom successfully registered!");
            return true;
        }
    }

    public static List<Symptom> searchSymptomByText(String name, int i) throws SQLException {
        return SymptomDAO.searchSymptomByText(name, i);
    }

    public static void deleteSymptom(int id) throws SQLException {
        SymptomDAO.deleteSymptom(id);
    }

    public static void updateSymptom(Symptom symptom) throws SQLException {
        SymptomDAO.updateSymptom(symptom);
    }

    public static boolean checkSymptom(String id) throws SQLException {
        return SymptomDAO.checkSymptom(id);
    }
}
