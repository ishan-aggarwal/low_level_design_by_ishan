package com.ishan.splitwise.repository;

import com.ishan.splitwise.model.Expense;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class ExpenseRepository {

    // similar to user repository, we are maintaining a map of expenseId to expense
    // this can be a real database too
    public static Map<String, Expense> expenseMap = new HashMap<>();
}