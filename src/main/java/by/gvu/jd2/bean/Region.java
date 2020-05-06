package by.gvu.jd2.bean;

import java.io.Serializable;

public class Region implements Serializable {
    private int id;
    private Country country = null;
    private String name = null;

    public Region() {
    }

    public Region(int id, Country country, String name) {
        this.id = id;
        this.country = country;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Region)) return false;

        Region region = (Region) o;

        if (id != region.id) return false;
        if (country != null ? !country.equals(region.country) : region.country != null) return false;
        return name != null ? name.equals(region.name) : region.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
