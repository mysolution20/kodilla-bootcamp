package com.kodilla.stream.world;

import java.util.*;

public class World{

    /*    public  List<Continent> getContinentList(Continent continent) {
            final List<Continent> continentList = new ArrayList<>();
            continentList.add(new Continent("Asia"));
            continentList.add(new Continent("Europa"));
            continentList.add(new Continent("Africa"));
            continentList.add(new Continent("South America"));
            continentList.add(new Continent("North America"));
            continentList.add(new Continent("Australia"));
            return new ArrayList<>(continentList);
        }*/

    private final Set<Continent> continentSet;

    public World(Set<Continent> continentSet) {
        this.continentSet = continentSet;
    }

        public  List<Continent> getContinentSet(Continent continent) {
            final List<Continent> continentSet = new ArrayList<>();
            continentSet.add(continent);
            return new ArrayList<Continent>(continentSet);
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        World world = (World) o;
        return Objects.equals(continentSet, world.continentSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continentSet);
    }

    @Override
    public String toString() {
        return "World{" +
                "ContinentSet=" + continentSet +
                '}';
    }
//      flatMap()  reduce()


}











//    ******** temporary trash to erase ****************


//    public Set<Continent> getContinentSet() {
//        return continentSet;
//    }


//    public Set<Country>  getPeopleQuantity() {
//     return countrySet.stream()
//     .map( country -> country.getPeopleQuantity())
//     .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
//    }


/*    public  List<Continent> getContinentList(Continent continent) {
        final List<Continent> continentList = new ArrayList<>();
        continentList.add(new Continent("Asia"));
        continentList.add(new Continent("Europa"));
        continentList.add(new Continent("Africa"));
        continentList.add(new Continent("South America"));
        continentList.add(new Continent("North America"));
        continentList.add(new Continent("Australia"));
        return new ArrayList<>(continentList);
    }*/
