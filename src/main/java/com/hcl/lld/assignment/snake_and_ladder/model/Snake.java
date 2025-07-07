package com.hcl.lld.assignment.snake_and_ladder.model;

import lombok.Getter;

@Getter
public class Snake extends Cell {

    int start;
    int end;

    public Snake(int start, int end) {
        super(CellType.SNAKE);
    }
    @Override
    public int getNextCell() {
        return end;
    }
}
