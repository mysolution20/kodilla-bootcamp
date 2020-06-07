package com.kodilla.good.patterns.food2door;
import com.kodilla.good.patterns.orders.OrderRequest;

public class DeliveryCompletion {
    FoodProducer foodProducer;
     OrderRequest orderRequest;

    public DeliveryCompletion(FoodProducer foodProducer, OrderRequest orderRequest) {
        this.foodProducer = foodProducer;
        this.orderRequest = orderRequest;
    }

    public FoodProducer getFoodProducer() {
        return foodProducer;
    }

    public OrderRequest getOrderRequest() {
        return orderRequest;
    }
}
