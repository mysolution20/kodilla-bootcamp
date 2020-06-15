package com.kodilla.patterns.builder.pizza;

import org.junit.Assert;
import org.junit.Test;

public class PizzaTestSuite {
    @Test
    public void testPizzaPreviousNew() {
        //Given
        PizzaPrevious pizzaPrevious = new PizzaPrevious("Thin", "Spicy", "Mushrooms", "Onion", "Ham");
        System.out.println(pizzaPrevious);
        //When
        int howManyIngredients = pizzaPrevious.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);
    }
    @Test
    public void testPizzaNew() {
        //Given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredient("Onion")
                .bottom("Thin")
                .sauce("Spicy")
                .ingredient("Ham")
                .ingredient("Mushrooms")
                .build();
        System.out.println(pizza);
        //When
        int howManyIngredients = pizza.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);
    }

}