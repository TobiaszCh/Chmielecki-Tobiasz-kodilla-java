package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SendTasksTestSuite {

    @Test
    void testUpdate() {

        //Given
        SendTasks tasks1 = new FirstMentor();
        SendTasks tasks2 = new SecondMentor();
        Mentors mentor1 = new Mentors("Grzesiak");
        Mentors mentor2 = new Mentors("Brylewski");
        tasks1.registerObserver(mentor1);
        tasks2.registerObserver(mentor2);


        //When
        tasks1.addPost("Task5");
        tasks1.addPost("Task10");
        tasks2.addPost("Task11");
        tasks2.addPost("Task12");
        tasks2.addPost("Task13");


        //Then
        assertEquals(2, mentor1.getUpdateCount());
        assertEquals(3, mentor2.getUpdateCount());





    }
}
