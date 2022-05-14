package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User tobi = new Millenials("Tobiasz");
        User norbi = new YGeneration("Norbert");
        User wiki = new ZGeneration("Wiktoria");

        //When
        String result1 = "Facebook";
        String result2 = "Twitter";
        String result3 = "Snapchat";
        //Then
        assertEquals(result1, tobi.sharePost());
        assertEquals(result2, norbi.sharePost());
        assertEquals(result3, wiki.sharePost());

    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User norbi = new YGeneration("Norbert");
        norbi.changePlatformByUser(new FacebookPublisher());
        //When
        String result1 = "Facebook";
        //Then
        assertEquals(result1, norbi.sharePost());

    }
}
