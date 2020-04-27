package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(1, 1.5));
        } catch (Exception e) {
            System.out.println("Ima throwing exceptions alright mate! Exception: " + e);
        } finally {
            System.out.println("Is that all, or am I too exceptional to catch it?");
        }
    }
}
