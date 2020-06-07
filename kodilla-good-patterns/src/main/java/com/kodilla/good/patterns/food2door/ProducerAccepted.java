package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.orders.OrderRequest;

public class ProducerAccepted implements DeliveryService {
    @Override
    public boolean delivery(FoodProducer foodProducer, OrderRequest orderRequest) {
        System.out.println(" At " + orderRequest.getOrderDate().toString() + " " + orderRequest.getItem().getQuantity() +
                " " + orderRequest.getItem().getNameOfItem() + " have been ordered BY: " + orderRequest.getUser().getName() +
                " from" + foodProducer.getProducerName() + " with delivery at  " + orderRequest.getOrderDate().toString());
        return true;
    }
}
