package abstractfactory;

import abstractfactory.components.buttons.WindowsButton;
import abstractfactory.components.dropdowns.WindowsDropdown;
import abstractfactory.components.menus.WindowsMenu;

public class WindowsUIFactory implements UIFactory {
    @Override
    public WindowsButton createButton() {
        return new WindowsButton();
    }

    @Override
    public WindowsMenu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public WindowsDropdown createDropdown() {
        return new WindowsDropdown();
    }
}
