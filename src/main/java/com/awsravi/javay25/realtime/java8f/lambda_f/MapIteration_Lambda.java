package com.awsravi.javay25.realtime.java8f.lambda_f;

import java.util.HashMap;
import java.util.Map;

public class MapIteration_Lambda {
public static void main(String[] args) {
/*
 * Map Iteration using Lambda
 * forEach() method is used to iterate the map
 */
Map<String, Integer> map = new HashMap<>();
map.put("Aruna", 1);
map.put("Ravi", 2);
map.put("Rahul", 3);
map.put("Sunita", 4);
map.put("Darshan", 5);
map.forEach((key, value) -> {
System.out.println("Key: " + key + " Value: " + value);
});
}
}
