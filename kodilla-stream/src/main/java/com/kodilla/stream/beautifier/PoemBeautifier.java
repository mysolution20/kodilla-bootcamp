package com.kodilla.stream.beautifier;

public class PoemBeautifier {


    public void   beautify( String tekst, PoemDecorator poemDecorator){

        // 1.
        System.out.println( "Zadanie: Upiększacz tekstów ------ " + poemDecorator.decorate( tekst )+ " ------ ");

        // 2.
//        String result = poemDecorator.decorate( tekst );
//        System.out.println( "Zadanie: Upiększacz tekstów ------ " + result + "  ------  " );


    }
}
