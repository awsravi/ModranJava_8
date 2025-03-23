package com.awsravi.javay25.realtime.java8f.lambda_streams_f;

public class FindFirst_Lambda {
public static void main(String[] args) {
    //Lambda with Streams api FindFirst method
    //FindFirst is used to get the first element from the stream
    
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    int firstEven = java.util.Arrays.stream(arr).filter(a -> a%2==0).findFirst().getAsInt();
    System.out.println("First even number: "+firstEven);

    java.util.List<Integer> num=java.util.Arrays.asList(6,7,8,9,10,1,2,3,4,5);
    int firstEven1 = num.stream().filter(a -> a%2==0).findFirst().get();
    System.out.println("First even number: "+firstEven1);
    
    java.util.List<String> ListOfStrings=java.util.Arrays.asList("Ravi","Aruna","Rahul","Sunita");
    String firstString = ListOfStrings.stream().findFirst().get();
    System.out.println("First String: "+firstString);
   }
}
