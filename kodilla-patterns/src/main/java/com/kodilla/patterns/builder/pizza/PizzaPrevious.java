package com.kodilla.patterns.builder.pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaPrevious {
    private final String bottom;
    private final String sauce;
    private final List<String> ingredients = new ArrayList<>();

    public PizzaPrevious(final String bottom, final String sauce, final String... ingredients) {
        this.bottom = bottom;
        this.sauce = sauce;
        for (int n = 0; n < ingredients.length; n++) {
            this.ingredients.add(ingredients[n]);
        }
    }

    public String getBottom() {
        return bottom;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "bottom='" + bottom + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
