package com.kodilla.exception.test;

import sun.font.TrueTypeFont;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class AirportAvailability<flight> {


    public boolean findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportList = new HashMap<>();
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

        List<String> airportListTrue = new ArrayList<>();
        for (Map.Entry<String, Boolean> entry : airportList.entrySet()) {
            if (entry.getValue().equals(TRUE)) {
                airportListTrue.add(entry.getKey());
            }
        }
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
        return FALSE;
    }

}
