package bridge;

// difference between bridge and strategy pattern explained here:
// https://itecnote.com/tecnote/r-strategy-vs-bridge-patterns/

/*
The Strategy on the other hand is concerned with changing the behaviour of an object at run time.
I like to use the example of a game with a character that possesses several different types of weapons.
The character can attack but the behaviour of attack depends on the weapon that the character
is holding at the time, and this cannot be known at compile time.
 */

public class Main {
    public static void main(String[] args) {
        LivingThings fish = new Fish();
        fish.breath();

        LivingThings dog = new Dog();
        dog.breath();
    }
}
