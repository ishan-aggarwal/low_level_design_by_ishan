package solid.d.v1;

import solid.d.v0.Keyboard;
import solid.d.v0.Mouse;

public class Laptop {
    private Keyboard keyboard;
    private Mouse mouse;

    public Laptop(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}


// By doing this, the direction of original dependency is inverted: low level classes are now dependent on high level abstractions.
// This is how we achieve Dependency Inversion Principle.
//  - The high level modules should not depend on low level modules. Both should depend on abstractions.
