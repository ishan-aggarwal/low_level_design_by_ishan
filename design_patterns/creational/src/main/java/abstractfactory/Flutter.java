package abstractfactory;

public class Flutter {

    private final Platform platform;

    public Flutter(Platform platform) {
        this.platform = platform;
    }

    public void setButtonColor() {
        System.out.println("Button color set.");
    }

    public void setButtonShape() {
        System.out.println("Button shape set.");
    }

    public void setFont() {
        System.out.println("Font set for display.");
    }


    public UIFactory createUIFactory() {
        return UIFactoryFactory.getUIFactoryByName(platform.getValue());
    }

}
