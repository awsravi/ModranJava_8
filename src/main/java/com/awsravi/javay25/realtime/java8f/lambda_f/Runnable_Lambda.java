package com.awsravi.javay25.realtime.java8f.lambda_f;

public class Runnable_Lambda {
    public static void main(String[] args) {
        Runnable r = () ->{ System.out.println("Runnable with Lambda");};

        //creating thread using lambda expression
    
        new Thread(() -> System.out.println("Creating with Lambda Example !")).start();
        new Thread(r).start();

    }
}
