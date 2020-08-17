package com.kodillla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaSmallVariant extends AbstractPizzaOrderDecorator {
    public PizzaSmallVariant(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice();
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ": small variant";
    }
}
