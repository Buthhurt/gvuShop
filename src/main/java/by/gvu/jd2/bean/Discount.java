package by.gvu.jd2.bean;

import by.gvu.jd2.bean.CatalogInfo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class Discount implements Serializable {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Discount)) return false;

        Discount discount = (Discount) o;

        if (id != discount.id) return false;
        if (Double.compare(discount.value, value) != 0) return false;
        if (productList != null ? !productList.equals(discount.productList) : discount.productList != null)
            return false;
        if (dateFrom != null ? !dateFrom.equals(discount.dateFrom) : discount.dateFrom != null) return false;
        return dateTo != null ? dateTo.equals(discount.dateTo) : discount.dateTo == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (productList != null ? productList.hashCode() : 0);
        result = 31 * result + (dateFrom != null ? dateFrom.hashCode() : 0);
        result = 31 * result + (dateTo != null ? dateTo.hashCode() : 0);
        temp = Double.doubleToLongBits(value);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
