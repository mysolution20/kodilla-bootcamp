package com.kodilla.good.patterns.orders;

import java.time.LocalDate;

public interface OrderService {
    boolean order(User user, Item item, LocalDate orderDate, LocalDate deliveryDate);
}



