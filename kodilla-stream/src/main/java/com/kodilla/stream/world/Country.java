package com.kodilla.stream.world;


import java.util.Objects;

public class Country {                 //    zwracającą liczbę typu BigDecimal
    private final String countryName;
    private final double peopleQuantity;

    public Country(final String countryName, final double peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }
    public String getCountryName() {
        return countryName;
    }
    public double getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Double.compare(country.getPeopleQuantity(), getPeopleQuantity()) == 0 &&
                Objects.equals(getCountryName(), country.getCountryName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountryName(), getPeopleQuantity());
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", peopleQuantity=" + peopleQuantity +
                '}';
    }
}
