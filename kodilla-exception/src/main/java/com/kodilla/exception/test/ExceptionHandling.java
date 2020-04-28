package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {
    public void exceptionHandlingMethod(double x, double y) {
        try {
            if (x >= 2 || x < 1 || y == 1.5)
                throw new Exception("Note, variables x and y with values of \n " +
                        "x >= 2 or x < 1 or y == 1.5 are forbidden.");
//                System.out.println("Note, variables x and y with values of \n " +
//                        "x >= 2 or x < 1 or y == 1.5 are forbidden.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
