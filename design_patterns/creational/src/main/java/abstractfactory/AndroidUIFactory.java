package abstractfactory;

import abstractfactory.components.buttons.AndroidButton;
import abstractfactory.components.dropdowns.AndroidDropdown;
import abstractfactory.components.menus.AndroidMenu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropdown createDropdown() {
        return new AndroidDropdown();
    }
}
