package com.hcl.lld.assignment.snake_and_ladder.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Game {
    private List<Player> players;
    private Board board;
}
