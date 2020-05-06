package by.gvu.jd2.bean;

import java.io.Serializable;

public class PaymentMethod implements Serializable {
    private int id;
    private UserForm user = null;
    private String cardNumber = null;
    private String cardFirstName = null;
    private String cardSecondName = null;
    private int cardCvs;
    private UserForm userHistory = null;

    public PaymentMethod() {
    }

    public PaymentMethod(int id, UserForm user, String cardNumber, String cardFirstName, String cardSecondName, int cardCvs, UserForm userHistory) {
        this.id = id;
        this.user = user;
        this.cardNumber = cardNumber;
        this.cardFirstName = cardFirstName;
        this.cardSecondName = cardSecondName;
        this.cardCvs = cardCvs;
        this.userHistory = userHistory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserForm getUser() {
        return user;
    }

    public void setUser(UserForm user) {
        this.user = user;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardFirstName() {
        return cardFirstName;
    }

    public void setCardFirstName(String cardFirstName) {
        this.cardFirstName = cardFirstName;
    }

    public String getCardSecondName() {
        return cardSecondName;
    }

    public void setCardSecondName(String cardSecondName) {
        this.cardSecondName = cardSecondName;
    }

    public int getCardCvs() {
        return cardCvs;
    }

    public void setCardCvs(int cardCvs) {
        this.cardCvs = cardCvs;
    }

    public UserForm getUserHistory() {
        return userHistory;
    }

    public void setUserHistory(UserForm userHistory) {
        this.userHistory = userHistory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PaymentMethod)) return false;

        PaymentMethod that = (PaymentMethod) o;

        if (id != that.id) return false;
        if (cardCvs != that.cardCvs) return false;
        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        if (cardNumber != null ? !cardNumber.equals(that.cardNumber) : that.cardNumber != null) return false;
        if (cardFirstName != null ? !cardFirstName.equals(that.cardFirstName) : that.cardFirstName != null)
            return false;
        if (cardSecondName != null ? !cardSecondName.equals(that.cardSecondName) : that.cardSecondName != null)
            return false;
        return userHistory != null ? userHistory.equals(that.userHistory) : that.userHistory == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (cardNumber != null ? cardNumber.hashCode() : 0);
        result = 31 * result + (cardFirstName != null ? cardFirstName.hashCode() : 0);
        result = 31 * result + (cardSecondName != null ? cardSecondName.hashCode() : 0);
        result = 31 * result + cardCvs;
        result = 31 * result + (userHistory != null ? userHistory.hashCode() : 0);
        return result;
    }
}
