package com.kodilla.good.patterns.challenges.food2door;

public class OrderExecutor {
    private InfoService infoService;
    public OrderExecutor(InfoService infoService) {
        this.infoService = infoService;
    }

    public void execute(Order order) {
        boolean result = order.getProducer().process(order.getProduct().getName(), order.getProduct().getAmount());
        infoService.inform(order.getUser(), order.getProduct(), result);
        if (result) {
            order.getUser().addToBasket(order.getProduct());
        }
    }
}
