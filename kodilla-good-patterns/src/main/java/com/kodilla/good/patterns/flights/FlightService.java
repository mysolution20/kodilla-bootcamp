package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightService {

    FlightInformationDesk flightInformationDesk = new FlightInformationDesk();

    public String getDepartureFlight(String departureAirport) {
        return flightInformationDesk.getAirportList().entrySet().stream()
                .filter(entry -> entry.getKey().equals(departureAirport))
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining(" and "));
    }

    public String getArrivalFlight(String arrivalAirport) {
        return flightInformationDesk.getAirportList().entrySet().stream()
                .filter(entry -> entry.getValue().contains(arrivalAirport))
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(" and "));
    }

    public String findFlightByCity(String departureAirport, String arrivalAirport) {

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

        return String.join(" and ", interchangeAirport);
    }
}
