package com.hcl.lld.assignment.parking_lot.model;

import com.hcl.lld.assignment.parking_lot.model.displayboard.ParkingFloorDisplayBoard;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ParkingFloor {
    private int floorNo;
    private String floorName;
    private List<ParkingSpot> parkingSlots;
    private List<ParkingFloorDisplayBoard> displayBoards;
}
