package com.awsravi.javay25.realtime.java24f;

import java.util.List;

/*
The Stream Gatherers feature in Java 24 enhances the Stream API by introducing a new gather(Gatherer<T, R>) method.
This method allows for more flexible and efficient data processing within streams by enabling custom aggregation logic
beyond standard collectors like collect(Collectors.toList()).
 */
public class GatherExample {
public static void main(String[] args) {
    /*
     if using ArrayList,LinkedList,Vector this classes are mutable
     */
    //Arrays.asList Allows elements to be (Modification)added or removed nut not resizing.
    /*
    if List.of().method and Collections.unmodifiableList() this are Immutable.
    This list is immutable, meaning elements cannot be modified.
     */
    
    List<Integer> numbers = List.of(1, 2, 3, 4, 5);
    numbers.stream().gather(Gatherers.scan(0,Integer::sum)).forEach(System.out::println);
    /*
    Gatherers → A new class in Java 24 that provides predefined implementations of Gatherer, including scan, windowFixed
     */
    /*
    Works like a cumulative sum (prefix sum), where each element is added to the previous sum.
     */

}
}
