package com.kodilla.patterns.prototype.strategy;

public class ConservativePredictor implements BuyPredictor{
    @Override
    public String predictWhatToBuy() {
        return "[Conservative predictor] Buy debentures of XYZ";
    }
}
