package com.example.demo.stream;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<String, Integer> wordCount = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.split("\\s+").length;
            }
        };

        Function<Integer, String> numberToText = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                switch (integer){
                    case 1:
                        return "one";
                    case 2:
                        return "two";
                    case 3:
                        return "three";
                    default:
                        return "unknown";
                }
            }
        };

        System.out.println(wordCount.apply("Hi  How are you?"));
        System.out.println(numberToText.apply(1));

        //Function chaining using andThen
        String andThenOut = wordCount.andThen(numberToText).apply("Hi  How are you?");
        System.out.println("andThen() output " + andThenOut);

        //Function chaining using compose
        int composeOut = wordCount.compose(numberToText).apply(2);
        System.out.println("compose() output "+composeOut);
    }
}
