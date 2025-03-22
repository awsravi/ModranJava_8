package com.awsravi.javay25.realtime.java8f.lambda_f;

public class Supplier_Lambda {
public static void main(String[] args) {
    // Supplier using lambda
    // Supplier is a functional interface which takes no arguments and returns a value
    // Supplier -> To supplay the value based on the requirement

    java.util.function.Supplier<String> s = () -> "Ravi";
    System.out.println(s.get());

    java.util.function.Supplier<Integer> s1 = () -> 10;
    System.out.println(s1.get());
}


}
