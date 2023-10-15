package com.ishan.amazonlocker.repository;

import com.ishan.amazonlocker.model.GeoLocation;
import com.ishan.amazonlocker.model.Locker;
import com.ishan.amazonlocker.model.LockerSize;
import com.ishan.amazonlocker.model.LockerStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LockerRepository {
    public static List<Locker> lockers;
    public static Map<String, Locker> lockerMap;

    static {
        lockers = new ArrayList<>();
        lockerMap = new HashMap<>();
    }

    public static Locker getLocker(LockerSize lockerSize, GeoLocation location) {

        //assumption the nearby lockers in radius are fetched from a service
        List<Locker> lockerList =
                lockers.stream()
                        .filter(locker ->
                                locker.getLockerStatus() == LockerStatus.AVAILABLE &&
                                        locker.getLockerSize() == lockerSize)
                        .collect(Collectors.toList());

        if (lockerList != null && lockerList.size() > 0)
            return lockerList.get(0);
        return null;
    }
}