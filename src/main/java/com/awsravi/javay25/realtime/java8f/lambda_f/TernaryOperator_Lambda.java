package com.awsravi.javay25.realtime.java8f.lambda_f;

import java.util.function.BinaryOperator;

public class TernaryOperator_Lambda {
public static void main(String[] args) {
    // Using BinaryOperator with a ternary operator to find the maximum of two numbers
        BinaryOperator<Integer> maxBy = (a, b) -> (a > b) ? a : b;
        System.out.println(maxBy.apply(5, 10)); 
        System.out.println(maxBy.apply(10, 20)); 

        // Using BinaryOperator with a ternary operator to find the minimum of two numbers
        BinaryOperator<Integer> minBy = (a, b) -> (a < b) ? a : b;
        System.out.println(minBy.apply(5, 10)); 
        System.out.println(minBy.apply(10, 20)); 

}
}
