package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(1,5));
        } catch (Exception e) {
            System.out.println("y can't be 1,5 | x must be 1");
        }
        finally {
            System.out.println("I am always");
        }
    }

}
