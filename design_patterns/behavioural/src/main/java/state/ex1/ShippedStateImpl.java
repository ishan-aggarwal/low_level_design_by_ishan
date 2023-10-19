package state.ex1;

public class ShippedStateImpl implements PackageState {
    @Override
    public void nextState(Package pkg) {
        pkg.setState(new OutForDeliveryStateImpl());
    }

    @Override
    public void previousState(Package pkg) {
        pkg.setState(new OrderedStateImpl());
    }

    @Override
    public void displayInfo(Package pkg) {
        System.out.println("Package is shipped now! and will be out for delivery soon.");
    }

    @Override
    public String toString() {
        return "ShippedState{}";
    }
}
