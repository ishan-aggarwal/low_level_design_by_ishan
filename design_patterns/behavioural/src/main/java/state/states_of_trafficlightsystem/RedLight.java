package state.states_of_trafficlightsystem;

public class RedLight implements TrafficLightState {
    @Override
    public TrafficLightState next() {
        System.out.println("Changing from RED to GREEN.");
        return new GreenLight();
    }

    @Override
    public String getColor() {
        return "RED";
    }
}
