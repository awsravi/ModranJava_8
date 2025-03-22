package com.awsravi.javay25.realtime.java8f.lambda_f;

import java.util.Arrays;
import java.util.List;

public class Sorting_Lambda {
    public static void main(String[] args) {
        //Sorting a List using Lambda
        //It sorts a list of strings in ascending order.
        System.out.println("=====================================");
        List<String> lOfString=Arrays.asList("Tej", "Rahul", "Sunita", "Ravi", "Aruna","Darshan","Bargav");
        lOfString.sort((s1,s2)->s1.compareTo(s2));
        lOfString.forEach(System.out::println);
        System.out.println("=====================================");
        //It sorts a list of strings in descending order.
        lOfString.sort((s1,s2)->s2.compareTo(s1));
        lOfString.forEach(System.out::println);
    }

}
