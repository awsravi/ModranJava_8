package com.awsravi.javay25.realtime.java8f.lambda_streams_advance_f;

public class PartitioningBy_Lambda {
public static void main(String[] args) {
    
    // Partitioning by using stream
    // Using collect() method to partition all elements in the stream
    // Using Collectors.partitioningBy() method to partition all elements in the stream
    // Using Collectors.counting() method to partition all elements in the stream
    
    java.util.List<String> listOfString=java.util.Arrays.asList("Ravi", "Aruna","Ravi", "Aruna", "Rahul", "Rahul","Sunita");
    java.util.Map<Boolean, Long> mapOfString=listOfString.stream()
    .collect(java.util.stream.Collectors.partitioningBy(s->s.length()>4, java.util.stream.Collectors.counting()));
    System.out.println("Partitioning by using stream: " + mapOfString);
   }
}
