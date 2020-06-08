package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.allegro.Product;
import com.kodilla.good.patterns.challenges.allegro.User;

public class ConsoleInfoService implements InfoService {
    @Override
    public void inform(User user, Product product, boolean result) {
        String message = "Dear " + user + "\n";
        if (result) {
            message = message + "Your order of: \n" + product + " has been successfully made!";
        } else {
            message = message + "Product " + product + "\nis not available at this moment!\nPlease try another time!";
        }
        System.out.println(message);
    }
}
