package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class Airport {
    final String departure;
    final String arrival;

    public Airport(final String departure, final String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(getDeparture(), airport.getDeparture()) &&
                Objects.equals(getArrival(), airport.getArrival());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDeparture(), getArrival());
    }

    @Override
    public String toString() {
        return "Airport{" +
                "departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }
}
