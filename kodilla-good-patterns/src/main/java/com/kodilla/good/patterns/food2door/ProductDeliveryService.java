package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.orders.*;

public class ProductDeliveryService {
    private final InformationService informationService;
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    public ProductDeliveryService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

//    public OrderDto assembly(final OrderRequest orderRequest) {
//
//        return getOrderDto(orderRequest, orderService, informationService, orderRepository);
//    }
}
