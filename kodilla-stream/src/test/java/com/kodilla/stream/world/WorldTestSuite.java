package com.kodilla.stream.world;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class WorldTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Beginning of WorldContinentCountry tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All WorldContinentCountry tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute WorldContinentCountry test #" + testCounter);
    }

    @Test
    public void countryCountryNameTest() {
        //Given
        List<Continent> continents = new ArrayList<>();

        Set<Country> asiaContinents = new HashSet<>();
        asiaContinents.add(new Country("India", new BigDecimal("1200000000")));
        asiaContinents.add(new Country("Japan", new BigDecimal("90000000")));
        continents.add(new Continent("Asia", asiaContinents));

        Set<Country> europeContinents = new HashSet<>();
        europeContinents.add(new Country("England", new BigDecimal("60000000")));
        europeContinents.add(new Country("Sweden", new BigDecimal("15000000")));
        continents.add(new Continent("Europe", europeContinents));

        Set<Country> africaContinents = new HashSet<>();
        africaContinents.add(new Country("Egypt", new BigDecimal("91000000")));
        africaContinents.add(new Country("Morocco", new BigDecimal("30000000")));
        continents.add(new Continent("Africa", africaContinents));

        Set<Country> southAmericaContinents = new HashSet<>();
        southAmericaContinents.add(new Country("Argentina", new BigDecimal("40000000")));
        southAmericaContinents.add(new Country("Brazil", new BigDecimal("160000000")));
        continents.add(new Continent("South America", southAmericaContinents));

        Set<Country> northAmericaContinents = new HashSet<>();
        northAmericaContinents.add(new Country("Canada", new BigDecimal("40000000")));
        northAmericaContinents.add(new Country("Mexico", new BigDecimal("80000000")));
        continents.add(new Continent("North America", northAmericaContinents));

        Set<Country> australiaContinents = new HashSet<>();
        australiaContinents.add(new Country("Australia", new BigDecimal("45000000")));
        australiaContinents.add(new Country("New Zeland", new BigDecimal("15000000")));
        continents.add(new Continent("Australia", australiaContinents));

        World world = new World(continents);

        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();

        //Then
        assertEquals(new BigDecimal("1866000000"), peopleQuantity);

    }
}

