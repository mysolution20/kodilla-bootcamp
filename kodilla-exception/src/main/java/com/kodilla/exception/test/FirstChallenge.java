package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 1);
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("You should not divide a number by zero" + e);

        } finally {
            System.out.println("Exception occurred");

        }
    }
}