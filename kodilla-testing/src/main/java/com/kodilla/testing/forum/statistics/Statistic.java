package com.kodilla.testing.forum.statistics;

public class Statistic {

    private int numberOfUsers;
    private int numberOfComments;
    private int numberOfPosts;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
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


    public void calculateAdvStatistics(Statistics statistics) {

        numberOfUsers = statistics.usersNames().size();
        numberOfComments = statistics.commentsCount();
        numberOfPosts = statistics.postsCount();

        if(numberOfUsers > 0) {
            averagePostsPerUser = (double)numberOfPosts / numberOfUsers;
            averageCommentsPerUser = (double)numberOfComments / numberOfUsers;
        }
        else {
            numberOfComments = 0;
            numberOfPosts = 0;
            averagePostsPerUser = 0;
            averageCommentsPerUser = 0;
            averageCommentsPerPost = 0;
        }
        if(numberOfPosts > 0) {
            averageCommentsPerPost = (double)numberOfComments / numberOfPosts;
        }
        else {
            averageCommentsPerPost = 0;
            numberOfComments = 0;



        }


    }
    public void showStatistics() {



    }
}
