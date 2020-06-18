package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.producers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.producers.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.food2door.producers.HealthyShop;
import com.kodilla.good.patterns.challenges.food2door.products.SampleProduct;

import java.util.ArrayList;
import java.util.List;

public class DataPreparator {
    private User user;
    private List<Order> orderList;
    private ProducersList producersList;

    public void prepareSampleData() {
        user = new User("John", "Bean", "MrBean");
        producersList = new ProducersList();
        producersList.addProducer(new ExtraFoodShop());
        producersList.addProducer(new GlutenFreeShop());
        producersList.addProducer(new HealthyShop());
        orderList = new ArrayList<>();
        orderList.add(new Order(user, new SampleProduct("Siberian Oranges", 10), "ExtraFoodShop"));
        orderList.add(new Order(user, new SampleProduct("Bag of tasty rocks", 20), "GlutenFreeShop"));
        orderList.add(new Order(user, new SampleProduct("Baby spinach", 300), "HealthyShop"));
    }

    public User getUser() {
        return user;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public ProducersList getProducersList() {
        return producersList;
    }
}
