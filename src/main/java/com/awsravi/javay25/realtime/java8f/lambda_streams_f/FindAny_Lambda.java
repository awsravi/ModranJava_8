package com.awsravi.javay25.realtime.java8f.lambda_streams_f;

public class FindAny_Lambda {
public static void main(String[] args) {
    //Lambda with Streams api FindAny method
    //FindAny is used to get any element from the stream
    
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    int any = java.util.Arrays.stream(arr).findAny().getAsInt();
    System.out.println("Any element of array: "+any);

    java.util.List<Integer> num=java.util.Arrays.asList(6,7,8,9,1,2,3,4,5,10);
    int any1 = num.stream().findAny().get();
    System.out.println("Any element of List: "+any1);

    java.util.List<String> ListOfStrings=java.util.Arrays.asList("Ravi","Aruna","Rahul","Sunita");
    String any2 = ListOfStrings.stream().findAny().get();
    System.out.println("Any element of List: "+any2);
   }
}
