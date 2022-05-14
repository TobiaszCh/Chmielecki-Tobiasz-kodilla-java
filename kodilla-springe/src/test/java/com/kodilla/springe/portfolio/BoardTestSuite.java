package com.kodilla.springe.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        //When
        Board board = context.getBean(Board.class);
        String task1 = "It will do";
        String task2 = "It is doing";
        String task3 = "It did";

        //Then
        assertEquals("[It will do]",board.getToDoList(task1).toString());
        assertEquals("[It is doing]",board.getInProgressList(task2).toString());
        assertEquals("[It did]",board.getDoneList(task3).toString());



    }
}
