package com.kodilla.good.patterns.challenges.food2door;

public class Application {
    public static void main(String[] args) {
        DataPreparator dataPreparator = new DataPreparator();
        dataPreparator.prepareSampleData();
        OrderExecutor orderExecutor = new OrderExecutor(new ConsoleInfoService());
        orderExecutor.execute(dataPreparator.getOrderList().get(0));
        orderExecutor.execute(dataPreparator.getOrderList().get(1));
        orderExecutor.execute(dataPreparator.getOrderList().get(2));
        dataPreparator.getUser().showBasket();
    }
}
