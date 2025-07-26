package com.hcl.lld.assignment.parking_lot.model;

import lombok.Data;

@Data
public class ParkingSlot {
    int parkingSlotNo;
    VehicleType vehicleType;
    boolean isOccupied;
}
