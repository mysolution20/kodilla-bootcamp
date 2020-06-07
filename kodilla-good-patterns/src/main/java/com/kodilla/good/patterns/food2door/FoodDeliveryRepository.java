package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;

public class FoodDeliveryRepository implements DeliveryRepository {
    @Override
    public void createDelivery(FoodProducer foodProducer, Buyer buyer, FoodItem foodItem, LocalDate orderDate, LocalDate deliveryDate) {
        System.out.println("System has created delivery for " + buyer.getBuyerName() + " at about "
                + foodItem.getQuantity() + " " + foodItem.getNameOfItem() + " at "
                + orderDate.toString() + " from " + foodProducer.getProducerName() + " with delivery date "
                + deliveryDate.toString()
        );
    }
}
