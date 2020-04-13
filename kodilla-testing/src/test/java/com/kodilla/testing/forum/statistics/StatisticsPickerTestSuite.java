package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.StatisticsPicker;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsPickerTestSuite {

    @Test
    public void testCalculateAdvStatisticsWithMock() {

        //Given
        Statistics usersNamesMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList<>();      // list of users names
        usersNames.add("mrsmith");
        usersNames.add("mrkowalski");
        usersNames.add("mrnowak");
        usersNames.add("mrkowal");
        usersNames.add("mrmuller");

        when(usersNamesMock.usersNames()).thenReturn(usersNames);
        Statistics statistics = new StatisticsPicker( );


        //When
//        int quantityOfSensors = statistics.calculateAdvStatistics(statistics).size();

    }

}
