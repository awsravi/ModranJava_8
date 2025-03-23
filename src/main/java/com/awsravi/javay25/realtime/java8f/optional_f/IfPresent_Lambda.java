package com.awsravi.javay25.realtime.java8f.optional_f;

public class IfPresent_Lambda {
public static void main(String[] args) {
    
    // Using ifPresent() method to print the value of an Optional
    // if it is not null
    
    java.util.Optional<String> optionalString=java.util.Optional.of("Ravi");
    optionalString.ifPresent(System.out::println);
    
    java.util.Optional<String> optionalString2=java.util.Optional.ofNullable(null);
    optionalString2.ifPresent(System.out::println);
    
    java.util.Optional<String> optionalString3=java.util.Optional.empty();
    optionalString3.ifPresent(System.out::println);
    
    java.util.Optional<String> optionalString4=java.util.Optional.of("Ravi");
    optionalString4.ifPresent((String s)->System.out.println(s));
    
    java.util.Optional<String> optionalString5=java.util.Optional.ofNullable(null);
    optionalString5.ifPresent((String s)->System.out.println(s));
    
    java.util.Optional<String> optionalString6=java.util.Optional.empty();
    optionalString6.ifPresent((String s)->System.out.println(s));
    
    java.util.Optional<String> optionalString7=java.util.Optional.of("Ravi");
    optionalString7.ifPresent((String s)->{System.out.println(s);});
    
    java.util.Optional<String> optionalString8=java.util.Optional.ofNullable(null);
    optionalString8.ifPresent((String s)->{System.out.println(s);});
    
    java.util.Optional<String> optionalString9=java.util.Optional.empty();
    optionalString9.ifPresent((String s)->{System.out.println(s);});
    
    java.util.Optional<String> optionalString10=java.util.Optional.of("Ravi");
    optionalString10.ifPresent((String s)->{
        System.out.println(s);
    });
    
    java.util.Optional<String> optionalString11=java.util.Optional.ofNullable(null);
    optionalString11.ifPresent((String s)->{
        System.out.println(s);
    });
    
    java.util.Optional<String> optionalString12=java.util.Optional.empty();
    optionalString12.ifPresent((String s)->{
        System.out.println(s);
    });
    
    java.util.Optional<String> optionalString13=java.util.Optional.of("Ravi");
    optionalString13.ifPresent((String s)->{
        System.out.println(s);
    });
    
    java.util.Optional<String> optionalString14=java.util.Optional.ofNullable(null);
    optionalString14.ifPresent((String s)->{
        System.out.println(s);
    });
  }
}
