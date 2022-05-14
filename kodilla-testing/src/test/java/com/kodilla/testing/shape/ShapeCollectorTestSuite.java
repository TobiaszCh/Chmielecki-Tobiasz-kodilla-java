package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@DisplayName ("TDD: Test Shape collector")
class ShapeCollectorTestSuite {
    @Nested
    class TestAddFigure {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(6);
            shapeCollector.addFigure(shape);
            //When
            int result = shapeCollector.getFigure1().size();
            //Then
            Assertions.assertEquals(1, result);
        }
    }

    @Nested
    class TestRemoveFigure {
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(6);
            shapeCollector.addFigure(shape);
            shapeCollector.removeFigure(shape);
            //When
            int result = shapeCollector.getFigure1().size();
            //Then
            Assertions.assertEquals(0, result);
        }
    }

    @Nested
    class TestGetFigure {
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(6);
            shapeCollector.addFigure(shape);
            //When
            Shape result1 = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(shape, result1);
        }
    }

    @Nested
    class TestShowFigures {
        @Test
        void testShowFigures() {
            //Given
            Shape shape = new Triangle(6);
            Shape shape1 = new Circle(9);
            Shape shape2 = new Square(2);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(shape);
            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);
            String test = shapeCollector.showFigures();
            //When
            String test1 = "Triangle " + "Circle " + "Square ";
            //Then
            Assertions.assertEquals(test, test1);

        }
    }
}