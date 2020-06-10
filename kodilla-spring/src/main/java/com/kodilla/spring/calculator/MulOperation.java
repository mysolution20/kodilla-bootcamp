package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class MulOperation implements Formula{
    public double mul(double a, double b) {
        return a * b;
    }

    @Override
    public double countFormula(double a, double b) {
        return mul( a,  b);
    }
}
