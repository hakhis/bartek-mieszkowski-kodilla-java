package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    private Map<String, Boolean> availableDestinations = new HashMap<>();

    public FlightFinder() {
        availableDestinations.put("Warsaw", true);
        availableDestinations.put("Bangkok", false);
        availableDestinations.put("Hanoi", true);
        availableDestinations.put("Berlin", true);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        if (availableDestinations.containsKey(flight.getArrivalAirport())) {
            if (availableDestinations.get(flight.getArrivalAirport())) {
                System.out.println("Direct flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is available");
            } else {
                System.out.println("There is no direct flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
            }
        } else {
            throw new RouteNotFoundException("No such flight found!");
        }
    }
}
