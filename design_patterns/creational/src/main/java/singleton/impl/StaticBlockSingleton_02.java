package singleton.impl;

public class StaticBlockSingleton_02 {
    private static StaticBlockSingleton_02 INSTANCE;

    private StaticBlockSingleton_02() {
    }

    static {
        INSTANCE = new StaticBlockSingleton_02();
    }

    public static StaticBlockSingleton_02 getInstance() {
        return INSTANCE;
    }
}
