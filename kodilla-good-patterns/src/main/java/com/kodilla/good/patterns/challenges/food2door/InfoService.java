package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.allegro.Product;
import com.kodilla.good.patterns.challenges.allegro.User;

public interface InfoService {
    void inform(User user, Product product, boolean result);
}
