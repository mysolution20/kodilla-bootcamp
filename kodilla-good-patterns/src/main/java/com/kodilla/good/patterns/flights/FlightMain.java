package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightMain {

    public static void main(String[] args) {
        Airport airport = new Airport("Wrocław", "Gdańsk");

        String departureAirport = airport.getDeparture();
        String arrivalAirport = airport.getArrival();

        FlightInformationDesk flightInformationDesk = new FlightInformationDesk();

        String departureAirportInformation =
                flightInformationDesk.getAirportList().entrySet().stream()
                        .filter(entry -> entry.getKey().equals(departureAirport))
                        .flatMap(entry -> entry.getValue().stream())
                        .collect(Collectors.joining(" and "));

        String arrivalAirportInformation =
                flightInformationDesk.getAirportList().entrySet().stream()
                        .filter(entry -> entry.getValue().contains(arrivalAirport))
                        .map(Map.Entry::getKey)
                        .collect(Collectors.joining(" and "));

        List<String> flightsTo =
                flightInformationDesk.getAirportList().entrySet().stream()
                        .filter(entry -> entry.getValue().contains(arrivalAirport))
                        .map(Map.Entry::getKey)
                        .collect(Collectors.toList());

        List<String> flightsFrom =
                flightInformationDesk.getAirportList().entrySet().stream()
                        .filter(entry -> entry.getKey().equals(departureAirport))
                        .flatMap(entry -> entry.getValue().stream())
                        .collect(Collectors.toList());

        List<String> interchangeAirport = new ArrayList<>(flightsTo);
        interchangeAirport.retainAll(flightsFrom);

        String interchangeAirportInformation = String.join(" and ", interchangeAirport);
        System.out.println("All flights from " + departureAirport + " are: " + departureAirportInformation + ".");
        System.out.println("All flights to " + arrivalAirport + " are from: " + arrivalAirportInformation + ".");
        System.out.println("All indirect air flights connection from " + departureAirport + " to " + arrivalAirport + " are through: " + interchangeAirportInformation + ".");

    }
}
