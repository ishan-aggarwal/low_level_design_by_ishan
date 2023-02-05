package solid.d.v1;

import solid.d.v0.BluetoothKeyboard;
import solid.d.v0.BluetoothMouse;
import solid.d.v0.Keyboard;
import solid.d.v0.Mouse;

public class Client {
    public static void main(String[] args) {
        Keyboard keyboard = new BluetoothKeyboard();
        Mouse mouse = new BluetoothMouse();
        Laptop laptop = new Laptop(keyboard, mouse);
        System.out.println(laptop);
    }
}
