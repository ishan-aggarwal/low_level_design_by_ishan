package com.ishan.tictactoe.factories.botplayingstrategyfactory;

import com.ishan.tictactoe.models.BotDifficultyLevel;
import com.ishan.tictactoe.strategies.botplayingstrategies.BotPlayingStrategy;
import com.ishan.tictactoe.strategies.botplayingstrategies.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public BotPlayingStrategy createBotPlayingStrategyForDifficultyLevel(BotDifficultyLevel difficultyLevel) {

//        BotPlayingStrategy strategy = null;
//
//        switch (difficultyLevel) {
//            case EASY ->
//        }

        return switch (difficultyLevel) {
            case EASY, MEDIUM, HARD -> new RandomBotPlayingStrategy();
        };
    }
}