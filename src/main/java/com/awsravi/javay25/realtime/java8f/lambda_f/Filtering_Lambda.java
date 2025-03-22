package com.awsravi.javay25.realtime.java8f.lambda_f;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filtering_Lambda {
    public static void main(String[] args) {
        //Filtering a List using Lambda
        //It specifically filters a list to include only strings that start with the letter 'R'.
        List<String> lOfString=Arrays.asList("Tej", "Rahul", "Sunita", "Ravi", "Aruna");
        List<String> filteredListOfString=lOfString.stream()
        .filter(s -> s.startsWith("R"))
        .collect(Collectors.toList());
        filteredListOfString.forEach(System.out::println); 

    }
}
