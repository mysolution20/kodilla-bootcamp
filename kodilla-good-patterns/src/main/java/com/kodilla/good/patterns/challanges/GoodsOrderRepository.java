package com.kodilla.good.patterns.challanges;

import java.time.LocalDate;

public class GoodsOrderRepository implements OrderRepository {

    @Override
    public void createOrder(User user, Item item, LocalDate orderDate, LocalDate deliveryDate) {
        System.out.println("It has been created order for " + item.getQuantity() + " items of " + item.getNameOfItem() + " for: "
                + user.getName() + " as " + user.getUserName()
                + " at " + orderDate.toString() + " with delivery at " + deliveryDate.toString());
    }
}
