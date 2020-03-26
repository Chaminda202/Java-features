package com.example.demo.know;

public class Main {
    public static void main(String args[]){
        Address a = new Address("test1", "test2");
        Address b = new Address("test11", "test22");
        Student student = new Student("saman", 21, a);
        System.out.println("First address " + student.toString());
        student = new Student("saman1", 24, b);
        System.out.println("Second address "+student.toString());
    }
}
