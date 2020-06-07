package com.kodilla.good.patterns.food2door;


import java.time.LocalDate;

public interface DeliveryRepository {
    void createDelivery(FoodProducer foodProducer, Buyer buyer, FoodItem foodItem, LocalDate orderDate, LocalDate deliveryDate);
}
