package com.hcl.lld.assignment.parking_lot.model.gate;

import com.hcl.lld.assignment.parking_lot.model.ticket.Ticket;
import com.hcl.lld.assignment.parking_lot.model.displayboard.EntryDisplayBoard;
import com.hcl.lld.assignment.parking_lot.model.user.Client;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SimpleEntryGate implements EntryGate {
    private int gateNo;
    private String gateName;
    private EntryDisplayBoard displayBoard;

    @Override
    public Ticket generateTicket(Client client) {
        return Ticket.builder()
                .client(client)
                .entryTime(Date.from(Instant.now()))
                .vehicleType(client.getVehicleType())
                .entryGate(this)
                .build();
    }
}
