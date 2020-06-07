package com.kodilla.good.patterns.food2door;

public class DeliveryCompletion {
    FoodProducer foodProducer;
    DeliveryRequest deliveryRequest;

    public DeliveryCompletion(FoodProducer foodProducer, DeliveryRequest deliveryRequest) {
        this.foodProducer = foodProducer;
        this.deliveryRequest = deliveryRequest;
    }

    public FoodProducer getFoodProducer() {
        return foodProducer;
    }

    public DeliveryRequest getDeliveryRequest() {
        return deliveryRequest;
    }
}
