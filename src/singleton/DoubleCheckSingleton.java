package singleton;

public final class DoubleCheckSingleton {

    private DoubleCheckSingleton() {
    }

    private static volatile DoubleCheckSingleton INSTANCE;

    public static DoubleCheckSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckSingleton();
                }
            }
        }

        return INSTANCE;
    }
}
