package singleton.impl;

public class CloneableSafeSingleton_07 implements Cloneable {
    private static CloneableSafeSingleton_07 INSTANCE;

    private CloneableSafeSingleton_07() {
    }

    public static CloneableSafeSingleton_07 getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckLockingORMultiThreadedSafeSingleton_06.class) {
                if (INSTANCE == null) {
                    INSTANCE = new CloneableSafeSingleton_07();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public CloneableSafeSingleton_07 clone() {
        return getInstance();
    }
}
