package com.kodilla.stream.array;
public class ArrayExecution implements ArrayOperations {
    public double getAverage(int[] numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum/numbers.length;
    }
}
