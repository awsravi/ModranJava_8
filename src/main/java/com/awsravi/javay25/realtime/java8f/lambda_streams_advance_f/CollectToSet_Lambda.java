package com.awsravi.javay25.realtime.java8f.lambda_streams_advance_f;

public class CollectToSet_Lambda {
public static void main(String[] args) {
    
    // Collecting to Set using stream
    // Using collect() method to collect all elements in the stream to a Set
    // Using Collectors.toSet() method to collect all elements in the stream to a Set
    
    java.util.List<String> listOfString=java.util.Arrays.asList("Ravi", "Aruna","Ravi", "Aruna", "Rahul", "Rahul","Sunita");
    java.util.Set<String> setOfString=listOfString.stream()
    .collect(java.util.stream.Collectors.toSet());
    System.out.println("Set of strings using stream: " + setOfString);
   }
}
