package com.ishan.splitwise.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Expense {
    private String id; // system generated
    private String userId; // owner of the expense
    private String title; // short title/ reason for the expense
    private String description;
    private LocalDateTime expenseDate; // date of the expense
    private ExpenseStatus expenseStatus;
    private double expenseAmount; // amount of the expense
    // we are taking the complete object here and not just the id
    // because the expense group can not exist without an expense
    private ExpenseGroup expenseGroup; // so this expense is part of which group
}