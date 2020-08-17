package com.kodillla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaMediumVariant extends AbstractPizzaOrderDecorator{
    public PizzaMediumVariant(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(5));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+": medium variant";
    }
}
