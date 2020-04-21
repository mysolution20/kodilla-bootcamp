package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        OptionalDouble average = IntStream.of(numbers)
                .average();

        IntStream.range(0, numbers.length)
                .forEach(
                        rangeNumbers -> System.out.println(numbers[rangeNumbers])
                );

        return average.getAsDouble();
    }
}

