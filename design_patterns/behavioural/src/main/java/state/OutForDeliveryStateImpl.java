package state;

public class OutForDeliveryStateImpl implements PackageState {
    @Override
    public void nextState(Package pkg) {
        pkg.setState(new DeliveredStateImpl());
    }

    @Override
    public void previousState(Package pkg) {
        pkg.setState(new ShippedStateImpl());
    }

    @Override
    public void displayInfo(Package pkg) {
        System.out.println("Package is out for delivery! and will be delivered soon.");
    }

    @Override
    public String toString() {
        return "OutForDeliveryState{}";
    }
}
