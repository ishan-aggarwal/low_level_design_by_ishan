package state.ex2.after;

public class TV {

    private State state;

    public TV() {
        state = new TVStateOff();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void doAction() {
        state.doAction();
    }
}
