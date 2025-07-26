package com.hcl.lld.assignment.parking_lot.main;

import com.hcl.lld.assignment.parking_lot.model.EmptySpace;
import com.hcl.lld.assignment.parking_lot.model.ParkingLot;
import com.hcl.lld.assignment.parking_lot.model.ticket.Ticket;
import com.hcl.lld.assignment.parking_lot.model.user.Client;
import com.hcl.lld.assignment.parking_lot.strategy.find_empty_space.IFindEmptySpaceStrategy;

public class Main {
    public static IFindEmptySpaceStrategy strategy;
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();
        Client client = new Client();
        Ticket ticket = parkingLot.getEntryGates().get(0).generateTicket(client);
        System.out.println("ticket :: " + ticket);
        // find empty slot and park the vehicle
        EmptySpace space = strategy.findEmptySpace(parkingLot, ticket.getVehicleType());

        client.setTicket(ticket);

    }
}
