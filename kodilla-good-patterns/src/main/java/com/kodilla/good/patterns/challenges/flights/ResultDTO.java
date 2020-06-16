package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;

public class ResultDTO {
    private Set<Flight> flightSet;
    private String message;

    public ResultDTO(Set<Flight> flightSet, String message) {
        this.flightSet = flightSet;
        this.message = message;
    }

    public Set<Flight> getFlightSet() {
        return flightSet;
    }

    public String getMessage() {
        return message;
    }
}
