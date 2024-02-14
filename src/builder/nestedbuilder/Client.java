package builder.nestedbuilder;

public class Client {
    public static void main(String[] args) {
        final User user = new User.UserBuilder("dan", "stoya")
                .withAge(21)
                .withEmail("dan@test.email")
                .build();

    }
}
