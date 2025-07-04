package com.hcl.lld.assignment.toctactoe.factories;

import com.hcl.lld.assignment.toctactoe.model.Bot;
import com.hcl.lld.assignment.toctactoe.model.HumanPlayer;

public class PlayerFactory {
    public static HumanPlayer.Builder createHumanPlayer() {
        return HumanPlayer.builder();
    }

    public static Bot.Builder createBot() {
        return Bot.builder();
    }
}
