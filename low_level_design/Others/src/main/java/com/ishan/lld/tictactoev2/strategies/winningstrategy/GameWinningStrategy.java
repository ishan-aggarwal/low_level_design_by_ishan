package com.ishan.lld.tictactoev2.strategies.winningstrategy;

import com.ishan.lld.tictactoev2.models.Board;
import com.ishan.lld.tictactoev2.models.Move;

public interface GameWinningStrategy {

    boolean checkVictory(Board board, Move lastMove);
}
