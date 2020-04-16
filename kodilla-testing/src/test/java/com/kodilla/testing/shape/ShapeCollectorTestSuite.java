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
        // info: ( add * 4 ) less 1  Then 3  for assert to test
        Assert.assertEquals(3, figures.size());
    }

    @Test
    public void testGetFigure() {
        //Given
        Shape circle = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector(circle);

        //When
        Shape result = shapeCollector.getFigure();

        //Then
        Assert.assertEquals(result, circle);
    }

    @Test
    public void testShowFigures() {
        //Given
        Shape triangle = new Triangle();
        Shape square = new Square();
        Shape circle = new Circle();
        List<Shape> figures = new ArrayList<>();

        //When
        figures.add(triangle);
        figures.add(square);
        figures.add(circle);

        //Then
        Assert.assertEquals("Triangle", figures.get(0).getShapeName());
        Assert.assertEquals("Square", figures.get(1).getShapeName());
        Assert.assertEquals("Circle", figures.get(2).getShapeName());
    }

}
