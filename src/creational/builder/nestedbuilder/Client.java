package creational.builder.nestedbuilder;

public class Client {
    public static void main(String[] args) {
        final User user = User.builder("dan", "stoya")
                .withAge(21)
                .withEmail("dan@test.email")
                .build();

    }
}
