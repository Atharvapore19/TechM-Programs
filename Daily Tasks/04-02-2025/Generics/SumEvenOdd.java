package com.Generics;

import java.util.List;

public class SumEvenOdd {
    public static <T extends Number> void sumEvenOdd(List<T> numbers) {
        int evenSum = 0, oddSum = 0;

        for (T num : numbers) {
            if (num.intValue() % 2 == 0) {
                evenSum += num.intValue();
            } else {
                oddSum += num.intValue();
            }
        }

        System.out.println("Sum of Even Numbers: " + evenSum);
        System.out.println("Sum of Odd Numbers: " + oddSum);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        sumEvenOdd(numbers);
    }
}

