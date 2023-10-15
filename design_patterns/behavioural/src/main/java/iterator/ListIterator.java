package iterator;

public class ListIterator<T> extends Iterator<T> {


    private final BrowserHistory<T> browserHistory;

    private int index;

    public ListIterator(BrowserHistory<T> browserHistory) {
        this.browserHistory = browserHistory;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < browserHistory.getUrls().size();
    }

    @Override
    public T next() {
        return browserHistory.getUrls().get(index++);
    }
}
