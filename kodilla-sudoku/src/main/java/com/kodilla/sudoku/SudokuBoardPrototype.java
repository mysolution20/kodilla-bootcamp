package com.kodilla.sudoku;

public class SudokuBoardPrototype<T> implements Cloneable {
    @Override
    public T clone() throws CloneNotSupportedException {
        return (T) super.clone();
    }
}
