package iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory<T> {

    private final List<T> urls;

    public BrowserHistory() {
        this.urls = new ArrayList<>();
    }

    public void push(T url) {
        urls.add(url);
    }

    public T pop() {
        return urls.remove(urls.size() - 1);
    }

    public List<T> getUrls() {
        return urls;
    }

    public int size() {
        return urls.size();
    }

    public Iterator<T> createIterator() {
        return new ListIterator<>(this);
    }
}
