package com.example.demo.stream;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> checkValidCharacterLength = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() < 50;
            }
        };

        Predicate<String> checkWordExist = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("Java");
            }
        };

        String text = "Java 8 newly introduce functional programming. It is reduced a lot of boiler plate code.";

        System.out.println(checkValidCharacterLength.test(text));
        System.out.println(checkWordExist.test(text));

        //compose above two call using and
        System.out.println(checkValidCharacterLength.and(checkWordExist).test(text));

        System.out.println(checkValidCharacterLength.or(checkWordExist).test(text));

        System.out.println(checkValidCharacterLength.negate().and(checkWordExist).test(text));


    }
}
