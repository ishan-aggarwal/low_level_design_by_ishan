package design.bird.version1;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Bird {
    private String name;
    private String type;
    private int numberOfWings;
    private double weight;
    private String color;

    public void fly() {
        System.out.println(this.name + " is flying");
    }

    // Note: the problem with this approach is that all birds
    // will have exactly the same behavior
    // version1
    public void makeSound() {
        System.out.println(this.name + " is making sound");
    }

    // Note: problem with this approach version 2
    // understandability
    // difficult to test
    // difficult for multiple developers to work in parallel
    // code duplication
    // less code reuse
    // violates "S" of SOLID
    public void makeSound2() {
        if ("crow".equalsIgnoreCase(this.type)) {
            System.out.println("Kaw kaw");
        } else if ("sparrow".equalsIgnoreCase(this.type)) {
            System.out.println("hey hey");
        } else {
            System.out.println(this.name + " is making sound");
        }
    }

    public void makeDance() {
        System.out.println(this.name + " is dancing");
    }
}
