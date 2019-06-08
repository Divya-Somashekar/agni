package com.divya.learning.techiedelight.Hashing;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by: Divya Somashekar
 * Date:  5/24/2019
 * Time: 2:38 PM
 **/
public class CheckDuplicatesInArray {
    private static <T> Boolean checkForDuplicate(T... array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] != null && array[i].equals(array[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] arg) {
    Integer[] array = {1, 2, 3, 4, 5};

        if (checkForDuplicate(array)) {
            System.out.println("yes we have Duplicate");
        } else {
            System.out.println("No Duplicate");
        }
    }
}
