package singleton;

public final class LazySingleton {

    private LazySingleton() {
    }

    private static LazySingleton INSTANCE;

    public static synchronized LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }

        return INSTANCE;
    }
}
