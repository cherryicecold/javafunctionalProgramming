package streams;

import imperative.Main;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _streams {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Karan", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Alex",  Gender.MALE),
                new Person("Alice", Gender.FEMALE)
        );

       Set<String> names = people.stream()
                .map(person -> person.name)
                .collect(Collectors.toSet());
               //.forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }
    }

    enum Gender {
        MALE, FEMALE
    }

}
