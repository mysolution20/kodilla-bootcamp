package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.orders.*;

public class FoodMain {
    public static void main(String[] args) {
        OrderRequest orderRequest = new OrderRequestExecute().order();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new GoodsOrderService(),
                new GoodsOrderRepository());
        productOrderService.assembly(orderRequest);
    }
}
