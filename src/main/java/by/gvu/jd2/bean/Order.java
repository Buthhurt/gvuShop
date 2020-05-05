package by.gvu.jd2.bean;

import java.util.List;

public class Order {
    private int id;
    private UserForm user = null;
    private List<Product> productList = null;
    private PaymentMethod paymentMethod = null;
    private Address address = null;
    private String comment = null;
    private UserForm operator = null;
    private int status;

    public Order() {
    }

    public Order(int id, UserForm user, List<Product> productList, PaymentMethod paymentMethod, Address address, String comment, UserForm operator, int status) {
        this.id = id;
        this.user = user;
        this.productList = productList;
        this.paymentMethod = paymentMethod;
        this.address = address;
        this.comment = comment;
        this.operator = operator;
        this.status = status;
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

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public UserForm getOperator() {
        return operator;
    }

    public void setOperator(UserForm operator) {
        this.operator = operator;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
