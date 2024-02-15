package structural.adapter.objectadapter;

import structural.adapter.classadapter.Employee;
import structural.adapter.classadapter.Visitor;

public class EmployeeObjectAdapter implements Visitor {
    private final Employee employee;

    public EmployeeObjectAdapter(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return employee.getFirstName() + " " + employee.getLastName();
    }

    @Override
    public String getSector() {
        return employee.getDepartment() + "";
    }
}
