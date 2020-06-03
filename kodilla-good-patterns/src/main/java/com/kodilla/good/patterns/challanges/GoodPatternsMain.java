package com.kodilla.good.patterns.challanges;

import java.util.stream.Collectors;

public class GoodPatternsMain {

    public static void main(String[] args) {

        System.out.println("************************************************");
        System.out.println("---- Zadanie: funkcyjna iteracja po tytułach ----");
        System.out.println();
        MovieStore movieStore = new MovieStore();
        String flatStringLine = movieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .map(String::toString)
                .collect(Collectors.joining(" ! "));

        System.out.println(flatStringLine);
        System.out.println("************************************************");

    }
}
