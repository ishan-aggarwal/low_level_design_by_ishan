package com.ishan.splitwise.service;

import com.ishan.splitwise.exceptions.ExpenseDoesNotExistsException;
import com.ishan.splitwise.model.*;
import com.ishan.splitwise.repository.ExpenseRepository;
import com.ishan.splitwise.repository.UserRepository;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

public class ExpenseService {
    private NotificationService notificationService = new NotificationServiceImpl();

    public Expense createExpense(String title, String description, LocalDateTime expenseDate, double expenseAmount,
                                 String userId) {
        Expense expense = Expense.builder()
                .id(UUID.randomUUID().toString())
                .title(title)
                .description(description)
                .expenseDate(expenseDate)
                .expenseAmount(expenseAmount)
                .userId(userId)
                .expenseStatus(ExpenseStatus.CREATED)
                .expenseGroup(new ExpenseGroup()) // empty expense group and then we can add users to this group
                .build();
        return ExpenseRepository.expenseMap.putIfAbsent(expense.getId(), expense);
    }

    public void addUsersToExpense(String expenseId, String emailId) throws
            ExpenseDoesNotExistsException {
        if (!ExpenseRepository.expenseMap.containsKey(expenseId)) {
            System.out.println("Please create expense first");
            throw new
                    ExpenseDoesNotExistsException("Expense with id: " + expenseId + " does not exist. Please create expense first");
        }

        // based on the expenseId fetch the expense from the expenseMap
        // from the expense get the expenseGroup
        // and then fetch the user from the userRepository userHashMap based on emailId
        // and then add the user to the expenseGroup
        ExpenseRepository.expenseMap.get(expenseId)
                .getExpenseGroup().getGroupMembers()
                .add(UserRepository.userHashMap.get(emailId));

        if (notificationService != null) {
            notificationService.notifyUser(UserRepository.userHashMap.get(emailId),
                    ExpenseRepository.expenseMap.get(expenseId));
        }
    }

    // we can also have an expense split policy here and based on that we can split the expense
    // based on equal split policy or percentage split policy
    // for equal split policy instead of having the share specified from the caller we can calculate the share
    // based on the number of users in the expense group
    public void assignExpenseShare(String expenseId, String emailId, double share)
            throws ExpenseDoesNotExistsException {
        if (!ExpenseRepository.expenseMap.containsKey(expenseId)) {
            System.out.println("Please create expense first");
            throw new ExpenseDoesNotExistsException(String.format("Expense %s does not exists", expenseId));
        }
        Expense expense = ExpenseRepository.expenseMap.get(expenseId);
        expense.getExpenseGroup()
                .getUserContributions().putIfAbsent(emailId, new UserShare(emailId, share));

    }

    public void setExpenseStatus(String expenseId, ExpenseStatus expenseStatus) {
        Expense expense = ExpenseRepository.expenseMap.get(expenseId);
        expense.setExpenseStatus(expenseStatus);
    }

    public boolean isExpenseSettled(String expenseId) {
        Expense expense = ExpenseRepository.expenseMap.get(expenseId);
        ExpenseGroup expenseGroup = expense.getExpenseGroup();
        Map<String, UserShare> userContributions = expenseGroup.getUserContributions();

        double total = expense.getExpenseAmount();

        for (Map.Entry<String, UserShare> entry : userContributions.entrySet()) {
            UserShare userShare = entry.getValue();
            for (Contribution contribution : userShare.getContributions()) {
                total -= contribution.getContributionValue();
            }
        }
        if (total <= 1) {
            return true;
        }
        return false;
    }

}