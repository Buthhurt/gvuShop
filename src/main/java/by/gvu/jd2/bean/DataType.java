package by.gvu.jd2.bean;

import java.io.Serializable;

public class DataType implements Serializable {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DataType)) return false;

        DataType dataType = (DataType) o;

        if (id != dataType.id) return false;
        return name != null ? name.equals(dataType.name) : dataType.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
