package com.kodilla.exception.test;

public class ExceptionHandlingMain {
    public static void main(String[] args) throws Exception {
        SecondChallenge secondChallenge = new SecondChallenge();
        double x = 1.5;
        double y = 2;
        double z = 0.5;         //   x < 2 || x > 1 || y != 1.5
        try {
            String result = secondChallenge.probablyIWillThrowException(x + z, y - z);
            System.out.println(result);
        } catch (Exception e) {
            ExceptionHandling eh = new ExceptionHandling();
            eh.exceptionHandlingMethod(x, y);
//            System.out.println(e.getMessage());
        }
    }
}
