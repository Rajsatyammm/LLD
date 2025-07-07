package com.hcl.lld.assignment.snake_and_ladder.model;

import lombok.Getter;

@Getter
public class Ladder extends Cell {
    int start;
    int end;

    public Ladder(int start, int end) {
        super(CellType.LADDER);
    }

    @Override
    public int getNextCell() {
        return end;
    }
}
