package com.ishan;

import com.ishan.observable.LLDSeriesArticles;
import com.ishan.observer.CommunitySubscriber;
import com.ishan.observer.IndividualSubscriber;
import com.ishan.observer.Observer;

// Reference and credits:
// https://www.linkedin.com/pulse/observer-pattern-publisher-subscriber-architecture-practice-saurav-jcitf/

public class NewsletterRunner {
    public static void main(String[] args) {
        LLDSeriesArticles newsletter = new LLDSeriesArticles();

        // Alex and Max are subscribed to the newsletter. 
        Observer alex = new IndividualSubscriber("Alex", newsletter);
        Observer max = new IndividualSubscriber("Max", newsletter);

        // GeekForces organisation is subscribed to the newsletter.
        Observer geeksForces = new CommunitySubscriber("Geeks Force", newsletter);

        // New Article is published and all the subscribers are notified.
        newsletter.newArticlePublished("Observer Pattern explained");

        // Max unsubscribes from the newsletter
        newsletter.removeObserver(max);

        // New Article is published and all the subscribers are notified.
        newsletter.newArticlePublished("Factory Pattern explained");
    }
}