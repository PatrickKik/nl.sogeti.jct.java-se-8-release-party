package nl.sogeti.jct.java8party;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Collecting one collection into a collection of different objects.
 * Every object must be handled.
 */
public class Collecting7 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf");

        Set<Person> persons = new HashSet<>();

        for (String name : names) {
            persons.add(new Person(name));
        }

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
