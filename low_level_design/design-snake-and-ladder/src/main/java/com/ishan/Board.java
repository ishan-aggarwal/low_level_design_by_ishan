package com.ishan;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;
    int boardSize;

    // constructor
    Board(int boardSize, int numberOfSnakes, int numberOfLadders) {
        initializeBoard(boardSize);
        addSnakesLadders(cells, numberOfSnakes, numberOfLadders);
    }

    /*
     * Initialize the board with cells
     */
    private void initializeBoard(int boardSize) {
        this.boardSize = boardSize;
        this.cells = new Cell[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                cells[i][j] = new Cell();
            }
        }
    }


    /*
     * Add snakes and ladders to the board
     */
    private void addSnakesLadders(Cell[][] cells, int numberOfSnakes, int numberOfLadders) {
        // add snakes to the board
        while (numberOfSnakes > 0) {
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);

            // snake tail should be less than snake head
            if (snakeTail >= snakeHead) {
                continue;
            }

            // create snake object
            Jump snakeObj = new Jump(snakeHead, snakeTail);
            // set snake object to the cell
            Cell cell = getCell(snakeHead);
            cell.setJump(snakeObj);

            // decrement the number of snakes to be added
            numberOfSnakes--;
        }

        // add ladders to the board
        while (numberOfLadders > 0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);

            // ladder end should be greater than ladder start
            if (ladderStart >= ladderEnd) {
                continue;
            }

            // create ladder object
            Jump ladderObj = new Jump(ladderStart, ladderEnd);
            //
            Cell cell = getCell(ladderStart);
            cell.jump = ladderObj;

            // decrement the number of ladders to be added
            numberOfLadders--;
        }
    }

    Cell getCell(int playerPosition) {
        int boardRow = playerPosition / cells.length;
        int boardColumn = (playerPosition % cells.length);
        return cells[boardRow][boardColumn];
    }
}

