package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.test.FirstChallenge;

public class ExceptionModuleRunner {
    public static void main(String args[]){

        FileReader fileReader = new FileReader();
        fileReader.reaFile();
//        FirstChallenge firstChallenge = new FirstChallenge();
//        double result = firstChallenge.divide(3, 0);
//        System.out.println(result);
//
//        try {
//            return a / b;
//        } catch (ArithmeticException e) {
//            System.out.println("You should not divide a number by zero" + e);
//        } finally {
//            System.out.println("Exception occurred");
//        }


    }
}
