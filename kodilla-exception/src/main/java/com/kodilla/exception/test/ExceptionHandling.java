package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {
    public String exceptionHandlingSimpleText() {
        return "*****************************************************\n" +
                "Something went wrong with probablyIWillThrowException\n" +
                "method, therefore now it is going to handle them!\n" +
                "*****************************************************";
    }
}

class Example {
    public static void main(String[] args) throws ExceptionHandling {

        SecondChallenge secondChallenge = new SecondChallenge();
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        String ex = exceptionHandling.exceptionHandlingSimpleText();

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(2, 1.5));
        } catch (ExceptionHandling e) {
            throw new ExceptionHandling();
        } catch (Exception e) {
            System.out.println(ex);
        } finally {
            System.out.println("******** Last certain info! **********");
        }
    }
}