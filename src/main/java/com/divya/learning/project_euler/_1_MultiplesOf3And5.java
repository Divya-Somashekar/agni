package com.divya.learning.project_euler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
* */
public class _1_MultiplesOf3And5 {
    public static void main(String[] args) {
        System.out.println("Lets start");
        List<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<1000;i++){
            if(i%3==0 || i%5==0){
                list.add(i);
            }
        }
        int sum =0;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            sum += (Integer) iterator.next();
        }
        System.out.println("The output is " + sum);
    }
}
