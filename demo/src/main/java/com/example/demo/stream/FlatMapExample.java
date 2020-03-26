package com.example.demo.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {

        Stream<String> stringStream1 = Stream.of(new String[]{"Ross", "Jack", "Tim"});
        Stream<String> ross = Stream.of("Ross", "Jack", "Tim");
        Stream<List<String>> words1 = Stream.of(Arrays.asList("JavaDevJournal", "Java"));
        List<String> words = Arrays.asList("JavaDevJournal", "Java");
        Stream<List<String>> words2 =Stream.of(words);
        Stream<String> stream = words.stream();

        List<User> userList = Arrays.asList(
                new User("Tom", 25, Arrays.asList("1", "2", "3")),
                new User("Taylor", 35, Arrays.asList("4", "5")),
                new User("Sam", 22, Arrays.asList("6")),
                new User("Michel", 38, Arrays.asList("7", "8", "9")),
                new User("Peter", 19, Arrays.asList("10", "11", "12", "13"))
        );

        final Optional<String> stringOptional = userList.stream()
                .map(user -> user.getPhoneNo().stream())
                .flatMap(stringStream -> stringStream.filter(phone -> phone.equals("5")))
                .findAny();

        stringOptional.ifPresent(System.out::println);

        userList.stream()
                .map(User::getPhoneNo)
                .flatMap(Collection::stream)
                .forEach(System.out::println);

        List<String> firstNames = Arrays.asList("Peter", "Tom", "Nickel", "Thomsan");
        List<String> lastNames = Arrays.asList("Max", "Clerk", "Tim");

        Stream.of(firstNames, lastNames)
                .flatMap(List::stream)
                .forEach(System.out::println);

        System.out.println("Check prime number " + primeNumber(5));
    }

    private static boolean primeNumber (int number) {
            for(int i=2 ; i < Math.sqrt(number) ; i++) {
                if(number%i==0)
                    return false;
            }
            return true;
    }

    static class User {
        private String name;
        private int age;
        private List<String> phoneNo;

        public User(String name, int age, List<String> phoneNo) {
            this.name = name;
            this.age = age;
            this.phoneNo = phoneNo;
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

        public List<String> getPhoneNo() {
            return phoneNo;
        }

        public void setPhoneNo(List<String> phoneNo) {
            this.phoneNo = phoneNo;
        }
    }
}
