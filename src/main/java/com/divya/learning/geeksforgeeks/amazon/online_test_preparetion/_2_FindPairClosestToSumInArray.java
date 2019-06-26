package com.divya.learning.geeksforgeeks.amazon.online_test_preparetion;

/*
* Amazon transport centre ships there items in trucks of some size. And each item take some space. And for safety purpose we have to keep a some given space empty in truck.

We are given a array of size of items[10,20,30,40], size of truck(100) and safety space(40). We have to find a pair of items which can be shipped safely and utilising maximum space in truck.

So in given example we will ship pair(20 & 40) with keeping 40 space.
* */

public class _2_FindPairClosestToSumInArray {
    // Prints the pair with sum cloest to x
    static void printClosest(int arr[], int n, int x)
    {
        int res_l=0, res_r=0;  // To store indexes of result pair

        // Initialize left and right indexes and difference between
        // pair sum and x
        int l = 0, r = n-1, diff = Integer.MAX_VALUE;

        // While there are elements between l and r
        while (r > l)
        {
            // Check if this pair is closer than the closest pair so far
            if (Math.abs(arr[l] + arr[r] - x) < diff)
            {
                res_l = l;
                res_r = r;
                diff = Math.abs(arr[l] + arr[r] - x);
            }

            // If this pair has more sum, move to smaller values.
            if (arr[l] + arr[r] > x)
                r--;
            else // Move to larger values
                l++;
        }

        System.out.println(" The closest pair is "+arr[res_l]+" and "+ arr[res_r]);
    }


    // Driver program to test above function
    public static void main(String[] args)
    {
        int arr[] =  {10, 22, 28, 29, 30, 40}, x = 54;
        int n = arr.length;
        printClosest(arr, n, x);
    }
}
