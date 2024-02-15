package structural.adapter.classadapter;


import java.util.UUID;

public class EntryPassDesigner {
    public static String designPass(Visitor visitor) {
        return String.format("""
                Card: %s
                Name: %s
                Sector: %s
                """, UUID.randomUUID(), visitor.getName(), visitor.getSector());
    }

    public static void main(String[] args) {
        final Visitor employee = new EmployeeAdapter("dan", "stoq", Employee.Department.IT);
        final String pass = designPass(employee);
        System.out.println(pass);
    }
}
