package by.gvu.jd2.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class UserForm implements Serializable {
    private String login = null;
    private String password = null;
    private String passwordConfirm = null;
    private String email = null;
    private String fName = null;
    private String sName = null;
    private String nName = null;
    private int sexId = -1;
    private Timestamp birthday = null;

    public UserForm() {
    }

    public UserForm(String login, String password, String passwordConfirm, String email, String fName, String sName, String nName, int sexId, Timestamp birthday) {
        this.login = login;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
        this.email = email;
        this.fName = fName;
        this.sName = sName;
        this.nName = nName;
        this.sexId = sexId;
        this.birthday = birthday;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public boolean isSet() {
        return
                this.login != null ||
                        this.password != null ||
                        this.passwordConfirm != null ||
                        this.email != null ||
                        this.fName != null ||
                        this.sName != null ||
                        this.nName != null ||
                        this.sexId != -1 ||
                        this.birthday != null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserForm)) return false;

        UserForm userForm = (UserForm) o;

        if (sexId != userForm.sexId) return false;
        if (login != null ? !login.equals(userForm.login) : userForm.login != null) return false;
        if (password != null ? !password.equals(userForm.password) : userForm.password != null) return false;
        if (passwordConfirm != null ? !passwordConfirm.equals(userForm.passwordConfirm) : userForm.passwordConfirm != null)
            return false;
        if (email != null ? !email.equals(userForm.email) : userForm.email != null) return false;
        if (fName != null ? !fName.equals(userForm.fName) : userForm.fName != null) return false;
        if (sName != null ? !sName.equals(userForm.sName) : userForm.sName != null) return false;
        if (nName != null ? !nName.equals(userForm.nName) : userForm.nName != null) return false;
        return birthday != null ? birthday.equals(userForm.birthday) : userForm.birthday == null;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (passwordConfirm != null ? passwordConfirm.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (fName != null ? fName.hashCode() : 0);
        result = 31 * result + (sName != null ? sName.hashCode() : 0);
        result = 31 * result + (nName != null ? nName.hashCode() : 0);
        result = 31 * result + sexId;
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        return result;
    }
}
