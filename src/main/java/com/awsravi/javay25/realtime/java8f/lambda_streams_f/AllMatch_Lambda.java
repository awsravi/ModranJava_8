package com.awsravi.javay25.realtime.java8f.lambda_streams_f;

public class AllMatch_Lambda {
public static void main(String[] args) {
    //Lambda with Streams api AllMatch method
    //AllMatch is used to check if all the elements in the stream satisfy the given condition
    //If all the elements satisfy the condition then it returns true else false
    //It returns true if the stream is empty
    //It is a terminal operation
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    boolean allMatch = java.util.Arrays.stream(arr).allMatch(a -> a%2==0);
    System.out.println("All elements are even: "+allMatch);

    java.util.List<Integer> num=java.util.Arrays.asList(2,4,6,8,10);
    boolean allMatch1 = num.stream().allMatch(a -> a%2==0);
    System.out.println("All elements are even: "+allMatch1);

    java.util.List<String> ListOfStrings=java.util.Arrays.asList("Ravi","Aruna","Rahul","Sunita");
    boolean allMatch2 = ListOfStrings.stream().allMatch(a -> a.length()>3);
    System.out.println("All elements have length greater than 3: "+allMatch2);
  }
}
