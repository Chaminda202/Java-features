package com.java.generics.wildcard;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildCardClient {
    public static void main(String[] args) {
        System.out.println("Generic unbounded wild card");
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        print(integerList);
        System.out.println(".......................................");
        List<Double> doubleList = Arrays.asList(1.0, 2.0, 3.0, 4.0, 4.0);
        print(doubleList);
    }

    private static void print(List<?> list) {
        list.forEach(item -> System.out.print(item + "\t"));
        System.out.println("\n");
    }
}
