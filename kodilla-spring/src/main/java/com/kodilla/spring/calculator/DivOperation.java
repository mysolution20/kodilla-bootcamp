package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class DivOperation implements Formula{
    public double div(double a, double b) {
        return a / b;
    }

    @Override
    public double countFormula(double a, double b) {
        return div( a,  b);
    }
}
