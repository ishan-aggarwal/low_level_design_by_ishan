package genericspackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

//What is unboxing in java? - Request to read about it.
public class Client {
    public static void main(String[] args) {
        //Raw data types - Java 5
        Pair p1 = new Pair();
        p1.first = "America";
        p1.second = "umang";
        p1.first = 900;

        //After Java 5 - Generics came
        Pair<Integer, String> p2 = new Pair<Integer, String>();
        p2.first = 20;
        p2.second = "Umang";

        Pair<String, String> p3 = new Pair</*Data types here is optional*/>();
        p3.first = "Umang";
        p3.second = "Agrawal";
        String s = p3.getSecond();
        //Generics applies a hard compile time check on the data types


        //Raw data types
        //Backward Compatability
        HashMap hm = new HashMap();
        hm.put("Umang", 20);
        hm.put(20, 50);
        hm.put("20", "Sachin");

        HashMap<String, Double> hm1 = new HashMap<>();
        hm1.put("US", 5.9);
        //Generics will help you to fail fast

        //Pair.<Integer>doSome(5);
        Pair<Integer, Integer> p5 = new Pair<>();
        Pair.doSome(5, 6);
        Pair.doSome("Umang", 89);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        //dogs.add(new Cat());

        Util.randomMethod(new Dog());

        List<Cat> cats = new ArrayList<>();
        Util.doSomething(cats);

        Util.doSomething(dogs);

        List<Animal> animals = new ArrayList<>();
        Util.doSomething(animals);

        GenericMethods g1 = new GenericMethods();
        //String rV = g1.doSomething(1);
        //Go through operator overloading generics
    }
}