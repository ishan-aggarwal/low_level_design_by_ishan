package factory;

public class Factory {

    public static OS getInstance(OSType osType) {
        switch (osType) {
            case MAC:
                return new Mac();
            case WINDOWS:
                return new Windows();
        }
        return null;
    }
}