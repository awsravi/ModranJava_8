package com.awsravi.javay25.realtime.java8f.lambda_streams_advance_f;

import java.util.Arrays;
import java.util.List;

public class Max_MinInteger_Lambda {
public static void main(String[] args) {
    
    // Max of numbers using stream
    // Using mapToInt() method to convert stream of Integer to IntStream
    // Using max() method to get the max of all elements in the stream

   List<Integer> num=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
   int max1=num.stream()
   .mapToInt(Integer::intValue)
   .max()
   .getAsInt();
    System.out.println("Max of numbers using stream: " + max1);

    // Min of numbers using stream
    // Using mapToInt() method to convert stream of Integer to IntStream
    // Using min() method to get the min of all elements in the stream
    List<Integer> nums=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
   int min1=nums.stream()
   .mapToInt(Integer::intValue)
   .min()
   .getAsInt();
    System.out.println("Max of numbers using stream: " + min1);

   }
}
