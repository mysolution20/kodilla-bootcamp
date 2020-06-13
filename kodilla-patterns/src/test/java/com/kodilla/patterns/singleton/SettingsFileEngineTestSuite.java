package com.kodilla.patterns.singleton;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SettingsFileEngineTestSuite {
    /** private static SettingsFileEngine settingsFileEngine; */
    @BeforeClass
    public static void openSettingsFile() {
        /** settingsFileEngine = new SettingsFileEngine();
         settingsFileEngine.open("myapp.settingsThisIsExampleNameOfMyApplication"); */
        SettingsFileEngine.getInstance().open("myapp.settingsThisIsExampleNameOfMyApplication");
    }

    @AfterClass
    public static void closeSettingsFile() {
        /** settingsFileEngine.close(); */
        SettingsFileEngine.getInstance().close();
    }

    @Test
    public void testGetFileName() {
        //Given
        //When
        /**String fileName = settingsFileEngine.getFileName();*/
        String fileName = SettingsFileEngine.getInstance().getFileName();
        //Then
        Assert.assertEquals("myapp.settingsThisIsExampleNameOfMyApplication", fileName);
    }

    @Test
    public void testLoadSettings() {
        //Given
        //When
        /**boolean result = settingsFileEngine.loadSettings(); */
        boolean result = SettingsFileEngine.getInstance().loadSettings();
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testSaveSettings() {
        //Given
        //When
        /**boolean result = settingsFileEngine.saveSettings(); */
        boolean result = SettingsFileEngine.getInstance().saveSettings();
        //Then
        Assert.assertTrue(result);
    }
}