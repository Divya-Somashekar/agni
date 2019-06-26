package com.divya.learning.geeksforgeeks.amazon.online_test_preparetion;

public class Euclidean {
    public static double calculateDistance(double[] array1, double[] array2)
    {
        double sum = 0.0;
        for(int i=0;i<array1.length;i++) {
            sum = sum + Math.pow((array1[i]-array2[i]),2.0);
        }
        return Math.sqrt(sum);
    }
}
