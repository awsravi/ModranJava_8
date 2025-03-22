package com.awsravi.javay25.realtime.java8f.lambda_f;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Comparator_Lambda {
public static void main(String[] args) {
/*
 * Comparator using Lambda
 * sort() method is used to sort the list
 * comparingInt() method is used to compare the length of the strings, based on the length of the strings
 */
System.out.println("Sorting the list of strings based on the length of the strings");
 List<String> lOfString=Arrays.asList("Tej", "Rahul", "Sunita", "Ravi", "Aruna");
 lOfString.sort(Comparator.comparingInt(String::length));
 lOfString.forEach(System.out::println);
}
}
