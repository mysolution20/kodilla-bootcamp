package com.kodilla.stream.array;

import org.junit.*;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class ArrayOperationsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Beginning of GetListUsing tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All GetListUsing tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute GetListUsing test #" + testCounter);
    }
    @Test
    public void testGetAverage() {
        //Given
        int[] Numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        ArrayOperations.getAverage(Numbers);
        //When
         double result = ArrayOperations.getAverage(Numbers);

        //Then
        assertEquals(9.5, result, 0);
    }
}
