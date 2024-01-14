package com.ishan.observable;

import com.ishan.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class LLDSeriesArticles implements Subject {
    private List<Observer> observers;
    private String articleContent;

    public LLDSeriesArticles() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(articleContent);
        }
    }

    public void newArticlePublished(String articleContent) {
        this.articleContent = articleContent;
        notifyObservers();
    }
}