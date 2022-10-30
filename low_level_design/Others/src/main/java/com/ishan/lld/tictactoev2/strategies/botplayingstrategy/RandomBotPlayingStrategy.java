package com.ishan.lld.tictactoev2.strategies.botplayingstrategy;

import com.ishan.lld.tictactoev2.models.Board;
import com.ishan.lld.tictactoev2.models.Cell;
import com.ishan.lld.tictactoev2.models.Move;
import com.ishan.lld.tictactoev2.models.Player;

import java.util.List;

public class RandomBotPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Move makeMove(Board board, Player player) {

        for (List<Cell> row : board.getBoard()) {
            for (Cell cell : row) {
                if (cell.getPlayer() == null) {
                    return new Move(cell.getRow(), cell.getColumn(), player);
                }
            }
        }
        return null;
    }
}
