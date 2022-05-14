package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {

    private final int uniqueID;
    private final String nameUser;
    private final char sex;
    private final LocalDate dateOfBrith;
    private final int postCount;

    public ForumUser(int uniqueID, String nameUser, char sex, int yearOfBirth,
                     int monthOfBirth, int dayOfBirth, int postCount) {
        this.uniqueID = uniqueID;
        this.nameUser = nameUser;
        this.sex = sex;
        this.dateOfBrith = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postCount = postCount;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public String getNameUser() {
        return nameUser;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBrith() {
        return dateOfBrith;
    }

    public int getPostCount() {
        return postCount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return uniqueID == forumUser.uniqueID && sex == forumUser.sex && postCount == forumUser.postCount && Objects.equals(nameUser, forumUser.nameUser) && Objects.equals(dateOfBrith, forumUser.dateOfBrith);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueID, nameUser, sex, dateOfBrith, postCount);
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqueID=" + uniqueID +
                ", nameUser='" + nameUser + '\'' +
                ", sex=" + sex +
                ", dateOfBrith=" + dateOfBrith +
                ", postCount=" + postCount +
                '}';
    }
}
