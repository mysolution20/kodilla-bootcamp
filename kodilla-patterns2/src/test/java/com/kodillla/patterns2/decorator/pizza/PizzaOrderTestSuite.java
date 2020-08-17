package com.kodillla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite  {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedPrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(15), calculatedPrice);
    }
    @Test
    public void testBasicPizzaOrderGetIngredients() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        final String ingredients = theOrder.getIngredients();
        //Then
        assertEquals("Pizza: dough and tomato sauce with cheese", ingredients);
    }

    @Test
    public void testBasicPizzaOrderGetCostBigVariant() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaBigVariant(theOrder);
        //When
        BigDecimal calculatedPrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(25), calculatedPrice);
    }
    @Test
    public void testBasicPizzaOrderGetIngredientsBigVariant() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaBigVariant(theOrder);
        //When
        final String ingredients = theOrder.getIngredients();
        //Then
        assertEquals("Pizza: dough and tomato sauce with cheese: big variant", ingredients);
    }
    @Test
    public void testBasicPizzaOrderGetCostMediumVariant() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaMediumVariant(theOrder);
        //When
        BigDecimal calculatedPrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(20), calculatedPrice);
    }
    @Test
    public void testBasicPizzaOrderGetIngredientsMediumVariant() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaMediumVariant(theOrder);
        //When
        final String ingredients = theOrder.getIngredients();
        //Then
        assertEquals("Pizza: dough and tomato sauce with cheese: medium variant", ingredients);
    }
    /**
     15       5      10        3           4        3           2
     basic  medium   big   extra cheese   salami   aruqula   ExtraSauce
     */
    @Test
    public void testBasicPizzaOrderGetCostBigVariantExtraCheeseDoubleSalamiExtraSauceAndArugula() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaBigVariant(theOrder);
        theOrder = new ExtraCheese(theOrder);
        theOrder = new Salami(theOrder);
        theOrder = new Salami(theOrder);
        theOrder = new ExtraSauce(theOrder);
        theOrder = new Arugula(theOrder);

        //When
        BigDecimal calculatedPrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(41), calculatedPrice);
    }
    @Test
    public void testBasicPizzaOrderGetIngredientsBigVariantExtraCheeseDoubleSalamiExtraSauceAndArugula() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaBigVariant(theOrder);
        theOrder = new ExtraCheese(theOrder);
        theOrder = new Salami(theOrder);
        theOrder = new Salami(theOrder);
        theOrder = new ExtraSauce(theOrder);
        theOrder = new Arugula(theOrder);
        //When
        final String ingredients = theOrder.getIngredients();
        //Then
        assertEquals("Pizza: dough and tomato sauce with cheese: big variant + extra cheese + salami + salami + extra sauce + aruqula", ingredients);
    }
}