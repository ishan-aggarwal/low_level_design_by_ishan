package observer;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@NoArgsConstructor
public class WeatherStationObservable implements IObservable {

    private static final Random random = new Random();
    private final List<IObserver> observerList = new ArrayList<>();

    @Override
    public void add(IObserver observer) {
        System.out.println("Registering client: " + observer);
        this.observerList.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        System.out.println("Unregistering client: " + observer);
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Going to notify the observers: " + observerList);
        observerList.forEach(
                observer -> {
                    observer.update();
                }
        );
    }

    public WeatherData getState() {
        return new WeatherData(random.nextInt(1000));
    }


    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    @Getter
    @Setter
    public class WeatherData {
        private int temperature;
    }
}
