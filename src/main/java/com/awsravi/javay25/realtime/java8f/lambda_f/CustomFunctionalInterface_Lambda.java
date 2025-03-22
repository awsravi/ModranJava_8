package com.awsravi.javay25.realtime.java8f.lambda_f;

public class CustomFunctionalInterface_Lambda {
public static void main(String[] args) {
    //Custom Functional Interface using Lambda
    //It calculates the sum of two numbers using a custom functional interface.
    MyFunctionalInterface mfi=(a,b)->a+b;
    System.out.println(mfi.add(10, 20));

    //It calculates the Multiply of two numbers using a custom functional interface.
    MyFunctionalInterface mfi2=(a,b)->a*b;
    System.out.println(mfi2.add(10, 20));
}
}
