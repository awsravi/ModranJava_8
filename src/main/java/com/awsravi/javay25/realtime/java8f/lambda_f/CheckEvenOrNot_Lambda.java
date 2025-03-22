package com.awsravi.javay25.realtime.java8f.lambda_f;

import java.util.function.Predicate;

public class CheckEvenOrNot_Lambda {
public static void main(String[] args) {
   
        Predicate<Integer> isEven = num -> num % 2 == 0;

        // use predicate to check Even or not
        System.out.println(isEven.test(4)); 
        System.out.println(isEven.test(7)); 
    
}
}
