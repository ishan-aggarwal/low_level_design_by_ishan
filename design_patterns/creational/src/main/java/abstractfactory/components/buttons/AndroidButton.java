package abstractfactory.components.buttons;

public class AndroidButton implements Button {
    @Override
    public void displayButton() {
        System.out.println("I am Android Button.");
    }
}
