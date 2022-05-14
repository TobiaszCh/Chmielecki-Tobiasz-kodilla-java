package com.kodilla.stream.world.immutable;

public final class ForumUser {

    private final String userName;
    private final String realName;

    public ForumUser(String userName, String realName) {
        this.userName = userName;
        this.realName = realName;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }

    //This method doesn't work if class, atributesis final and atributes are private
    public void modifyUserName (String name) {
 //       userName = name;
    //This method doesn't work...
    }
}
