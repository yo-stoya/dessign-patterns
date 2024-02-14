package builder.userbuilder;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        final UserWebDTOBuilder userWebDTOBuilder = new UserWebDTOBuilder();
        directorAssembly(userWebDTOBuilder);
        final UserWebDTO webDTO = userWebDTOBuilder.getProduct();
    }

    private static void directorAssembly(UserBuilder userBuilder) {
        userBuilder
                .withFirstName("dan")
                .withLastName("stoya")
                .withBirthday(LocalDate.of(1994, 2, 2))
                .withAddress(new Address("sf", "1400", "Vitoshka Str", "10"));
    }
}
