package com.hcl.lld.assignment.parking_lot.model.gate;

import com.hcl.lld.assignment.parking_lot.model.ticket.Ticket;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SimpleExitGate implements ExitGate {
    private int gateNo;
    private String gateName;

    @Override
    public Double calculateFare(Ticket ticket) {
        return 0.0;
    }

    @Override
    public boolean acceptPayment(Ticket ticket, Double price) {
        return false;
    }
}
