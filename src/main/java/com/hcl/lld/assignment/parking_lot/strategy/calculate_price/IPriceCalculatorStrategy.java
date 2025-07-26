package com.hcl.lld.assignment.parking_lot.strategy.calculate_price;

import com.hcl.lld.assignment.parking_lot.model.ticket.Ticket;

public interface IPriceCalculatorStrategy {
    Double calculatePrice(Ticket ticket);
}
