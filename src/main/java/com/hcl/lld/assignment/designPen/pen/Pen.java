package com.hcl.lld.assignment.designPen.pen;

import com.hcl.lld.assignment.designPen.ink.Ink;
import com.hcl.lld.assignment.designPen.nib.Nib;
import com.hcl.lld.assignment.designPen.strategy.RefillStrategy;
import com.hcl.lld.assignment.designPen.interfaces.Writable;

public abstract class Pen implements Writable {
    protected Nib nib;
    protected Ink ink;
    protected RefillStrategy refillStrategy;

    public abstract void refill();
}
