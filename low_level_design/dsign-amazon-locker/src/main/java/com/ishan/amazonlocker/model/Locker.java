package com.ishan.amazonlocker.model;

import com.ishan.amazonlocker.utils.IdGenerator;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Locker {
    private String id;
    private LockerSize lockerSize; // lockers will come with some standard sizes
    private String locationId; // the locker must have a location id and the location can exist without a locker too as it can be a store/ mall
    private LockerStatus lockerStatus; // different possible states of the locker

    public Locker(LockerSize lockerSize, String locationId) {
        id = IdGenerator.generateId(8);
        this.lockerSize = lockerSize;
        this.locationId = locationId;
        this.lockerStatus = LockerStatus.AVAILABLE;
    }

}
