package com.ishan.lld.tictactoev2.models;

import com.ishan.lld.tictactoev2.factories.BotPlayingStrategyFactory;
import com.ishan.lld.tictactoev2.strategies.botplayingstrategy.BotPlayingStrategy;

public class Bot extends Player {
    private final BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategyByDifficultyLevel(botDifficultyLevel);
    }

    @Override
    public Move makeMove(Board board) {
        return botPlayingStrategy.makeMove(board, this);
    }
}
