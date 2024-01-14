package com.ishan.observer;

import com.ishan.observable.Subject;

public class IndividualSubscriber implements Observer {
    private String articleContent;
    private final Subject newsletter;
    private final String name;

    public IndividualSubscriber(String name, Subject newsletter) {
        this.newsletter = newsletter;
        this.name = name;
        this.newsletter.registerObserver(this);
    }

    public void update(String articleContent) {
        this.articleContent = articleContent;
        articleContentReceived();
    }

    public void articleContentReceived() {
        System.out.println("=======================");
        System.out.println("New Article Content received by " + this.name);
        System.out.println("Article content: " + this.articleContent);
        System.out.println("=======================");
        System.out.println();
    }
}