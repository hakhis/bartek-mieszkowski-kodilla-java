package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.producers.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.food2door.producers.ProducerBase;
import com.kodilla.good.patterns.challenges.food2door.products.Product;
import com.kodilla.good.patterns.challenges.food2door.products.SampleProduct;
import com.sun.org.apache.xpath.internal.operations.Or;

public class Application {
    public static void main(String[] args) {
        User user = new User("John", "Bean", "MrBean");
        Order order = new Order(user, new SampleProduct("Glutenfree Water", 5), new GlutenFreeShop());
    }
}
