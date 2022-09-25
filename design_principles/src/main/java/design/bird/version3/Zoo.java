package design.bird.version3;

import java.util.List;

public class Zoo {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        List<Bird> birds = List.of(new Sparrow(), new Crow(), new Owl(), new Peacock());
        zoo.birdRace(birds);

//        List<Flyable> flyableBirds = List.of(new Penguin()); // Is not allowed as Penguin is not of Flyable type
        List<Flyable> flyableBirds = List.of(new Sparrow(), new Crow(), new Owl(), new Peacock());
    }

    public void birdRace(List<Bird> birds) {
        System.out.println(birds);
    }
}
