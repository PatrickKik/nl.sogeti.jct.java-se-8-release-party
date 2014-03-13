package nl.sogeti.jct.java8party;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Sorts a list of strings based on their second character with a lambda expression using the new sort default method
 * on the List interface.
 */
public class Comparator8 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf");

        List<String> sortedNames = new ArrayList<>(names);

        sortedNames.sort((left, right) -> Character.compare(left.charAt(1), right.charAt(1)));

        System.out.println(sortedNames);
    }
}
