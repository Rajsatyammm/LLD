package com.hcl.lld.assignment.parking_lot.strategy.find_empty_space;

import com.hcl.lld.assignment.parking_lot.model.EmptySpace;
import com.hcl.lld.assignment.parking_lot.model.ParkingLot;
import com.hcl.lld.assignment.parking_lot.model.VehicleType;

public interface IFindEmptySpaceStrategy {
    EmptySpace findEmptySpace(ParkingLot parkingLot, VehicleType vehicleType);
}
