package composite.example1;

import composite.example1.Developer;
import composite.example1.Employee;
import composite.example1.Manager;

public class Client {
    public static void main(String[] args) {
        final Employee dancho = new Developer(1, "dancho", 1500);
        final Manager manager = new Manager(99, "Mr Reads", 5000);
        manager.addEmployee(dancho);

        dancho.doWork();
        manager.doWork();

    }
}
