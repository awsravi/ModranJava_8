package com.awsravi.javay25.realtime.java8f.lambda_f;

public class Function_Lambda {
public static void main(String[] args) {
    // Function using lambda
    // Function is a functional interface which takes an argument and returns a value.
    // Function -> To take some input and perform requried operation and return the result.

    java.util.function.Function<String, Integer> f = s -> s.length();
    System.out.println(f.apply("Ravi"));
    System.out.println(f.apply("Ravi Kumar"));

    java.util.function.Function<Integer, Integer> f1 = i -> i * i;
    System.out.println(f1.apply(10));
    System.out.println(f1.apply(20));
}
}
