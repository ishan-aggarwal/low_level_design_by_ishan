package state;

import visitor.car_service.MainApplication;

import java.util.HashMap;
import java.util.Map;

public class DeliveredStateImpl implements PackageState {

    private static final Map<Package, Boolean> packageStatusMap = new HashMap<>();

    @Override
    public void nextState(Package pkg) {
        System.out.println("Package already delivered! No further state change possible.");
    }

    @Override
    public void previousState(Package pkg) {
        pkg.setState(new ShippedStateImpl());
    }

    @Override
    public void displayInfo(Package pkg) {

        if (packageStatusMap.containsKey(pkg)) {
            System.out.println("Package already delivered to the customer!");
            return;
        }

        packageStatusMap.put(pkg, true);
        System.out.println("Package delivered successfully to the customer!");
    }

    @Override
    public String toString() {
        return "DeliveredState{}";
    }
}
