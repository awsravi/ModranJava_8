package com.awsravi.javay25.realtime.java8f.lambda_streams_advance_f;

import java.util.Arrays;
import java.util.List;

public class SummingInteger_Lambda {
public static void main(String[] args) {

    // Sum of numbers using stream
    // Using mapToInt() method to convert stream of Integer to IntStream
    // Using sum() method to get the sum of all elements in the stream

   List<Integer> num=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
   int sum1=num.stream().mapToInt(Integer::intValue).sum();
    System.out.println("Sum of numbers using stream: " + sum1);
   }
}