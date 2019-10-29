package com.divya.learning.project_euler;

import java.util.ArrayList;
import java.util.List;

/*
https://projecteuler.net/problem=3
* The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
* */
public class _3_LargestPrimeFactor {
    public static void main(String args[]) {
        long number = 600851475143L;

        for (long i = 2; i < number; i++) {
            while (number % i == 0) {
                System.out.println(i + " ");
                number = number / i;
            }
        }
        if (number > 2) {
            System.out.println(number);
        }
    }
}

