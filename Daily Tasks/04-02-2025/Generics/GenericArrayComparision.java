package com.Generics;

import java.util.Arrays;

public class GenericArrayComparision {
    public static <T> boolean areArraysEqual(T[] array1, T[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4};
        Integer[] arr2 = {1, 2, 3, 4};
        Integer[] arr3 = {1, 2, 4, 3};

        System.out.println(areArraysEqual(arr1, arr2));
        System.out.println(areArraysEqual(arr1, arr3));
    }
}
