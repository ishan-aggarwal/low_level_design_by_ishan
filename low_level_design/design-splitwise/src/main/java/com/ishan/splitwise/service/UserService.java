package com.ishan.splitwise.service;

import com.ishan.splitwise.exceptions.ContributionExceededException;
import com.ishan.splitwise.exceptions.ExpenseSettledException;
import com.ishan.splitwise.exceptions.InvalidExpenseState;
import com.ishan.splitwise.model.*;
import com.ishan.splitwise.repository.ExpenseRepository;
import com.ishan.splitwise.repository.UserRepository;

public class UserService {
    public User createUser(String emailId, String name, String phoneNumber) {
        User user = new User(emailId, name, phoneNumber);
        return UserRepository.userHashMap.putIfAbsent(emailId, user);
    }

    public void contributeToExpense(String expenseId, String emailId,
                                    Contribution contribution)
            throws InvalidExpenseState, ExpenseSettledException, ContributionExceededException {
        Expense expense = ExpenseRepository.expenseMap.get(expenseId);
        ExpenseGroup expenseGroup = expense.getExpenseGroup();
        if (expense.getExpenseStatus() == ExpenseStatus.CREATED) {
            throw new InvalidExpenseState("Invalid expense State");
        }
        if (expense.getExpenseStatus() == ExpenseStatus.SETTLED) {
            throw new ExpenseSettledException("Expense is already settled.");
        }
        UserShare userShare = expenseGroup.getUserContributions().get(emailId);
        if (contribution.getContributionValue() > userShare.getShare()) {
            throw new ContributionExceededException(
                    String.format("User %s contribution %d exceeded the share %d",
                            emailId, contribution.getContributionValue(), userShare.getShare()));
        }
        userShare.getContributions().add(contribution);
    }

//    public void contributeToExpense(String expenseId, String emailId, String toEmailId,
//                                    Contribution contribution)
//            throws InvalidExpenseState, ExpenseSettledException, ContributionExceededException {
//        Expense expense = ExpenseRepository.expenseMap.get(expenseId);
//        ExpenseGroup expenseGroup = expense.getExpenseGroup();
//        if (expense.getExpenseStatus() == ExpenseStatus.CREATED) {
//            throw new InvalidExpenseState("Invalid expense State");
//        }
//        if (expense.getExpenseStatus() == ExpenseStatus.SETTLED) {
//            throw new ExpenseSettledException("Expense is already settled.");
//        }
//        UserShare userShare = expenseGroup.getUserContributions().get(emailId);
//        if (contribution.getContributionValue() > userShare.getShare()) {
//            throw new ContributionExceededException(
//                    String.format("User %s contribution %d exceeded the share %d",
//                            emailId, contribution.getContributionValue(), userShare.getShare()));
//        }
//        userShare.getContributions().add(contribution);
//    }
}