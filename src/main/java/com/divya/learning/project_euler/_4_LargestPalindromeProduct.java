package com.divya.learning.project_euler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
https://projecteuler.net/problem=4
* A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
* */
public class _4_LargestPalindromeProduct {
    public static void main(String[] arr) {
        System.out.println("Let's start");
        List<Integer> ans = new ArrayList<>();
        int value = 0;
        for (int i = 999; i > 100; i--) {
            for (int j = 999; j > 100; j--) {
                value = i * j;
                String check = String.valueOf(value);
                StringBuilder builder = new StringBuilder();
                builder.append(check);
                if (check.equals(builder.reverse().toString())) {
                    ans.add(value);
                }
            }
        }
        System.out.println(Collections.max(ans));
    }
}
