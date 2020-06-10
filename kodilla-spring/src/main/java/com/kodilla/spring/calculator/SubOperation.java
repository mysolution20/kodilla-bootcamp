package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class SubOperation implements Formula{
    public double sub(double a, double b) {
        return a - b;
    }

    @Override
    public double countFormula(double a, double b) {
        return sub( a,  b) ;
    }
}
