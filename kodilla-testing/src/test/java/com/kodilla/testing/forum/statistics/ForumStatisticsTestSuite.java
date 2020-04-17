package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    public static int testCounter = 0;
    @Before
    public void before(){
        testCounter++;
        System.out.println("Beginning of test #" + testCounter);
    }
    @After
    public void after(){
        System.out.println("End of test #" + testCounter);

    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testCalculateAdvStatistics0Posts() {
        //Given
        int userCount = 10;
        int postsCount = 0;
        int commentsCount = 40;
        double avgPostsPerUsr = (double) postsCount / userCount;
        double avgCommPerUsr = (double) commentsCount / userCount;
        double avgCommPerPost = 0;
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList100 = new ArrayList<>();
        for(int i = 0; i < userCount; i++){
            usersList100.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList100);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        forumStatistics.showStatistics();
        Assert.assertEquals(userCount, forumStatistics.getUserCount());
        Assert.assertEquals(postsCount, forumStatistics.getPostCount());
        Assert.assertEquals(commentsCount, forumStatistics.getCommentCount());
        Assert.assertEquals(avgPostsPerUsr, forumStatistics.getAveragePostsPerUser(), 0.01);
        Assert.assertEquals(avgCommPerUsr, forumStatistics.getAverageCommentsPerUser(), 0.01);
        Assert.assertEquals(avgCommPerPost, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatistics1000Posts() {
        //Given
        int userCount = 10;
        int postsCount = 1000;
        int commentsCount = 40;
        double avgPostsPerUsr = (double) postsCount / userCount;
        double avgCommPerUsr = (double) commentsCount / userCount;
        double avgCommPerPost = (double) commentsCount / postsCount;
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList100 = new ArrayList<>();
        for(int i = 0; i < userCount; i++){
            usersList100.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList100);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        forumStatistics.showStatistics();
        Assert.assertEquals(userCount, forumStatistics.getUserCount());
        Assert.assertEquals(postsCount, forumStatistics.getPostCount());
        Assert.assertEquals(commentsCount, forumStatistics.getCommentCount());
        Assert.assertEquals(avgPostsPerUsr, forumStatistics.getAveragePostsPerUser(), 0.01);
        Assert.assertEquals(avgCommPerUsr, forumStatistics.getAverageCommentsPerUser(), 0.01);
        Assert.assertEquals(avgCommPerPost, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatistics0Comments() {
        //Given
        int userCount = 10;
        int postsCount = 50;
        int commentsCount = 0;
        double avgPostsPerUsr = (double) postsCount / userCount;
        double avgCommPerUsr = (double) commentsCount / userCount;
        double avgCommPerPost = (double) commentsCount / postsCount;
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList100 = new ArrayList<>();
        for(int i = 0; i < userCount; i++){
            usersList100.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList100);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        forumStatistics.showStatistics();
        Assert.assertEquals(userCount, forumStatistics.getUserCount());
        Assert.assertEquals(postsCount, forumStatistics.getPostCount());
        Assert.assertEquals(commentsCount, forumStatistics.getCommentCount());
        Assert.assertEquals(avgPostsPerUsr, forumStatistics.getAveragePostsPerUser(), 0.01);
        Assert.assertEquals(avgCommPerUsr, forumStatistics.getAverageCommentsPerUser(), 0.01);
        Assert.assertEquals(avgCommPerPost, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsCommentsMoreThanPosts() {
        //Given
        int userCount = 10;
        int postsCount = 50;
        int commentsCount = 100;
        double avgPostsPerUsr = (double) postsCount / userCount;
        double avgCommPerUsr = (double) commentsCount / userCount;
        double avgCommPerPost = (double) commentsCount / postsCount;
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList100 = new ArrayList<>();
        for(int i = 0; i < userCount; i++){
            usersList100.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList100);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        forumStatistics.showStatistics();
        Assert.assertEquals(userCount, forumStatistics.getUserCount());
        Assert.assertEquals(postsCount, forumStatistics.getPostCount());
        Assert.assertEquals(commentsCount, forumStatistics.getCommentCount());
        Assert.assertEquals(avgPostsPerUsr, forumStatistics.getAveragePostsPerUser(), 0.01);
        Assert.assertEquals(avgCommPerUsr, forumStatistics.getAverageCommentsPerUser(), 0.01);
        Assert.assertEquals(avgCommPerPost, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsPostsMoreThanComments() {
        //Given
        int userCount = 10;
        int postsCount = 100;
        int commentsCount = 40;
        double avgPostsPerUsr = (double) postsCount / userCount;
        double avgCommPerUsr = (double) commentsCount / userCount;
        double avgCommPerPost = (double) commentsCount / postsCount;
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList100 = new ArrayList<>();
        for(int i = 0; i < userCount; i++){
            usersList100.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList100);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        forumStatistics.showStatistics();
        Assert.assertEquals(userCount, forumStatistics.getUserCount());
        Assert.assertEquals(postsCount, forumStatistics.getPostCount());
        Assert.assertEquals(commentsCount, forumStatistics.getCommentCount());
        Assert.assertEquals(avgPostsPerUsr, forumStatistics.getAveragePostsPerUser(), 0.01);
        Assert.assertEquals(avgCommPerUsr, forumStatistics.getAverageCommentsPerUser(), 0.01);
        Assert.assertEquals(avgCommPerPost, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatistics0Users() {
        //Given
        int userCount = 0;
        int postsCount = 50;
        int commentsCount = 40;
        double avgPostsPerUsr = 0;
        double avgCommPerUsr = 0;
        double avgCommPerPost = (double) commentsCount / postsCount;
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList100 = new ArrayList<>();
        for(int i = 0; i < userCount; i++){
            usersList100.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList100);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        forumStatistics.showStatistics();
        Assert.assertEquals(userCount, forumStatistics.getUserCount());
        Assert.assertEquals(postsCount, forumStatistics.getPostCount());
        Assert.assertEquals(commentsCount, forumStatistics.getCommentCount());
        Assert.assertEquals(avgPostsPerUsr, forumStatistics.getAveragePostsPerUser(), 0.01);
        Assert.assertEquals(avgCommPerUsr, forumStatistics.getAverageCommentsPerUser(), 0.01);
        Assert.assertEquals(avgCommPerPost, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatistics100Users() {
        //Given
        int userCount = 100;
        int postsCount = 50;
        int commentsCount = 40;
        double avgPostsPerUsr = (double) postsCount / userCount;
        double avgCommPerUsr = (double) commentsCount / userCount;
        double avgCommPerPost = (double) commentsCount / postsCount;
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList100 = new ArrayList<>();
        for(int i = 0; i < userCount; i++){
            usersList100.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList100);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        forumStatistics.showStatistics();
        Assert.assertEquals(userCount, forumStatistics.getUserCount());
        Assert.assertEquals(postsCount, forumStatistics.getPostCount());
        Assert.assertEquals(commentsCount, forumStatistics.getCommentCount());
        Assert.assertEquals(avgPostsPerUsr, forumStatistics.getAveragePostsPerUser(), 0.01);
        Assert.assertEquals(avgCommPerUsr, forumStatistics.getAverageCommentsPerUser(), 0.01);
        Assert.assertEquals(avgCommPerPost, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }
}
