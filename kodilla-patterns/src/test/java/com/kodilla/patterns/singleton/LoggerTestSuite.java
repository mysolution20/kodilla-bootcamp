package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void openSettingsLog() {
        Logger.getInstance().open();
    }

    @AfterClass
    public static void closeSettingsLog() {
        Logger.getInstance().close();
    }

    @Test
    public void testLastLog() {
        //Given
        String lastLogText = "gameBoyLog";
        //When
        Logger.getInstance().log(lastLogText);
        //Then
        Assert.assertEquals(lastLogText, Logger.getInstance().getLastLog());
        System.out.println("LogText: " + lastLogText);
    }

    @Test
    public void testLoadingLog() {
        //Given
        //When
        boolean result = Logger.getInstance().loadSettingLog();
        //Then
        Assert.assertTrue(result);
    }
}