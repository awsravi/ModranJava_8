package com.awsravi.javay25.realtime.java8f.lambda_streams_f;

public class Reduce_Lambda {
public static void main(String[] args) {
    //Lambda with Streams api Reduse method
    //Reduce method is used to reduce the elements of a stream to a single value.
    //Reduce method takes two arguments, first one is the initial value and the second one is the lambda expression.
    //Reduce method is used to perform the sum, max, min, product of the elements of the stream.
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    int sum = java.util.Arrays.stream(arr).reduce(0, (a,b) -> a+b);
    System.out.println("Sum of array elements: "+sum);
    int max = java.util.Arrays.stream(arr).reduce(0, (a,b) -> a>b?a:b);
    System.out.println("Max of array elements: "+max);
    int min = java.util.Arrays.stream(arr).reduce(0, (a,b) -> a<b?a:b);
    System.out.println("Min of array elements: "+min);
    int product = java.util.Arrays.stream(arr).reduce(1, (a,b) -> a*b);
    System.out.println("Product of array elements: "+product);
    int sum1 = java.util.Arrays.stream(arr).reduce(0, Integer::sum);
    System.out.println("Sum of array elements: "+sum1);
    int max1 = java.util.Arrays.stream(arr).reduce(0, Integer::max);
    System.out.println("Max of array elements: "+max1);
    int min1 = java.util.Arrays.stream(arr).reduce(0, Integer::min);
    System.out.println("Min of array elements: "+min1);
    int product1 = java.util.Arrays.stream(arr).reduce(1, (a,b) -> a*b);
    System.out.println("Product of array elements: "+product1);

}
}
