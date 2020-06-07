package com.kodilla.good.patterns.challenges.allegro;

public class BookShop {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
                new ConsoleInfoService(), new MapOrderRepository(), new SimpleOrderService());
        orderProcessor.process(orderRequest);
    }
}
