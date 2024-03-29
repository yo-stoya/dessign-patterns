package creational.singleton;

public final class EagerSingleton {

    private EagerSingleton() {
    }
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
