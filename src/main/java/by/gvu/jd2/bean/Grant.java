package by.gvu.jd2.bean;

import java.io.Serializable;

public class Grant implements Serializable {
    private int id;
    private String name = null;

    public Grant() {
    }

    public Grant(int id, String name) {
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
        if (!(o instanceof Grant)) return false;

        Grant grant = (Grant) o;

        if (id != grant.id) return false;
        return name != null ? name.equals(grant.name) : grant.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
