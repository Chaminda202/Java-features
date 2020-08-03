package com.java.generics.methods;

public class GenericMethodClient {
    public static void main(String[] args) {
        System.out.println("Generic class with generic method");
        String[] arr1 = new String[] {"Test1", "Test2", "Test3"};
        GenericClassWithMethod<String> integerGenericClassWithMethod = new GenericClassWithMethod(arr1);
        String[] arr2 = integerGenericClassWithMethod.getArr();
        integerGenericClassWithMethod.print(arr2);
        System.out.print("\n");
        System.out.println("............................................");

        Integer[] arr3 = new Integer[] {1, 2, 3, 4};
        GenericClassWithMethod<Integer> integerGenericClassWithMethod1 = new GenericClassWithMethod(arr3);
        Integer[] arr4 = integerGenericClassWithMethod1.getArr();
        integerGenericClassWithMethod.print(arr4);
        System.out.print("\n\n");

        System.out.println("Non Generic class with generic method");
        String[] arr5 = new String[] {"Test1", "Test2", "Test3"};
        NonGenericClassWithMethod nonGenericClassWithMethod = new NonGenericClassWithMethod();
        nonGenericClassWithMethod.print(arr5);
        System.out.print("\n");
        System.out.println("............................................");
        Integer[] arr6 = new Integer[] {1, 2, 3, 4};
        nonGenericClassWithMethod.print(arr6);
        System.out.print("\n");
    }
}
