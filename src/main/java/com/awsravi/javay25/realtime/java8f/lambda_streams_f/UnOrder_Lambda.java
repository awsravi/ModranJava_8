package com.awsravi.javay25.realtime.java8f.lambda_streams_f;

public class UnOrder_Lambda {
public static void main(String[] args) {
    //Lambda with Streams api UnOrder method
    //UnOrder method is used to process the elements in the stream in an unordered manner.
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    java.util.Arrays.stream(arr).unordered().forEach(System.out::println);
    System.out.println("=====================================");
    java.util.List<Integer> num=java.util.Arrays.asList(6,7,8,9,1,2,3,4,5,10);
    num.stream().unordered().forEach(System.out::println);
    
    java.util.List<String> ListOfStrings=java.util.Arrays.asList("Ravi","Aruna","Rahul","Sunita");
    ListOfStrings.stream().unordered().forEach(System.out::println);
   }
}
