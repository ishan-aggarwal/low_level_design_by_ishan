package genericspackage;

import java.util.List;

public class Util {
    public static void doSomething(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getClass());
        }
        //animals.add(new Cat());
        //animals.add(new Dog());
        //animals.add(new Animal());
    }

    public static void doSomethingOnDogs(List<Animal> dogs) {
        dogs.add(new Dog());
        dogs.add(new Cat());
        dogs.add(new Animal());

    }

    public static <T extends Animal> void doSomething2(List<T> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getClass());
        }
    }

    public static void randomMethod(Animal animal) {

    }
}