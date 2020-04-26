package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class AirportAvailability {
    Boolean isAvailable;
    String airportName;

    public Boolean findFilght(Flight flight) {
        Map<String, Boolean> airportListAvail = new HashMap<>();
        airportListAvail.put("Warszawa", TRUE);
        airportListAvail.put("Berlin", TRUE);
        airportListAvail.put("Praga", TRUE);
        airportListAvail.put("Madryt", TRUE);
        airportListAvail.put("Londyn", FALSE);
//        return flight.getArrivalAirport();

//        for (Map.Entry<String, Boolean> entry : airportListAvail.entrySet()) {
//            if (flight.getArrivalAirport().toString().equals(entry.getKey())) {
////                return entry.getValue();
//            }
//        }
        return true;
    }


    public static void main(String[] args) {

        Flight WarszawaBerlin = new Flight("Warszawa", "Berlin");
        Flight PragaWarszawa = new Flight("Praga", "Warszawa");
        Flight WarszawaPraga = new Flight("Warszawa", "Praga");


        AirportAvailability airportAvailability = new AirportAvailability();
        System.out.println(airportAvailability.findFilght(PragaWarszawa));
//        System.out.println("Liczba dostepnych lotnisk: " + lot);


    }

}