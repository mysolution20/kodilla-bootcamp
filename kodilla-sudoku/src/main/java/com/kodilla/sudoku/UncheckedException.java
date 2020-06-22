package com.kodilla.sudoku;

public class UncheckedException extends RuntimeException {
    public UncheckedException() {
        super("Variables are invalid");
    }
}
