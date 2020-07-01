package com.kodilla.sudoku;

public class SudokuGame {
    public static void main(String[] args)  {
        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
                gameFinished = theGame.resolveSudoku();
        }
    }

    public boolean resolveSudoku()  {
        SudokuProcessor sudokuProcessor = new SudokuProcessor();
        return sudokuProcessor.processSudoku();
    }
}
