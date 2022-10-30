package com.ishan.lld.tictactoev2.strategies.botplayingstrategy;

import com.ishan.lld.tictactoev2.models.Board;
import com.ishan.lld.tictactoev2.models.Move;
import com.ishan.lld.tictactoev2.models.Player;

public interface BotPlayingStrategy {

    Move makeMove(Board board, Player player);
}
