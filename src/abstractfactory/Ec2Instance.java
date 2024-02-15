package abstractfactory;

public class Ec2Instance implements Instance {
    @Override
    public void start() {
        System.out.println(this.getClass().getSimpleName() + " started");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getSimpleName() + " stopped");

    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached storage: " + storage.getId() + " to " + this.getClass().getSimpleName());

    }
}
