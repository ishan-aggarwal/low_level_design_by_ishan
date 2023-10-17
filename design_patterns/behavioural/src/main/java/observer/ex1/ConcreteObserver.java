package observer.ex1;

import lombok.ToString;

@ToString
public class ConcreteObserver implements IObserver, IDisplay {

    private final WeatherStationObservable observable;

    private final IDisplay displayScreen;

    public ConcreteObserver(WeatherStationObservable observable, IDisplay displayScreen) {
        this.observable = observable;
        this.displayScreen = displayScreen;
    }

    @Override
    public void update() {
        WeatherStationObservable.WeatherData state = this.observable.getState();
        display(state.toString());

    }

    @Override
    public void display(String data) {
        displayScreen.display(data);
    }
}
