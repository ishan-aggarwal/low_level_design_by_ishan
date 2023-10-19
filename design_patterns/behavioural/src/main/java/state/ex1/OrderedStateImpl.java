package state.ex1;

public class OrderedStateImpl implements PackageState {
    @Override
    public void nextState(Package pkg) {
        pkg.setState(new ShippedStateImpl());
    }

    @Override
    public void previousState(Package pkg) {
        System.out.println("Package is ordered! The package is in it's root state. No further previous state change possible.");
    }

    @Override
    public void displayInfo(Package pkg) {
        System.out.println("Package is ordered! and will be shipped soon.");
    }

    @Override
    public String toString() {
        return "OrderedState{}";
    }
}
