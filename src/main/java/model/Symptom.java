package model;

public class Symptom {

    private int symptom_id;
    private String symptom_name;
    private String symptom_desc;

    public int getId() {
        return symptom_id;
    }

    public String getName() {
        return symptom_name;
    }

    public String getDesc() {
        return symptom_desc;
    }

    public void setId(int symptom_id) {
        this.symptom_id = symptom_id;
    }

    public void setName(String symptom_name) {
        this.symptom_name = symptom_name;
    }

    public void setDesc(String symptom_desc) {
        this.symptom_desc = symptom_desc;
    }
}
