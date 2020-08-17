package com.kodillla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public interface PizzaOrder {
    BigDecimal getPrice();
    String getIngredients();
}
