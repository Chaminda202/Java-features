package imperative;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("John", Gender.MALE),
                new Person("Alex", Gender.MALE),
                new Person("Peter", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Shelina", Gender.FEMALE)
        );

        //Imperative approach
        List<Person> filteredFemaleList = new ArrayList<>();

        for(Person person : list) {
            if(person.gender == Gender.FEMALE)
                filteredFemaleList.add(person);
        }

        System.out.println("Imperative approach");
        for(Person person : filteredFemaleList) {
            System.out.println(person);
        }

        System.out.println("Declarative approach");
        //declarative approach
        final Predicate<Person> personPredicate = person -> person.gender == Gender.FEMALE;
        list.stream()
                .filter(personPredicate)
                .forEach(System.out::println);
    }

    @Data
    @AllArgsConstructor
    static class Person {
        private final String name;
        private final Gender gender;
    }

    enum Gender {
        MALE, FEMALE;
    }
}
