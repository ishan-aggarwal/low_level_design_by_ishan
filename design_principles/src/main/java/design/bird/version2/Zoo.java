package design.bird.version2;

import java.util.List;

public class Zoo {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        List<Bird> birds = List.of(new Sparrow(), new Crow(), new Owl(), new Peacock());
        zoo.birdRace(birds);

        Bird b = new Penguin();
        b.fly();
    }

    public void birdRace(List<Bird> birds) {
        System.out.println(birds);
    }
}
