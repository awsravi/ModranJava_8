package com.awsravi.javay25.realtime.java8f.lambda_streams_advance_f;

import java.util.stream.Collectors;

public class ToMap_Lambda {
public static void main(String[] args) {
    
    // ToMap using stream
    // Using collect() method to convert stream of String to Map
    // Using Collectors.toMap() method to convert stream of String to Map
    
    java.util.List<String> listOfString=java.util.Arrays.asList("Ravi", "Aruna", "Rahul","Sunita");
    java.util.Map<String,Integer> mapOfString=listOfString.stream()
    .collect(Collectors.toMap(s -> s, String::length));
    mapOfString.forEach((k,v)->System.out.println("Key: "+k+" Value: "+v));

    System.out.println("Map of strings using stream: " + mapOfString);

   }
}
