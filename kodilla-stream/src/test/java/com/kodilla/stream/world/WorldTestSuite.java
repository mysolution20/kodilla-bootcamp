package com.kodilla.stream.world;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

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

        Country country =  new Country("India",new BigDecimal("1200000000"));
//        Continent continent= new Continent("Asia","");

//        World world = new World();
//        List<Continent> continents
//                .map(L -> L.)
    }
}
//    Country country =  new Country("India",new BigDecimal("1200000000"));
//