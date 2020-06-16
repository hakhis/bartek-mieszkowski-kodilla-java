package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearchEngine {

    public ResultDTO findFrom(Flight from, Set<Flight> flightSet) {
        Set<Flight> result = flightSet.stream()
                .filter(flight -> flight.equals(from))
                .flatMap(flight -> flight.getDestinations().stream())
                .collect(Collectors.toSet());
        String message = "Flights from city " + from + ":";
        return new ResultDTO(result, message);
    }

    public ResultDTO findTo(Flight to, Set<Flight> flightSet) {
        Set<Flight> result = flightSet.stream()
                .filter(flight -> {
                    if (flight.getDestinations().contains(to)) {
                        return true;
                    } else return false;
                })
                .collect(Collectors.toSet());
        String message = "Flights to city " + to + ":";
        return new ResultDTO(result, message);
    }

    public ResultDTO findIndirect(Flight from, Flight to, Set<Flight> flightSet) {
        Set<Flight> result = findTo(to, findFrom(from, flightSet).getFlightSet()).getFlightSet();
        String message = "Indirect flights from " + from + " to " + to + " through cities:";
        return new ResultDTO(result, message);
    }
}
