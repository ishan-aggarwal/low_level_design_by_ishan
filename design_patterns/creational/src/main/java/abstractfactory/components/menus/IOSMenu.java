package abstractfactory.components.menus;

public class IOSMenu implements Menu {
    @Override
    public void displayMenu() {
        System.out.println("Menu for IOS platform.");
    }
}
