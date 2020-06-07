package com.kodilla.good.patterns.food2door;

public class FoodMain {
    public static void main(String[] args) {
        DeliveryCompletion deliveryCompletion = new DeliveryRequestExecute().order();

        ProductDeliveryService productDeliveryService = new ProductDeliveryService(new SmsService(), new FoodDeliveryService(),
                new FoodDeliveryRepository());
        productDeliveryService.assembly(deliveryCompletion);
    }
}
