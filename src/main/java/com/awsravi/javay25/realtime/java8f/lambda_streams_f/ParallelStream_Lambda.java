package com.awsravi.javay25.realtime.java8f.lambda_streams_f;

public class ParallelStream_Lambda {
public static void main(String[] args) {
    //Lambda with Streams api ParallelStream method
    //ParallelStream is used to perform parallel processing of the stream elements.
    //ParallelStream is used to process the elements in the stream in parallel.
    //All feature operations are multi-threaded.
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    java.util.Arrays.stream(arr).parallel().forEach(System.out::println);
    System.out.println("=====================================");
    java.util.List<Integer> num=java.util.Arrays.asList(6,7,8,9,1,2,3,4,5,10);
    num.stream().parallel().forEach(System.out::println);
    
    java.util.List<String> ListOfStrings=java.util.Arrays.asList("Ravi","Aruna","Rahul","Sunita");
    ListOfStrings.stream().parallel().forEach(System.out::println);
   }
}
