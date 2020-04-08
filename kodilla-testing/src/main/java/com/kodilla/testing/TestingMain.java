package com.kodilla.testing;

import com.kodilla.testing.user.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){


        System.out.println("*************************************************");
        System.out.println("Test - pierwszy test jednostkowy:");
        System.out.println();
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("*************************************************");
        System.out.println("Testing Calculator class");
        System.out.println();
        Calculator calc = new Calculator();
        int addResult = calc.add(12, 3);
        int subResult = calc.subtract(11, 13);
        if (addResult == 15 && subResult == -2) {
            System.out.println("Calculator test OK");
        } else {
            System.out.println("Calculator has error!");
        }



    }
}
