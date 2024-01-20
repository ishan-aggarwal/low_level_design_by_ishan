package com.ishan;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    final Deque<Player> playersList = new LinkedList<>();
    Player winner;

    public Game() {
        initializeGame();
    }

    private void initializeGame() {
        board = new Board(10, 5, 4);
        dice = new Dice(1);
        addPlayers();
    }

    private void addPlayers() {
        Player player1 = new Player("Player 1", 0);
        Player player2 = new Player("Player 2", 0);
        playersList.add(player1);
        playersList.add(player2);
    }

    // Start the game and keep rolling the dice until we get a winner
    public void startGame() {

        while (winner == null) {
            //check whose turn now
            Player playerTurn = findPlayerTurn();
            System.out.println("\nPlayer turn is: " + playerTurn.name);
            System.out.println(playerTurn.name + " current position is: " + playerTurn.currentPosition);

            //roll the dice
            int diceNumbers = dice.rollDice();
            int totalDiceNumbers = diceNumbers;
            System.out.println("Dice number is: " + diceNumbers);
            while (diceNumbers == 6) {
                diceNumbers = dice.rollDice();
                totalDiceNumbers += diceNumbers;
                System.out.println("Next dice number is: " + diceNumbers);
            }

            //get the new position
            int playerNewPosition = playerTurn.currentPosition + totalDiceNumbers;
            playerNewPosition = jumpCheck(playerNewPosition);

            // check for winning condition
            if (playerNewPosition == board.cells.length * board.cells.length) {
                winner = playerTurn;
                playerTurn.currentPosition = playerNewPosition;
                System.out.println(playerTurn.name + " new Position is: " + playerNewPosition);
                break;
            } else if (playerNewPosition > board.cells.length * board.cells.length) {
                System.out.println(playerTurn.name + " cannot move");
            } else {
                playerTurn.currentPosition = playerNewPosition;
                System.out.println(playerTurn.name + " new Position is: " + playerNewPosition);
            }
        }
        System.out.println("Game Winner is: " + winner.name);
    }

    private Player findPlayerTurn() {
        Player playerWithTurn = playersList.removeFirst();
        playersList.addLast(playerWithTurn);
        return playerWithTurn;
    }

    private int jumpCheck(int playerNewPosition) {

        if (playerNewPosition > board.cells.length * board.cells.length - 1) {
            return playerNewPosition;
        }

        Cell cell = board.getCell(playerNewPosition);
        if (cell.jump != null && cell.jump.start == playerNewPosition) {
            String jumpBy = (cell.jump.start < cell.jump.end) ? "ladder" : "snake";
            System.out.println("jump done by: " + jumpBy);
            return cell.jump.end;
        }
        return playerNewPosition;
    }
}

