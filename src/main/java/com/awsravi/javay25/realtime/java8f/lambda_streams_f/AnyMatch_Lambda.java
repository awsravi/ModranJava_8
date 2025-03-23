package com.awsravi.javay25.realtime.java8f.lambda_streams_f;

public class AnyMatch_Lambda {
public static void main(String[] args) {
    //Lambda with Streams api AnyMatch method
    //AnyMatch is used to check if any element in the stream matches the given condition
    //If any element matches the condition then it returns true else false
    //It is a terminal operation
    //It returns a boolean value
    //It takes a predicate as an argument
    //It is a short-circuiting operation

    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    boolean isAnyMatch = java.util.Arrays.stream(arr).anyMatch(a -> a%2==0);
    System.out.println("Is any element is even: "+isAnyMatch);

    java.util.List<Integer> num=java.util.Arrays.asList(1,3,5,7,9);
    boolean isAnyMatch1 = num.stream().anyMatch(a -> a%2==0);
    System.out.println("Is any element is even: "+isAnyMatch1);

    java.util.List<String> ListOfStrings=java.util.Arrays.asList("Ravi","Aruna","Rahul","Sunita");
    boolean isAnyMatch2 = ListOfStrings.stream().anyMatch(a -> a.startsWith("R"));
    System.out.println("Is any element starts with R: "+isAnyMatch2);   

    java.util.List<String> ListOfStrings1=java.util.Arrays.asList("Ravi","Aruna","Rahul","Sunita");
    boolean isAnyMatch3 = ListOfStrings1.stream().anyMatch(a -> a.startsWith("X"));
    System.out.println("Is any element starts with X: "+isAnyMatch3);

   }
}
