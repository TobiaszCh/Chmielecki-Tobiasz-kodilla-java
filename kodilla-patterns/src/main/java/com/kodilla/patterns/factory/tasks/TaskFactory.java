package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DrivingTask = "DrivingTask";
    public static final String PaintingTask = "PaintingTask";
    public static final String ShoppingTask = "ShoppingTask";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DrivingTask:
                return new DrivingTask("Taxi", "Home", "Audi");
            case PaintingTask:
                return new PaintingTask("Face painting", "red", "face");
            case ShoppingTask:
                return new ShoppingTask("Shopping Time", "sneakers", 3);
            default:
                return null;
        }

    }
}
