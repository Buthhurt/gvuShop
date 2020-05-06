package by.gvu.jd2.bean;

import java.io.Serializable;
import java.util.List;

public class Role implements Serializable {
    private int id;
    private String name = null;
    private List<Grant> grantList = null;

    public Role() {
    }

    public Role(int id) {
        this.id = id;
    }

    public Role(int id, String name, List<Grant> grantList) {
        this.id = id;
        this.name = name;
        this.grantList = grantList;
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

    public List<Grant> getGrantList() {
        return grantList;
    }

    public void setGrantList(List<Grant> grantList) {
        this.grantList = grantList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Role)) return false;

        Role role = (Role) o;

        if (id != role.id) return false;
        if (name != null ? !name.equals(role.name) : role.name != null) return false;
        return grantList != null ? grantList.equals(role.grantList) : role.grantList == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (grantList != null ? grantList.hashCode() : 0);
        return result;
    }
}
