package com.example.demo.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static javafx.scene.input.KeyCode.K;

public class CountDuplicateElementsArrayList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
            list.add("a");
            list.add("b");
            list.add("c");
            list.add("d");
            list.add("b");
            list.add("c");
            list.add("a");
            list.add("a");
            list.add("a");
            list.add("b");
            list.add("b");

        Map<String, Long> resultMap = new HashMap<>();
        list.forEach(e -> resultMap.put(e, resultMap.getOrDefault(e, 0L) + 1L));
        System.out.println("First type "+resultMap);

        Map<String, Long> resultMap2 = new HashMap<>();
        list.forEach(e -> {
            resultMap2.put(e, resultMap2.compute(e, (k, v) -> v == null ? 1L : v + 1l));
        });
        System.out.println("Second type "+resultMap2);

        Map<String, Long> resultMap3 = list.stream().collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
        System.out.println("Third type "+resultMap3);

        final Map<String, Long> resultMap4 = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println("Forth type "+resultMap4);

        Optional<Map.Entry<String, Long>> maxEntry = resultMap4.entrySet()
                .stream()
                .max((Map.Entry<String, Long> e1, Map.Entry<String, Long> e2) -> e1.getValue()
                        .compareTo(e2.getValue())
                );
        System.out.println(maxEntry.get());

        Optional<Map.Entry<String, Long>> maxEntry2 = resultMap4.entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue)
                );

    }
}
