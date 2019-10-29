package com.divya.course.learning.lambdaexpression;

@FunctionalInterface
interface IsFunctional{
    void testMethod(String data);
}

public class Example3 {
    IsFunctional obj = new IsFunctional() {
        @Override
        public void testMethod(String data) {
            System.out.println("Printing "+ data);
        }
    };
}
