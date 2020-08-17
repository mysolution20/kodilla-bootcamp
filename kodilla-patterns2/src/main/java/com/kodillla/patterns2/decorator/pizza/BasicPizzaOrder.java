package com.kodillla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements  PizzaOrder{
    @Override
    public BigDecimal getPrice() {
         return new BigDecimal(15.00);
    }

    @Override
    public String getIngredients() {
        return "Pizza: dough and tomato sauce with cheese";
    }
}
