package com.awsravi.javay25.realtime.java8f.lambda_f;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class LogicalOperator_Lambda {
public static void main(String[] args) {
    
        boolean x = true, y = false;

        // Logical AND (&&) using BiFunction
        /*
        The Logical (&&) operator does not check SECOND condition IF the FIRST condition is FALSE,
        It checks the SECOND condition IF the FISRT condition is TRUE. 
         */ 
        BiFunction<Boolean, Boolean, Boolean> logicalAnd = (a, b) -> a && b;
        System.out.println("Logical AND (&&): " + logicalAnd.apply(x, y)); // false

        /*
         * The bitwise & ALWAYS checking both conditions if the condition is true or false
         */
        // Bitwise AND (&) using BiFunction
        BiPredicate<Integer, Integer> checkConditions = (a, b) -> {
            System.out.println("Checking first condition: " + (a > 0));
            System.out.println("Checking second condition: " + (b > 0));
            return (a > 0) & (b > 0); // Bitwise AND ensures both conditions are evaluated
        };

        System.out.println("Result: " + checkConditions.test(-5, 10));
  
        // Bitwise OR (|) using BiFunction
        BiFunction<Boolean, Boolean, Boolean> bitwiseOr = (a, b) -> a | b;
        System.out.println("Bitwise OR (|): " + bitwiseOr.apply(x, y)); // true

        // Logical NOT (!) using Function
        Function<Boolean, Boolean> logicalNot = a -> !a;
        System.out.println("Logical NOT (!): " + logicalNot.apply(x)); // false

        // Logical OR (||) using BiFunction
        BiFunction<Boolean, Boolean, Boolean> logicalOr = (p, q) -> p || q;
        System.out.println("Logical OR (||): " + logicalOr.apply(x, y)); // true

    
}
}
