package com.awsravi.javay25.realtime.java8f.lambda_streams_advance_f;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Mapping_Lambda {
public static void main(String[] args) {
    
    // Mapping using stream
    // Using map() method to convert stream of String to stream of Integer
    // Using forEach() method to print all elements in the stream
    
   java.util.List<String> listOfString=java.util.Arrays.asList("Ravi", "Aruna", "Rahul","Sunita");
   listOfString.stream().map(String::length).forEach(System.out::println);

   // Mapping using stream

   Map<Integer,List<String>> map=listOfString.stream().collect(Collectors.groupingBy(String::length));
    System.out.println("Mapping using stream: " + map);
    map.forEach((k,v)->System.out.println("Key: "+k+" Value: "+v));
   


   }
}
