package abstractfactory.components.dropdowns;

public class WindowsDropdown implements Dropdown {
    @Override
    public void displayDropdown() {
        System.out.println("Dropdown for windows platform.");
    }
}
