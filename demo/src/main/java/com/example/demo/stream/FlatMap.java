package com.example.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("JavaDevJournal", "Java");

        System.out.println("Distinct characters ");
        words.stream()
                .map(s -> s.split(""))
                .flatMap(s -> Arrays.stream(s))
                .distinct()
                .forEach(System.out::println);


        List<String> sentences = Arrays.asList("This is the test file", "This test  file is ", "a demo  fo flatMap example");
        System.out.println("Distinct words ");

        sentences.stream()
                .map(w -> w.split("\\s+"))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);

        final Stream<String> stringStream = sentences.stream()
                .map(w -> w.split("\\s+"))
                .flatMap(Arrays::stream);

        final Set<String> collect = sentences.stream()
                .map(w -> w.split("\\s+"))
                .flatMap(Arrays::stream)
                .collect(Collectors.toSet());
    }
}
