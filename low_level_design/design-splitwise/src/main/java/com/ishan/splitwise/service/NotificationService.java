package com.ishan.splitwise.service;

import com.ishan.splitwise.model.Expense;
import com.ishan.splitwise.model.User;

public interface NotificationService {
    void notifyUser(User user, Expense expense);
}