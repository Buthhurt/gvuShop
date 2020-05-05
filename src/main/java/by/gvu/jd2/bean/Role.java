package by.gvu.jd2.bean;

import java.util.List;

public class Role {
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
}
