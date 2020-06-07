package com.kodilla.good.patterns.food2door;


import java.util.Objects;

public class FoodProducer  {
    private final String producerName;

    public FoodProducer(String producerName) {
        this.producerName = producerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoodProducer that = (FoodProducer) o;
        return Objects.equals(getProducerName(), that.getProducerName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProducerName());
    }

    public String getProducerName() {
        return producerName;
    }
}
