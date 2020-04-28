package com.kodilla.exception.test;


public class RouteNotFoundException extends Throwable {
    public static void main(String[] args) throws RouteNotFoundException {
        Flight flight = new Flight("Praga", "Londyn");

        AirportAvailability airportAvailability = new AirportAvailability();
        try {
            System.out.println(airportAvailability.findFilght(flight));
        } catch (RouteNotFoundException e) {
            throw new RouteNotFoundException();
        } finally {
            System.out.println("**2* Coś tam, coś tam");
        }
    }
}
