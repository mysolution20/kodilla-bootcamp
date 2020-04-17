package com.kodilla.stream.world;

import java.util.*;

public class Continent {
//    zawierać kolekcję krajów leżących na tym kontynencie

    private final String continentName;
    private final Country country;

    private final List<Country> countryList = new ArrayList<>();
    Country England = new Country("England",60000000);
    Country Sweden = new Country("Sweden",15000000);
    Country Japan = new Country("Japan",90000000);
    Country India = new Country("India",1200000000);
    Country Egypt = new Country("Egypt",91000000);
    Country Morocco = new Country("Morocco",30000000);
    Country Canada = new Country("Canada",40000000);
    Country Mexico = new Country("Mexico",80000000);
    Country Brazil = new Country("Brazil",160000000);
    Country Argentina = new Country("Argentina",40000000);
    Country Australia = new Country("Australia",45000000);
    Country New_Zealand = new Country("New Zealand",10000000);

    public Continent(String continentName, Country country) {
        this.continentName = continentName;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(continentName, continent.continentName) &&
                Objects.equals(country, continent.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continentName, country);
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", country=" + country +
                '}';
    }
}
