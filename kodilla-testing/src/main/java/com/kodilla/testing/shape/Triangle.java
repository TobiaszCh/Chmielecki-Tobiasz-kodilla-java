package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {

    private static String shapeName = "Triangle";
    private double field;

    public Triangle(double field) {

        this.field = field;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.field, field) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(field);
    }
    @Override
    public String toString() {
        return shapeName + ": " +field;
    }
}

