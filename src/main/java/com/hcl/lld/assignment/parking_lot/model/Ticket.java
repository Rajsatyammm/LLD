package com.hcl.lld.assignment.parking_lot.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Ticket {
    // user
    // payment info
    Date entryTime;
    Date exitTime;
    VehicleType vehicleType;
}
