package com.kodilla.good.patterns.challanges;

import java.time.LocalDate;

public interface OrderService {
    boolean rent(User user, Item item, LocalDate orderDate, LocalDate deliveryDate);

}



