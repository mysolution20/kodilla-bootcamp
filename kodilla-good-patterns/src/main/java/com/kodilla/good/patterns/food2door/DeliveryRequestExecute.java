package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.orders.Item;
import com.kodilla.good.patterns.orders.OrderRequest;
import com.kodilla.good.patterns.orders.User;

import java.time.LocalDate;

public class DeliveryRequestExecute {
    public DeliveryCompletion order() {
        User user = new User("Piotr", "Madmax");
        Item item = new Item("Tomatoes", 2);
        LocalDate orderDate = LocalDate.of(2020, 8, 1);
        LocalDate deliveryDate = LocalDate.of(2020, 9, 6);
        OrderRequest orderRequest = new OrderRequest(user,item,orderDate,deliveryDate);

        FoodProducer foodProducer = new FoodProducer("ExtraFoodShop");
        return new DeliveryCompletion(foodProducer, orderRequest);
    }
}
