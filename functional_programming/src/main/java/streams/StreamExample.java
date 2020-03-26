package streams;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("John", Gender.MALE),
                new Person("Alex", Gender.MALE),
                new Person("Peter", Gender.MALE),
                new Person("Peter", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Simon", Gender.OTHER),
                new Person("Shelina", Gender.FEMALE)
        );

        list.stream()
                .map(person -> person.getName())
                .distinct()
                .forEach(System.out::println);

        list.stream()
                .map(person -> person.getName().length())
                .forEach(System.out::println);

        list.stream()
                .map(person -> person.getGender())
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        final boolean isAllPersonsFemale = list.stream()
                .allMatch(person -> person.getGender() == Gender.FEMALE);

        System.out.println("All persons are females " + isAllPersonsFemale);
    }

    @Data
    @AllArgsConstructor
    static class Person {
        private final String name;
        private final Gender gender;
    }

    enum Gender {
        MALE, FEMALE, OTHER;
    }
}
