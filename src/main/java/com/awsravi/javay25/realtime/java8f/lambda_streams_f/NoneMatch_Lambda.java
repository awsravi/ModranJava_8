package com.awsravi.javay25.realtime.java8f.lambda_streams_f;

public class NoneMatch_Lambda {
public static void main(String[] args) {
    //Lambda with Streams api NoneMatch method
    //NoneMatch is used to check if none of the elements in the stream match the given condition
    //If none of the elements match the condition then it returns true else false
    //It returns true if the stream is empty
    //It is a terminal operation
    //It returns a boolean value
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    boolean result = java.util.Arrays.stream(arr).noneMatch(a -> a%2==0);
    System.out.println("None of the elements are even: "+result);

    java.util.List<Integer> num=java.util.Arrays.asList(1,3,5,7,9);
    boolean result1 = num.stream().noneMatch(a -> a%2==0);
    System.out.println("None of the elements are even: "+result1);

    java.util.List<String> ListOfStrings=java.util.Arrays.asList("Ravi","Aruna","Rahul","Sunita");
    boolean result2 = ListOfStrings.stream().noneMatch(a -> a.length()>5);
    System.out.println("None of the elements have length greater than 5: "+result2);
  }
}
