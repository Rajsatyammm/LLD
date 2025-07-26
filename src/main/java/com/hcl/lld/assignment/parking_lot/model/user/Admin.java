package com.hcl.lld.assignment.parking_lot.model.user;

import com.hcl.lld.assignment.parking_lot.model.ParkingFloor;
import com.hcl.lld.assignment.parking_lot.model.ParkingLot;
import com.hcl.lld.assignment.parking_lot.model.displayboard.ParkingFloorDisplayBoard;
import com.hcl.lld.assignment.parking_lot.model.gate.EntryGate;
import com.hcl.lld.assignment.parking_lot.model.gate.ExitGate;

public class Admin extends User {

    private final ParkingLot parkingLot;

    public Admin(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public boolean addParkingFloor(ParkingFloor floor) {
        return parkingLot.getParkingFloors().add(floor);
    }

    public boolean addParkingSpot(ParkingFloor floor) {
        return parkingLot.getParkingFloors().add(floor);
    }

    public boolean addParkingDisplayBoard(String floorName, ParkingFloorDisplayBoard displayBoard) {
        ParkingFloor parkingFloor = parkingLot.getParkingFloors()
                .stream()
                .filter(floor -> floor.getFloorName().equals(floorName))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No such floor"));
        return parkingFloor.getDisplayBoards().add(displayBoard);
    }

    public boolean addEntranceGate(EntryGate entryGate) {
        return parkingLot.getEntryGates().add(entryGate);
    }

    public boolean addExitPanel(ExitGate exitGate) {
        return parkingLot.getExitGates().add(exitGate);
    }
}
