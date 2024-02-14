package solid.srp;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

class Journal {
    private static int count = 0;
    private final List<String> entries = new ArrayList<>();

    public void addEntry(String text) {
        entries.add((++count) + ": " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

    // here we break SRP
    public void save(String filename) throws Exception {
        // save to file logic
    }

    // here we break SRP
    public void load(String filename) {
    }

    // here we break SRP
    public void load(URL url) {
    }
}

// Handles the responsibility of loading and saving journals.
final class Persistence {

    private Persistence() {
    }

    public static void saveToFile(Journal journal,
                                  String filename, boolean overwrite) {
     // save to file logic
    }

    public static Journal load(String filename) {
        return null;
    }

    public static Journal load(URL url) {
        return null;
    }
}

class SRPDemo {
    public static void main(String[] args)  {
        Journal journal = new Journal();
        journal.addEntry("Trained in the morning");
        journal.addEntry("Had lunch with SAra");
        System.out.println(journal);

        String filename = "c:\\temp\\journal.txt";
        Persistence.saveToFile(journal, filename, true);
    }
}
