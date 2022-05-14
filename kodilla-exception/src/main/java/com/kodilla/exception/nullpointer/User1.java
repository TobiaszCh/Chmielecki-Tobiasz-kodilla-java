package com.kodilla.exception.nullpointer;

import java.util.Objects;

public class User1 {

     private String userName;
     private int age;
     private int countTest;
     private String nameTest;

    public User1(String userName, int age, int countTest,String nameTest) {
        this.userName = userName;
        this.age = age;
        this.countTest = countTest;
        this.nameTest = nameTest;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    public int getCountTest() {
        return countTest;
    }

    public String getNameTest() {
        return nameTest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User1 user1 = (User1) o;
        return age == user1.age && countTest == user1.countTest && Objects.equals(userName, user1.userName) && Objects.equals(nameTest, user1.nameTest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, age, countTest, nameTest);
    }
}
