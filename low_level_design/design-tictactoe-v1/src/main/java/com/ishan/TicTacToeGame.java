package com.ishan;

import com.ishan.model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame extends Game {
    Deque<Player> players;
    Board gameBoard;
    private static final Scanner inputScanner = new Scanner(System.in);

    @Override
    public void initialize() {

        // create a list for players
        players = new LinkedList<>();

        // create 2 Players
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player1", crossPiece);

        PlayingPieceO noughtsPiece = new PlayingPieceO();
        Player player2 = new Player("Player2", noughtsPiece);

        // add players to the list
        players.add(player1);
        players.add(player2);

        //initialize Board with size 3
        gameBoard = new Board(3);
    }

    @Override
    public GameResult start() {

        // loop until there is a winner or there are no free cells
        while (true) {

            //take out the player whose turn is and also put the player in the list back
            Player playerTurn = players.removeFirst();

            // print the board to the console
            gameBoard.printBoard();

            // get the free cells on the board
            List<Cell> freeSpaces = gameBoard.getFreeCells();

            // if there are no free cells left on the board, so there is no winner
            if (freeSpaces.isEmpty()) {
                return new GameResult(GameResult.ResultType.TIE, null);
            }

            // read the user input
            System.out.print("Player: " + playerTurn.name + " Enter row,column: ");

            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.parseInt(values[0]);
            int inputColumn = Integer.parseInt(values[1]);

            // place the playingPiece on the board at the given row and column position
            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow, inputColumn, playerTurn.playingPiece);
            if (!pieceAddedSuccessfully) {
                // player can not insert the piece into this cell, player has to choose another cell
                System.out.println("Incorrect position chosen, try again");
                // since the same player has to play again, add the player back to front of the list
                players.addFirst(playerTurn);
                // continue the loop
                continue;
            }

            // otherwise add the player back to the end of the list
            players.addLast(playerTurn);

            // after each move, check if there is a winner of the game
            if (isThereWinner(inputRow, inputColumn, playerTurn.playingPiece.pieceType)) {
                // print the final board position to the console
                gameBoard.printBoard();
                return new GameResult(GameResult.ResultType.WIN, playerTurn);
            }
        }
    }

    public boolean isThereWinner(int row, int column, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // need to check in row
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
                break;
            }
        }

        // need to check in column
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType) {
                columnMatch = false;
                break;
            }
        }

        // need to check diagonals
        for (int i = 0, j = 0; i < gameBoard.size; i++, j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
                break;
            }
        }

        // need to check anti-diagonals
        for (int i = 0, j = gameBoard.size - 1; i < gameBoard.size; i++, j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
                break;
            }
        }
        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}

