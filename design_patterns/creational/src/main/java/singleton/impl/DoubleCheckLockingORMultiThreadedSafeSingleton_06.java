package singleton.impl;


public class DoubleCheckLockingORMultiThreadedSafeSingleton_06 {
    private static DoubleCheckLockingORMultiThreadedSafeSingleton_06 INSTANCE;

    private DoubleCheckLockingORMultiThreadedSafeSingleton_06() {
    }

    public static DoubleCheckLockingORMultiThreadedSafeSingleton_06 getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckLockingORMultiThreadedSafeSingleton_06.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckLockingORMultiThreadedSafeSingleton_06();
                }
            }
        }
        return INSTANCE;
    }
}



