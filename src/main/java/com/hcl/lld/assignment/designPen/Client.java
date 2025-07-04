package com.hcl.lld.assignment.designPen;

import com.hcl.lld.assignment.designPen.ink.BlueInk;
import com.hcl.lld.assignment.designPen.nib.LongNib;
import com.hcl.lld.assignment.designPen.pen.BallPen;
import com.hcl.lld.assignment.designPen.pen.Pen;
import com.hcl.lld.assignment.designPen.strategy.ReplaceRefill;

public class Client {
    public static void main(String[] args) {
        Pen pen = new BallPen(new LongNib(), new BlueInk(), new ReplaceRefill());
        pen.refill();
    }
}
