package abstractfactory;

public interface Instance {
    void start();
    void stop();
    void attachStorage(Storage storage);
}
