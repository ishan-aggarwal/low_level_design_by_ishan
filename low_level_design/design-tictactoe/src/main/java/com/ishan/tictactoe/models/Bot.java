package com.ishan.tictactoe.models;

import com.ishan.tictactoe.factories.botplayingstrategyfactory.BotPlayingStrategyFactory;
import com.ishan.tictactoe.strategies.botplayingstrategies.BotPlayingStrategy;

public class Bot extends Player {
    private BotPlayingStrategy botPlayingStrategy;
    private BotDifficultyLevel botDifficultyLevel;

    public Bot(Symbol symbol, BotDifficultyLevel botDifficultyLevel) {
        super(PlayerType.BOT, symbol);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = new BotPlayingStrategyFactory().createBotPlayingStrategyForDifficultyLevel(
                botDifficultyLevel
        );
    }

    @Override
    public Move makeMove(Board board) {
        return this.botPlayingStrategy.makeNextMove(board, this);
    }
}