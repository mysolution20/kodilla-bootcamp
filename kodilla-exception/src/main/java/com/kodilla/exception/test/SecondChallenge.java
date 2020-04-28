package com.kodilla.exception.test;

public class SecondChallenge {

    public String probablyIWillThrowException(double x, double y) throws Exception {
        if ( x >= 2 || x < 1 || y == 1.5) {
            throw new Exception("Note, numbers x and y like: x >= 2 || x < 1 || y == 1.5 are forbidden.");
        }
        return "**** Done ! *****";
    }
}





