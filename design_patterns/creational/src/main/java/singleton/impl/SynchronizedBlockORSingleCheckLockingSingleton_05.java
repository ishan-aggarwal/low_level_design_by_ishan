package singleton.impl;


public class SynchronizedBlockORSingleCheckLockingSingleton_05 {
    private static SynchronizedBlockORSingleCheckLockingSingleton_05 INSTANCE;

    private SynchronizedBlockORSingleCheckLockingSingleton_05() {
    }

    public static SynchronizedBlockORSingleCheckLockingSingleton_05 getInstance() {
        if (INSTANCE == null) {
            synchronized (SynchronizedBlockORSingleCheckLockingSingleton_05.class) {
                INSTANCE = new SynchronizedBlockORSingleCheckLockingSingleton_05();
            }
        }
        return INSTANCE;
    }
}



