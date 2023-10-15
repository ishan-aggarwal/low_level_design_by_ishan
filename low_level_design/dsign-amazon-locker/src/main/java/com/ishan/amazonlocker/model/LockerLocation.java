package com.ishan.amazonlocker.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class LockerLocation {
    private String locationId;
    private List<Locker> lockers = new ArrayList<>(); // lockerlocation can have multiple lockers (Has-A relationship)
    private GeoLocation geoLocation; // lockerlocation will have a Geo location -> it will be used to calculate distance from the locker to the delivery location
    private LocationTiming locationTiming; // each locker may have different timings which will depend on the Locker location
}
