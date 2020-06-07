package com.kodilla.good.patterns.food2door;

public class FoodDeliveryService implements DeliveryService {
    @Override
    public boolean delivery(FoodProducer foodProducer, DeliveryRequest deliveryRequest) {
        System.out.println(deliveryRequest.getBuyer().getBuyerName() + " has ordered delivery "
                + deliveryRequest.getFoodItem().getQuantity() + " quantity of " + deliveryRequest.getFoodItem().getNameOfItem()
                + " at " + deliveryRequest.getOrderDate().toString() + " from " + foodProducer.getProducerName()
                + " with delivery date " + deliveryRequest.getDeliveryDate().toString()
        );
        return true;
    }
}
