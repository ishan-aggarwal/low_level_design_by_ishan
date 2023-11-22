package singleton.impl;

public class BillPughSingleton_10 {

    private BillPughSingleton_10(){}

    private static class SingletonHelper {
        private static final BillPughSingleton_10 INSTANCE = new BillPughSingleton_10();
    }

    public static BillPughSingleton_10 getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
