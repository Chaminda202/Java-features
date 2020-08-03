package com.java.generics.interfaces;

public class ImplementInterface<E, K> implements MyInterface<E> {
    private E e;
    private K k;
    @Override
    public void setValue(E e) {
        this.e = e;
    }

    @Override
    public E getValue() {
        return e;
    }

    public void setK(K k) {
        this.k = k;
    }

    public K getK() {
        return k;
    }
}
