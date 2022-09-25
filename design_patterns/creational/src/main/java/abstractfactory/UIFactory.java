package abstractfactory;

import abstractfactory.components.buttons.Button;
import abstractfactory.components.dropdowns.Dropdown;
import abstractfactory.components.menus.Menu;

public interface UIFactory {

    Button createButton();

    Menu createMenu();

    Dropdown createDropdown();

}
