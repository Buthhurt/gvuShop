package by.gvu.jd2.bean;

import java.io.Serializable;

public class AttributeValue implements Serializable {
    private String value = "";
    private boolean isActive = false;


    public AttributeValue(String value) {
        this.value = value;
        this.isActive = false;
    }

    public AttributeValue(String value, boolean isActive, boolean isRequired) {
        this.value = value;
        this.isActive = isActive;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AttributeValue)) return false;

        AttributeValue that = (AttributeValue) o;

        if (isActive != that.isActive) return false;
        return value != null ? value.equals(that.value) : that.value == null;
    }

    @Override
    public int hashCode() {
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + (isActive ? 1 : 0);
        return result;
    }
}
