package com.ishan.tictactoe.strategies.botplayingstrategies;

import com.ishan.tictactoe.models.Board;
import com.ishan.tictactoe.models.Move;
import com.ishan.tictactoe.models.Player;

public interface BotPlayingStrategy {
    Move makeNextMove(Board board, Player player);
}