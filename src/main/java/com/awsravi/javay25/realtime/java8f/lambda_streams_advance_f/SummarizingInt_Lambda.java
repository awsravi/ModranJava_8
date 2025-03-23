package com.awsravi.javay25.realtime.java8f.lambda_streams_advance_f;

import java.util.Arrays;

public class SummarizingInt_Lambda {
public static void main(String[] args) {
    
    // SummarizingInt using stream
    // Using collect() method to summarize all elements in the stream
    // Using Collectors.summarizingInt() method to summarize all elements in the stream
    
    java.util.List<String> listOfString=java.util.Arrays.asList("Ravi", "Aruna", "Rahul","Sunita");
    java.util.IntSummaryStatistics intSummaryStatistics=listOfString.stream().collect(java.util.stream.Collectors.summarizingInt(String::length));
    System.out.println("SummarizingInt using stream: " + intSummaryStatistics);

    System.out.println("========================================");
                                                         
    Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream().collect(java.util.stream.Collectors.summarizingInt(Integer::intValue));
    System.out.println("SummarizingInt using stream: " + intSummaryStatistics);
    System.out.println(
        "Count: " + intSummaryStatistics.getCount() + 
        ", Sum: " + intSummaryStatistics.getSum() + 
        ", Min: " + intSummaryStatistics.getMin() + 
        ", Average: " + intSummaryStatistics.getAverage() + 
        ", Max: " + intSummaryStatistics.getMax()
    );

    }
}
