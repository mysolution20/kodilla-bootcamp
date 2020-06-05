package com.kodilla.good.patterns.orders;

public class ProductOrderService {
    private final InformationService informationService;
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto assembly(final OrderRequest orderRequest) {

        boolean isRented = orderService.order(orderRequest.getUser(), orderRequest.getItem(),
                orderRequest.getOrderDate(), orderRequest.getDeliveryDate());

        if (isRented) {
            informationService.inform(orderRequest.getUser(), orderRequest.getItem());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getItem(), orderRequest.getOrderDate(), orderRequest.getDeliveryDate());

            return new OrderDto(orderRequest.getUser(), orderRequest.getItem(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getItem(), false);
        }
    }
}
