package com.awsravi.javay25.realtime.java8f.lambda_f;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference_Lambda {
public static void main(String[] args) {
    // Method reference
    
    //Method reference of a static method
    List<String> lOfString=Arrays.asList("Tej", "Rahul", "Sunita", "Ravi", "Aruna");
    lOfString.forEach(System.out::println); 
     List<String> upperCaseList = lOfString.stream()
                .map(MethodReference_Lambda::toUpperCase) 
                .collect(Collectors.toList());
                System.out.println("Upper Case List: " + upperCaseList);

    //Method reference of an instance method
   
    List<Integer> stringLengths = lOfString.stream()
                .map(String::length) 
                .collect(Collectors.toList());

        System.out.println("String Lengths: " + stringLengths);

    //Method reference of a constructor
    List<String> copyList = lOfString.stream()
                .map(String::new) 
                .collect(Collectors.toList());

        System.out.println("Copied List : " + copyList);

}
//static method
public static String toUpperCase(String s) {
    return s.toUpperCase();
}
}
