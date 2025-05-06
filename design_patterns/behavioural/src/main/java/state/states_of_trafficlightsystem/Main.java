package state.states_of_trafficlightsystem;

public class Main {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();

        for (int i = 0; i < 6; i++) {
            System.out.println("Light is: " + light.getCurrentColor());
            light.change();
        }
    }
}

/*
Light is: RED
Changing from RED to GREEN.
Light is: GREEN
Changing from GREEN to YELLOW.
Light is: YELLOW
Changing from YELLOW to RED.
...
 */