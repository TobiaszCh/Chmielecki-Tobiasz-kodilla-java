package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DrivingTask);
        //Then
        assertEquals("Taxi", drivingTask.getTaskName());
        assertEquals("I will driving", drivingTask.executeTask());
        assertFalse(drivingTask.isTaskExecuted());
    }

    @Test
    void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PaintingTask);
        //Then
        assertEquals("Face painting", paintingTask.getTaskName());
        assertEquals("I am painting", paintingTask.executeTask());
        assertFalse(paintingTask.isTaskExecuted());
    }

    @Test
    void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.ShoppingTask);
        //Then
        assertEquals("Shopping Time", shoppingTask.getTaskName());
        assertEquals("I did the shopping", shoppingTask.executeTask());
        assertTrue(shoppingTask.isTaskExecuted());

    }
}
