package state.ex2.after;

public class TVStateOff implements State {
    @Override
    public void doAction() {
        System.out.println("TV is turned OFF");
    }
}
