package com.hcl.lld.assignment.parking_lot.strategy.calculate_price;

import com.hcl.lld.assignment.parking_lot.model.ticket.Ticket;

public class SimplePriceCalculator implements IPriceCalculatorStrategy {

    @Override
    public Double calculatePrice(Ticket ticket) {
        long totalSec = ticket.getExitTime().getTime() - ticket.getEntryTime().getTime();
        System.out.println(totalSec);
        return 0.0;
    }
}
