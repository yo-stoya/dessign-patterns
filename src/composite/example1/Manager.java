package composite.example1;

import java.util.ArrayList;
import java.util.List;

// composite / container
public class Manager extends Employee {
    private List<Employee> employees;

    public Manager(Integer id, String name, double salary) {
        super(id, name, salary);
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void doWork() {
        System.out.println("Manager delegates to employees to work.");
        employees.forEach(Employee::doWork);
    }
}
