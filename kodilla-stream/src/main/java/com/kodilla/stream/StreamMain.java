package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args){

        String textSample1 = "AbEcAdLo Z pIeCa SpAdLo";
        String textSample2 = textSample1.toLowerCase();
        String textSample3 = textSample2.toUpperCase();
        String textSample4 = textSample3.replaceAll("ABECADLO","tranwaj");

        System.out.println("********************************");
        System.out.println();

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify(textSample1 ,(tekst) -> tekst );
        poemBeautifier.beautify(textSample2 ,(tekst) -> tekst );
        poemBeautifier.beautify(textSample3 ,(tekst) -> tekst );
        poemBeautifier.beautify(textSample4 ,(tekst) -> tekst );


        System.out.println();
        System.out.println("********************************");


//        System.out.println();
//        System.out.println("**********************");
//        System.out.println();


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

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
