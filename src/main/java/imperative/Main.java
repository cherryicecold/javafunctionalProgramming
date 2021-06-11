package imperative;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Karan", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha",Gender.FEMALE),
                new Person("Alex",Gender.MALE),
                new Person("Alice",Gender.FEMALE)
        );

        //Imperative approach - we're defining every single statement.
        List<Person> females = new ArrayList<>();
        for(Person person : people){
            if(Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for (Person female : females) {
           System.out.println(female.name);
        }

        //Declarative approach- we make use of streams.
        System.out.println("Declarative approach");

        people.stream().filter(p->Gender.FEMALE.equals(p.gender))
                        .map(p->p.name)
                        .forEach(System.out::println);
    }


    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name,Gender gender){
            this.name = name;
            this.gender = gender;
        }
    }

    enum Gender {
        MALE, FEMALE
    }

}