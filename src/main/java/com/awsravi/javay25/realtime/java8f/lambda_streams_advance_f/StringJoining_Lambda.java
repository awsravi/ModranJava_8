package com.awsravi.javay25.realtime.java8f.lambda_streams_advance_f;

public class StringJoining_Lambda {
public static void main(String[] args) {
    
    // Joining strings using stream
    // Using collect() method to join all elements in the stream
    // Using Collectors.joining() method to join all elements in the stream
    // Using Collectors.joining(", ") method to join all elements in the stream with a delimiter
    // Using Collectors.joining(", ", "[", "]") method to join all elements in the stream with a delimiter and prefix and suffix
    
    String[] str= {"Ravi", "Aruna", "Rahul","Sunita"};
    String joinedString=java.util.Arrays.stream(str).collect(java.util.stream.Collectors.joining());
    System.out.println("Joined string using stream: " + joinedString);
    
    String joinedString1=java.util.Arrays.stream(str).collect(java.util.stream.Collectors.joining(", "));
    System.out.println("Joined string using stream with delimiter: " + joinedString1);
    
    String joinedString2=java.util.Arrays.stream(str).collect(java.util.stream.Collectors.joining(", ", "[", "]"));
    System.out.println("Joined string using stream with delimiter and prefix and suffix: " + joinedString2);
    }
}
