package com.example.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapToIntExample {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Tom", "Krish", "Grace", "Michel", "Nethan");

        nameList.stream()
                .filter(MapToIntExample::isMatching)
                .map(User::new)
                .forEach(System.out::println);

        final List<User> userList = nameList.stream()
                .filter(MapToIntExample::isMatching)
                .map(User::new)
                .collect(Collectors.toList());

        final int sum = userList.stream()
                .mapToInt(User::getAge)
                .sum();
        System.out.println("User age sum is " + sum);
    }

    private static boolean isMatching(String name) {
        return !name.equals("Tom");
    }

    static class User {
        private String name;
        private int age = 20;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
