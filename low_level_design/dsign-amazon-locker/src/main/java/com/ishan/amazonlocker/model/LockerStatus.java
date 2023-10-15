package com.ishan.amazonlocker.model;

public enum LockerStatus {
    CLOSED,
    BOOKED,
    AVAILABLE,
    NOT_OPENED, // not yet picked up
    OPEN // locker is opned by the customer
}
