package com.kodilla.good.patterns.flights;

public class FlightMain {

    public static void main(String[] args) {
        Airport airport = new Airport("Wrocław", "Gdańsk");
        String departureAirport = airport.getDeparture();
        String arrivalAirport = airport.getArrival();

        FlightService flightService = new FlightService();
        String  departureAirportInformation = flightService.getDepartureFlight(departureAirport);
        String  arrivalAirportInformation = flightService.getArrivalFlight(arrivalAirport);
        String  interchangeAirportInformation = flightService.findFlightByCity(departureAirport,arrivalAirport);

        System.out.println("All flights from " + departureAirport + " are: " + departureAirportInformation + ".");
        System.out.println("All flights to " + arrivalAirport + " are from: " + arrivalAirportInformation + ".");
        System.out.println("All indirect air flights connection from " + departureAirport + " to " + arrivalAirport + " are through: " + interchangeAirportInformation + ".");
    }
}
