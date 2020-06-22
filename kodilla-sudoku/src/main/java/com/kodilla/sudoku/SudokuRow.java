package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Objects;

public class SudokuRow {
    private final ArrayList<SudokuElement> sudokuElement = new ArrayList<>();

    public SudokuRow(){
        for(int i=0; i<9; i++) {
            sudokuElement.add(i,new SudokuElement());
        }
    }
    public ArrayList<SudokuElement> getSudokuElements() {
        return sudokuElement;
    }

    @Override
    public String toString() {
        return "SudokuRow{" +
                "sudokuElement=" + sudokuElement +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SudokuRow sudokuRow = (SudokuRow) o;
        return Objects.equals(sudokuElement, sudokuRow.sudokuElement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sudokuElement);
    }
}
