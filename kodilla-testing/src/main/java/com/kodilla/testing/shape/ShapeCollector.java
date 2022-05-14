package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {


    private List<Shape> figure = new ArrayList<>();

    public List<Shape> getFigure1() {
        return figure;
    }
    public void addFigure(Shape shape) {
        figure.add(shape);
    }
    public void removeFigure(Shape shape) {
        figure.remove(shape);
    }
    public Shape getFigure(int n) {
       return figure.get(n);
    }

    public String showFigures() {
        String result = "";
        for (Shape figures : figure) {
            result += figures.getShapeName() + " ";
        }
        return result;
    }

}
