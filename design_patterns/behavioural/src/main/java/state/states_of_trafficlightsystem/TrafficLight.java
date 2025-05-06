package state.states_of_trafficlightsystem;

// context class
public class TrafficLight {
    private TrafficLightState state = new RedLight(); // initial state

    public void change() {
        state = state.next();
    }

    public String getCurrentColor() {
        return state.getColor();
    }
}
