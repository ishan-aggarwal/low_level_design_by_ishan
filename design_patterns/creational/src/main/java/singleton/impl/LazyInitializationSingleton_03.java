package singleton.impl;


public class LazyInitializationSingleton_03 {
    private static LazyInitializationSingleton_03 INSTANCE;

    private LazyInitializationSingleton_03() {
    }

    public static LazyInitializationSingleton_03 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazyInitializationSingleton_03();
        }
        return INSTANCE;
    }
}



