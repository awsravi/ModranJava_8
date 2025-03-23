package com.awsravi.javay25.realtime.java8f.lambda_streams_advance_f;

public class MapToInt_Lambda {
public static void main(String[] args) {
    
    // MapToInt using stream
    // Using mapToInt() method to convert stream of String to IntStream
    // Using forEach() method to print all elements in the stream
    
   java.util.List<String> listOfString=java.util.Arrays.asList("Ravi", "Aruna", "Rahul","Sunita");
   listOfString.stream().mapToInt(String::length).forEach(System.out::println);
    }
}
