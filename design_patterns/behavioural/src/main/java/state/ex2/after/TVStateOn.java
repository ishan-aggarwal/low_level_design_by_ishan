package state.ex2.after;

public class TVStateOn implements State {
    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }
}
