package com.kodilla.good.patterns.orders;

import java.time.LocalDate;

public class GoodsOrderService implements OrderService {
    @Override
    public boolean order(User user, Item item, LocalDate orderDate, LocalDate deliveryDate) {
        System.out.println(item.getQuantity() + " " + item.getNameOfItem() + " have been ordered for: "
                + user.getName() + " " + user.getUserName() + " at " + orderDate.toString()
                + " with delivery at  " + deliveryDate.toString());
        return true;
    }
}
