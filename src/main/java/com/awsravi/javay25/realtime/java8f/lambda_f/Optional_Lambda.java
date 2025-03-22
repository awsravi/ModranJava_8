package com.awsravi.javay25.realtime.java8f.lambda_f;

public class Optional_Lambda {
public static void main(String[] args) {
    // Optional
    // Optional is a container object which may or may not contain a non-null value.
    // If a value is present, isPresent() will return true and get() will return the value.
    // If a value is not present, isPresent() will return false and get() will throw an exception.
    // Optional.Of method is used to create an Optional object with a non-null value.
    // Optional.empty() is used to create an empty Optional object.
    // Optional.ofNullable() is used to create an Optional object that may or may not contain a non-null value.
    // Optional is used to avoid NullPointerException.
    //Revisit for all methods of Optional

    
    //Optional.of
    String s = "Ravi";
    java.util.Optional<String> optionalString = java.util.Optional.of(s);
    System.out.println(optionalString.get());
    optionalString.ifPresent(System.out::println);

}
}
