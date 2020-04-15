package com.kodilla.stream.beautifier;

public class PoemBeautifier {


    public void   beautify( String s, PoemDecorator poemDecorator){

        // 1.
        System.out.println( "Zadanie: Upiększacz tekstów ------ " + poemDecorator.decorate( s )+ " ------ ");

        // 2.
//        String result = poemDecorator.decorate( s );
//        System.out.println( "Zadanie: Upiększacz tekstów ------ " + result + "  ------  " );


    }
}
