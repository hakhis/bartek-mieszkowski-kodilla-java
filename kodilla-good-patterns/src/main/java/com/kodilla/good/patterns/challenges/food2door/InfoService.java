package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.products.Product;

public interface InfoService {
    void inform(User user, Product product, boolean result);
}
