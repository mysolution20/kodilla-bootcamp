package com.kodilla.exception.test;

import java.util.*;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class AirportAvailability {
    private Map<String, Boolean> airportList = new HashMap<>();

    public AirportAvailability() {
        airportList.put("Warszawa", FALSE);
        airportList.put("Berlin", TRUE);
        airportList.put("Praga", TRUE);
        airportList.put("Madryt", TRUE);
        airportList.put("Londyn", TRUE);
        airportList.put("Paryz", FALSE);
        airportList.put("Moskwa", TRUE);
        airportList.put("Lisbona", TRUE);
        airportList.put("Rzym", FALSE);
        airportList.put("Kraków", FALSE);
        airportList.put("Gdańsk", TRUE);
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        List<String> airportListTrue = new ArrayList<>();
        for (Map.Entry<String, Boolean> entry : airportList.entrySet()) {
            if (entry.getValue().equals(TRUE)) {
                airportListTrue.add(entry.getKey());
            }
        }
        if (airportListTrue.contains(flight.getDepartureAirport())) {
            if (airportListTrue.contains(flight.getArrivalAirport())) {
                return TRUE;
            } else {
                throw new RouteNotFoundException("Arrival airport has not been find.");
            }
        } else {
            throw new RouteNotFoundException("Departure airport has not been find.");
        }
/**  // poniżej wersja tradycyjna zostawiam w celach dydaktycznych
 *
 for (String flightDep : airportListTrue) {
 if (flightDep.equals(flight.getDepartureAirport())) {
 for (String flightArr : airportListTrue) {
 while (flightArr.equals(flight.getArrivalAirport())) {
 //                        System.out.println("Flight from airport: " + flight.getDepartureAirport()
 //                                + " to " + flight.getArrivalAirport() + " airport is available.");
 return TRUE;
 //                        break;
 }
 }
 }
 }
 return FALSE;*/
    }
}
