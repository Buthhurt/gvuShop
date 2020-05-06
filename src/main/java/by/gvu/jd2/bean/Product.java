package by.gvu.jd2.bean;

import java.io.Serializable;
import java.util.List;

public class Product implements Serializable {
    private int id;
    private CatalogInfo catalog = null;
    private String name = null;
    private double price;
    private int count;
    private boolean isActive;
    private List<Attribute> attributes = null;
    private Discount discount = null;
    private double priceDiscount;

    public Product() {
    }

    public Product(int id, CatalogInfo catalog, String name, double price, int count, boolean isActive, List<Attribute> attributes, Discount discount, double priceDiscount) {
        this.id = id;
        this.catalog = catalog;
        this.name = name;
        this.price = price;
        this.count = count;
        this.isActive = isActive;
        this.attributes = attributes;
        this.discount = discount;
        this.priceDiscount = priceDiscount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CatalogInfo getCatalogId() {
        return catalog;
    }

    public void setCatalogId(CatalogInfo catalogId) {
        this.catalog = catalogId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getPriceDiscount() {
        return priceDiscount;
    }

    public void setPriceDiscount(double priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (id != product.id) return false;
        if (Double.compare(product.price, price) != 0) return false;
        if (count != product.count) return false;
        if (isActive != product.isActive) return false;
        if (Double.compare(product.priceDiscount, priceDiscount) != 0) return false;
        if (catalog != null ? !catalog.equals(product.catalog) : product.catalog != null) return false;
        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        if (attributes != null ? !attributes.equals(product.attributes) : product.attributes != null) return false;
        return discount != null ? discount.equals(product.discount) : product.discount == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (catalog != null ? catalog.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + count;
        result = 31 * result + (isActive ? 1 : 0);
        result = 31 * result + (attributes != null ? attributes.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        temp = Double.doubleToLongBits(priceDiscount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
