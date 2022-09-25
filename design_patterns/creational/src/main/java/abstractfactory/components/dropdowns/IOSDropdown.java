package abstractfactory.components.dropdowns;

public class IOSDropdown implements Dropdown {
    @Override
    public void displayDropdown() {
        System.out.println("Dropdown for IOS platform.");
    }
}
