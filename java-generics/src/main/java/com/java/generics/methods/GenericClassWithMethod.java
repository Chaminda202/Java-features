package com.java.generics.methods;

import java.util.Arrays;

public class GenericClassWithMethod<T> {
    private T [] arr;

    public GenericClassWithMethod(T[] arr) {
        this.arr = arr;
    }

    public T[] getArr() {
        return arr;
    }

    public <E> void print(E[] arr) {
        Arrays.stream(arr).forEach(item -> System.out.print(item + "\t"));
    }
}
