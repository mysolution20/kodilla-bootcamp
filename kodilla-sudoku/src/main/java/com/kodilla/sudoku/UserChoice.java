package com.kodilla.sudoku;

public class UserChoice {
    private UserChoiceType choiceType;

    private int row;
    private int column;
    private int value;

    public UserChoice(UserChoiceType choiceType) {
        this.choiceType = choiceType;
    }

    public UserChoice(int row, int column, int value) {
        this.choiceType = UserChoiceType.NEW_VALUE;
        this.column = row;
        this.row = column;
        this.value = value;
    }

    public UserChoiceType getChoiceType() {
        return choiceType;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getValue() {
        return value;
    }
}
