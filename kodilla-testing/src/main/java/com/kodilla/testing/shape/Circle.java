package com.kodilla.testing.shape;

public class Circle implements Shape {

    public String getShapeName() {
        return "Circle";
    }

    public double getField() {
        double radius = 2;
        double PI = 3.14;
        return PI * radius * radius;

    }
}

