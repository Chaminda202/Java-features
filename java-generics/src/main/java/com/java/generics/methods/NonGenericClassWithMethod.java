package com.java.generics.methods;

import java.util.Arrays;

public class NonGenericClassWithMethod {
    public <E> void print(E[] arr) {
        Arrays.stream(arr).forEach(item -> System.out.print(item + "\t"));
    }
}
