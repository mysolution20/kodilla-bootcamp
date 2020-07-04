package com.kodilla.sudoku;

import java.util.Arrays;

import static com.kodilla.sudoku.Constants.*;

public class SudokuBoard {

    SudokuRow[] board = new SudokuRow[MAX_ROWS + 1];

    public SudokuBoard() {
        for (int row = 0; row < MAX_ROWS; row++) {
            board[row] = new SudokuRow();
        }
    }

    public SudokuRow[] getBoard() {
        return board;
    }

    public void setValueToCell(int row, int column, int value) throws IncorrectValueException {
        if (canSetValue(row, column, value)) {
            throw new IncorrectValueException("Incorrect value " + value + " in row " + row + " column " + column);
        }
        board[row].getSudokuElements().get(column).setValue(value);
    }

    public int getValue(int row, int column) throws IncorrectValueException {
        if (correctRowAndColumn(row, column)) {
            throw new IncorrectValueException("Number for row and column must be between 1 and 9.");
        }
        return board[row].getSudokuElements().get(column).getValue();
    }

    public boolean checkIfEntryRepeat(int currentRow, int currentColumn, int currentValue) {
        for (int c = 0; c < 9; c++) {
            int boardRowVal = getBoard()[currentRow].getSudokuElements().get(c).getValue();
            if (boardRowVal == currentValue) {
                System.out.println("Current value: " + currentValue + " repeats in the same column!");
                return true;
            }
        }

        for (int row = 0; row < 9; row++) {
            int boardColVal = getBoard()[row].getSudokuElements().get(currentColumn).getValue();
            if (boardColVal == currentValue) {
                System.out.println("Current value: " + currentValue + ": repeats in the same row!");
                return true;
            }
        }

        int rowColumn = currentColumn - currentColumn % 3;
        int rowStart = currentRow - currentRow % 3;
        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = rowColumn; j < rowColumn + 3; j++) {
                int subBoardVal = getBoard()[i].getSudokuElements().get(j).getValue();
                if (subBoardVal == currentValue) {
                    System.out.println("Current value: " + subBoardVal + ": repeats in the same sub board");
                    return true;
                }
            }
        }
        return false;
    }

    public boolean canResolve() {
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                if (getBoard()[row].getSudokuElements().get(column).getValue() == -1) {
                    for (int value = 1; value <= 9; value++) {
                        try {
                            if (setNum(row, column, value)) {
                                board[row].getSudokuElements().get(column).setValue(value);
                                if (canResolve()) {
                                    return true;
                                } else {
                                    board[row].getSudokuElements().get(column).setValue(-1);
                                }
                            }
                        } catch (IncorrectValueException e) {
                            System.out.println("Unexpected values: " + e.getMessage());
                            e.printStackTrace();
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void setStartElementOnNewGameBoard() {
        SudokuElement sudokuElement = new SudokuElement();
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                board[row].getSudokuElements().get(column).setValue(sudokuElement.getValue());
            }
        }
    }

    public String printFulfilledSudoku() {
        StringBuilder sudokuResolvedBoard = new StringBuilder("    1   2   3   4   5   6   7   8   9" + "\n");
        for (int column = 0; column < MAX_ROWS; column++) {
            sudokuResolvedBoard.append(1 + column).append(" |");
            for (int row = 0; row < MAX_COLUMN; row++) {
                sudokuResolvedBoard.append(" ").append(getBoard()[row].getSudokuElements().get(column).getValue()).append(" ").append("|");
            }
            sudokuResolvedBoard.append("\n");
        }
        return sudokuResolvedBoard.toString();
    }

    @Override
    public String toString() {
        StringBuilder handFilledBoard = new StringBuilder("    1   2   3   4   5   6   7   8   9" + "\n");
        for (int column = 0; column < MAX_ROWS; column++) {
            handFilledBoard.append(1 + column).append(" |");
            for (int row = 0; row < MAX_COLUMN; row++) {
                if (getBoard()[row].getSudokuElements().get(column).getValue() == -1) {
                    handFilledBoard.append(" - ");
                } else {
                    handFilledBoard.append(" ").append(getBoard()[row].getSudokuElements().get(column).getValue()).append(" ");
                }
                handFilledBoard.append("|");
            }
            handFilledBoard.append("\n");
        }
        return handFilledBoard.toString();
    }

    private boolean rowCheck(int row, int value) throws IncorrectValueException {
        if (correctRowAndColumn(row, value)) {
            throw new IncorrectValueException("Number for row and value must be between 1 and 9.");
        }
        for (int i = 0; i < MAX_ROWS; i++) {
            if (getValue(row, i) == value) {
                return true;
            }
        }
        return false;
    }

    private boolean colCheck(int column, int value) throws IncorrectValueException {
        if (correctRowAndColumn(column, value)) {
            throw new IncorrectValueException("Number for column and value must be between 1 and 9.");
        }
        for (int i = 0; i < MAX_COLUMN; i++) {
            if (getValue(i, column) == value) {
                return true;
            }
        }
        return false;
    }

    private boolean boxCheck(int row, int column, int value) throws IncorrectValueException {
        if (canSetValue(row, column, value)) {
            throw new IncorrectValueException("Number for row, column and value must be between 1 and 9.");
        }
        int rowStart = row - row % 3;
        int colStart = column - column % 3;
        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = colStart; j < colStart + 3; j++) {
                if (getValue(i, j) == value) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean setNum(int row, int column, int value) throws IncorrectValueException {
        if (canSetValue(row, column, value)) {
            throw new IncorrectValueException("Number for row, column and value must be between 1 and 9.");
        }
        return !rowCheck(row, value) && !colCheck(column, value) && !boxCheck(row, column, value);
    }

    private boolean canSetValue(int row, int column, int value) {
        boolean correctValue = (value >= MIN_VALUE) && (value <= MAX_VALUE);
        return !correctValue || correctRowAndColumn(row, column);
    }

    private boolean correctRowAndColumn(int row, int column) {
        boolean correctRow = (row >= MIN_ROWS) && (row <= MAX_ROWS);
        boolean correctColumn = (column >= MIN_COLUMN) && (column <= MAX_COLUMN);
        return !correctRow || !correctColumn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SudokuBoard that = (SudokuBoard) o;
        return Arrays.equals(getBoard(), that.getBoard());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getBoard());
    }
}
