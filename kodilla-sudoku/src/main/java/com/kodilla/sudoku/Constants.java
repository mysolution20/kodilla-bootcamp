package com.kodilla.sudoku;

public class Constants {

    public static final int MAX_COLUMN = 9;
    public static final int MIN_COLUMN = 0;
    public static final int MAX_ROWS = 9;
    public static final int MIN_ROWS = 0;
    public static final int MIN_VALUE = 1;
    public static final int MAX_VALUE = 9;

    public static final String USER_MANUAL() {
        return "==================== SUDOKU =====================\n" +
                "  You can type: 3 numbers: rcv \n" +
                "  where: r is row, c is column and v means value \n" +
                "  for example: 321 \n" +
                "-------------------------------------------------\n" +
                "-------------- Another options are: -------------\n" +
                "  type: sudoku - if you want to resolve sudoku   \n" +
                "  type: n      - if you want to start a new game \n" +
                "  type: x      - if you going to exit the game   \n" +
                "=================================================";
    }
}
