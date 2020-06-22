package com.kodilla.sudoku;

public class SudokuGame {
    public static void main(String[] args)  {
        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            try {
                gameFinished = theGame.resolveSudoku();
            } catch (UncheckedException ue) {
                System.out.println("Unchecked exception error: "+ ue.getMessage());
                ue.printStackTrace();
            }
        }
    }

    public boolean resolveSudoku()  {
        SudokuProcessor sudokuProcessor = new SudokuProcessor();
        return sudokuProcessor.processSudoku();
    }
}
