package structural.adapter.classadapter;

// Serves as the Adaptee
public class Employee {
    private String firstName;
    private String lastName;
    private Department department;

    public Employee(String firstName, String lastName, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Department getDepartment() {
        return department;
    }

    enum Department {
        IT,
        HR
    }
}


