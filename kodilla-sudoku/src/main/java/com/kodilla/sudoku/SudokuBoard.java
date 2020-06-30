package com.kodilla.sudoku;

import java.util.Arrays;
import java.util.List;

import static com.kodilla.sudoku.Constants.*;

public class SudokuBoard extends SudokuBoardPrototype {

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
        board[column].getSudokuElements().get(row).setValue(value);
    }

    public int getValue(int row, int column) throws IncorrectValueException {
        if (correctColumnAndRow(row, column)) {
            throw new IncorrectValueException("Number for row and column must be between 1 and 9.");
        }
        return board[column].getSudokuElements().get(row).getValue();
    }

    public boolean checkIfEntryRepeat(int currentRow, int currentColumn, int currentValue) {
        for (int r = 0; r < 9; r++) {
            int boardRowVal = getBoard()[currentColumn].getSudokuElements().get(r).getValue();
            if (boardRowVal == currentValue) {
                System.out.println("Current value: " + currentValue + " repeats in the same column");
                return true;
            }
        }

        for (int col = 0; col < 9; col++) {
            int boardColVal = getBoard()[col].getSudokuElements().get(currentRow).getValue();
            if (boardColVal == currentValue) {
                System.out.println("Current value: " + currentValue + ": repeats in the same row");
                return true;
            }
        }

        int rowStart = currentRow - currentRow % 3;
        int colStart = currentColumn - currentColumn % 3;
        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = colStart; j < colStart + 3; j++) {
                int subBoardVal = getBoard()[j].getSudokuElements().get(i).getValue();
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
                if (getBoard()[column].getSudokuElements().get(row).getValue() == -1) {
                    for (int value = 1; value <= 9; value++) {
                        try {
                            if (setNum(row, column, value)) {
                                board[column].getSudokuElements().get(row).setValue(value);
                                if (canResolve()) {
                                    return true;
                                } else {
                                    board[column].getSudokuElements().get(row).setValue(-1);
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
                board[column].getSudokuElements().get(row).setValue(sudokuElement.getValue());
            }
        }
    }

    public String printFulfilledSudoku() {
        StringBuilder sudokuResolvedBoard = new StringBuilder("    1   2   3   4   5   6   7   8   9" + "\n");
        for (int row = 0; row < MAX_ROWS; row++) {
            sudokuResolvedBoard.append(1 + row).append(" |");
            for (int column = 0; column < MAX_COLUMN; column++) {
                sudokuResolvedBoard.append(" ").append(getBoard()[column].getSudokuElements().get(row).getValue()).append(" ").append("|");
            }
            sudokuResolvedBoard.append("\n");
        }
        return sudokuResolvedBoard.toString();
    }

    @Override
    public String toString() {
        StringBuilder handFilledBoard = new StringBuilder("    1   2   3   4   5   6   7   8   9" + "\n");
        for (int row = 0; row < MAX_ROWS; row++) {
            handFilledBoard.append(1 + row).append(" |");
            for (int column = 0; column < MAX_COLUMN; column++) {
                if (getBoard()[column].getSudokuElements().get(row).getValue() == -1) {
                    handFilledBoard.append(" - ");
                } else {
                    handFilledBoard.append(" ").append(getBoard()[column].getSudokuElements().get(row).getValue()).append(" ");
                }
                handFilledBoard.append("|");
            }
            handFilledBoard.append("\n");
        }
        return handFilledBoard.toString();
    }

    private boolean rowCheck(int row, int value) throws IncorrectValueException {
        if (correctColumnAndRow(row, value)) {
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
        if (correctColumnAndRow(column, value)) {
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

    private boolean canSetValue(int column, int row, int value) {
        boolean correctValue = (value >= MIN_VALUE) && (value <= MAX_VALUE);
        return !correctValue || correctColumnAndRow(column, row);
    }

    private boolean correctColumnAndRow(int column, int row) {
        boolean correctColumn = (column >= MIN_COLUMN) && (column <= MAX_COLUMN);
        boolean correctRow = (row >= MIN_ROWS) && (row <= MAX_ROWS);
        return !correctColumn || !correctRow;
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

    public SudokuBoard deepCopy() throws CloneNotSupportedException {
//      SudokuBoard deepClonedBackTrackBoard = (SudokuBoard) super.clone();
        SudokuBoard deepClonedBackTrackBoard = (SudokuBoard) this.clone();
        deepClonedBackTrackBoard.board = new SudokuRow[MAX_ROWS + 1];
        for (int i = 0; i < MAX_ROWS; i++) {
            List<SudokuElement> elements = board[i].getSudokuElements();
            for (int j = 0; j < elements.size(); j++) {
                deepClonedBackTrackBoard.board[i].getSudokuElements().get(j).setValue(elements.get(j).getValue());
            }
        }
        return deepClonedBackTrackBoard;
    }
}
