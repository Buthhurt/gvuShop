package by.gvu.jd2.bean;

public class DataType {
    private int id;
    private String name = null;

    public DataType() {
    }

    public DataType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
