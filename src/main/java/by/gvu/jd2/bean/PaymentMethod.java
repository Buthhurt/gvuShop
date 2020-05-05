package by.gvu.jd2.bean;

public class PaymentMethod {
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
}
