package com.kodilla.springe.library;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootTest
public class LibraryTestSuite {

    @Test
    void testLoadFromDB() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.springe");
        Library library = context.getBean(Library.class);
        //When
        library.loadToDb();
        //Then

    }

    @Test
    void testSaveFromDB() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.springe");
        Library library = context.getBean(Library.class);
        //When
        library.saveToDb();
        //Then

    }
    @Test
    void testContext() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.springe");

        //When & Then
        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }
}
