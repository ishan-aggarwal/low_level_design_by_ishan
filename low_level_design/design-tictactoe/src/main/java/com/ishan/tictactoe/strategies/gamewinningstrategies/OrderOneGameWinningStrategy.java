package com.ishan.tictactoe.strategies.gamewinningstrategies;

import com.ishan.tictactoe.models.Board;
import com.ishan.tictactoe.models.Cell;
import com.ishan.tictactoe.models.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderOneGameWinningStrategy implements GameWinningStrategy {
    private List<HashMap<Character, Integer>> rowCharCounts;
    private List<HashMap<Character, Integer>> colCharCounts;

//    private Map<Integer, Map<Player, Integer>> rowCharCountMap;
//    private Map<Integer, Map<Player, Integer>> columnCharCountMap;


    private void initializeCounts(Board board) {
        rowCharCounts = new ArrayList<>();
        colCharCounts = new ArrayList<>();
//        rowCharCountMap = new HashMap<>();
//        columnCharCountMap = new HashMap<>();

        for (int i = 0; i < board.getDimension(); ++i) {
            rowCharCounts.add(new HashMap<>());
            colCharCounts.add(new HashMap<>());
        }
    }

    @Override
    public boolean checkIfWon(Board board, Player player, Cell moveCell) {
        if (rowCharCounts == null) {
            initializeCounts(board);
        }

        int row = moveCell.getRow();
        int col = moveCell.getColumn();

        if (!rowCharCounts.get(row).containsKey(moveCell.getSymbol().getCharacter())) {
            rowCharCounts.get(row).put(moveCell.getSymbol().getCharacter(), 0);
        }

        if (!colCharCounts.get(col).containsKey(moveCell.getSymbol().getCharacter())) {
            colCharCounts.get(col).put(moveCell.getSymbol().getCharacter(), 0);
        }

        rowCharCounts.get(row).put(
                moveCell.getSymbol().getCharacter(),
                1 + rowCharCounts.get(row).get(moveCell.getSymbol().getCharacter())
        );

        colCharCounts.get(col).put(
                moveCell.getSymbol().getCharacter(),
                1 + colCharCounts.get(col).get(moveCell.getSymbol().getCharacter())
        );

        if (rowCharCounts.get(row).get(moveCell.getSymbol().getCharacter()).equals(board.getDimension())) {
            return true;
        }

        if (colCharCounts.get(col).get(moveCell.getSymbol().getCharacter()).equals(board.getDimension())) {
            return true;
        }
        return false;
    }
}