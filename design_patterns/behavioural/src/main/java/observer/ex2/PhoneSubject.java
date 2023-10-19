package observer.ex2;

public interface PhoneSubject {

    void register(Observer observer);

    void deregister(Observer observer);

    void notifyObservers();

    void addStock(int quantity);
}
