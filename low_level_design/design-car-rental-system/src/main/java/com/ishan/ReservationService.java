package com.ishan;

import com.ishan.model.Location;
import com.ishan.model.ReservationStatus;
import com.ishan.model.ReservationType;
import com.ishan.model.User;
import com.ishan.model.product.Vehicle;
import lombok.*;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReservationService {

    public int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickUpLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;
    Location location;

    public void create(int id, User user, Vehicle vehicle, ReservationType reservationType) {
        this.reservationId = id;
        this.user = user;
        this.vehicle = vehicle;
        this.reservationType = reservationType;
        reservationStatus = ReservationStatus.IN_PROGRESS;
    }

    // CRUD operations

}

