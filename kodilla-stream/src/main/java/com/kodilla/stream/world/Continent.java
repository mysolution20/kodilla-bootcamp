package com.kodilla.stream.world;

import java.util.*;

public class Continent {
    private final String continent;
    private final Set<Country> countrySet;

    public Continent(final String continent, final Set<Country> countrySet) {
        this.continent = continent;
        this.countrySet = countrySet;
    }

    public String getContinent() {
        return continent;
    }

    public Set<Country> getCountrySet() {
        return new HashSet<>(countrySet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent1 = (Continent) o;
        return Objects.equals(continent, continent1.continent) &&
                Objects.equals(countrySet, continent1.countrySet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continent, countrySet);
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continent='" + continent + '\'' +
                ", countrySet=" + countrySet +
                '}';
    }
}

