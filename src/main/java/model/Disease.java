package model;

public class Disease {

    private int disease_id;
    private String disease_name;
    private String disease_desc;

    public int getId() {
        return disease_id;
    }

    public String getName() {
        return disease_name;
    }

    public String getDesc() {
        return disease_desc;
    }

    public void setId(int disease_id) {
        this.disease_id = disease_id;
    }

    public void setName(String disease_name) {
        this.disease_name = disease_name;
    }

    public void setDesc(String disease_desc) {
        this.disease_desc = disease_desc;
    }
}
