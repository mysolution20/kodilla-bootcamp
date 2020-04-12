package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Beginning of shapes tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All shapes tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute shape test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        List<Shape> figures = new ArrayList<>();
        Circle circle = new Circle();

        //When
        figures.add(circle);

        //Then
        Assert.assertEquals(1, figures.size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        List<Shape> figures = new ArrayList<>();
        Square square = new Square();

        //When
        figures.remove(square);

        //Then
        Assert.assertEquals(0, figures.size());
    }

    @Test
    public void testGetFigure() {
        //Given
        List<Shape> figures = new ArrayList<>();
        Triangle triangle = new Triangle();

        //When
        figures.add(triangle);

        //Then
        Assert.assertEquals("Triangle", triangle.getShapeName());
    }

    @Test
    public void testShowFigures() {
        //Given
        List<Shape> figures = new ArrayList<>();
        Triangle triangle = new Triangle();

        //When
        figures.add(triangle);  // test 123

        //Then
        Assert.assertEquals("Triangle", triangle.getShapeName());
    }

}
