package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    /*
    Na początku zrobiłem testy dla różnych kombinacji liczby użytkowników, postów i komentarzy, które w sekcji //then
    robiły asserty dla wszystkich pól klasy ForumStatistics, ale wtedy wystarczyło, że cokolwiek się nie zgadzało
    i wszystkie testy się wysypywały.
    Dlatego teraz ustawiłem parametry sterujące na początku i porobiłem testy dla każdej z wartości osobno. Ale to
    z kolei prowadzi do problemu, że przed każdorazowym testowaniem, trzeba recznie zmienić parametry i wykonywać testy
    wielokrotnie dla różnych kombinacji. Wysyłam tak jak jest teraz, bo już mi mózg topnieje :).
     */
    public static int userCount = 0;
    public static int postsCount = 52;
    public static int commentsCount = 18;
    public static double avgPostsPerUsr = 0;//(double) postsCount / userCount;
    public static double avgCommPerUsr = 0;//(double) commentsCount / userCount;
    public static double avgCommPerPost = (double) commentsCount / postsCount;
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
    public void testCalculateAdvStatisticsUserCount() {
        //Given
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
    }

    @Test
    public void testCalculateAdvStatisticsPostsCount() {
        //Given
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
        Assert.assertEquals(postsCount, forumStatistics.getPostCount());
    }

    @Test
    public void testCalculateAdvStatisticsCommentsCount() {
        //Given
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
        Assert.assertEquals(commentsCount, forumStatistics.getCommentCount());
    }

    @Test
    public void testCalculateAdvStatisticsAvgPPU() {
        //Given
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
        Assert.assertEquals(avgPostsPerUsr, forumStatistics.getAveragePostsPerUser(), 0.1);
    }

    @Test
    public void testCalculateAdvStatisticsAvgCPU() {
        //Given
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
        Assert.assertEquals(avgCommPerUsr, forumStatistics.getAverageCommentsPerUser(), 0.1);
    }

    @Test
    public void testCalculateAdvStatisticsAvgCPP() {
        //Given
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
        Assert.assertEquals(avgCommPerPost, forumStatistics.getAverageCommentsPerPost(), 0.1);
    }
}
