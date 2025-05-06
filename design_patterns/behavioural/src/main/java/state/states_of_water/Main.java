package state.states_of_water;

public class Main {
    public static void main(String[] args) {
        Water water = new Water();

        System.out.println("Current state: " + water.getStateName());
        water.freeze(); // Liquid → Solid
        System.out.println("Current state: " + water.getStateName());
        water.freeze(); // Solid → Still solid
        System.out.println("Current state: " + water.getStateName());
        water.heat();   // Solid → Liquid
        water.heat();   // Liquid → Gas
        System.out.println("Current state: " + water.getStateName());
        water.heat();
        System.out.println("Current state: " + water.getStateName());
        water.freeze(); // Gas → Liquid
        System.out.println("Current state: " + water.getStateName());
    }
}
