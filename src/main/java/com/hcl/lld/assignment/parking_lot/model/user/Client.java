package com.hcl.lld.assignment.parking_lot.model.user;

import com.hcl.lld.assignment.parking_lot.model.ticket.Ticket;
import com.hcl.lld.assignment.parking_lot.model.vehicle.VehicleType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public class Client extends User {
    private VehicleType vehicleType;
    private Ticket ticket;
}
