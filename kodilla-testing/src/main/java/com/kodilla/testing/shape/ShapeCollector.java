package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public void removeFigure(Shape shape) {
        figures.remove(shape);
    }

    public String getFigure(int n) {
        return figures.get(n).getShapeName().toString();
    }

    public void showFigures() {
        for (Shape shape : figures) {
            System.out.println(shape.getShapeName().toString());
        }

    }

}
