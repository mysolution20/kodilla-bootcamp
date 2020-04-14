package com.kodilla.testing.forum.statistics;

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
//        StatisticsPicker statisticsPicker = new StatisticsPicker(usersNamesMock);

        List<String> usersNames = new ArrayList<>();      // list of users names
        usersNames.add("mrsmith");
        usersNames.add("mrkowalski");
        usersNames.add("mrnowak");
        usersNames.add("mrkowal");
        usersNames.add("mrmuller");

        when(usersNamesMock.usersNames()).thenReturn(usersNames);
//        Statistics statistics = new StatisticsPicker( );


        //When
//        int quantityOfSensors = statistics.calculateAdvStatistics(statistics).size();

    }

}
