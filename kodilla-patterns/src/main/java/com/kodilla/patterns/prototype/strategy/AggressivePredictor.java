package com.kodilla.patterns.prototype.strategy;

public class AggressivePredictor implements BuyPredictor{
    @Override
    public String predictWhatToBuy() {
        return "[Aggressive predictor] Buy stock of XYZ";
    }
}
