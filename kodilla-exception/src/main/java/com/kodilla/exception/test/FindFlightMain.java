package com.kodilla.exception.test;

public class FindFlightMain {
    public static void main(String[] args) {
        Flight flight = new Flight("Praga", "Londyn");
        AirportAvailability airPort = new AirportAvailability();
        try {
            boolean flightPosible = airPort.findFlight(flight);
            System.out.println(flightPosible);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
