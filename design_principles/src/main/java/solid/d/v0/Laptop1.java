package solid.d.v0;

// laptop class which is a concrete class
// is directly dependent on other concrete classes
public class Laptop1 {
    private BluetoothKeyboard wiredKeyboard;
    private BluetoothMouse wiredMouse;

    public Laptop1(BluetoothKeyboard wiredKeyboard, BluetoothMouse wiredMouse) {
        this.wiredKeyboard = wiredKeyboard;
        this.wiredMouse = wiredMouse;
    }
}

// Here we have a class Laptop that depends on a WiredKeyboard and WiredMouse. The low level classes are directly dependent on other low level classes.
// and thus the classes are tightly coupled. This is a violation of the Dependency Inversion Principle.
