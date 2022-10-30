package com.ishan.lld.tictactoev2;

import com.ishan.lld.tictactoev2.exceptions.DuplicateSymbolException;
import com.ishan.lld.tictactoev2.exceptions.InvalidNumberOfPlayersException;
import com.ishan.lld.tictactoev2.factories.BotDifficultyLevelFactory;
import com.ishan.lld.tictactoev2.factories.GameWinningStrategyNameEnumFactory;
import com.ishan.lld.tictactoev2.factories.PlayerFactory;
import com.ishan.lld.tictactoev2.models.*;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("How many players? (as of now 2 players are supported)");
        System.out.println("How many players?");
        int numberOfPlayers = scanner.nextInt();

        if (numberOfPlayers < 2) {
            throw new InvalidNumberOfPlayersException(numberOfPlayers);
        }

        System.out.println("How many bots?");
        int numberOfBots = scanner.nextInt();

        List<Player> players = new ArrayList<>();
        Set<Character> usedSymbols = new HashSet<>();

        for (int i = 0; i < numberOfBots; ++i) {
            System.out.println("Name of Bot " + (i + 1));
            String botName = scanner.next();

            System.out.println("Symbol of Bot " + (i + 1));
            Character character = scanner.next().charAt(0);
            if (usedSymbols.contains(character)) {
                throw new DuplicateSymbolException(character);
            }
            usedSymbols.add(character);

            System.out.println("Difficulty of Bot " + (i + 1));
            System.out.println("Supported Bot difficulties are: " + Arrays.stream(BotDifficultyLevel.values()).collect(Collectors.toList()));
            String difficultyLevel = scanner.next();
            BotDifficultyLevel botDifficultyLevel = BotDifficultyLevelFactory.getBotDifficultyLevelByName(difficultyLevel);

            players.add(PlayerFactory.createBot(botName, character, botDifficultyLevel));
        }

        for (int i = numberOfBots; i < numberOfPlayers; ++i) {
            System.out.println("Name of Player " + (i - numberOfBots + 1));
            String name = scanner.next();

            System.out.println("Symbol of Player " + (i - numberOfBots + 1));
            Character character = scanner.next().charAt(0);
            if (usedSymbols.contains(character)) {
                throw new DuplicateSymbolException(character);
            }
            usedSymbols.add(character);

            players.add(PlayerFactory.createHumanPlayer(name, character));
        }

        System.out.println("How many winning strategies?");
        Integer winningStrategiesCount = scanner.nextInt();
        System.out.println("Supported Game Winning Strategy are: " + Arrays.stream(GameWinningStrategyName.values()).collect(Collectors.toList()));

        List<GameWinningStrategyName> gameWinningStrategyNames = new ArrayList<>();

        for (int i = 0; i < winningStrategiesCount; ++i) {
            System.out.println("Name strategy " + i);
            gameWinningStrategyNames.add(GameWinningStrategyNameEnumFactory.
                    getGameWinningStrategyNameFromString(scanner.next()));
        }

        Game game = Game.getBuilder()
                .setGameWinningStrategies(gameWinningStrategyNames)
                .setPlayers(players)
                .build();

        while (game.getGameStatus().equals(GameStatus.IN_PROGRESS)) {
            game.makeMove();
            if (game.getGameStatus().equals(GameStatus.DRAW)) {
                System.out.println("Game resulted in a draw!");
            } else if (game.getGameStatus().equals(GameStatus.ENDED)) {
                System.out.println("Congrats " + game.getWinner().getName() + " !! You have won :-)");
            }
        }
    }
}

// Client -> Main -> Controller -> Models

// person interacts by 1 by 1 giving inputs into the command line and playing the game
// Lifecycle of a game
// 0. Start a game
// 1. Create Players, choose symbols
// 2. Determine the size
// 3. Decide Winning Rules

// Break till 10: 35 PM

// 1. Implement all the 3 WinningStrategies
//   a. COLUMN
//   b. ROW
//   c. Diagonal

// 2. After the game status is no longer IN_PROGRESS, print if draw => Draw
// Else print Congrats {Name}!

// Ref: https://github.com/Naman-Bhalla/ticTacToeJul22