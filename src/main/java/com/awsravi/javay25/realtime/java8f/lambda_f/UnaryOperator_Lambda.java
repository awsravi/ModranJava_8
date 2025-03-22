package com.awsravi.javay25.realtime.java8f.lambda_f;

import java.util.function.UnaryOperator;

public class UnaryOperator_Lambda {
public static void main(String[] args) {
    // UnaryOperator<T> is a functional interface
    // It takes a single argument and returns a single argument
    // It extends Function<T, T>
    // It has a method called apply(T t)

    // Using UnaryOperator with a lambda expression to square a number
    UnaryOperator<Integer> unaryOperator = (x) -> x * x;
    System.out.println(unaryOperator.apply(5)); // 25
    System.out.println(unaryOperator.apply(10)); // 100

    // // Using UnaryOperator with String (convert to uppercase)
    UnaryOperator<String> toUpperCase = str -> str.toUpperCase();

    String upper = toUpperCase.apply("awsravi");
    System.out.println("Uppercase: " + upper); // Output: Uppercase: HELLO

}
}
