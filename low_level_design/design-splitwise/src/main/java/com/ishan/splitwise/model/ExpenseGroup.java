package com.ishan.splitwise.model;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
public class ExpenseGroup {

    private String expenseGroupId;
    // we are keeping it as a set so that we don't repeat the user in the same expense group
    private Set<User> groupMembers; // members who were part of the expense

    // expense creator will assign the share of each user in the expense
    // contribution of each user (comes from user share) in the expense
    @Setter
    private Map<String, UserShare> userContributions;

    public ExpenseGroup() {
        this.expenseGroupId = UUID.randomUUID().toString();
        this.groupMembers = new HashSet<>();
        this.userContributions = new HashMap<>();
    }

    public void ExpenseGroup() {
    }
}