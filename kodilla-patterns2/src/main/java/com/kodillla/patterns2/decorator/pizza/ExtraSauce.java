package com.kodillla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraSauce extends AbstractPizzaOrderDecorator {
    public ExtraSauce(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(2));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+" + extra sauce";
    }
}
