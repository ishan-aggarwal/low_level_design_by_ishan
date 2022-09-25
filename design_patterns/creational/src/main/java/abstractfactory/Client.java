package abstractfactory;

import abstractfactory.components.buttons.Button;
import abstractfactory.components.dropdowns.Dropdown;
import abstractfactory.components.menus.Menu;

public class Client {

    public static void main(String[] args) {

        // For Android
        Flutter flutter = new Flutter(Platform.ANDROID);
        UIFactory uiFactory = flutter.createUIFactory();

        Button button = uiFactory.createButton();
        Dropdown dropdown = uiFactory.createDropdown();
        Menu menu = uiFactory.createMenu();

        button.displayButton();
        dropdown.displayDropdown();
        menu.displayMenu();
        System.out.println();
        // For Windows
        flutter = new Flutter(Platform.WINDOWS);
        uiFactory = flutter.createUIFactory();

        button = uiFactory.createButton();
        dropdown = uiFactory.createDropdown();
        menu = uiFactory.createMenu();

        button.displayButton();
        dropdown.displayDropdown();
        menu.displayMenu();
        System.out.println();

        // For IOS
        flutter = new Flutter(Platform.IOS);
        uiFactory = flutter.createUIFactory();

        button = uiFactory.createButton();
        dropdown = uiFactory.createDropdown();
        menu = uiFactory.createMenu();

        button.displayButton();
        dropdown.displayDropdown();
        menu.displayMenu();
    }
}
