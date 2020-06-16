package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightPreparator {
    private final Set<Flight> flightSet;

    public FlightPreparator() {
        flightSet = new HashSet<>();

        Flight city1 = new Flight("Warsaw");
        Flight city2 = new Flight("Berlin");
        Flight city3 = new Flight("Prague");
        Flight city4 = new Flight("London");
        Flight city5 = new Flight("Paris");

        city1.addDestination(city2);
        city1.addDestination(city3);
        city1.addDestination(city4);

        city2.addDestination(city3);
        city2.addDestination(city4);
        city2.addDestination(city5);

        city3.addDestination(city4);
        city3.addDestination(city5);
        city3.addDestination(city1);

        city4.addDestination(city5);
        city4.addDestination(city1);
        city4.addDestination(city2);

        city5.addDestination(city1);
        city5.addDestination(city2);
        city5.addDestination(city3);

        flightSet.add(city1);
        flightSet.add(city2);
        flightSet.add(city3);
        flightSet.add(city4);
        flightSet.add(city5);
    }

    public Set<Flight> getFlightSet() {
        return flightSet;
    }
}
