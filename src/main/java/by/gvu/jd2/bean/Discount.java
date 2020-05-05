package by.gvu.jd2.bean;

import by.gvu.jd2.bean.CatalogInfo;

import java.sql.Timestamp;
import java.util.List;

public class Discount {
    private int id;
    private List<Product> productList = null;
    private Timestamp dateFrom = null;
    private Timestamp dateTo = null;
    private double value;

    public Discount() {
    }

    public Discount(int id, List<Product> productList, Timestamp dateFrom, Timestamp dateTo, double value) {
        this.id = id;
        this.productList = productList;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Timestamp getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Timestamp dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Timestamp getDateTo() {
        return dateTo;
    }

    public void setDateTo(Timestamp dateTo) {
        this.dateTo = dateTo;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
