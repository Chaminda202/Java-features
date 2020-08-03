package com.java.generics.wildcard;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildCardClient {
    public static void main(String[] args) {
        System.out.println("Generic upper bounded wild card");
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Sum of integer list " + sumOfElements(integerList));
        System.out.println(".......................................");
        List<Double> doubleList = Arrays.asList(1.0, 2.0, 3.0, 4.0, 4.0);
        System.out.println("Sum of double list " + sumOfElements(doubleList));
    }

    private static double sumOfElements(List<? extends Number> list) {
       return list.stream().mapToDouble(Number::doubleValue).sum();
    }
}
