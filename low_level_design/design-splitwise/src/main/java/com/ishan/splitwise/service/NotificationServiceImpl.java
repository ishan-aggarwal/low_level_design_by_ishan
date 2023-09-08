package com.ishan.splitwise.service;

import com.ishan.splitwise.model.Expense;
import com.ishan.splitwise.model.User;

public class NotificationServiceImpl implements NotificationService {
    @Override
    public void notifyUser(User user, Expense expense) {
        System.out.println("Notified user: " + user + " about expense: " + expense);
    }
}