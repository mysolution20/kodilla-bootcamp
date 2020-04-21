package com.kodilla.stream.world;
import java.math.BigDecimal;
import java.util.*;

public class World{

    private final List<Continent> continents;

    public  World() {

        List<Continent> tempContinents = new ArrayList<>();

            Set<Country> asiaContinents = new HashSet<>();
                asiaContinents.add(new Country("India",new BigDecimal("1200000000")));
                asiaContinents.add(new Country("Japan",new BigDecimal("90000000")));
            tempContinents.add(new Continent("Asia",asiaContinents));

            Set<Country> europeContinents = new HashSet<>();
                europeContinents.add(new Country("England",new BigDecimal("60000000")));
                europeContinents.add(new Country("Sweden",new BigDecimal("15000000")));
            tempContinents.add(new Continent("Europe",europeContinents));

            Set<Country> africaContinents = new HashSet<>();
                africaContinents.add(new Country("Egypt",new BigDecimal("91000000")));
                africaContinents.add(new Country("Morocco",new BigDecimal("30000000")));
            tempContinents.add(new Continent("Africa",africaContinents));

            Set<Country> southAmericaContinents = new HashSet<>();
                southAmericaContinents.add(new Country("Argentina",new BigDecimal("40000000")));
                southAmericaContinents.add(new Country("Brazil",new BigDecimal("160000000")));
            tempContinents.add(new Continent("South America",southAmericaContinents));

            Set<Country> northAmericaContinents = new HashSet<>();
                northAmericaContinents.add(new Country("Canada",new BigDecimal("40000000")));
                northAmericaContinents.add(new Country("Mexico",new BigDecimal("80000000")));
            tempContinents.add(new Continent("North America",northAmericaContinents));

            Set<Country> australiaContinents = new HashSet<>();
                australiaContinents.add(new Country("Australia",new BigDecimal("45000000")));
                australiaContinents.add(new Country("New Zeland",new BigDecimal("15000000")));
            tempContinents.add(new Continent("Australia",australiaContinents));

        this.continents = tempContinents;
    }

    public List<Continent> getContinents() {
        return new ArrayList<>(continents);
    }

    public double getPeopleQuantity(){
//        continents.stream()
        return 1;
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
