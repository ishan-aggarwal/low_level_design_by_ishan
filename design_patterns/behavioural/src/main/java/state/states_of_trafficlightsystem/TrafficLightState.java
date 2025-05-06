package state.states_of_trafficlightsystem;

public interface TrafficLightState {
    TrafficLightState next(); // Transition to next state
    String getColor();        // Get current light color
}
