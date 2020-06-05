package com.kodilla.good.patterns.orders;

import java.time.LocalDate;

public class OrderRequestExecute {

    public OrderRequest order() {
        User user = new User("Piotr", "Madmax");
        Item item = new Item("Sunglasses", 1);
        LocalDate orderDate = LocalDate.of(2020, 8, 1);
        LocalDate deliveryDate = LocalDate.of(2020, 9, 6);
        return new OrderRequest(user, item, orderDate, deliveryDate);
    }
}
