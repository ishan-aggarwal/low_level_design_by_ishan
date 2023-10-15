package iterator;

public class IteratorClientApp {
    public static void main(String[] args) {
        BrowserHistory<String> browserHistory = new BrowserHistory<>();
        browserHistory.push("a");
        browserHistory.push("b");
        browserHistory.push("c");

        Iterator<String> iterator = browserHistory.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
