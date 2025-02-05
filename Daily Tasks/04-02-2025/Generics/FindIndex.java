package com.Generics;

import java.util.List;

public class FindIndex {
    public static <T> int findFirstIndex(List<T> list, T target) {
        return list.indexOf(target);
    }

    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry", "date");
        System.out.println(findFirstIndex(words, "cherry"));
        System.out.println(findFirstIndex(words, "grape"));
    }
}
