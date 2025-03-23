package com.awsravi.javay25.realtime.java8f.lambda_streams_advance_f;

public class JoiningWithoutDelimiter_Lambda {
public static void main(String[] args) {
    
    // Joining without delimiter using stream
    // Using collect() method to join all elements in the stream
    // Using Collectors.joining() method to join all elements in the stream
    
    java.util.List<String> listOfString=java.util.Arrays.asList("Ravi", "Aruna", "Rahul","Sunita");
    String joinedString=listOfString.stream().collect(java.util.stream.Collectors.joining());
    System.out.println("Joined string without delimiter using stream: " + joinedString);
   }
}
