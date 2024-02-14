package builder.nestedbuilder;

public class User {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String email;

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.email = builder.email;
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String email;

        // mandatory fields
        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
