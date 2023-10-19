package state.ex1;

public class Package {
    private PackageState packageState;

    public Package() {
        packageState = new OrderedStateImpl();
    }

    public void nextState() {
        packageState.nextState(this);
    }

    public void previousState() {
        packageState.previousState(this);
    }

    public void displayInfo() {
        packageState.displayInfo(this);
    }

    public void setState(PackageState packageState) {
        this.packageState = packageState;
    }
}
