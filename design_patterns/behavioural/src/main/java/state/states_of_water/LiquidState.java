package state.states_of_water;

public class LiquidState implements WaterState {
    @Override
    public WaterState heat() {
        System.out.println("Heating liquid water → Becomes gas.");
        return new GasState();
    }

    @Override
    public WaterState freeze() {
        System.out.println("Freezing liquid water → Becomes solid.");
        return new SolidState();
    }
}
