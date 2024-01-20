package com.ishan;

import com.ishan.model.ReservationType;
import com.ishan.model.product.Vehicle;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class BillService {
    ReservationService reservation;
    double totalBillAmount;
    boolean isBillPaid;

    public BillService(ReservationService reservation) {
        this.reservation = reservation;
        this.totalBillAmount = computeBillAmount();
        isBillPaid = false;
    }

    private double computeBillAmount() {
        Vehicle vehicle = this.reservation.getVehicle();
        ReservationType reservationType = this.reservation.getReservationType();
        double totalBillAmount = 0.0;
        if (reservationType == ReservationType.HOURLY) {
            totalBillAmount = vehicle.getHourlyRentalCost();
        } else if (reservationType == ReservationType.DAILY) {
            totalBillAmount = vehicle.getDailyRentalCost();
        }
        return totalBillAmount;
    }
}

