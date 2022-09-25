package abstractfactory.components.menus;

public class WindowsMenu implements Menu {
    @Override
    public void displayMenu() {
        System.out.println("Menu for windows platform.");
    }
}
