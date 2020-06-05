package com.kodilla.good.patterns.challanges;

import java.time.LocalDate;

public class OrderRequest {
    private final User user;
    private final Item item;
    private final LocalDate orderDate;
    private final LocalDate deliveryDate;

    public OrderRequest(final User user, final Item item, final LocalDate orderDate, final LocalDate deliveryDate) {
        this.user = user;
        this.item = item;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;

    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }
}


