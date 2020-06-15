package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String bun;
    private final Integer burgers;
    private final List<String> sauces;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String bun;
        private Integer burgers;
        private List<String> sauces = new ArrayList<>();
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(Integer burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            sauces.add(sauce);
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }
        public Bigmac build() {
            return new Bigmac(bun, burgers, sauces,ingredients);
        }
    }

    public Bigmac(String bun, Integer burgers, List<String> sauces, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauces = sauces;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public Integer getBurgers() {
        return burgers;
    }

    public List<String> getSauces() {
        return sauces;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce=" + sauces +
                ", ingredients=" + ingredients +
                '}';
    }
}
