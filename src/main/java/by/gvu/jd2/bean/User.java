package by.gvu.jd2.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class User implements Serializable {
    private int id = -1;
    private String login = null;
    private String psw_sha3 = null;
    private String psw_md5 = null;
    private String email = null;
    private Role role = null;
    private String fName = null;
    private String sName = null;
    private String nName = null;
    private int sexId = -1;
    private Timestamp birthday = null;

    public User() {
    }

    public User(int id, String login, String psw_sha3, String psw_md5, String email, Role role, String fName, String sName, String nName, int sexId, Timestamp birthday) {
        this.id = id;
        this.login = login;
        this.psw_sha3 = psw_sha3;
        this.psw_md5 = psw_md5;
        this.email = email;
        this.role = role;
        this.fName = fName;
        this.sName = sName;
        this.nName = nName;
        this.sexId = sexId;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPsw_sha3() {
        return psw_sha3;
    }

    public void setPsw_sha3(String psw_sha3) {
        this.psw_sha3 = psw_sha3;
    }

    public String getPsw_md5() {
        return psw_md5;
    }

    public void setPsw_md5(String psw_md5) {
        this.psw_md5 = psw_md5;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getnName() {
        return nName;
    }

    public void setnName(String nName) {
        this.nName = nName;
    }

    public int getSexId() {
        return sexId;
    }

    public void setSexId(int sexId) {
        this.sexId = sexId;
    }

    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    public boolean isEmpty(){
        return
                id==-1 &&
                psw_md5 == null &&
                psw_sha3 ==null &&
                email == null &&
                role == null &&
                fName == null &&
                sName == null &&
                nName == null &&
                sexId == -1 &&
                birthday == null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (sexId != user.sexId) return false;
        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        if (psw_sha3 != null ? !psw_sha3.equals(user.psw_sha3) : user.psw_sha3 != null) return false;
        if (psw_md5 != null ? !psw_md5.equals(user.psw_md5) : user.psw_md5 != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (role != null ? !role.equals(user.role) : user.role != null) return false;
        if (fName != null ? !fName.equals(user.fName) : user.fName != null) return false;
        if (sName != null ? !sName.equals(user.sName) : user.sName != null) return false;
        if (nName != null ? !nName.equals(user.nName) : user.nName != null) return false;
        return birthday != null ? birthday.equals(user.birthday) : user.birthday == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (psw_sha3 != null ? psw_sha3.hashCode() : 0);
        result = 31 * result + (psw_md5 != null ? psw_md5.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (fName != null ? fName.hashCode() : 0);
        result = 31 * result + (sName != null ? sName.hashCode() : 0);
        result = 31 * result + (nName != null ? nName.hashCode() : 0);
        result = 31 * result + sexId;
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        return result;
    }
}
