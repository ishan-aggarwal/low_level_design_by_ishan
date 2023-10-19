package state.ex2.after;

public class StateMainApp {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.doAction();

        tv.setState(new TVStateOn());
        tv.doAction();

        tv.setState(new TVStateOff());
        tv.doAction();
    }
}
