package observer.ex1;

public interface IObservable {

    void add(IObserver observer);

    void remove(IObserver observer);

    void notifyObservers();
}
