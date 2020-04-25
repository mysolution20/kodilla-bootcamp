package com.kodilla.exception.test;

public class SecondChallenge {

    public String probablyIWillThrowException(double x, double y) throws ExceptionHandling {
        try {
            if (x >= 2 || x < 1 || y == 1.5) ;
            return "Done particular method 123321!";
            
        } catch (Exception e) {
            throw new ExceptionHandling();

        }
    }

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyIWillThrowException(3, 1);
            System.out.println(result);

        } catch (ExceptionHandling e) {
            System.out.println("Opening text: " + e);
        }
    }
}





