package com.awsravi.javay25.realtime.java8f.lambda_f;

public class BiFunction_Lambda {
public static void main(String[] args) {
    // BiFunction using lambda
    // BiFunction is a functional interface which takes two arguments and returns a value
    // BiFunction is used for conditional checking
    // BiFunction is used for filtering
    // BiFunction is used for matching
    // BiFunction is used for testing
    // BiFunction is used for validating
    // BiFunction is used for comparing
    // BiFunction is used for asserting

    java.util.function.BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
    System.out.println(add.apply(10, 20));

    java.util.function.BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
    System.out.println(multiply.apply(10, 20));

    java.util.function.BiFunction<Integer, Integer, Integer> divide = (a, b) -> a / b;
    System.out.println(divide.apply(20, 10));

    java.util.function.BiFunction<Integer, Integer, Integer> subtract = (a, b) -> a - b;
    System.out.println(subtract.apply(20, 10));
}
}
