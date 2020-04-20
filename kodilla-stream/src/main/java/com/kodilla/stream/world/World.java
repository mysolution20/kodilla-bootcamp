package com.kodilla.stream.world;
import java.math.BigDecimal;
import java.util.*;
public class World{
//    private final List<Continent> continentSet;

//    public World() { }

//    public World(List<Continent> continentSet) {
//        this.continentSet = new ArrayList<>();
//    }

//    public void getContinentSet(Continent continent) {
//        List<Continent> continentTemp  = new ArrayList<>();
//
//        continentTemp.add(new Continent("Asia",""));
//
//        continentTemp.add(new Continent("Europa"));
//        continentTemp.add(new Continent("Africa"));
//        continentTemp.add(new Continent("South America"));
//        continentTemp.add(new Continent("North America"));
//        continentTemp.add(new Continent("Australia"));
//        this.continentSet = continentTemp;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        World world = (World) o;
//        return Objects.equals(continentSet, world.continentSet);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(continentSet);
//    }
//
//    @Override
//    public String toString() {
//        return "World{" +
//                "ContinentSet=" + continentSet +
//                '}';
//    }

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
