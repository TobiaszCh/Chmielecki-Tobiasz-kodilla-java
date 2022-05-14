package com.kodilla.springe.forum;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ForumUserTestSuite {

    @Test
    void testGetUsername() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.springe");
        ForumUser forumUser = context.getBean(ForumUser.class);
        //When
        String username = forumUser.getUser();
        //Then
        assertEquals("John Smith", username);
    }
}
