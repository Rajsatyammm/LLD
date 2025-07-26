package com.hcl.lld.assignment.parking_lot.model;

import lombok.Data;

import java.util.List;

@Data
public class ParkingFloor {
    int floorNo;
    List<ParkingSlot> parkingSlots;
}
