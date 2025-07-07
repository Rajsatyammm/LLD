package com.hcl.lld.assignment.toctactoe.model;

import lombok.Getter;

@Getter
public class Cell {
    private int x;
    private int y;
    private Symbol symbol = new Symbol('.');

    public String toString() {
        return symbol.toString();
    }
}
