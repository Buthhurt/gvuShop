package by.gvu.jd2.bean;

import java.io.Serializable;
import java.util.List;

public class GroupAttributes implements Serializable {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GroupAttributes)) return false;

        GroupAttributes that = (GroupAttributes) o;

        if (id != that.id) return false;
        if (catalog != null ? !catalog.equals(that.catalog) : that.catalog != null) return false;
        return attributes != null ? attributes.equals(that.attributes) : that.attributes == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (catalog != null ? catalog.hashCode() : 0);
        result = 31 * result + (attributes != null ? attributes.hashCode() : 0);
        return result;
    }
}
