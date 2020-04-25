package com.kodilla.exception.test;

public class SecondChallenge {
    public String probablyIWillThrowException(double x, double y) throws ExceptionHandling {
        if (x >= 2 || x < 1 || y == 1.5) {
            throw new ExceptionHandling();
        }
        return "Done particular method 123321!";
    }

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(3, 1));
        } catch (ExceptionHandling ex) {
            ex.exceptionHandlingSimpleText();
        } finally {
            System.out.println("*****3* Here, there is information that always occurs about keeping order by exceptionHandlingSimpleText method.");
        }
    }
}





