package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public class World {

    private final List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public List<Continent> getContinents() {
        return new ArrayList<>(continents);
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.getCountrySet().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        World world = (World) o;
        return Objects.equals(continents, world.continents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continents);
    }

    @Override
    public String toString() {
        return "World{" +
                "Continent=" + continents +
                '}';
    }

}

