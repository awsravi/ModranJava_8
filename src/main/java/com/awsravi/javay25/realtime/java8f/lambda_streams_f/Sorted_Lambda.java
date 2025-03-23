package com.awsravi.javay25.realtime.java8f.lambda_streams_f;

public class Sorted_Lambda {
public static void main(String[] args) {
    //Lambda with Streams api Sorted method
    //Sorted is used to sort the stream data
    
    int[] arr = {3,4,5,1,2,9,10,6,7,8};
    java.util.Arrays.stream(arr)
    .sorted()
    .forEach(System.out::println);

    String[] names = {"X","Ravi","Aruna","Rahul","Sunita"};
    java.util.Arrays.stream(names)
    .sorted()
    .forEach(System.out::println);

    java.util.List<Integer> num=java.util.Arrays.asList(88,22,66,44,33,11,99,77,55);
    java.util.List<Integer> sortedNumbers= num.stream()
    .sorted()
    .collect(java.util.stream.Collectors.toList());
    sortedNumbers.forEach(System.out::println);

    java.util.List<String> ListOfStrings=java.util.Arrays.asList("Ravi","Aruna","Rahul","Sunita");
    ListOfStrings.stream()
    .sorted()
    .forEach(System.out::println);
   }
}
