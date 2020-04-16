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
    public void testCalculateAdvStatisticsWithMockInCaseOf0Posts0Comments0Users() {

        //Given
        Statistics usersNamesMock = mock(Statistics.class);
        StatisticsPicker statisticsPicker = new StatisticsPicker();

        List<String> usersNames = new ArrayList<>();

        when(usersNamesMock.postsCount()).thenReturn(0);
        when(usersNamesMock.commentsCount()).thenReturn(0);
        when(usersNamesMock.usersNames()).thenReturn(usersNames);

        //When
        statisticsPicker.calculateAdvStatistics(usersNamesMock);

        // Then
        Assert.assertEquals(0, statisticsPicker.getNumOfUsers(), 0);
        Assert.assertEquals(0, statisticsPicker.getNumOfComments(), 0);
        Assert.assertEquals(0, statisticsPicker.getNumOfPosts(), 0);
        Assert.assertEquals(0, statisticsPicker.getAvgNumOfCommentsPerPost(), 0);
        Assert.assertEquals(0, statisticsPicker.getAvgNumOfCommentsPerUser(), 0);
        Assert.assertEquals(0, statisticsPicker.getAvgNumOfPostPerUser(), 0);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockInCaseOf1000Posts0Comments0Users() {

        //Given
        Statistics usersNamesMock = mock(Statistics.class);
        StatisticsPicker statisticsPicker = new StatisticsPicker();

        List<String> usersNames = new ArrayList<>();

        when(usersNamesMock.postsCount()).thenReturn(1000);
        when(usersNamesMock.commentsCount()).thenReturn(0);
        when(usersNamesMock.usersNames()).thenReturn(usersNames);

        //When
        statisticsPicker.calculateAdvStatistics(usersNamesMock);

        // Then
        Assert.assertEquals(0, statisticsPicker.getNumOfUsers(), 0);
        Assert.assertEquals(0, statisticsPicker.getNumOfComments(), 0);
        Assert.assertEquals(0, statisticsPicker.getNumOfPosts(), 0);
        Assert.assertEquals(0, statisticsPicker.getAvgNumOfCommentsPerPost(), 0);
        Assert.assertEquals(0, statisticsPicker.getAvgNumOfCommentsPerUser(), 0);
        Assert.assertEquals(0, statisticsPicker.getAvgNumOfPostPerUser(), 0);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockInCaseOf0Posts0Comments100Users() {

        //Given
        Statistics usersNamesMock = mock(Statistics.class);
        StatisticsPicker statisticsPicker = new StatisticsPicker();

        List<String> usersNames = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            usersNames.add("mrsmith" + i);
        }
        when(usersNamesMock.postsCount()).thenReturn(0);
        when(usersNamesMock.commentsCount()).thenReturn(0);
        when(usersNamesMock.usersNames()).thenReturn(usersNames);

        //When
        statisticsPicker.calculateAdvStatistics(usersNamesMock);

        // Then
        Assert.assertEquals(100, statisticsPicker.getNumOfUsers(), 0);
        Assert.assertEquals(0, statisticsPicker.getNumOfComments(), 0);
        Assert.assertEquals(0, statisticsPicker.getNumOfPosts(), 0);
        Assert.assertEquals(0, statisticsPicker.getAvgNumOfCommentsPerPost(), 0);
        Assert.assertEquals(0, statisticsPicker.getAvgNumOfCommentsPerUser(), 0);
        Assert.assertEquals(0, statisticsPicker.getAvgNumOfPostPerUser(), 0);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockInCaseOf1000Posts0Comments100Users() {

        //Given
        Statistics usersNamesMock = mock(Statistics.class);
        StatisticsPicker statisticsPicker = new StatisticsPicker();

        List<String> usersNames = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            usersNames.add("mrsmith" + i);
        }
        when(usersNamesMock.postsCount()).thenReturn(1000);
        when(usersNamesMock.commentsCount()).thenReturn(0);
        when(usersNamesMock.usersNames()).thenReturn(usersNames);

        //When
        statisticsPicker.calculateAdvStatistics(usersNamesMock);

        // Then
        Assert.assertEquals(100, statisticsPicker.getNumOfUsers(), 0);
        Assert.assertEquals(0, statisticsPicker.getNumOfComments(), 0);
        Assert.assertEquals(1000, statisticsPicker.getNumOfPosts(), 0);
        Assert.assertEquals(0, statisticsPicker.getAvgNumOfCommentsPerPost(), 0);
        Assert.assertEquals(0, statisticsPicker.getAvgNumOfCommentsPerUser(), 0);
        Assert.assertEquals(10, statisticsPicker.getAvgNumOfPostPerUser(), 0);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockInCaseOfPostsAreMoreThenCommentsAnd100Users() {

        //Given
        Statistics usersNamesMock = mock(Statistics.class);
        StatisticsPicker statisticsPicker = new StatisticsPicker();

        List<String> usersNames = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            usersNames.add("mrsmith" + i);
        }
        when(usersNamesMock.postsCount()).thenReturn(1000);
        when(usersNamesMock.commentsCount()).thenReturn(500);
        when(usersNamesMock.usersNames()).thenReturn(usersNames);

        //When
        statisticsPicker.calculateAdvStatistics(usersNamesMock);

        // Then
        Assert.assertEquals(100, statisticsPicker.getNumOfUsers(), 0);
        Assert.assertEquals(500, statisticsPicker.getNumOfComments(), 0);
        Assert.assertEquals(1000, statisticsPicker.getNumOfPosts(), 0);
        Assert.assertEquals(0.5, statisticsPicker.getAvgNumOfCommentsPerPost(), 0);
        Assert.assertEquals(5, statisticsPicker.getAvgNumOfCommentsPerUser(), 0);
        Assert.assertEquals(10, statisticsPicker.getAvgNumOfPostPerUser(), 0);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockInCaseOfPostsAreLessThenCommentsAnd100Users() {

        //Given
        Statistics usersNamesMock = mock(Statistics.class);
        StatisticsPicker statisticsPicker = new StatisticsPicker();

        List<String> usersNames = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            usersNames.add("mrsmith" + i);
        }
        when(usersNamesMock.postsCount()).thenReturn(1000);
        when(usersNamesMock.commentsCount()).thenReturn(2000);
        when(usersNamesMock.usersNames()).thenReturn(usersNames);

        //When
        statisticsPicker.calculateAdvStatistics(usersNamesMock);

        // Then
        Assert.assertEquals(100, statisticsPicker.getNumOfUsers(), 0);
        Assert.assertEquals(2000, statisticsPicker.getNumOfComments(), 0);
        Assert.assertEquals(1000, statisticsPicker.getNumOfPosts(), 0);
        Assert.assertEquals(2, statisticsPicker.getAvgNumOfCommentsPerPost(), 0);
        Assert.assertEquals(20, statisticsPicker.getAvgNumOfCommentsPerUser(), 0);
        Assert.assertEquals(10, statisticsPicker.getAvgNumOfPostPerUser(), 0);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockInCaseOfPostsAreMoreThenCommentsAnd0Users() {

        //Given
        Statistics usersNamesMock = mock(Statistics.class);
        StatisticsPicker statisticsPicker = new StatisticsPicker();

        List<String> usersNames = new ArrayList<>();

        when(usersNamesMock.postsCount()).thenReturn(1000);
        when(usersNamesMock.commentsCount()).thenReturn(0);
        when(usersNamesMock.usersNames()).thenReturn(usersNames);

        //When
        statisticsPicker.calculateAdvStatistics(usersNamesMock);

        // Then
        Assert.assertEquals(0, statisticsPicker.getNumOfUsers(), 0);
        Assert.assertEquals(0, statisticsPicker.getNumOfComments(), 0);
        Assert.assertEquals(0, statisticsPicker.getNumOfPosts(), 0);
        Assert.assertEquals(0, statisticsPicker.getAvgNumOfCommentsPerPost(), 0);
        Assert.assertEquals(0, statisticsPicker.getAvgNumOfCommentsPerUser(), 0);
        Assert.assertEquals(0, statisticsPicker.getAvgNumOfPostPerUser(), 0);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockInCaseOfPostsAreLessThenCommentsAnd0Users() {

        //Given
        Statistics usersNamesMock = mock(Statistics.class);
        StatisticsPicker statisticsPicker = new StatisticsPicker();

        List<String> usersNames = new ArrayList<>();

        when(usersNamesMock.postsCount()).thenReturn(1000);
        when(usersNamesMock.commentsCount()).thenReturn(2000);
        when(usersNamesMock.usersNames()).thenReturn(usersNames);

        //When
        statisticsPicker.calculateAdvStatistics(usersNamesMock);

        // Then
        Assert.assertEquals(0, statisticsPicker.getNumOfUsers(), 0);
        Assert.assertEquals(0, statisticsPicker.getNumOfComments(), 0);
        Assert.assertEquals(0, statisticsPicker.getNumOfPosts(), 0);
        Assert.assertEquals(0, statisticsPicker.getAvgNumOfCommentsPerPost(), 0);
        Assert.assertEquals(0, statisticsPicker.getAvgNumOfCommentsPerUser(), 0);
        Assert.assertEquals(0, statisticsPicker.getAvgNumOfPostPerUser(), 0);
    }
}
