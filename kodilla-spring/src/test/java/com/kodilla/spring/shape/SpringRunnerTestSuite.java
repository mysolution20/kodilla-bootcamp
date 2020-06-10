package com.kodilla.spring.shape;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTestSuite {
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
    public void testCircleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape)context.getBean("circle");
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is a circle.", name);
    }

    @Test
    public void testTriangleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape)context.getBean("triangle");
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is a triangle.", name);
    }

    @Test
    public void testSquareLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape)context.getBean("createSquare");  //  <-- it's method in ShapeFactory with @Configuration and @Bean Spring notation
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is a square.", name);
    }

    @Test
    public void testShapeLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape)context.getBean("chosenShape"); //  <-- it's method in ShapeFactory with @Configuration and @Bean Spring notation
        //When
        String name = shape.getShapeName();
        //Then
        System.out.println("Chosen shape says: " + name);
    }

  /**  @Test
    public void testCircleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Circle.class);
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is a circle.", name);
    }
    @Test
    public void testTriangleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Triangle.class);
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is a triangle.", name);
    }
        @Test
    public void testSquareLoadedIntoContainer() {
        //  Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Square.class);
        //  When
        String name = shape.getShapeName();
        //  Then
        Assert.assertEquals("This is a square.", name);
    }*/
}
