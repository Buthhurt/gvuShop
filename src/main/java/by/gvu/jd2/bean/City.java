package by.gvu.jd2.bean;

public class City {
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
}
