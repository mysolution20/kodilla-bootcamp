package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;

public class DeliveryRequest {
    private final Buyer buyer;
    private final FoodItem foodItem;
    private final LocalDate orderDate;
    private final LocalDate deliveryDate;

    public DeliveryRequest(Buyer buyer, FoodItem foodItem, LocalDate orderDate, LocalDate deliveryDate) {
        this.buyer = buyer;
        this.foodItem = foodItem;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }
}
