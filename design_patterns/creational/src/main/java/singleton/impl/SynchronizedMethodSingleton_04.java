package singleton.impl;


public class SynchronizedMethodSingleton_04 {
    private static SynchronizedMethodSingleton_04 INSTANCE;

    private SynchronizedMethodSingleton_04() {
    }
    public synchronized static SynchronizedMethodSingleton_04 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SynchronizedMethodSingleton_04();
        }
        return INSTANCE;
    }
}



