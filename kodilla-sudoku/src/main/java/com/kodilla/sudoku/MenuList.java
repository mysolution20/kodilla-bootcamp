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

                    if (canCheck()) {
                        return new UserChoice(column, row, value);
                    } else {
                        return new UserChoice(UserChoiceType.NONE);
                    }

                } else {
                    return new UserChoice(UserChoiceType.NONE);
                }
        }
    }

    private static UserChoice newGame() {
        boolean correctInput = false;
        System.out.println("Do you want to start a new game? y/n");
        String input = scanner.next();
        if (input.equalsIgnoreCase("y")) {
            return new UserChoice(UserChoiceType.NEW_GAME);
        }
        if (input.equalsIgnoreCase("n")) {
            return new UserChoice(UserChoiceType.EXIT_GAME);
        }
        return new UserChoice(UserChoiceType.NONE);
    }

    private static UserChoice exitGame() {
        boolean correctInput = false;
        System.out.println("Do you want exit? y/n");
        String input = scanner.next();
        if (input.equalsIgnoreCase("y")) {
            return new UserChoice(UserChoiceType.EXIT_GAME);
        }
        return new UserChoice(UserChoiceType.NONE);
    }

    public static void printIncorrectValueToSet(UserChoice choice) {
        System.out.println("Incorrect value: " + choice);
    }

    public static void show(String text) {
        System.out.println(text);
    }


//    private static UserChoice exitGame() {
//        boolean correctInput = false;
//        do {
//            System.out.println("Do you want exit? y/n");
//            String input = scanner.next();
//            if(input.equalsIgnoreCase("y")) {
//                correctInput = true;
//                return new UserChoice(UserChoiceType.EXIT_GAME);
//            }
//            if(input.equalsIgnoreCase("n")) {
//                correctInput = true;
//                return new UserChoice(UserChoiceType.NONE);
//            }
//        } while (!correctInput);
//        return new UserChoice(UserChoiceType.NONE);
//    }


    private static boolean canCheck() {
        SudokuBoard sudokuBoard = new SudokuBoard();
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                if (sudokuBoard.getBoard()[column].getSudokuElements().get(row).getValue() == -1) {
                    for (int value = 1; value <= 9; value++) {
                        try {
                            if (setNum(row, column, value)) {
//                                board[column].getSudokuElements().get(row).setValue(value);
                                if (canCheck()) {
                                    System.out.println("Sudoku ok");
                                    return true;
                                } else {
                                    System.out.println("Sudoku can not be solved");
                                    return false;
                                }
                            }
                        } catch (IncorrectValueException e) {
                            System.out.println("Unexpected values: " + e.getMessage());
                            e.printStackTrace();
                        }
                    }
                    return false;  // out of range
                }
            }
        }
        return true;
    }


    private static boolean setNum(int row, int column, int value) throws IncorrectValueException {
        return !rowCheck(row, value) && !colCheck(column, value) && !boxCheck(row, column, value);
    }

    private static boolean rowCheck(int row, int value) throws IncorrectValueException {
        SudokuBoard sudokuBoard = new SudokuBoard();
        for (int i = 0; i < MAX_ROWS; i++) {
            if (sudokuBoard.getValue(row, i) == value) {
                return true;
            }
        }
        return false;
    }

    private static boolean colCheck(int column, int value) throws IncorrectValueException {
        SudokuBoard sudokuBoard = new SudokuBoard();
        for (int i = 0; i < MAX_COLUMN; i++) {
            if (sudokuBoard.getValue(i, column) == value) {
                return true;
            }
        }
        return false;
    }

    private static boolean boxCheck(int row, int column, int value) throws IncorrectValueException {
        SudokuBoard sudokuBoard = new SudokuBoard();
        int rowStart = row - row % 3;
        int colStart = column - column % 3;
        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = colStart; j < colStart + 3; j++) {
                if (sudokuBoard.getValue(i, j) == value) {
                    return true;
                }
            }
        }
        return false;
    }


}
