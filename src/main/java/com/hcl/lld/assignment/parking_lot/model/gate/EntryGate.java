package com.hcl.lld.assignment.parking_lot.model.gate;

import com.hcl.lld.assignment.parking_lot.model.ticket.Ticket;
import com.hcl.lld.assignment.parking_lot.model.user.Client;

public interface EntryGate extends Gate {
        Ticket generateTicket(Client client);
}
