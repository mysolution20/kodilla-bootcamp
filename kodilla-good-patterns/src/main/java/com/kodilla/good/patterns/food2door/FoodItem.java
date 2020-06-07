package com.kodilla.good.patterns.food2door;

public class FoodItem {
    private final String nameOfItem;
    private final int quantity;

    public FoodItem(String nameOfItem, int quantity) {
        this.nameOfItem = nameOfItem;
        this.quantity = quantity;
    }

    public String getNameOfItem() {
        return nameOfItem;
    }

    public int getQuantity() {
        return quantity;
    }
}
