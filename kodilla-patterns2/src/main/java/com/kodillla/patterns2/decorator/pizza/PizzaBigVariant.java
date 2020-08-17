package com.kodillla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaBigVariant extends AbstractPizzaOrderDecorator {
    public PizzaBigVariant(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(10));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ": big variant";
    }
}
