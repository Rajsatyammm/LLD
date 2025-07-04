package com.hcl.lld.assignment.designPen.strategy;

public class FillInk implements RefillStrategy {
    @Override
    public void refill() {
        System.out.println("refilling");
    }
}
