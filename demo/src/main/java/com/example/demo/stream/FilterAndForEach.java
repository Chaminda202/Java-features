package com.example.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterAndForEach {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Tom", "Krish", "Grace", "Michel", "Nethan");

        nameList.stream()
                .filter(FilterAndForEach::isMatching)
                .forEach(System.out::println);

    }

    private static boolean isMatching(String name) {
        return !name.equals("Tom");
    }
}
