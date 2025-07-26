package com.hcl.lld.assignment.parking_lot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmptySpace {
    int floorNo;
    int parkingSlotNo;
    VehicleType vehicleType;
}
