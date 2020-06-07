package com.kodilla.good.patterns.challenges.allegro;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("John", "Wick", "babayaga");
        Product book = new Book("Hyperion", "Dan Simmons", 1989, 10000, 1);
        return new OrderRequest(user, book);
    }
}
