package com.hcl.lld.assignment.snake_and_ladder.model;

import lombok.Getter;

@Getter
public class Normal extends Cell {

    public Normal() {
        super(CellType.NORMAL);
    }

    @Override
    public int getNextCell() {
        return this.getIndex();
    }
}
