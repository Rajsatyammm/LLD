package com.hcl.lld.assignment.designPen.strategy;

public class ReplaceRefill implements RefillStrategy {
    @Override
    public void refill() {
        System.out.println("Replace refill");
    }
}
