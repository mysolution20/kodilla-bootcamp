package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {

    public void exceptionHandlingSimpleText() {
        try {
            System.out.println("*****1* When something went wrong then, there is pace to report about this problem.");
        } catch (Exception e) {
            System.out.println("****1a* When something went wrong about report # *****1*, then it is " +
                    "going to hands by general info: " + e + ".");
        } finally {
            System.out.println("*****2* Here, there is information that occurs always when problem appear.");
        }
    }
}
