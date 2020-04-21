package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static void getAverage(int[] numbers) {
        OptionalDouble average = IntStream.of(numbers)
                .average();

        System.out.println(average.getAsDouble());

        System.out.println();

        IntStream.range(0, numbers.length)
                .forEach(
                            rangeNumbers -> System.out.println(numbers[rangeNumbers])
                        );
        System.out.println();
    }
}

