package com.divya.learning.project_euler;

import java.util.ArrayList;
import java.util.List;

/*
https://projecteuler.net/problem=2
* Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
* */
public class _2_EvenFibonacciNumber {
    public static void main(String[] args) {
        System.out.println("Let's start");
        long firstValue = 1l;
        long secondValue = 1l;
        long output = 0l;
        long evenNumbers = 0l;
        List<Long> allNumbers = new ArrayList<>();
        for (long i = 1; i < 40; i++) {
            output = firstValue + secondValue;
            allNumbers.add(output);
            firstValue = secondValue;
            secondValue = output;
        }
        for (long value : allNumbers) {
            if (value % 2 == 0 && value < 4000000L) {
                evenNumbers = evenNumbers + value;
            }
        }
        System.out.println(evenNumbers);
    }
}
