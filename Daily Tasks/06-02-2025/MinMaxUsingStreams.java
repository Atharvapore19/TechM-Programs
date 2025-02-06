package com.Streams;
import java.util.Arrays;
import java.util.List;

public class MinMaxUsingStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);
        int min = numbers.stream().min(Integer::compareTo).orElse(Integer.MAX_VALUE);
        int max = numbers.stream().max(Integer::compareTo).orElse(Integer.MIN_VALUE);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
