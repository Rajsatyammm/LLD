package com.hcl.lld.assignment.parking_lot.model;

import com.hcl.lld.assignment.parking_lot.model.vehicle.VehicleType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ParkingSpot {
    private int parkingSlotNo;
    private VehicleType vehicleType;
    private boolean isOccupied;
}
