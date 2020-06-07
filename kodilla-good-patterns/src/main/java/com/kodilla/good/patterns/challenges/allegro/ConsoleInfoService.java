package com.kodilla.good.patterns.challenges.allegro;

public class ConsoleInfoService implements InfoService {
    @Override
    public void inform(User user, Product product, boolean result) {
        String message = "Dear " + user + "\n";
        if (result) {
            message = message + "Your order of: \n" + product + " has been successful!";
        } else {
            message = message + "Product " + product + "\nis not available at this moment!\nPlease try another time!";
        }
        System.out.println(message);
    }
}
