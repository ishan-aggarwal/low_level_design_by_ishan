package solid.d.v0;

public class Laptop {
    private WiredKeyboard wiredKeyboard;
    private WiredMouse wiredMouse;

    public Laptop(WiredKeyboard wiredKeyboard, WiredMouse wiredMouse) {
        this.wiredKeyboard = wiredKeyboard;
        this.wiredMouse = wiredMouse;
    }
}

// Here we have a class Laptop that depends on a WiredKeyboard and WiredMouse. The low level classes are directly dependent on other low level classes.
// and thus the classes are tightly coupled. This is a violation of the Dependency Inversion Principle.
