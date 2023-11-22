package singleton.impl;

public class ReflectionPreventiveSingleton_09 {
    private static ReflectionPreventiveSingleton_09 INSTANCE;

    private ReflectionPreventiveSingleton_09() {
        throw new RuntimeException();
    }

    public static ReflectionPreventiveSingleton_09 getInstance() {
        if (INSTANCE == null) {
            synchronized (ReflectionPreventiveSingleton_09.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ReflectionPreventiveSingleton_09();
                }
            }
        }
        return INSTANCE;
    }
}
