package com.hcl.lld.assignment.designPen.pen;

import com.hcl.lld.assignment.designPen.ink.Ink;
import com.hcl.lld.assignment.designPen.nib.Nib;
import com.hcl.lld.assignment.designPen.strategy.RefillStrategy;

public class MarkerPen extends Pen {
    public MarkerPen(Nib nib, Ink ink, RefillStrategy refillStrategy) {
        this.nib = nib;
        this.ink = ink;
        this.refillStrategy = refillStrategy;
    }

    @Override
    public void write() {
        System.out.println("Writing with Marker Pen");
    }

    @Override
    public void refill() {
        refillStrategy.refill();
    }
}
