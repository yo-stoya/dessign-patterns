package creational.builder.userbuilder;

public class Address {
    private String city;
    private String zipcode;
    private String street;
    private String houseNumber;

    public Address(String city, String zipcode, String street, String houseNumber) {
        this.city = city;
        this.zipcode = zipcode;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return String.format("""
                City: %s
                Zipcode: %s
                Street: %s
                House number: %s
                """, city, zipcode, street, houseNumber);
    }
}
