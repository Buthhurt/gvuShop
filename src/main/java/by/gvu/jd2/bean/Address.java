package by.gvu.jd2.bean;

import java.io.Serializable;

public class Address implements Serializable {
    private int id;
    private UserToken user = null;
    private Country country = null;
    private Region region = null;
    private City city = null;
    private String address = null;

    public Address() {
    }

    public Address(int id, UserToken user, Country country, Region region, City city, String address) {
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

    public UserToken getUser() {
        return user;
    }

    public void setUser(UserToken user) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;

        Address address1 = (Address) o;

        if (id != address1.id) return false;
        if (user != null ? !user.equals(address1.user) : address1.user != null) return false;
        if (country != null ? !country.equals(address1.country) : address1.country != null) return false;
        if (region != null ? !region.equals(address1.region) : address1.region != null) return false;
        if (city != null ? !city.equals(address1.city) : address1.city != null) return false;
        return address != null ? address.equals(address1.address) : address1.address == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
