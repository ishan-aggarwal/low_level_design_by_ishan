package i;

public class Penguine extends Bird implements EatableFlyable {
    @Override
    public void eat() {

    }


    // interface segregation principal...
    @Override
    public void fly() {
//        throw new RuntimeException("method not supported");
        // leaving it empty
    }
}
