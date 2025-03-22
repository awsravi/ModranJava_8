package com.awsravi.javay25.realtime.java8f.lambda_f;

import java.util.Arrays;

public class Iterating_lambda {
public static void main(String[] args) {

    // Iterating using forEach
    
    String[] names = {"Rahul", "Sunita", "Ravi", "Aruna"};
    for (String name : names) {
        System.out.println("Iterating : " + name);
    }
    System.out.println("Iterating with lambda");
    java.util.Arrays.asList(names).forEach(name -> System.out.println(name));

    Arrays.asList(names).forEach(name -> System.out.println(name));
}
}
