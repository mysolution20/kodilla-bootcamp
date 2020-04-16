package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    Shape shape;

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    List<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public void removeFigure(Shape shape) {
        figures.remove(shape);
    }

    public Shape getFigure() {
        return this.shape;
    }

    public void showFigures() {
        for (Shape shape : figures) {
            System.out.println(shape.getShapeName());
        }
    }
}
