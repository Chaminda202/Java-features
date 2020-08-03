package com.java.generics.interfaces;

public class ImplementGenericInterface<E> implements MyInterface<E> {
    private E e;
    @Override
    public void setValue(E e) {
        this.e = e;
    }

    @Override
    public E getValue() {
        return e;
    }
}
