package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public class World{

//    private final String continent;
//    private final String country;

    public  List<Continent> getContinentList(Continent continent) {
        final List<Continent> continentList = new ArrayList<>();
        continentList.add(new Continent("Asia"));
        continentList.add(new Continent("Europa"));
        continentList.add(new Continent("Africa"));
        continentList.add(new Continent("South America"));
        continentList.add(new Continent("North America"));
        continentList.add(new Continent("Australia"));
        return new ArrayList<>(continentList);
    }

//    public Set<Country>  getPeopleQuantity() {
//     return countrySet.stream()
//     .map( country -> country.getPeopleQuantity())
//     .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
//    }


//      flatMap()  reduce()


}
