package com.ishan.amazonlocker.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Notification {

    // we need to send a notification to the customer whenever an order is placed inside the locker

    private String customerId;
    private String orderId;
    private String lockerId;
    private String code; // code is 6-digit code
}
