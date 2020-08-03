package com.java.generics.boudedtype;

import java.util.Arrays;
import java.util.Comparator;

public class BoundedTypeClient {
    public static void main(String[] args) {
        Integer [] integerArr = {1, 2, 3, 4, 5};
        Long [] longArr = {1L, 2L, 3L, 4L, 5L};
        Double [] doubleArr = {1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println("Generic class define upper bound type");
        GenericUpperBoundClass<Integer> integerUpperBoundClass = new GenericUpperBoundClass(integerArr);
        System.out.println(integerUpperBoundClass.calculateAverage());
        System.out.println(".............................................");
        GenericUpperBoundClass<Long> longUpperBoundClass = new GenericUpperBoundClass(longArr);
        System.out.println(longUpperBoundClass.calculateAverage());
        System.out.println(".............................................");
        GenericUpperBoundClass<Double> doubleUpperBoundClass = new GenericUpperBoundClass(doubleArr);
        System.out.println(doubleUpperBoundClass.calculateAverage());

        System.out.println("Generic method define upper bound type");
        System.out.println(findGreaterThanValueCount(integerArr, 2));
        System.out.println(".............................................");
        System.out.println(findGreaterThanValueCount(longArr, 3L));
        System.out.println(".............................................");
        System.out.println(findGreaterThanValueCount(doubleArr, 4.0));
    }

    private static <T extends Comparable<T>> long findGreaterThanValueCount(T [] arr, T element) {
        return Arrays.stream(arr).filter(i -> i.compareTo(element) > 0).count();
    }
}
