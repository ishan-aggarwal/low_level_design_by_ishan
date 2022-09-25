package abstractfactory;

public class UIFactoryFactory {

    public static UIFactory getUIFactoryByName(String name) {
        switch (name) {
            case "android" -> {
                return new AndroidUIFactory();
            }

            case "ios" -> {
                return new IOSUIFactory();
            }

            case "windows" -> {
                return new WindowsUIFactory();
            }
            default -> throw new IllegalStateException("Unexpected value: " + name);
        }
    }
}
