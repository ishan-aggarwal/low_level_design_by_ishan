package solid.l.v1;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();
        eagle.eat();

        List<Bird> birdList = Arrays.asList(
                new Eagle(),
                new Penguin());

        List<Flyable> flyableList = Arrays.asList(new Eagle());

        // if you want to use a method
        // which is not in bird class
        // then you need to type case first...

//        Flyable eagle1 = new Eagle();
//        eagle1.fly();
//
//        ((Bird) eagle1).eat();
//
//        eagle.eat();
        // iska matlab jo object eagle ka tha
        // use bataya ki bhai tu flyable type ka bhi hai
        // usmein typecase ho ja
        // aur fir uski jo functionality hai use bhi use krne ke layak ban ja..
        ((Flyable) eagle).fly();
//
//        penguin.eat();
    }
}

