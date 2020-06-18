package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.producers.Producer;

public class OrderExecutor {
    private InfoService infoService;
    private ProducersList producersList;
    public OrderExecutor(InfoService infoService, ProducersList producersList) {
        this.infoService = infoService;
        this.producersList = producersList;
    }

    public void execute(Order order) {
        Producer producer;
        Boolean result;
        if (producersList.getProducerMap().containsKey(order.getProducer())) {
            producer = producersList.getProducerMap().get(order.getProducer());
            result = producer.process(order.getProduct().getName(), order.getProduct().getAmount());
        } else {
            System.out.println("No such producer in the database!");
            result = false;
        }
        infoService.inform(order.getUser(), order.getProduct(), result);
        if (result) {
            order.getUser().addToBasket(order.getProduct());
        }
    }
}
