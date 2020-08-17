package com.kodillla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Salami extends AbstractPizzaOrderDecorator {
    public Salami(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(4));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + salami";
    }
}
