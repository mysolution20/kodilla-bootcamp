package com.kodilla.good.patterns.flights;

import java.util.*;

public class FlightInformationDesk {

    private final Map<String, List<String>> airportLists = new HashMap<>();

    FlightInformationDesk() {
        airportLists.put("Gdańsk", Arrays.asList("Warszawa", "Kraków", "Katowice"));
        airportLists.put("Poznań", Arrays.asList("Gdańsk", "Katowice", "Warszawa"));
        airportLists.put("Kraków", Arrays.asList("Gdańsk", "Wrocław", "Warszawa"));
        airportLists.put("Warszawa", Arrays.asList("Gdańsk", "Wrocław", "Poznań"));
        airportLists.put("Katowice", Arrays.asList("Warszawa", "Kraków", "Poznań"));
        airportLists.put("Wrocław", Arrays.asList("Warszawa", "Kraków", "Gdańsk"));
    }

    public final Map<String, List<String>> getAirportList() {
        return airportLists;
    }

}
