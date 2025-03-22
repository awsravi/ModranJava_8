package com.awsravi.javay25.realtime.java8f.lambda_f;

public class Consumer_Lambda {
public static void main(String[] args) {
    // Consumer using lambda
    // Consumer is a functional interface which takes an argument and returns nothing
    // To consume some input and perform requried operation and it wont return anything.
    java.util.function.Consumer<String> c = s -> System.out.println(s);
    c.accept("Ravi");
    c.accept("Kumar");

    java.util.function.Consumer<Integer> c1 = i -> System.out.println(i);
    c1.accept(10);
    c1.accept(20);
}
}
