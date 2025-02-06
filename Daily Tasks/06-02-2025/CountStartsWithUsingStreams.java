package com.Streams;
import java.util.Arrays;
import java.util.List;

public class CountStartsWithUsingStreams {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "avocado", "blueberry");
        long count = words.stream().filter(word -> word.startsWith("a")).count();
        System.out.println("Count of words starting with 'a': " + count);
    }
}
