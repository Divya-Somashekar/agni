package com.divya.learning.geeksforgeeks.GoldmanSachs;

/*
* Given a string, find the first non-repeating character in it. For example, if the input string is “GeeksforGeeks”, then output should be ‘f’ and if input string is “GeeksQuiz”, then output should be ‘G’.
* */
public class FirstNonRepeativeCharacter {
    public static void main(String[] args){
        String input = "GeeksForGeeks";
        boolean contains = false;

        char[] chars = input.toCharArray();
        char[] newArray = new char[chars.length];
        for(int i= 0; i<= chars.length; i++){
            //check if the newArray contains chars[i]
            for (char c : newArray) {
                if (c == chars[i]) {
                    contains = true;
                    break;
                }
            }
            if(contains){

            }
        }
    }
}
