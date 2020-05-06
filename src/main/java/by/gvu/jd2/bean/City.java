package by.gvu.jd2.bean;

import java.io.Serializable;

public class City implements Serializable {
    private int id;
    private Country country = null;
    private Region region = null;
    private String name = null;

    public City() {
    }

    public City(int id, Country country, Region region, String name) {
        this.id = id;
        this.country = country;
        this.region = region;
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

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
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
        if (!(o instanceof City)) return false;

        City city = (City) o;

        if (id != city.id) return false;
        if (country != null ? !country.equals(city.country) : city.country != null) return false;
        if (region != null ? !region.equals(city.region) : city.region != null) return false;
        return name != null ? name.equals(city.name) : city.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
