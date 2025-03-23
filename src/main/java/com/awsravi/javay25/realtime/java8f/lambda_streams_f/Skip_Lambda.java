package com.awsravi.javay25.realtime.java8f.lambda_streams_f;

public class Skip_Lambda {
public static void main(String[] args) {
    //Lambda with Streams api Skip method
    //Skip is used to skip the number of elements in the stream
    
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    java.util.Arrays.stream(arr).skip(5).forEach(System.out::println);
    System.out.println("=====================================");
    java.util.List<Integer> num=java.util.Arrays.asList(6,7,8,9,1,2,3,4,5,10);
    num.stream().skip(5).forEach(System.out::println);
    
    java.util.List<String> ListOfStrings=java.util.Arrays.asList("Ravi","Aruna","Rahul","Sunita");
    ListOfStrings.stream().skip(2).forEach(System.out::println);
   }
}
