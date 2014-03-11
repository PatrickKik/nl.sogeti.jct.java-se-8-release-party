package nl.sogeti.jct.java8party;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Collecting with a parallel stream and a mapper.
 */
public class Collecting8 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf");

        Set<Person> persons = names.parallelStream().map(Person::new).collect(Collectors.toSet());

        System.out.println(persons);
    }

    static class Person {
        private String name;

        Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }
}

