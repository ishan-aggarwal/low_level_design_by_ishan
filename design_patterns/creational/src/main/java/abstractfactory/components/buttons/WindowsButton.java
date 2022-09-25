package abstractfactory.components.buttons;

public class WindowsButton implements Button {
    @Override
    public void displayButton() {
        System.out.println("I am Windows Button.");
    }
}
