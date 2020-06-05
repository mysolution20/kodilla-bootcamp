package com.kodilla.good.patterns.challanges;

public class OrderDto {
    public User user;
    public Item item;
    public boolean isOrdered;

    public OrderDto(final User user, final Item item, final boolean isOrdered) {
        this.user = user;
        this.item = item;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
