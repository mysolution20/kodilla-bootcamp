package com.kodilla.good.patterns.challanges;

public class GoodPatternsMain {

    public static void main(String[] args) {
/**     // left for education purposes
 System.out.println("************************************************");
 System.out.println("---- Zadanie: funkcyjna iteracja po tytułach ----");
 System.out.println();
 MovieStore movieStore = new MovieStore();
 String flatStringLine = movieStore.getMovies().entrySet().stream()
 .flatMap(entry -> entry.getValue().stream())
 .map(String::toString)
 .collect(Collectors.joining(" ! "));

 System.out.println(flatStringLine);
 System.out.println(movieStore.getMovies());
 System.out.println("************************************************");*/

          OrderRequest orderRequest = new OrderRequestExecute().order();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new GoodsOrderService(),
                new GoodsOrderRepository());
        productOrderService.assembly(orderRequest);
    }
}
