package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args){

        String textSample = "AbEcAdLo Z pIeCa SpAdLo";
        String textSample2 = textSample.toLowerCase();
        String textSample3 = textSample2.toUpperCase();
        String textSample4 = textSample3.replaceAll("ABECADLO","JAJKO");


        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("**********************");
        System.out.println();

        poemBeautifier.beautify(()-> System.out.println("--abc--"));
        poemBeautifier.beautify(()-> System.out.println(textSample));
        poemBeautifier.beautify(()-> System.out.println(textSample2));
        poemBeautifier.beautify(()-> System.out.println(textSample+textSample2));
        poemBeautifier.beautify(()-> System.out.println(textSample+" "+textSample2));
        poemBeautifier.beautify(()-> System.out.println(textSample+" "+textSample2+" "+textSample3));
        poemBeautifier.beautify(()-> System.out.println(textSample4));
        poemBeautifier.beautify(()-> System.out.println(textSample4.replaceAll(textSample4,textSample3)));


        System.out.println();
        System.out.println("**********************");
        System.out.println();





/*
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
*/




//        3.
/*        Processor processor = new Processor();
        processor.execute(()-> System.out.println("This is an example text."));*/

//        2.
/*      Processor processor = new Processor();
        Executor codeToExecute = ()-> System.out.println("This is an example text.");
        processor.execute(codeToExecute);*/

//        1.
/*      Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);*/


    }
}
