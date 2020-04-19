package com.kodilla.stream.array;

import java.util.*;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayExecution implements ArrayOperations {

    public double getAverage(int[] numbers) {
        IntStream intStream = IntStream.range(1, numbers.length + 1);
        OptionalDouble result = intStream.average();
        if (result.isPresent()) {
            return result.getAsDouble();
        } else {
            return 0;
        }
    }

    public double getAverage2(int[] numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        if (numbers.length != 0) {
            return sum / numbers.length;
        } else {
            return 0;
        }
    }
}
