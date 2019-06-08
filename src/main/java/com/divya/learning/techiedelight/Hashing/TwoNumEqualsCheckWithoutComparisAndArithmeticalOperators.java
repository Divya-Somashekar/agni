package com.divya.learning.techiedelight.Hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by: Divya Somashekar
 * Date:  5/24/2019
 * Time: 1:39 PM
 **/
public class TwoNumEqualsCheckWithoutComparisAndArithmeticalOperators {
    //using bitwise XOR operator
    /*private static boolean checkForEquality(int x, int y) {
        return (x ^ y) == 0;
    }*/

    //using Array index + Ternary operator
    /*private static boolean checkForEquality(int x, int y) {
        Short[] arr = new Short[x + 1];
        arr[x] = 0;
        return (arr[y] == 0);
    }*/

    //hashing
    /*private static boolean checkForEquality(int x, int y) {
        Map<Integer, Boolean> map = new HashMap<>();
        map.put(x, true);
        return map.containsKey(y);
    }*/

    //Repeated subtraction
    /*private static boolean checkForEquality(int x, int y) {
        while (--x > 0 && --y > 0){
        }
        return !(x != 0 || y - 1 != 0);
    }*/

    //simple subtraction
    private static boolean checkForEquality(int x, int y) {
        return x - y == 0;
    }

    public static void main(String[] args) {
        int x = 9;
        int y = 10;
        if (checkForEquality(x, y)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
