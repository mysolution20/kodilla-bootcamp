package com.kodilla.good.patterns.challanges;

import java.time.LocalDate;

public interface OrderRepository {
    void createOrder(User user, Item item, LocalDate orderDate, LocalDate deliveryDate);

}
