package com.ishan;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    // number of dice to be rolled by a player
    int diceCount;
    int min = 1;
    int max = 6;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    /*
     * Roll the dice and return the sum of the dice values to find the jump position
     */
    public int rollDice() {
        int totalSum = 0;
        int diceUsed = 0;

        while (diceUsed < diceCount) {
            totalSum += ThreadLocalRandom.current().nextInt(min, max + 1);
            diceUsed++;
        }
        return totalSum;
    }
}

