package com.ishan;

public enum TransactionType {
    CASH_WITHDRAWAL,
    BALANCE_CHECK;

    public static void listAllTransactions() {
        for (TransactionType type : TransactionType.values()) {
            System.out.println(type.name());
        }
    }
}

