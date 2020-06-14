package com.kodilla.patterns.prototype.strategy;

public class BalancedPredictor implements BuyPredictor{
    @Override
    public String predictWhatToBuy() {
        return "[Balanced predictor] Buy shared units of Fund XYZ";
    }
}
