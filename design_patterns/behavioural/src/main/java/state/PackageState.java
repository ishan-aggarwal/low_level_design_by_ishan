package state;

public interface PackageState {

    void nextState(Package pkg);

    void previousState(Package pkg);

    void displayInfo(Package pkg);
}
