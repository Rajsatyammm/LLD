package com.hcl.lld.assignment.parking_lot.model.payment;

import com.hcl.lld.assignment.parking_lot.model.ticket.Ticket;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Payment {
//    @ManyToOne
    private Ticket ticket;
    private PaymentType paymentType;
    private Double amount;
    private PaymentStatus paymentStatus;
}
