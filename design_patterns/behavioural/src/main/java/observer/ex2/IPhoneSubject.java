package observer.ex2;

import java.util.ArrayList;
import java.util.List;

public class IPhoneSubject implements PhoneSubject {

    private static final List<Observer> observers = new ArrayList<>();

    private int quantity;

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void addStock(int quantity) {
        System.out.println("New stock added to the store with quantity " + quantity);
        this.quantity += quantity;
        System.out.println("Going to notify observers");
        notifyObservers();
    }
}
