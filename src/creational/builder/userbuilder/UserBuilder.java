package creational.builder.userbuilder;

import java.time.LocalDate;

public interface UserBuilder {
    UserBuilder withFirstName(String name);
    UserBuilder withLastName(String name);
    UserBuilder withBirthday(LocalDate date);
    UserBuilder withAddress(Address address);
}
