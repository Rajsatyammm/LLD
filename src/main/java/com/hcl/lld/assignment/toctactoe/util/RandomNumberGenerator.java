package com.hcl.lld.assignment.toctactoe.util;

import java.util.Random;

public class RandomNumberGenerator {
    public static int generateRandomNumber(int lowerBound, int upperBound) {
        return new Random().nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
}
