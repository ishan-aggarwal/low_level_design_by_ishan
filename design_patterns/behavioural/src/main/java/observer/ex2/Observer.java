package observer.ex2;

public abstract class Observer {
    private String name;

    public Observer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void update();
}
