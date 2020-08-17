package com.kodillla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Arugula extends AbstractPizzaOrderDecorator {
    public Arugula(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(3));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + aruqula";
    }
}
