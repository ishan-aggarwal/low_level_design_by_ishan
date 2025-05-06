package state.states_of_trafficlightsystem;

public class GreenLight implements TrafficLightState {
    @Override
    public TrafficLightState next() {
        System.out.println("Changing from GREEN to YELLOW.");
        return new YellowLight();
    }

    @Override
    public String getColor() {
        return "GREEN";
    }
}
