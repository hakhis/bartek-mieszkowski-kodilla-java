package com.kodilla.good.patterns.challenges.allegro;

public class OrderProcessor {
    private InfoService infoService;
    private OrderRepository orderRepository;
    private OrderService orderService;

    public OrderProcessor(InfoService infoService, OrderRepository orderRepository, OrderService orderService) {
        this.infoService = infoService;
        this.orderRepository = orderRepository;
        this.orderService = orderService;
    }

    public void process(OrderRequest orderRequest) {
        boolean isAvailable = orderService.makeOrder(orderRequest.getUser(), orderRequest.getProduct());
        if (isAvailable) {
            infoService.inform(orderRequest.getUser(), orderRequest.getProduct(), isAvailable);
            orderRepository.addOrder(orderRequest.getUser(), orderRequest.getProduct());
        } else {
            infoService.inform(orderRequest.getUser(), orderRequest.getProduct(), isAvailable);
        }
        System.out.println();
        orderRepository.displayOrders();
    }
}
