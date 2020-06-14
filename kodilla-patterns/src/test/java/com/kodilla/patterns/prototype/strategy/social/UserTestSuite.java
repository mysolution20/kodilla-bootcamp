package com.kodilla.patterns.prototype.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User marcin = new Millenials("Marcin Borkowski");
        User janusz = new YGeneration("Janusz Witczak");
        User mateusz = new ZGeneration("Mateusz Nowak");

        //When
        String marcinUse = marcin.sharePost();
        System.out.println("Marcin uses: " + marcinUse);
        String januszUse = janusz.sharePost();
        System.out.println("Janusz uses: " + januszUse);
        String mateuszUse = mateusz.sharePost();
        System.out.println("Mateusz uses: " + mateuszUse);

        //Then
        Assert.assertEquals("Facebook", marcinUse);
        Assert.assertEquals("Twitter", januszUse);
        Assert.assertEquals("Snapchat", mateuszUse);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User marcin = new Millenials("Marcin Borkowski");

        //When
        String marcinUse = marcin.sharePost();
        System.out.println("Marcin uses: " + marcinUse);
        marcin.setSharePost(new TwitterPublisher());
        marcinUse = marcin.sharePost();
        System.out.println("Marcin now uses: " + marcinUse);

        //Then
        Assert.assertEquals("Twitter", marcinUse);
    }
}