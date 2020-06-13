package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void openSettingsLog() {
        Logger.log("gameBoyLog").open();
    }

    @AfterClass
    public static void closeSettingsLog() {
        Logger.close();
    }

    @Test
    public void testLastLog() {
        //Given
        String log = "gameBoyLog";
        //When
        String stringLog = Logger.getLastLog();
        //Then
        Assert.assertEquals(log, stringLog);
        System.out.println("LogText: " + stringLog);
    }

    @Test
    public void testLoadingLog() {
        //Given
        //When
        boolean result = Logger.loadSettingLog();
        //Then
        Assert.assertTrue(result);
    }
}