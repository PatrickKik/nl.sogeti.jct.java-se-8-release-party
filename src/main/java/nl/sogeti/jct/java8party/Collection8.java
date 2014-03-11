package nl.sogeti.jct.java8party;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Collecting with a parallel stream and a custom collector.
 */
public class Collection8 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf");

        Set<Person> persons = names.parallelStream().collect(
                HashSet<Person>::new,                     // Will be called once per fork.
                (set, name) -> set.add(new Person(name)), // Will be called for every element in the stream.
                (left, right) -> left.addAll(right));     // Will be called once per join.

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

