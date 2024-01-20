package com.ishan.model;


import java.util.ArrayList;
import java.util.List;

public class Board {

    public int size;
    public PlayingPiece[][] board;

    /**
     * Constructor to initialize the board
     *
     * @param size Size of the board
     */
    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    /**
     * Method to add a playing piece to the board
     *
     * @param row          Row of the board
     * @param column       Column of the board
     * @param playingPiece Playing piece to be added
     * @return true if the piece is added successfully, false otherwise
     */
    public boolean addPiece(int row, int column, PlayingPiece playingPiece) {

        // if the row or column is out of bounds, return false
        if (row < 0 || row >= size || column < 0 || column >= size) {
            return false;
        }

        // if the cell is already occupied, return false
        if (board[row][column] != null) {
            return false;
        }

        // add the playing piece to the board
        board[row][column] = playingPiece;
        return true;
    }


    /**
     * Method to get the free cells on the board
     *
     * @return List of free cells
     */
    public List<Cell> getFreeCells() {
        List<Cell> freeCells = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    Cell freeCell = new Cell(i, j);
                    freeCells.add(freeCell);
                }
            }
        }
        return freeCells;
    }

    /**
     * Method to print the board
     */
    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}

