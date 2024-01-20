package com.ishan;

public class PaymentService {
    public void payBill(BillService bill) {
        bill.setBillPaid(true);
        System.out.println("Bill paid successfully. Total amount: " + bill.getTotalBillAmount());
    }
}

