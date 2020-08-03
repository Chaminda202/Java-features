package com.java.generics.interfaces;

public class InterfaceClient {
    public static void main(String[] args) {
        System.out.println("Implements generic interface without define type");
        ImplementGenericInterface<String> implementGenericInterface = new ImplementGenericInterface<>();
        implementGenericInterface.setValue("Hello world");

        System.out.println(implementGenericInterface.getValue());
        System.out.println(".................................................");

        System.out.println("Implements generic interface define type");
        ImplementGenericInterfaceDefineType implementGenericInterfaceDefineType = new ImplementGenericInterfaceDefineType();
        implementGenericInterfaceDefineType.setValue(100);

        System.out.println(implementGenericInterfaceDefineType.getValue());
        System.out.println(".................................................");

        System.out.println("Implements generic interface and add new generic type");
        ImplementInterface<String, Integer> implementInterface = new ImplementInterface<>();
        implementInterface.setValue("New Value");
        implementInterface.setK(1000);

        System.out.println(implementInterface.getValue());
        System.out.println(implementInterface.getK());
        System.out.println(".................................................");
    }
}
