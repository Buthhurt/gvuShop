package by.gvu.jd2.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class UserToken implements Serializable {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserToken)) return false;

        UserToken userToken = (UserToken) o;

        if (id != userToken.id) return false;
        return nName != null ? nName.equals(userToken.nName) : userToken.nName == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nName != null ? nName.hashCode() : 0);
        return result;
    }
}
