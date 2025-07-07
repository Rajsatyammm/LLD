package com.hcl.lld.assignment.snake_and_ladder.model;

import lombok.Getter;

import java.util.List;

@Getter
public class Player {
    private List<Cell> cells;
    private User user;
    private Color color;
}
