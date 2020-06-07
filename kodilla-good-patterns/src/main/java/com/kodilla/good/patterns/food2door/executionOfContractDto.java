package com.kodilla.good.patterns.food2door;

public class executionOfContractDto {
    public FoodProducer foodProducer;
    public Buyer buyer;
    public FoodItem foodItem;
    public boolean isAccepted;

    public executionOfContractDto(FoodProducer foodProducer, Buyer buyer, FoodItem foodItem, boolean isAccepted) {
        this.foodProducer = foodProducer;
        this.buyer = buyer;
        this.foodItem = foodItem;
        this.isAccepted = isAccepted;
    }

    public FoodProducer getFoodProducer() {
        return foodProducer;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public boolean isAccepted() {
        return isAccepted;
    }
}
