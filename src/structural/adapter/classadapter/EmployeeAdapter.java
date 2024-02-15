package structural.adapter.classadapter;

public class EmployeeAdapter extends Employee implements Visitor {

    public EmployeeAdapter(String firstName, String lastName, Department department) {
        super(firstName, lastName, department);
    }

    @Override
    public String getName() {
        return getFirstName() + " " + getLastName();
    }

    @Override
    public String getSector() {
        return getDepartment().toString();
    }
}
