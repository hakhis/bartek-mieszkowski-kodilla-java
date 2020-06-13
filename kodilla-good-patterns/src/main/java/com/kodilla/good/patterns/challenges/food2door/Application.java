package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.producers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.producers.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.food2door.producers.HealthyShop;
import com.kodilla.good.patterns.challenges.food2door.products.SampleProduct;

public class Application {
    public static void main(String[] args) {
        User user = new User("John", "Bean", "MrBean");
        Order order = new Order(user, new SampleProduct("Siberian Oranges", 10), new ExtraFoodShop());
        OrderExecutor orderExecutor = new OrderExecutor(new ConsoleInfoService());
        orderExecutor.execute(order);
        System.out.println(user.showBasket());
    }
}
