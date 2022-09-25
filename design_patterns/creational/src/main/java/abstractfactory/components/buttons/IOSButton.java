package abstractfactory.components.buttons;

public class IOSButton implements Button {

    @Override
    public void displayButton() {
        System.out.println("I am IOS Button.");
    }
}
