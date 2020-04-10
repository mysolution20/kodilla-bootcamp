package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {      // OddNumbersExterminatorTest

    @Before
    public void before() {
        System.out.println("Test: begin");
    }

    @After
    public void after() {
        System.out.println("Test: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        List<Integer> newNumbers = new ArrayList<>();

        //Then
        for (Integer integer : oddNumbersExterminator.exterminate(newNumbers)) {

            Assert.assertTrue("NewNumbers List is null", newNumbers.isEmpty());
        }

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        List<Integer> newNumbers = new ArrayList<>();
        for (int i = 0; i < 29; i++) {
            newNumbers.add(i);
        }

        //Then
        for (Integer i : oddNumbersExterminator.exterminate(newNumbers)) {
            Assert.assertEquals("Numbers from newNumbers List are odd", 0, i % 2);
        }

    }


}
