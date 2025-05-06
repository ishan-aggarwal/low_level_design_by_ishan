package state.states_of_water;

public class Water {
    private WaterState state;

    public Water() {
        this.state = new LiquidState(); // Default state
    }

    public void heat() {
        state = state.heat();
    }

    public void freeze() {
        state = state.freeze();
    }

    public String getStateName() {
        return state.getClass().getSimpleName();
    }
}
