package com.awsravi.javay25.realtime.java8f.lambda_streams_advance_f;

public class Counting_Lambda {
public static void main(String[] args) {
    
    // Counting using stream
    // Using collect() method to count all elements in the stream
    // Using Collectors.counting() method to count all elements in the stream
    
    java.util.List<String> listOfString=java.util.Arrays.asList("Ravi", "Aruna","Ravi", "Aruna", "Rahul", "Rahul","Sunita");
    long count=listOfString.stream().collect(java.util.stream.Collectors.counting());
    System.out.println("Count of strings using stream: " + count);
    }
}
