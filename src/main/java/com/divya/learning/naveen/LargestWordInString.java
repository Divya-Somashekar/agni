package com.divya.learning.naveen;

public class LargestWordInString {
    public static void main(String[] args){
        String string = "Hi Im divya, Im a software developer";

        String ans = findLargestWordInString(string);
        System.out.println("The largest word is "+ ans);
    }

    private static String findLargestWordInString(String string) {
        String[] stringArray = string.split(" ");
        int count = 0;
        String largestWord = "";
        for (String aStringArray : stringArray) {
            if (aStringArray.length() > count) {
                count = aStringArray.length();
                largestWord = aStringArray;
            }
        }
        return largestWord;
    }
}
