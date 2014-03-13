package nl.sogeti.jct.java8party;

import java.util.*;

/**
 * Sorts a list of strings based on their second character with a custom Comparator implementation.
 * <p/>
 * Make it a lambda!
 */
public class Comparator7 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf");

        List<String> sortedNames = new ArrayList<>(names);

        Collections.sort(sortedNames, new Comparator<String>() {
            @Override
            public int compare(String left, String right) {
                return Character.compare(left.charAt(1), right.charAt(1));
            }
        });

        System.out.println(sortedNames);
    }
}
