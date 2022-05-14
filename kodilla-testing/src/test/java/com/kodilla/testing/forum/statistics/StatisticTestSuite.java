package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticTestSuite {
    private static int testCounter = 0;
    Statistic statistic = new Statistic();

    @BeforeEach
    public void beforeEach() {
        testCounter ++;
        System.out.println("Test " + testCounter);
        List<String> mockNames = new ArrayList<>();
        for (int n = 1; mockNames.size() < 100; n++) {
            mockNames.add("User" + n);
        }
        when(statisticsMock.usersNames()).thenReturn(mockNames);
        when(statisticsMock.postsCount()).thenReturn(200);
        when(statisticsMock.commentsCount()).thenReturn(400);

    }
    @AfterEach
    public void afterEach() {
        System.out.println("Test end");
    }

    @Mock
    private Statistics statisticsMock;

    @Test
    void countPostsZero() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        statistic.calculateAdvStatistics(statisticsMock);
        //then
        Assertions.assertEquals(0, statistic.getAveragePostsPerUser());
        Assertions.assertEquals(4, statistic.getAverageCommentsPerUser());
        Assertions.assertEquals(0, statistic.getAverageCommentsPerPost());

    }

    @Test
    void countPostsThousand() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        statistic.calculateAdvStatistics(statisticsMock);
        //then
        Assertions.assertEquals(10, statistic.getAveragePostsPerUser());
        Assertions.assertEquals(4, statistic.getAverageCommentsPerUser());
        Assertions.assertEquals(0.4, statistic.getAverageCommentsPerPost());

    }
    @Test
    void countCommentsZero() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        statistic.calculateAdvStatistics(statisticsMock);
        //then
        Assertions.assertEquals(2, statistic.getAveragePostsPerUser());
        Assertions.assertEquals(0, statistic.getAverageCommentsPerUser());
        Assertions.assertEquals(0, statistic.getAverageCommentsPerPost());

    }
    @Test
    void commentsLessThanPosts() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.postsCount()).thenReturn(100);
        //When
        statistic.calculateAdvStatistics(statisticsMock);
        //then
        Assertions.assertEquals(1, statistic.getAveragePostsPerUser());
        Assertions.assertEquals(0.5, statistic.getAverageCommentsPerUser());
        Assertions.assertEquals(0.5, statistic.getAverageCommentsPerPost());


    }
    @Test
    void commentsMoreThanPosts() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(50);
        //When
        statistic.calculateAdvStatistics(statisticsMock);
        //then
        Assertions.assertEquals(0.5, statistic.getAveragePostsPerUser());
        Assertions.assertEquals(1, statistic.getAverageCommentsPerUser());
        Assertions.assertEquals(2, statistic.getAverageCommentsPerPost());

    }
    @Test
    void usersNameZero() {
        List<String> mockNames = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(mockNames);
        //When
        statistic.calculateAdvStatistics(statisticsMock);
        //then
        Assertions.assertEquals(0, statistic.getAveragePostsPerUser());
        Assertions.assertEquals(0, statistic.getAverageCommentsPerUser());
        Assertions.assertEquals(0, statistic.getAverageCommentsPerPost());

    }
    @Test
    void usersNameThousand() {
        List<String> mockNames = new ArrayList<>();
        for (int n = 1; mockNames.size() < 1000; n++) {
            mockNames.add("mockUser" + n++);
        }
        System.out.println(mockNames.size());
        when(statisticsMock.usersNames()).thenReturn(mockNames);
        //When
        statistic.calculateAdvStatistics(statisticsMock);
        //then
        Assertions.assertEquals(0.2, statistic.getAveragePostsPerUser());
        Assertions.assertEquals(0.4, statistic.getAverageCommentsPerUser());
        Assertions.assertEquals(2, statistic.getAverageCommentsPerPost());

    }
}
