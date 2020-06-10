package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class AddOperation implements Formula {
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double countFormula(double a, double b) {
        return add(a, b);
    }

}
