package com.kodilla.patterns2.observer.homework;

public class Mentors implements Observer{

    private final String username;
    private int updateCount;

    public Mentors(String username) {
        this.username = username;
    }

    @Override
    public void update(SendTasks tasks) {
        System.out.println(username + ": New messages in topic from student " + tasks.getName() + "\n" +
                " (total: " + tasks.getMessages().size() + " messages)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
