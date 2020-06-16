package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;

public class Application {
    public static void main(String[] args) {
        FlightSearchEngine searchEngine = new FlightSearchEngine();
        FlightPreparator flightPreparator = new FlightPreparator();
        Set<Flight> flights = flightPreparator.getFlightSet();
        Flight flightFrom = new Flight("Warsaw");
        Flight flightTo = new Flight("Paris");
        ConsoleMessage messenger = new ConsoleMessage();

        ResultDTO resultDTO = searchEngine.findTo(flightTo, flights);
        messenger.showMessage(resultDTO.getMessage(), resultDTO.getFlightSet());

        resultDTO = searchEngine.findFrom(flightFrom, flights);
        messenger.showMessage(resultDTO.getMessage(), resultDTO.getFlightSet());

        resultDTO = searchEngine.findIndirect(flightFrom, flightTo, flights);
        messenger.showMessage(resultDTO.getMessage(), resultDTO.getFlightSet());
    }
}
