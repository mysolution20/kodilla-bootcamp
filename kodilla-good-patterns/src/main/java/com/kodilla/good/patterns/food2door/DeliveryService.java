package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.orders.Item;
import com.kodilla.good.patterns.orders.OrderRequest;
import com.kodilla.good.patterns.orders.User;

import java.time.LocalDate;

public interface DeliveryService {
    boolean delivery(FoodProducer foodProducer, OrderRequest orderRequest);
}
