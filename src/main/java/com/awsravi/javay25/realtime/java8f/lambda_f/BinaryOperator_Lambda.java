package com.awsravi.javay25.realtime.java8f.lambda_f;

public class BinaryOperator_Lambda {
public static void main(String[] args) {
    // BinaryOperator<T> is a functional interface
    // It takes two arguments and returns a single argument
    // It extends BiFunction<T, T, T>
    // It has a method called apply(T t, T t)
    // It has a static method called minBy and maxBy

    // Using BinaryOperator with a lambda expression to add two numbers
    java.util.function.BinaryOperator<Integer> binaryOperator = (x, y) -> x + y;
    System.out.println(binaryOperator.apply(5, 10)); 
    System.out.println(binaryOperator.apply(10, 20)); 

    // Using BinaryOperator with a lambda expression to find the maximum of two numbers
    java.util.function.BinaryOperator<Integer> maxBy = (a, b) -> Integer.max(a, b);
    System.out.println(maxBy.apply(5, 10)); 
    System.out.println(maxBy.apply(10, 20)); 

    // Using BinaryOperator with a lambda expression to find the minimum of two numbers
    java.util.function.BinaryOperator<Integer> minBy = (a, b) -> Integer.min(a, b);
    System.out.println(minBy.apply(5, 10)); 
    System.out.println(minBy.apply(10, 20)); 
}
}
