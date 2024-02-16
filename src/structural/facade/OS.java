package structural.facade;

public class OS {
    private String manufacturer;
    private String version;

    public OS(String manufacturer, String version) {
        this.manufacturer = manufacturer;
        this.version = version;
    }

    public void boot() {
        System.out.println(manufacturer + " " + version + " is booting");
    }
}
