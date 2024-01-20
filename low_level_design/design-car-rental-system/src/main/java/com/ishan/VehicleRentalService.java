package com.ishan;

import com.ishan.model.Location;
import com.ishan.model.User;

import java.util.List;

public class VehicleRentalService {
    List<StoreService> storeList;
    List<User> userList;

    VehicleRentalService(List<StoreService> stores, List<User> users) {
        this.storeList = stores;
        this.userList = users;
    }

    public StoreService getStoreByLocation(Location location) {
        //based on location, we will filter out the Store from storeList.
        for (StoreService store : storeList) {
            if (store.getStoreLocation().equals(location)) {
                return store;
            }
        }
        throw new RuntimeException("No store found for the given location");
    }


    //addUsers

    //remove users

    //add stores

    //remove stores
}

