package composite.example1;

// leaf
public class Developer extends Employee{
    public Developer(Integer id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void doWork() {
        System.out.println(this.getClass().getSimpleName() + " is working.");
    }
}
