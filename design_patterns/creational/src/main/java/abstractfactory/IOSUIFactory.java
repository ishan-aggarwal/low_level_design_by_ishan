package abstractfactory;

import abstractfactory.components.buttons.IOSButton;
import abstractfactory.components.dropdowns.IOSDropdown;
import abstractfactory.components.menus.IOSMenu;

public class IOSUIFactory implements UIFactory {

    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }

    @Override
    public IOSMenu createMenu() {
        return new IOSMenu();
    }

    @Override
    public IOSDropdown createDropdown() {
        return new IOSDropdown();
    }
}
