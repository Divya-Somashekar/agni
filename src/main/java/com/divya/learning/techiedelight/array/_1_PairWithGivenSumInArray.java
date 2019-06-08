package com.divya.learning.techiedelight.array;

import java.util.Arrays;
import java.util.Scanner;
/*
* Given and unsorted array of integer and a sum value find the index which will result the sum
*
* for eg:
* arr = [8,7,2,5,3,1]
* sum = 10
*
* output:
* pair found at index 0 and 2 [8+2]
*
* pair found at index 1 and 4 [7+3]
* */

public class _1_PairWithGivenSumInArray {
    /*public static void main(String[] args) {
        System.out.println("WELCOME!!!");
        int array[] = {8, 7, 2, 5, 3, 1};
        int sum = 10;
        int a;
        int b;

        for (int i = 0; i < array.length; i++) {
            a = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (a + array[j] == sum) {
                    b = array[j];
                    System.out.println("The pair is "+ a + " " + b);
                }
            }
        }

    }*/
    public static void main(String[] args) {
        System.out.println("WELCOME!!!");
        int array[] = {8, 7, 2, 5, 3, 1};
        int sum = 10;
        Arrays.sort(array);

    }

}