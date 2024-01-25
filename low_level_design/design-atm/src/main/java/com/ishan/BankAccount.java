package com.ishan;

public class BankAccount {
    int balance;

    public void withdrawalBalance(int amount) {

        if (amount > balance) {
            throw new RuntimeException("Insufficient balance");
        }

        balance -= amount;
    }
}