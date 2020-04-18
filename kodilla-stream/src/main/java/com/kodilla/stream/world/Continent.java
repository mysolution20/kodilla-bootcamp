package com.kodilla.stream.world;

import java.util.*;

public class Continent {

    private final Country countryOfContinent;
    private final String continent;

    public Continent(Country countryOfContinent, String continent) {
        this.countryOfContinent = countryOfContinent;
        this.continent = continent;
    }

    public  List<String> getContinentSet(String continent) {
        final List<String> continentSet = new ArrayList<>();
        continentSet.add(continent);
        return new ArrayList<>(continentSet);
    }

    public void addCountryContinent(Country countryOfContinent) {
    final Set<Country> continentsCountry = new HashSet<>();
        continentsCountry.add(countryOfContinent);
    }

}

//    ******** temporary trash to erase ****************

/*    public Map<String, String> getContinentMap(String countryOfContinent, String continent) {
        final Map<String, String> continentMap = new HashMap<>();
        continentMap.put(countryOfContinent, continent);
        return new HashMap<String, String>(continentMap);
    }*/


/*    public  List<String> getContinentSet(String continent) {
        final List<String> continentSet = new ArrayList<>();
        continentSet.add(continent);
        return new ArrayList<>(continentSet);
    }*/

    /*    public  Set<Continent> getContinentSet(Continent continent) {
        final Set<Continent> continentSet = new HashSet<>();
        continentSet.add(continent);
        return new HashSet<Continent>(continentSet);
    }*/

    /*continentSet.add(new Continent("Asia"));
    continentSet.add(new Continent("Europa"));
    continentSet.add(new Continent("Africa"));
    continentSet.add(new Continent("South America"));
    continentSet.add(new Continent("North America"));
    continentSet.add(new Continent("Australia"));*/



