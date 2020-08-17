package com.kodillla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {
    /**
     * dlaczego tu: BigDecimal.valueOf(15.00) nie natomiast, jako: new BigDecimal(15.00) ?
     */
    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(15.00);
    }

    @Override
    public String getIngredients() {
        return "Pizza: dough and tomato sauce with cheese";
    }
}
