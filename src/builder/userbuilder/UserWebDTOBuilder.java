package builder.userbuilder;

import java.time.LocalDate;

public class UserWebDTOBuilder implements UserBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    @Override
    public UserBuilder withFirstName(String name) {
        firstName = name;
        return this;
    }

    @Override
    public UserBuilder withLastName(String name) {
        lastName =  name;
        return this;
    }

    @Override
    public UserBuilder withBirthday(LocalDate date) {
        final int year = date.getYear();
        final int currentYear = LocalDate.now().getYear();
        age = currentYear - year;
        return this;
    }

    @Override
    public UserBuilder withAddress(Address address) {
        this.address = address.toString();
        return this;
    }

    public UserWebDTO getProduct() {
        return new UserWebDTO(firstName + " " + lastName, address, age);
    }
}
