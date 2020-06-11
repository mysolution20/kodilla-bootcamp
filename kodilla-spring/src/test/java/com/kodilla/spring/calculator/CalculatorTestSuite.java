package com.kodilla.spring.calculator;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    private static int testCounter = 0;
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Beginning of formulas tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All formulas tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute formula test #" + testCounter);
    }

    @Test
    public void testFormulaAddShouldEquals4() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Formula formula =  context.getBean(Calculator.class);
        //When
        double val = formula.add(2, 2);
        //Then
        Assert.assertEquals(4.00, val, 0);
    }

    @Test
    public void testFormulaSubShouldEquals0() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Formula formula = context.getBean(Calculator.class);
        //When
        double val = formula.sub(2, 2);
        //Then
        Assert.assertEquals(0.00, val, 0);
    }

    @Test
    public void testFormulaMulShouldEquals4() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Formula formula = context.getBean(Calculator.class);
        //When
        double val = formula.mul(2, 2);
        //Then
        Assert.assertEquals(4.00, val, 0);
    }

    @Test
    public void testFormulaDivShouldEquals1() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Formula formula = context.getBean(Calculator.class);
        //When
        double val = formula.div(2, 2);
        //Then
        Assert.assertEquals(1.00, val, 0);
    }
}