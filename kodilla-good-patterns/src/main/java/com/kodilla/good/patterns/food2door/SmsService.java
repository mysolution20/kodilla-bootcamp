package com.kodilla.good.patterns.food2door;

public class SmsService implements InformationFoodService {
    @Override
    public void inform(FoodProducer foodProducer, Buyer buyer, FoodItem foodItem) {
        System.out.println("Sms has been sent to " + buyer.getBuyerName() + " at about delivery of "
                + foodItem.getQuantity() + " " + foodItem.getNameOfItem() + " from "
                + foodProducer.getProducerName());
    }
}
