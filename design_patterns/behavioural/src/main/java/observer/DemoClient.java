package observer;

public class DemoClient {

    public static void main(String[] args) {

        WeatherStationObservable weatherStation = new WeatherStationObservable();
        IDisplay windowsDisplay = new WindowsDisplay();
        IDisplay phoneDisplay = new PhoneDisplay();

        ConcreteObserver concreteObserver = new ConcreteObserver(weatherStation, phoneDisplay);
        ConcreteObserver2 concreteObserver2 = new ConcreteObserver2(weatherStation, windowsDisplay);

        weatherStation.add(concreteObserver);
        weatherStation.add(concreteObserver2);

        weatherStation.notifyObservers();
    }
}
