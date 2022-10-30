package com.ishan.lld.tictactoev2.factories;

import com.ishan.lld.tictactoev2.models.BotDifficultyLevel;
import com.ishan.lld.tictactoev2.strategies.botplayingstrategy.BotPlayingStrategy;
import com.ishan.lld.tictactoev2.strategies.botplayingstrategy.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategyByDifficultyLevel(
            BotDifficultyLevel botDifficultyLevel) {
        return new RandomBotPlayingStrategy();
    }
}
