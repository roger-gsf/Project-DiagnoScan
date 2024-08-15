package model;

public class Diseases_Symptoms {

    private int ds_id;
    private int symptom_id;
    private int disease_id;

    public int getIdDs() {
        return this.ds_id;
    }

    public void setIdDoencas_Sintomas(int ds_id) {
        this.ds_id = ds_id;
    }

    public int getSymptomId() {
        return this.symptom_id;
    }

    public void setSymptomId(int symptom_id) {
        this.symptom_id = symptom_id;
    }

    public int getDiseaseId() {
        return this.disease_id;
    }

    public void setDiseaseId(int disease_id) {
        this.disease_id = disease_id;
    }
}
