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
