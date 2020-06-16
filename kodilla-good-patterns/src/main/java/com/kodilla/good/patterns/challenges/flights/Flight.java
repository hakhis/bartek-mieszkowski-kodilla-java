package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Flight {
    private final String startingPoint;
    private final Set<Flight> destinations = new HashSet<>();

    public Flight(final String startingPoint) {
        this.startingPoint = startingPoint;
    }

    public void addDestination(Flight flight) {
        destinations.add(flight);
    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public Set<Flight> getDestinations() {
        return destinations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return getStartingPoint().equals(flight.getStartingPoint());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStartingPoint());
    }

    @Override
    public String toString() {
        return startingPoint;
    }
}
