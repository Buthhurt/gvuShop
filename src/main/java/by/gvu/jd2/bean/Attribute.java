package by.gvu.jd2.bean;

import java.io.Serializable;
import java.util.List;

public class Attribute implements Serializable {
    private int id;
    private String name = null;
    private DataType dataType = null;
    private Unit unit = null;
    private boolean isRequired = false;
    private List<AttributeValue> values = null;

    public Attribute(int id, String name, DataType dataType, Unit unit, boolean isRequired, List<AttributeValue> values) {
        this.id = id;
        this.name = name;
        this.dataType = dataType;
        this.unit = unit;
        this.isRequired = isRequired;
        this.values = values;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataType getDataTypeId() {
        return dataType;
    }

    public void setDataTypeId(DataType dataTypeId) {
        this.dataType = dataTypeId;
    }

    public Unit getUnitId() {
        return unit;
    }

    public void setUnitId(Unit unitId) {
        this.unit = unitId;
    }

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean required) {
        isRequired = required;
    }

    public List<AttributeValue> getValues() {
        return values;
    }

    public void setValues(List<AttributeValue> values) {
        this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Attribute)) return false;

        Attribute attribute = (Attribute) o;

        if (id != attribute.id) return false;
        if (isRequired != attribute.isRequired) return false;
        if (name != null ? !name.equals(attribute.name) : attribute.name != null) return false;
        if (dataType != null ? !dataType.equals(attribute.dataType) : attribute.dataType != null) return false;
        if (unit != null ? !unit.equals(attribute.unit) : attribute.unit != null) return false;
        return values != null ? values.equals(attribute.values) : attribute.values == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (dataType != null ? dataType.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (isRequired ? 1 : 0);
        result = 31 * result + (values != null ? values.hashCode() : 0);
        return result;
    }
}
