package org.example.enums;

import java.util.Random;

public enum Move {
    ROCK, PAPER, SCISSORS , Spock,Lizard;

    private static Random random = new Random();  // Default random instance

    // Allow test code to control randomness by passing in a specific Random object
    public static void setRandom(Random newRandom) {
        random = newRandom;
    }

    public static Move getRandomMove() {
        Move[] moves = values();
        return moves[random.nextInt(moves.length)];
    }
}