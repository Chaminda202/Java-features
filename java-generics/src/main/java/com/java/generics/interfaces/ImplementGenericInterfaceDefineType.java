package com.java.generics.interfaces;

public class ImplementGenericInterfaceDefineType implements MyInterface<Integer> {
    private Integer e;
    @Override
    public void setValue(Integer e) {
        this.e = e;
    }

    @Override
    public Integer getValue() {
        return e;
    }
}
