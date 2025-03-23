package com.awsravi.javay25.realtime.java8f.lambda_streams_f;

public class Distnct_Lambda {
public static void main(String[] args) {
    //Lambda with Streams api Distinct method
    //Distinct is used to get the unique elements from the stream
    
    int[] arr = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
    java.util.Arrays.stream(arr)
    .distinct()
    .forEach(System.out::println);

    java.util.List<Integer> num=java.util.Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10);
    java.util.List<Integer> distinctNumbers= num.stream()
    .distinct()
    .collect(java.util.stream.Collectors.toList());
    distinctNumbers.forEach(System.out::println);
   }
}
