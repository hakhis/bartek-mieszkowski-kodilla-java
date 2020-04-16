package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.weather.stub.Temperatures;
import org.junit.Test;
import org.mockito.stubbing.OngoingStubbing;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    //Given
    @Test
    public void testCalculateAdvStatistics() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList0 = new ArrayList<>();
        List<String> usersList100 = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            usersList100.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList100);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //When
        forumStatistics.calculateAdvStatistics();
        //Then
    }

}
