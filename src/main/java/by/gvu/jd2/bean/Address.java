package by.gvu.jd2.bean;

public class Address {
    private int id;
    private UserForm user = null;
    private Country country = null;
    private Region region = null;
    private City city = null;
    private String address = null;

    public Address() {
    }

    public Address(int id, UserForm user, Country country, Region region, City city, String address) {
        this.id = id;
        this.user = user;
        this.country = country;
        this.region = region;
        this.city = city;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserForm getUser() {
        return user;
    }

    public void setUser(UserForm user) {
        this.user = user;
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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
