package com.Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringsUsingStreams {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "cherry", "date");
        List<String> sortedAsc = words.stream().sorted().collect(Collectors.toList());
        List<String> sortedDesc = words.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
        System.out.println("Ascending: " + sortedAsc);
        System.out.println("Descending: " + sortedDesc);
    }
}
