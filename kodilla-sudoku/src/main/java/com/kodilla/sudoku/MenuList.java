package com.kodilla.sudoku;

import java.util.Scanner;

import static com.kodilla.sudoku.Constants.*;

public class MenuList {

    private static final Scanner scanner = new Scanner(System.in);

    public static UserChoice getUserChoice() {
        System.out.println(USER_MANUAL());
        System.out.println();

        String input = scanner.next();
        boolean isDigits = input.chars().allMatch(Character::isDigit);
        boolean digitsCorrectLength = input.length() == 3;

        switch (input.toLowerCase()) {
            case "sudoku":
                return new UserChoice(UserChoiceType.SUDOKU_SOLVE);
            case "n":
                return newGame();
            case "x":
                return exitGame();
            default:
                if (isDigits && digitsCorrectLength) {
                    char[] inputTab = input.toCharArray();
                    int column = Character.getNumericValue(inputTab[0]);
                    int row = Character.getNumericValue(inputTab[1]);
                    int value = Character.getNumericValue(inputTab[2]);
                    return new UserChoice(column, row, value);
                } else {
                    return new UserChoice(UserChoiceType.NONE);
                }
        }
    }

    private static UserChoice newGame() {
        boolean correctInput = false;
        do {
        System.out.println("Do you want to start a new game? y/n");
        String input = scanner.next();

            if (input.equalsIgnoreCase("y")) {
                correctInput = true;
                return new UserChoice(UserChoiceType.NEW_GAME);
            }
            if (input.equalsIgnoreCase("n")) {
                correctInput = true;
                return new UserChoice(UserChoiceType.EXIT_GAME);
            }
        } while (!correctInput);

        return new UserChoice(UserChoiceType.NONE);
    }

    private static UserChoice exitGame() {
        boolean correctInput = false;
        do {
        System.out.println("Do you want exit? y/n");
        String input = scanner.next();

            if (input.equalsIgnoreCase("y")) {
                correctInput = true;
                return new UserChoice(UserChoiceType.EXIT_GAME);
            }
            if (input.equalsIgnoreCase("n")) {
                correctInput = true;
                return new UserChoice(UserChoiceType.NONE);
            }
        } while (!correctInput);

        return new UserChoice(UserChoiceType.NONE);
    }

    public static void printIncorrectValueToSet(UserChoice choice) {
        System.out.println("Incorrect value: " + choice);
    }

    public static void show(String text) {
        System.out.println(text);
    }
}
