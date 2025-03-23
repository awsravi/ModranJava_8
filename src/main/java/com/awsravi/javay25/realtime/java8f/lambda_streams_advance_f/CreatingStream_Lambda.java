package com.awsravi.javay25.realtime.java8f.lambda_streams_advance_f;

public class CreatingStream_Lambda {
public static void main(String[] args) {
    
    // Creating stream using stream
    // Using stream() method to create a stream of elements
    // Using forEach() method to print all elements in the stream
    
    java.util.List<String> listOfString=java.util.Arrays.asList("Ravi", "Aruna", "Rahul","Sunita");
    listOfString.stream().forEach(System.out::println);
   }
}
