package com.java.generics.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildCardClient {
    public static void main(String[] args) {
        System.out.println("Generic lower bounded wild card");
        List<Integer> integerList = new ArrayList<>();
        addNumbers(integerList);
        System.out.println(".......................................");
        List<Number> numberList = new ArrayList<>();
        addNumbers(numberList);
        System.out.println(".......................................");
        List<Object> objectList = new ArrayList<>();
        addNumbers(objectList);
    }

    private static void addNumbers(List<? super Integer> list) {
        for (int i=0; i< 10; i++)
            list.add(i);

        System.out.println("Print the list " + list);
    }
}
