package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;

public class ConsoleMessage {
    public void showMessage(String message, Set<Flight> flightSet) {
        System.out.println("=============================================================");
        System.out.println(message);
        flightSet.stream().forEach(System.out::println);
        System.out.println("=============================================================");
    }
}
