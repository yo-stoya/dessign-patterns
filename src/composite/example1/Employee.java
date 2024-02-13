package composite.example1;

public abstract class Employee {
    private Integer id;
    private String name;
    private double salary;

    public Employee(Integer id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public abstract void doWork();

    // other common algorithms
}
