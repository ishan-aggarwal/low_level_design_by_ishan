package com.ishan.model;

import lombok.*;

import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PaymentDetails {
    int paymentId;
    int amountPaid;
    Date dateOfPayment;
    boolean isRefundable;
    PaymentMode paymentMode;
}

