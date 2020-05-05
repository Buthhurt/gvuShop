package by.gvu.jd2.bean;

public class AttributeValue {
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
}
