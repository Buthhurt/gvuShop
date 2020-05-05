package by.gvu.jd2.bean;

import java.util.List;

public class GroupAttributes {
    private int id;
    private CatalogInfo catalog = null;
    private List<Attribute> attributes = null;

    public GroupAttributes() {
    }

    public GroupAttributes(int id, CatalogInfo catalog, List<Attribute> attributes) {
        this.id = id;
        this.catalog = catalog;
        this.attributes = attributes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CatalogInfo getCatalog() {
        return catalog;
    }

    public void setCatalog(CatalogInfo catalog) {
        this.catalog = catalog;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }
}
