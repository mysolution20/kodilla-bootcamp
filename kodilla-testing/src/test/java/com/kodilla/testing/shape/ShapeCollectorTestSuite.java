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
        Shape square = new Square();
        Shape circle = new Circle();
        Shape triangle = new Triangle();

        //When
        figures.add(square);
        figures.add(square);
        figures.add(circle);
        figures.add(triangle);

        figures.remove(square);

        //Then
        // ( add * 4 ) less 1  Then 3  for assert to test
        Assert.assertEquals(3, figures.size());
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
