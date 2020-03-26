package com.example.demo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {
        List<Integer> list = Arrays.stream(sortedArray).boxed().collect(Collectors.toList());

       int count = (int) Arrays.stream(sortedArray).boxed()
                .filter(num -> num > lessThan)
                .count();

        IntStream.of(sortedArray)
                .filter(num -> num > lessThan)
                .count();
        return (int)Arrays.stream(sortedArray)
               .filter(num -> num>lessThan)
               .count();
    }
    
    public static void main(String[] args) {
        //System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4));
        //uniqueResult();
        System.out.println(String.join(", ",  uniqueResult()));
    }

    public static List<String> uniqueResult(){
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};

        List<String> merge = new ArrayList<>();
        merge.addAll(Arrays.asList(names1));
        merge.addAll(Arrays.asList(names2));

        return merge.stream().collect(Collectors.toSet()).stream().collect(Collectors.toList());
    }
}