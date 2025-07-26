package com.hcl.lld.assignment.parking_lot.model.displayboard;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EntryDisplayBoard implements DisplayBoard {
    private int totalCapacity;
    private int remainingCapacity;

    @Override
    public void display() {
        System.out.println("total capacity: " + totalCapacity);
        System.out.println("remaining capacity: " + remainingCapacity);
    }
}
