package com.kodilla.good.patterns.orders;

public class Item {
    private final String nameOfItem;
    private final int quantity;

    public Item(String nameOfItem, int quantity) {
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
