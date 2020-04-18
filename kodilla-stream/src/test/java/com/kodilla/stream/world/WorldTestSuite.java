package com.kodilla.stream.world;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
        //    Given
        Country country = new Country("England", 60000000);
        //    When
        String resultCountryName = country.getCountryName();
        //    Then
        assertEquals("England", resultCountryName);
    }
    @Test
    public void countryPeopleQuantityTest() {
        //    Given
        Country country = new Country("England", 60000000);
        //    When
        double resultPeopleQuantity = country.getPeopleQuantity();
        //    Then
        assertEquals(60000000, resultPeopleQuantity, 0.0001);
    }
    @Test
    public void continentNumberOfContinentTest() {
        //    Given
        Continent continent = new Continent("Japan","Asia");
        //    When
        int resultContinent = continent.getContinentMap("Japan","Asia").size();
        //    Then
        assertEquals(1, resultContinent ,0);
    }

}
