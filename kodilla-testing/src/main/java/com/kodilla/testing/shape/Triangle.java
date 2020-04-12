package com.kodilla.testing.shape;

public class Triangle implements Shape {

    public String getShapeName() {
        return "Triangle";
    }

    public double getField() {
        double basis =2;
        double height = 3;
        return  basis * height / 2;
    }
}
