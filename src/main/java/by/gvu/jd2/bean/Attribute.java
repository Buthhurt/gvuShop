package by.gvu.jd2.bean;

import java.util.List;

public class Attribute {
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
}
