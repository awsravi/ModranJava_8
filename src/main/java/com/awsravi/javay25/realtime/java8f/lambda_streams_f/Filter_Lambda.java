package com.awsravi.javay25.realtime.java8f.lambda_streams_f;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Lambda {
    public static void main(String[] args) {
        //Lambda with Streams api Filter method
        //Filter is used to filter the data based on the condition
        
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        java.util.Arrays.stream(arr).filter(a -> a%2==0).forEach(System.out::println);

        List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       List<Integer> evenNumbers= num.stream().filter(a -> a%2==0).collect(Collectors.toList());
       evenNumbers.forEach(System.out::println);
        

    }

}
