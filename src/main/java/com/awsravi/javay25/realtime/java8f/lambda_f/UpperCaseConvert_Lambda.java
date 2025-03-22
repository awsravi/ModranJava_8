package com.awsravi.javay25.realtime.java8f.lambda_f;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseConvert_Lambda {
public static void main(String[] args) {
    
    //uppercase use lambda and map
    List<String> lOfString=Arrays.asList("Tej", "Rahul", "Sunita", "Ravi", "Aruna");
    List<String> upperList=lOfString.stream().map(String::toUpperCase)
    .collect(Collectors.toList());
    System.out.println(upperList.toString());
}
}
