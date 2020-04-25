package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);
        return IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average().getAsDouble();

        //Na poczatku nie doczytałem i zrobiłem tak jak niżej i też działało :)
        /*IntStream.of(numbers)
                .forEach(System.out::println);
        return IntStream.of(numbers)
                .average().getAsDouble();*/
    }
}
