package state.states_of_water;

public class GasState implements WaterState {
    @Override
    public WaterState heat() {
        System.out.println("Already gas. No change.");
        return this;
    }

    @Override
    public WaterState freeze() {
        System.out.println("Condensing gas → Becomes liquid.");
        return new LiquidState();
    }
}
