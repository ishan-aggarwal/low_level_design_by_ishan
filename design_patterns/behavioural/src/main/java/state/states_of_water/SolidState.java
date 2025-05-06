package state.states_of_water;

public class SolidState implements WaterState {
    @Override
    public WaterState heat() {
        System.out.println("Heating solid water (ice) → Becomes liquid.");
        return new LiquidState();
    }

    @Override
    public WaterState freeze() {
        System.out.println("Already solid. No change.");
        return this;
    }
}
