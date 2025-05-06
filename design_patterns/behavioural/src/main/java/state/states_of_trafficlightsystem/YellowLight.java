package state.states_of_trafficlightsystem;

public class YellowLight implements TrafficLightState {
    @Override
    public TrafficLightState next() {
        System.out.println("Changing from YELLOW to RED.");
        return new RedLight();
    }

    @Override
    public String getColor() {
        return "YELLOW";
    }
}
