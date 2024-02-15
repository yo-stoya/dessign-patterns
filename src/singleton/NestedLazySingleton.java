package singleton;

public final class NestedLazySingleton {

    private NestedLazySingleton() {
    }

    private static final class SingletonHolder {
        private static final NestedLazySingleton INSTANCE = new NestedLazySingleton();
    }

    public static NestedLazySingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
