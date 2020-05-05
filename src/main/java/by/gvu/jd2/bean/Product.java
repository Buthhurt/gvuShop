package by.gvu.jd2.bean;

import java.util.List;

public class Product {
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
}
