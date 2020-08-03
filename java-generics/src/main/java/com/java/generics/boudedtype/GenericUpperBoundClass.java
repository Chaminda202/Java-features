package com.java.generics.boudedtype;

import java.util.Arrays;

public class GenericUpperBoundClass<T extends Number> {
    private T[] arr;

    public GenericUpperBoundClass(T[] arr) {
        this.arr = arr;
    }

    public double calculateAverage() {
       return Arrays.stream(this.arr).mapToDouble(Number::doubleValue).average().getAsDouble();
    }
}