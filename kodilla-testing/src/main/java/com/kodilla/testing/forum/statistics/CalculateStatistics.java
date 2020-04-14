package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CalculateStatistics {

    String userName;

    public CalculateStatistics(String userName) {
        this.userName = userName;
    }

    public int calculateNumberOfUsers(String userName)
   {
       Set<String>  statisticList = new HashSet<>();
       StatisticsPicker statistic1 = new StatisticsPicker("mrgalamonim");
       statisticList.add(userName);
        return  statisticList.size();
   }



}
