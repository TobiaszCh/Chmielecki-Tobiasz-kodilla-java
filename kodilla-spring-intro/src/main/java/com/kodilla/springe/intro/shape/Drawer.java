package com.kodilla.springe.intro.shape;

public class Drawer {

    private final Shape shape;

    public Drawer(Shape shape) {
        this.shape = shape;
    }

    public String doDrawing() {
        return shape.draw();
    }
}
