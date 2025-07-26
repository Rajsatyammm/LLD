package com.hcl.lld.assignment.parking_lot.model.gate;

import com.hcl.lld.assignment.parking_lot.model.ticket.Ticket;

public interface ExitGate extends Gate {
    Double calculateFare(Ticket ticket);
    boolean acceptPayment(Ticket ticket, Double price);
}
