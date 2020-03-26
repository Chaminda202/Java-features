package com.example.demo.test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
        Stream<String> concat = Stream.concat(Stream.of(names1), Stream.of(names2)).distinct();
        String[] result = concat.toArray(item -> new String[item]);
        //final List<String> list = concat.collect(Collectors.toList());
        //list.forEach(System.out::println);
        return result;
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}