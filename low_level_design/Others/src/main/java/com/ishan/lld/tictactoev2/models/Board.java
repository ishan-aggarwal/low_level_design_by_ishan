package com.ishan.lld.tictactoev2.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private int dimension;
    private List<List<Cell>> board;

    private Map<Player, Map<Integer, Integer>> playerToRowCountMap;
    private Map<Player, Map<Integer, Integer>> playerToColCountMap;
    private Map<Player, Map<Integer, Integer>> playerToDiagonalCountMap;

    public Cell getCell(int row, int col) {
        return board.get(row).get(col);
    }

    public Board(int dimension) {
        this.dimension = dimension;
        this.board = new ArrayList<>(); //[ [(), (), ()], [], []]

        for (int i = 0; i < dimension; ++i) {
            this.board.add(new ArrayList<>()); //[]

            for (int j = 0; j < dimension; ++j) {
                this.board.get(i).add(new Cell(i, j));
            }
        }

        this.playerToColCountMap = new HashMap<>();
        this.playerToRowCountMap = new HashMap<>();
        this.playerToDiagonalCountMap = new HashMap<>();
    }

    public Map<Player, Map<Integer, Integer>> getPlayerToRowCountMap() {
        return playerToRowCountMap;
    }

    public Map<Player, Map<Integer, Integer>> getPlayerToColCountMap() {
        return playerToColCountMap;
    }

    public Map<Player, Map<Integer, Integer>> getPlayerToDiagonalCountMap() {
        return playerToDiagonalCountMap;
    }

    public int getDimension() {
        return dimension;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void display() {
        for (List<Cell> row : board) {
            for (Cell cell : row) {
                if (cell.getPlayer() == null) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" " + cell.getPlayer().getSymbol().getCharacter() + " ");
                }
            }
            System.out.println();
        }
    }
}


// 1. Make classes with private attributes
// 2. Create getters and setters for those
// 3. Always create a constructor that initializes those attributes
