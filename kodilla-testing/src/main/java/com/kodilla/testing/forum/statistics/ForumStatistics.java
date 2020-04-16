package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics {
    private int userCount;                  //liczbę użytkowników,
    private int postCount;                  //liczbę postów,
    private int commentCount;               //liczbę komentarzy,
    private double averagePostsPerUser;     //średnią liczbę postów na użytkownika,
    private double averageCommentsPerUser;  //średnią liczbę komentarzy na użytkownika,
    private double averageCommentsPerPost;  //średnią liczbę komentarzy na post.

    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();
        if (userCount != 0) {
            averagePostsPerUser = (double) postCount / userCount;
        } else averageCommentsPerUser = 0;
        if (userCount != 0) {
            averageCommentsPerUser = (double) commentCount / userCount;
        } else averageCommentsPerUser = 0;
        if (postCount != 0) {
            averageCommentsPerPost = (double) commentCount / postCount;
        } else averageCommentsPerPost = 0;
    }

    public void showStatistics(){
        System.out.println("Number of users " + userCount);
        System.out.println("Number of posts " + postCount);
        System.out.println("Number of comments " + commentCount);
        System.out.println("Average posts per user " + averagePostsPerUser);
        System.out.println("Average comments per user " + averageCommentsPerUser);
        System.out.println("Average comments per post " + averageCommentsPerPost);
    }
}
