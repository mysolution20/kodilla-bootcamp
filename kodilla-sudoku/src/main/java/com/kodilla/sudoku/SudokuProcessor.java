package com.kodilla.sudoku;

public class SudokuProcessor {

    private SudokuBoard board;
    public boolean processSudoku()  {

        board = new SudokuBoard();
        boolean finishGame = false;
        boolean newGame = false;
        do {
            UserChoice choice = MenuList.getUserChoice();
            switch (choice.getChoiceType()) {
                case EXIT_GAME:
                    finishGame = true;
                    break;
                case NONE:
                    break;
                case NEW_GAME:
                    board.setStartElementOnNewGameBoard();
                    newGame = true;
                case NEW_VALUE:
                    setValue(choice);
                    MenuList.show(board.toString());
                    break;
                case SUDOKU_SOLVE:
                    board.canResolve();
                    MenuList.show(board.printFulfilledSudoku());
                    break;
            }
        } while (!finishGame || !newGame);
        return true;
    }

    private void setValue(UserChoice choice) {
        try {
            board.setValueToCell(choice.getColumn() - 1, choice.getRow() - 1, choice.getValue());
        } catch (Exception e) {
            MenuList.printIncorrectValueToSet(choice);
        }
    }
}
