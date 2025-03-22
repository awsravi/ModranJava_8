package com.awsravi.javay25.realtime.java8f.lambda_f;

import java.util.function.Predicate;

public class Predicate_Lambda {
public static void main(String[] args) {
    // Predicate using lambda
    // Predicate is a functional interface which takes an argument and returns a boolean

    // To take some input and perform some some conditional check and return boolean value

    Predicate<String> isEmpty=s -> s.isEmpty();
    System.out.println(isEmpty.test(""));
    System.out.println(isEmpty.test("Aswravi"));

    Predicate<String> p = s -> s.length() > 5;
    System.out.println(p.test("Ravi"));
    System.out.println(p.test("Ravi Kumar"));

    }
}
