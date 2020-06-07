package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;

public class DeliveryRequestExecute {
    public DeliveryCompletion order() {
        FoodProducer foodProducer = new FoodProducer("ExtraFoodShop");
        Buyer buyer = new Buyer("Piotr Nowak");
        FoodItem foodItem = new FoodItem("Tomatoes", 2);
        LocalDate orderDate = LocalDate.of(2020, 8, 1);
        LocalDate deliveryDate = LocalDate.of(2020, 9, 6);

        DeliveryRequest deliveryRequest = new DeliveryRequest(buyer, foodItem, orderDate, deliveryDate);
        return new DeliveryCompletion(foodProducer, deliveryRequest);
    }
}
