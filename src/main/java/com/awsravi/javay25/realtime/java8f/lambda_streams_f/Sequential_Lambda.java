package com.awsravi.javay25.realtime.java8f.lambda_streams_f;

public class Sequential_Lambda {
public static void main(String[] args) {
    //Lambda with Streams api Sequential method
    //Sequential method is used to iterate the elements in the order of insertion
    //Marks the stream as sequential, which means that the elements will be processed in order. All Feature operations are single-threaded.
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    java.util.Arrays.stream(arr).sequential().forEach(System.out::println);
    System.out.println("=====================================");
    java.util.List<Integer> num=java.util.Arrays.asList(6,7,8,9,1,2,3,4,5,10);
    num.stream().sequential().forEach(System.out::println);
    
    java.util.List<String> ListOfStrings=java.util.Arrays.asList("Ravi","Aruna","Rahul","Sunita");
    ListOfStrings.stream().sequential().forEach(System.out::println);
   }
}
