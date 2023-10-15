package com.ishan.amazonlocker.service;

import com.ishan.amazonlocker.model.Item;
import com.ishan.amazonlocker.model.Locker;
import com.ishan.amazonlocker.model.LockerStatus;

public class ReturnsService {

    public void returnItemsToLocker(Item item, Locker locker) {
        locker.setLockerStatus(LockerStatus.CLOSED);
    }

}