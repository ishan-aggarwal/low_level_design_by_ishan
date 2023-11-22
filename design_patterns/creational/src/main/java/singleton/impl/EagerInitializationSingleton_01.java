package singleton.impl;

public class EagerInitializationSingleton_01 {
    private static EagerInitializationSingleton_01 INSTANCE = new EagerInitializationSingleton_01();

    private EagerInitializationSingleton_01() {
    }

    public static EagerInitializationSingleton_01 getInstance() {
        return INSTANCE;
    }
}
