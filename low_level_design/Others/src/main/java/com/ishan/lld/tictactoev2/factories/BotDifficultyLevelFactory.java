package com.ishan.lld.tictactoev2.factories;

import com.ishan.lld.tictactoev2.exceptions.BotDifficultyNotSupportedException;
import com.ishan.lld.tictactoev2.models.BotDifficultyLevel;

public class BotDifficultyLevelFactory {
    public static BotDifficultyLevel getBotDifficultyLevelByName(String name) {
        if ("EASY".equalsIgnoreCase(name)) {
            return BotDifficultyLevel.EASY;
        } else if ("MEDIUM".equalsIgnoreCase(name)) {
            return BotDifficultyLevel.MEDIUM;
        } else if ("HARD".equalsIgnoreCase(name)) {
            return BotDifficultyLevel.HARD;
        }
        throw new BotDifficultyNotSupportedException(name);
    }
}
