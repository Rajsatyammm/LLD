package com.hcl.lld.assignment.parking_lot.model;

import com.hcl.lld.assignment.parking_lot.model.displayboard.ParkingFloorDisplayBoard;
import com.hcl.lld.assignment.parking_lot.model.gate.EntryGate;
import com.hcl.lld.assignment.parking_lot.model.gate.ExitGate;
import com.hcl.lld.assignment.parking_lot.model.gate.SimpleEntryGate;
import com.hcl.lld.assignment.parking_lot.model.gate.SimpleExitGate;
import com.hcl.lld.assignment.parking_lot.model.vehicle.Vehicle;
import com.hcl.lld.assignment.parking_lot.model.vehicle.VehicleType;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
public class ParkingLot {
    private Integer id;
    private String name;
    private String city;
    private String address;

    private List<ParkingFloor> parkingFloors;
    private List<EntryGate> entryGates;
    private List<ExitGate> exitGates;

    private ParkingLot() {
        id = new Random().nextInt(10000);
        name = "Raj Parking Lot";
        city = "Noida";
        address = "Noida";

        // initialize demo parking spots
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int randomVal = new Random().nextInt(4);
            ParkingSpot spot = ParkingSpot.builder()
                    .parkingSlotNo(i)
                    .isOccupied(false)
                    .vehicleType(VehicleType.values()[randomVal])
                    .build();
            parkingSpots.add(spot);
        }

        // init demo displayBoard
        ParkingFloorDisplayBoard displayBoard = ParkingFloorDisplayBoard.builder()
                .remainingCapacity(parkingSpots.size())
                .totalCapacity(parkingSpots.size())
                .build();

        // initialize demo parking floor
        parkingFloors = new ArrayList<ParkingFloor>();
        for (int i = 0; i < 10; i++) {
            ParkingFloor floor = ParkingFloor.builder()
                    .floorNo(i)
                    .floorName("Floor " + i)
                    .parkingSlots(parkingSpots)
                    .displayBoards(List.of(displayBoard))
                    .build();
            parkingFloors.add(floor);
        }

        entryGates = new ArrayList<>();
        entryGates.add(SimpleEntryGate.builder()
                .gateNo(1)
                .gateName("First Entry")
                .displayBoard(null)
                .build());

        exitGates = new ArrayList<>();
        exitGates.add(SimpleExitGate.builder()
                .gateNo(10)
                .gateName("First Exit")
                .build());
    }

    private static final class Holder {
        private static final ParkingLot INSTANCE = new ParkingLot();
    }

    public static ParkingLot getInstance() {
        return Holder.INSTANCE;
    }
}
