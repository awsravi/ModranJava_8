package com.awsravi.javay25.realtime.java8f.lambda_streams_f;

public class Count_Lambda {
public static void main(String[] args) {
    //Lambda with Streams api Count method
    //Count is used to get the count of elements in the stream

    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    long count = java.util.Arrays.stream(arr).count();
    System.out.println("Count of array elements: "+count);

    java.util.List<Integer> num=java.util.Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    long count1 = num.stream().count();
    System.out.println("Count of List elements: "+count1);

    java.util.List<String> ListOfStrings=java.util.Arrays.asList("Ravi","Aruna","Rahul","Sunita");
    long count2 = ListOfStrings.stream().count();
    System.out.println("Count of List elements: "+count2);   
   }
}
