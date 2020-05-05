package by.gvu.jd2.bean;

import java.sql.Timestamp;

public class UserToken {
    private int id = -1;
    private String nName = null;

    public UserToken() {
    }

    public UserToken(int id, String nName) {
        this.id = id;
        this.nName = nName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getnName() {
        return nName;
    }

    public void setnName(String nName) {
        this.nName = nName;
    }
}
