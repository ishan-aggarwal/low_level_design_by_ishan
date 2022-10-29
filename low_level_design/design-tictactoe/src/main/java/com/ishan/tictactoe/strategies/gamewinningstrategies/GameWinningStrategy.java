package com.ishan.tictactoe.strategies.gamewinningstrategies;

import com.ishan.tictactoe.models.Board;
import com.ishan.tictactoe.models.Cell;
import com.ishan.tictactoe.models.Player;

public interface GameWinningStrategy {

    boolean checkIfWon(Board board, Player player, Cell moveCell);
}