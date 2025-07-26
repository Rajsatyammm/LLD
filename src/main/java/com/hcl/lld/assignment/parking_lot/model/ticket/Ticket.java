package com.hcl.lld.assignment.parking_lot.model.ticket;

import com.hcl.lld.assignment.parking_lot.model.vehicle.VehicleType;
import com.hcl.lld.assignment.parking_lot.model.gate.EntryGate;
import com.hcl.lld.assignment.parking_lot.model.gate.ExitGate;
import com.hcl.lld.assignment.parking_lot.model.payment.Payment;
import com.hcl.lld.assignment.parking_lot.model.user.Client;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@Builder
@ToString
public class Ticket {
    private Client client;
    // @OneToMany
    private List<Payment> payments;
    private EntryGate entryGate;
    private ExitGate exitGate;
    private Date entryTime;
    private Date exitTime;
    private VehicleType vehicleType;
}
