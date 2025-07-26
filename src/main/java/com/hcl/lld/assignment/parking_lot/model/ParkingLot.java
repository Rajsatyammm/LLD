package com.hcl.lld.assignment.parking_lot.model;

import lombok.Data;

import java.util.List;

@Data
public class ParkingLot {
    List<ParkingFloor> parkingFloors;
    List<EntryGate> entryGates;
    List<ExitGate> exitGates;
}
