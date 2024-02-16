package structural.facade;

public class Alexa {
    public static void bootComputer() {
        // client is coupled to all pc components.
        CPU.load();
        final RAM ram = new RAM(1024);
        ram.load();
        final OS pearOS = new OS("Pear", "0.1");
        pearOS.boot();
    }
}
