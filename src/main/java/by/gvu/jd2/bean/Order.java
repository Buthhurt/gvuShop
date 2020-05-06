package by.gvu.jd2.bean;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        if (status != order.status) return false;
        if (user != null ? !user.equals(order.user) : order.user != null) return false;
        if (productList != null ? !productList.equals(order.productList) : order.productList != null) return false;
        if (paymentMethod != null ? !paymentMethod.equals(order.paymentMethod) : order.paymentMethod != null)
            return false;
        if (address != null ? !address.equals(order.address) : order.address != null) return false;
        if (comment != null ? !comment.equals(order.comment) : order.comment != null) return false;
        return operator != null ? operator.equals(order.operator) : order.operator == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (productList != null ? productList.hashCode() : 0);
        result = 31 * result + (paymentMethod != null ? paymentMethod.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + status;
        return result;
    }
}
