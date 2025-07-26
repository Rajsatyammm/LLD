package com.hcl.lld.assignment.parking_lot.strategy.find_empty_space;

import com.hcl.lld.assignment.parking_lot.model.EmptySpace;
import com.hcl.lld.assignment.parking_lot.model.ParkingLot;
import com.hcl.lld.assignment.parking_lot.model.vehicle.VehicleType;

public class FindingFirstEmptySpaceStrategy implements IFindEmptySpaceStrategy {
    @Override
    public EmptySpace findEmptySpace(ParkingLot parkingLot, VehicleType vehicleType) {
        for (var floor : parkingLot.getParkingFloors()) {
            for (var slot : floor.getParkingSlots()) {
                if (!slot.isOccupied() && slot.getVehicleType().equals(vehicleType)) {
                    return EmptySpace.builder()
                            .floorNo(floor.getFloorNo())
                            .parkingSlotNo(slot.getParkingSlotNo())
                            .vehicleType(vehicleType)
                            .build();
                }
            }
        }
        return null;
    }
}
