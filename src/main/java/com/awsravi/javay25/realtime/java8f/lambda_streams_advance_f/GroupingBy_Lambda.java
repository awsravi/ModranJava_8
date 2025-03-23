package com.awsravi.javay25.realtime.java8f.lambda_streams_advance_f;

public class GroupingBy_Lambda {
public static void main(String[] args) {
    
    // Grouping by using stream
    // Using collect() method to group all elements in the stream
    // Using Collectors.groupingBy() method to group all elements in the stream
    // Using Collectors.counting() method to group all elements in the stream
    
    java.util.List<String> listOfString=java.util.Arrays.asList("Ravi", "Aruna","Ravi", "Aruna", "Rahul", "Rahul","Sunita");
    java.util.Map<String, Long> mapOfString=listOfString.stream()
    .collect(java.util.stream.Collectors.groupingBy(java.util.function.Function.identity(), java.util.stream.Collectors.counting()));
    System.out.println("Grouping by using stream: " + mapOfString);

   }
}
