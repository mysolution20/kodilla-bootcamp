package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsPickerTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Beginning of statistics tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All statistics tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute statistics test #" + testCounter);
    }

    @Test
    public void testCalculateAdvStatisticsWithMock() {

        //Given
        Statistics usersNamesMock = mock(Statistics.class);
        StatisticsPicker statisticsPicker = new StatisticsPicker();

        List<String> usersNames = new ArrayList<>();
        usersNames.add("mrsmith");
        usersNames.add("mrkowalski");
        usersNames.add("mrnowak");
        usersNames.add("mrkowal");
        usersNames.add("mrmuller");

        when(usersNamesMock.usersNames()).thenReturn(usersNames);

        when(usersNamesMock.postsCount()).thenReturn(10);

        when(usersNamesMock.commentsCount()).thenReturn(50);


        //When
        statisticsPicker.calculateAdvStatistics(usersNamesMock);

        // Then

        Assert.assertEquals(5,statisticsPicker.getNumOfUsers());

        Assert.assertEquals(50,statisticsPicker.getNumOfComments());

        Assert.assertEquals(10,statisticsPicker.getNumOfPosts());

        Assert.assertEquals(5, statisticsPicker.getAvgNumOfCommentsPerPost(), 0);

        Assert.assertEquals(10, statisticsPicker.getAvgNumOfCommentsPerUser(), 0);

        Assert.assertEquals(2, statisticsPicker.getAvgNumOfPostPerUser(), 0);


    }

}
