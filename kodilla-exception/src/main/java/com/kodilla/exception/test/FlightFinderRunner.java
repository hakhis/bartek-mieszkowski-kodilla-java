package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.List;

public class FlightFinderRunner {
    public static void main(String args[]) {

        Flight flight1 = new Flight("Warsaw", "Bangkok");
        Flight flight2 = new Flight("Bangkok", "Hanoi");
        Flight flight3 = new Flight("Warsaw", "Radom");
        Flight flight4 = new Flight("Radom", "Berlin");

        List<Flight> flightList = new ArrayList<>();
        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);
        flightList.add(flight4);

        FlightFinder finder = new FlightFinder();
        for (Flight flight : flightList) {
            try {
                finder.findFlight(flight);
            } catch (RouteNotFoundException e) {
                System.out.println("Exception: " + e);
            } finally {
                System.out.println("Thank You for using TheFinalFlight Airlines!");
            }
        }
    }

}
