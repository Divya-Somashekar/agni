package com.divya.learning.geeksforgeeks.GoldmanSachs;

import java.util.Scanner;

/*
* Given a list of non negative integers, arrange them in such a manner that they form the largest number possible.The result is going to be very large, hence return the result in the form of a string.

Input:
The first line of input consists number of the test cases. The description of T test cases is as follows:
The first line of each test case contains the size of the array, and the second line has the elements of the array.

Output:
In each separate line print the largest number formed by arranging the elements of the array in the form of a string.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 102
0 ≤ A[i] ≤ 103

Example:
Input:
2
5
3 30 34 5 9
4
54 546 548 60

Output:
9534330
6054854654
* */
public class _23_largestNumberFormedFromAnArray {
    public static void main(String[] args){
        System.out.println("Lets start");
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = scanner.nextInt();
        int sizeOfAaray = 0;
        Scanner scanner2 = new Scanner(System.in);
        String elementsOfArray = "";
        for(int i=1;i<=noOfTestCases;i++){
            sizeOfAaray = scanner.nextInt();
            System.out.println("The size of "+ i +"trail is"+ sizeOfAaray);
            elementsOfArray = scanner2.nextLine();
            System.out.println("The elements of "+ i +"trail is"+ elementsOfArray);
        }
    }
}
