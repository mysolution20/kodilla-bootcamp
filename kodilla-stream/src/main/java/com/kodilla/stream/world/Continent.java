package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public class Continent {

    private final String continent;
    Set <Country> countrySet = new HashSet<> ();

    final public Set<Country> getCountrySet(){
        countrySet.add(new Country("India",new BigDecimal("1200000000")));
        countrySet.add(new Country("Japan",new BigDecimal("90000000")));
        countrySet.add(new Country("England",new BigDecimal("60000000")));
        countrySet.add(new Country("Sweden",new BigDecimal("15000000")));
        countrySet.add(new Country("Egypt",new BigDecimal("91000000")));
        countrySet.add(new Country("Morocco",new BigDecimal("30000000")));
        countrySet.add(new Country("Brazil",new BigDecimal("160000000")));
        countrySet.add(new Country("Argentina",new BigDecimal("40000000")));
        countrySet.add(new Country("Canada",new BigDecimal("40000000")));
        countrySet.add(new Country("Mexico",new BigDecimal("80000000")));
        countrySet.add(new Country("Australia",new BigDecimal("45000000")));
        countrySet.add(new Country("New Zealand",new BigDecimal("10000000")));
        return new HashSet<Country> (countrySet);
    }

    public Continent(String continent) {
        this.continent = continent;
    }

    public String getContinent() {
        return continent;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent1 = (Continent) o;
        return Objects.equals(continent, continent1.continent) &&
                Objects.equals(getCountrySet(), continent1.getCountrySet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(continent, getCountrySet());
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continent='" + continent + '\'' +
                ", countrySet=" + countrySet +
                '}';
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
/*    public  List<String> getContinentSet(String continent) {
        final List<String> continentSet = new ArrayList<>();
        continentSet.add(continent);
        return new ArrayList<>(continentSet);
    }*/
    /*continentSet.add(new Continent("Asia"));
    continentSet.add(new Continent("Europa"));
    continentSet.add(new Continent("Africa"));
    continentSet.add(new Continent("South America"));
    continentSet.add(new Continent("North America"));
    continentSet.add(new Continent("Australia"));*/


/*    public void addCountryContinent(Country countryOfContinent) {
        final Set<Country> continentsCountry = new HashSet<>();
        continentsCountry.add(countryOfContinent);
    }*/

/*
    public void addCountryContinent(Country countryOfContinent) {
        final Set<Country> continentsCountry = new HashSet<>();
        continentsCountry.add(countryOfContinent);
    }*/

/*    public static Map<Country,Continent> getContinentList() {
        final Map<Country,Continent> continentList = new HashMap<>();
        continentList.put(new Country("India",1200000000),new Continent("Asia"));
        continentList.put(new Country("Japan",90000000),new Continent("Asia"));
        continentList.put(new Country("England",60000000),new Continent("Europa"));
        continentList.put(new Country("Sweden",15000000),new Continent("Europa"));
        continentList.put(new Country("Egypt",91000000),new Continent("Africa"));
        continentList.put(new Country("Morocco",30000000),new Continent("Africa"));
        continentList.put(new Country("Brazil",160000000),new Continent("South America"));
        continentList.put(new Country("Argentina",40000000),new Continent("South America"));
        continentList.put(new Country("Canada",40000000),new Continent("North America"));
        continentList.put(new Country("Mexico",80000000),new Continent("North America"));
        continentList.put(new Country("Australia",45000000),new Continent("Australia"));
        continentList.put(new Country("New Zealand",10000000),new Continent("Australia"));
        return new HashMap<Country,Continent> ( continentList);
    }*/
