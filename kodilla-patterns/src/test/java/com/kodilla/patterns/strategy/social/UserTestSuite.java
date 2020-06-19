package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User brajan = new ZGeneration("Brajan Kowalski");
        User seba = new YGeneration("Seba TumuLec");
        User angela = new Millenials("Andżela");

        //When
        String brajanShared = brajan.share();
        System.out.println("Brajan shared by: " + brajanShared);
        String sebaShared = seba.share();
        System.out.println("Seba shared by: " + sebaShared);
        String angelaShared = angela.share();
        System.out.println("Andżela shared by: " + angelaShared);

        //Then
        Assert.assertEquals(brajanShared, "Shared by Snapchat");
        Assert.assertEquals(sebaShared, "Shared by Twitter");
        Assert.assertEquals(angelaShared, "Shared by Facebook");
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User brajan = new ZGeneration("Brajan Kowalski");

        //When
        String brajanShared = brajan.share();
        System.out.println("Brajan shared by: " + brajanShared);
        brajan.setSocialPublisher(new FacebookPublisher());
        brajanShared = brajan.share();
        System.out.println("Brajan now shared by: " + brajanShared);

        //Then
        Assert.assertEquals(brajanShared, "Shared by Facebook");
    }
}
